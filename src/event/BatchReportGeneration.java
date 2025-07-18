package event;



import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.HorizontalAlignment;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.text.pdf.PdfPageEventHelper;

import DAO.BatchReport;
import util.Utility;
import view.Application;
import view.Batchwisereport;
import view.ReportForm;


@SuppressWarnings("deprecation")
public class BatchReportGeneration extends PdfPageEventHelper  {
	static String prtlev=null;
	static String dest2 =null;
	public static ArrayList<String> purchaseData=new ArrayList<>();
	
	public static void batchreportGeneratb() {
		LocalDateTime current = LocalDateTime.now();
		DateTimeFormatter formatter4 = DateTimeFormatter.BASIC_ISO_DATE;
		String formatted = current.format(formatter4);
		String format_minute = Integer.toString(current.getMinute());
		String format_hourse = Integer.toString(current.getHour());
		String format_seconds = Integer.toString(current.getSecond());
		String fileName = null;
		
		Float totalbill=Float.parseFloat(BatchReport.prdata.get(1));
		
		// com.itextpdf.text.Document document = new com.itextpdf.text.Document();

		try {

			// Creating a PdfDocument object
			String dest ="D:\\Batches\\" + BatchReport.prdata.get(3).toString()+"-"+ format_hourse + format_minute + format_seconds + ".pdf";
			
			//String dest="D:\\MPApplication\\Eddysorter\\Default_COM4\\B.pdf";
			PdfWriter writer = new PdfWriter(dest);

			// Creating a PdfDocument object
			PdfDocument pdf = new PdfDocument(writer);
		
			// Creating a Document object
			Document doc = new Document(pdf);
		
			ImageData data = ImageDataFactory.create(Utility.company_logo);                      
		      Image image = new Image(data); 
		      
            doc.add(image);
			// Creating text object
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
			LocalDateTime now = LocalDateTime.now();
			String timeformate=dtf.format(now);
			System.out.println(dtf.format(now));
			
			Text text1 = new Text("    Report Date & Time :");
			Text text1sname = new Text("    Supplier Name :");
			
			Text text2 = new Text(timeformate);
			
			Text text2snametext = new Text(Batchwisereport.componentName);
			
			Text text3 = new Text(BatchReport.prdata.get(3));

			float accept=0,reject=0,total=0;
			 
			 dtf.format(now);

			// Setting font of the text
			PdfFont font = PdfFontFactory.createFont(FontConstants.HELVETICA_BOLD);
			PdfFont font_text2 = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);
			text1.setFont(font);
			text1sname.setFont(font);
			text2.setFont(font_text2);
			text3.setFont(font);
			doc.add(new Paragraph(text1));
			doc.add(new Paragraph(text2).setMarginLeft(119).setMarginTop(-21));
			doc.add(new Paragraph(text3).setMarginLeft(290).setMarginTop(-21));
			doc.add(new Paragraph(text1sname));
			doc.add(new Paragraph(text2snametext).setMarginLeft(108).setMarginTop(-21));
			
			
			
			purchaseData.clear();
			
			if((BatchReport.prdata.size()/7)>(BatchReport.brdatastat.size()/8)) {
			int diff=	(BatchReport.prdata.size()/7)-(BatchReport.brdatastat.size()/8);
			for(int i=0;i<diff;i++) {
				System.out.println("==============================>>>>>>");
				
					 
					BatchReport.brdatastat.add("-");
					 BatchReport.brdatastat.add("00");
					 BatchReport.brdatastat.add("2000-03-29 11:31:06.0");
					 BatchReport.brdatastat.add("-");//upi
					 BatchReport.brdatastat.add("-");//name
					 BatchReport.brdatastat.add("-");//login
					 BatchReport.brdatastat.add("-");//des
					 BatchReport.brdatastat.add("12.5");
			    
			}
			
			}
			
			
			
			Text text5 = new Text("Purchase entry :");
			text5.setFont(font);
			//doc.add(new Paragraph(text5));
			// Creating a table
			float[] pointColumnWidths2 = {140F, 140F, 125F};
			Table table_2 = new Table(pointColumnWidths2);
//						
			// Adding cells to the table
			
			table_2.addCell(new Paragraph("B.No").setTextAlignment(TextAlignment.CENTER).setBold().setFontSize(10));
			table_2.addCell(new Paragraph("DATE").setTextAlignment(TextAlignment.CENTER).setBold().setFontSize(10));
			table_2.addCell(new Paragraph("BILL AMOUNT").setTextAlignment(TextAlignment.CENTER).setBold().setFontSize(10));
			//table_2.addCell(new Paragraph("LOGIN").setTextAlignment(TextAlignment.CENTER).setBold().setFontSize(10));	
		int sum1=0;
		int to=0;
		float accept1=0,reject1=0,total1=0;
		System.out.println("Purchase Size :"+BatchReport.prdata.size()/7+"     Repay Size:"+BatchReport.brdatastat.size()/8);
		float allsum1= 0;
		float repaybill1=0;
		for(int i=0;i<(BatchReport.prdata.size()/7);i++) {
			
		
		System.out.println();
			
			 //repaybill1+=Float.parseFloat(BatchReport.brdatastat.get(to+1));
		
		
		purchaseData.add(BatchReport.prdata.get(to));
		purchaseData.add(BatchReport.prdata.get(to+2).substring(0,10));
		purchaseData.add(BatchReport.prdata.get(to+1));
		purchaseData.add("-");
		purchaseData.add("-");
		purchaseData.add("-");
		purchaseData.add("-");
		purchaseData.add("-");
		
			table_2.addCell(
					new Paragraph(BatchReport.prdata.get(to)).setTextAlignment(TextAlignment.CENTER).setFontSize(10));
			table_2.addCell(
					new Paragraph(BatchReport.prdata.get(to+2).substring(0,10)).setTextAlignment(TextAlignment.CENTER).setFontSize(10));
			table_2.addCell(
					new Paragraph(BatchReport.prdata.get(to+1)).setTextAlignment(TextAlignment.CENTER).setFontSize(10));
//		table_2.addCell(
//					new Paragraph("ee").setTextAlignment(TextAlignment.CENTER).setFontSize(10));

		accept1=accept1+Float.parseFloat(BatchReport.prdata.get(to+1));

		to+=7;
		
		}
			//table_2.setMarginBottom(8);
			//table_2.setHorizontalAlignment(HorizontalAlignment.CENTER);
			//doc.add(table_2);
			
			Text text8 = new Text("Statement :");
			text8.setFont(font);
			doc.add(new Paragraph(text8));
		
			
//			for(int k=0;k<16;k++) {
//		    	purchaseData.add("-");
//		    }
//			
//		   
//			if(BatchReport.brdatastat.size()<=purchaseData.size()) {
//				for(int k=0;k<BatchReport.brdatastat.size()-purchaseData.size();k++) {
//			    	purchaseData.add("-");
//			    }
//							
//			}else {
//			
//			for(int k=0;k<purchaseData.size()-BatchReport.brdatastat.size();k++) {
//				BatchReport.brdatastat.add("-");
//		    }
//			
//			}
			
			float[] pointColumnWidths5 = {80F, 95F, 95F, 95F , 95F, 95F, 110F};
			Table table_5 = new Table(pointColumnWidths5);
	          
			table_5.addCell(new Paragraph("B.No").setTextAlignment(TextAlignment.CENTER).setBold().setFontSize(10));
			table_5.addCell(new Paragraph("BILL AMOUNT").setTextAlignment(TextAlignment.CENTER).setBold().setFontSize(10));
			table_5.addCell(new Paragraph("DATE").setTextAlignment(TextAlignment.CENTER).setBold().setFontSize(10));
			table_5.addCell(new Paragraph("PAY AMOUNT").setTextAlignment(TextAlignment.CENTER).setBold().setFontSize(10));
			table_5.addCell(new Paragraph("PAY DATE").setTextAlignment(TextAlignment.CENTER).setBold().setFontSize(10));
			table_5.addCell(new Paragraph("PAY TYPE").setTextAlignment(TextAlignment.CENTER).setBold().setFontSize(10));
			table_5.addCell(new Paragraph("DESCRIPTION").setTextAlignment(TextAlignment.CENTER).setBold().setFontSize(10));
			

			int sum=0;
			int tot=0;
			
			//System.out.println("Size Re :"+BatchReport.brdatastat.size()+"      Size pu"+purchaseData.size());
			float allsum= 0;
			
			int bigsize=0;
			int switchFlag=0;
			if((BatchReport.brdatastat.size()/8)==(purchaseData.size()/8)){
				bigsize=(purchaseData.size()/8);
			}else if((BatchReport.brdatastat.size()/8)>(purchaseData.size()/8)){
				bigsize=(BatchReport.brdatastat.size()/8);
				switchFlag=1;
			}else {
				bigsize=(purchaseData.size()/8);
				switchFlag=2;
			}
			
			for(int i=0;i<bigsize;i++) {
				
				Float repaybill= totalbill-(allsum+=Float.parseFloat(BatchReport.brdatastat.get(tot+1)));
			if((purchaseData.size()/8)>i) {
				table_5.addCell(new Paragraph(purchaseData.get(tot)).setTextAlignment(TextAlignment.CENTER).setFontSize(10));
				table_5.addCell(new Paragraph(purchaseData.get(tot+2)).setTextAlignment(TextAlignment.CENTER).setFontSize(10));
				table_5.addCell(new Paragraph(purchaseData.get(tot+1).substring(8)+"-"+purchaseData.get(tot+1).substring(5,8)+purchaseData.get(tot+1).substring(0,4)).setTextAlignment(TextAlignment.CENTER).setFontSize(10));
			}else {
				table_5.addCell(new Paragraph("-").setTextAlignment(TextAlignment.CENTER).setFontSize(10));
				table_5.addCell(new Paragraph("-").setTextAlignment(TextAlignment.CENTER).setFontSize(10));
				table_5.addCell(new Paragraph("-").setTextAlignment(TextAlignment.CENTER).setFontSize(10));
			}
				

			
			
			if(BatchReport.brdatastat.get(tot+2).equals("2000-03-29 11:31:06.0")) {	
				table_5.addCell(
						new Paragraph("-").setTextAlignment(TextAlignment.CENTER).setFontSize(10));
				
				table_5.addCell(new Paragraph("-")
					.setTextAlignment(TextAlignment.CENTER).setFontSize(10));
			}else {
				table_5.addCell(
						new Paragraph(BatchReport.brdatastat.get(tot+1)).setTextAlignment(TextAlignment.CENTER).setFontSize(10));
				
				table_5.addCell(new Paragraph(BatchReport.brdatastat.get(tot+2).substring(0,10).substring(8)+"-"+BatchReport.brdatastat.get(tot+2).substring(0,10).substring(5,8)+BatchReport.brdatastat.get(tot+2).substring(0,10).substring(0,4))
						.setTextAlignment(TextAlignment.CENTER).setFontSize(10));
			}
			table_5.addCell(
					new Paragraph(BatchReport.brdatastat.get(tot+3)).setTextAlignment(TextAlignment.CENTER).setFontSize(10));
			table_5.addCell(
					new Paragraph(BatchReport.brdatastat.get(tot+6)).setTextAlignment(TextAlignment.CENTER).setFontSize(10));
			accept=accept+Float.parseFloat(BatchReport.brdatastat.get(tot+1));
		
	
			tot+=8;
			
			}
//			
			PdfFont finalfont = PdfFontFactory.createFont(FontConstants.HELVETICA_BOLDOBLIQUE);
			Text tex1 = new Text("TOTAL");
			tex1.setFont(finalfont);
			Text tex5 = new Text("-");
			tex5.setFont(finalfont);
			Text tex6 = new Text("-");
			tex6.setFont(finalfont);
			Text tex7 = new Text(Float.toString(accept1));
			tex7.setFont(finalfont);
			Text tex2 = new Text(Float.toString(accept));
			tex2.setFont(finalfont);
			Text tex3 = new Text("-");
			tex3.setFont(finalfont);
			Text tex4 = new Text("-");
			tex4.setFont(finalfont);
		
		
			
			table_5.addCell(new Paragraph(tex1).setTextAlignment(TextAlignment.CENTER).setBold().setFontSize(10));
			table_5.addCell(new Paragraph(tex7).setTextAlignment(TextAlignment.CENTER).setBold().setFontSize(10));
			table_5.addCell(new Paragraph(tex3).setTextAlignment(TextAlignment.CENTER).setBold().setFontSize(10));
			table_5.addCell(new Paragraph(tex2).setTextAlignment(TextAlignment.CENTER).setBold().setFontSize(10));
			table_5.addCell(new Paragraph(tex4).setTextAlignment(TextAlignment.CENTER).setBold().setFontSize(10));
			table_5.addCell(new Paragraph(tex5).setTextAlignment(TextAlignment.CENTER).setBold().setFontSize(10));
			table_5.addCell(new Paragraph(tex6).setTextAlignment(TextAlignment.CENTER).setBold().setFontSize(10));
			
			//table_5.addCell(new Paragraph(tex5).setTextAlignment(TextAlignment.CENTER).setBold().setFontSize(10));
			//table_5.addCell(new Paragraph(tex6).setTextAlignment(TextAlignment.CENTER).setBold().setFontSize(10).setUnderline(2,-4));
			table_5.setMarginBottom(8);
			table_5.setHorizontalAlignment(HorizontalAlignment.CENTER);
			doc.add(table_5);
			
			
			
			Text text4 = new Text("Details :");
			text4.setFont(font);
			doc.add(new Paragraph(text4));
			float[] pointColumnWidths2b = {170F, 165F, 165F };
			Table table_b = new Table(pointColumnWidths2b);					
			
			table_b.addCell(new Paragraph("Total Amount").setTextAlignment(TextAlignment.CENTER).setBold().setFontSize(10));
			table_b.addCell(new Paragraph("Paid Amount").setTextAlignment(TextAlignment.CENTER).setBold().setFontSize(10));
			table_b.addCell(new Paragraph("Pending Amount").setTextAlignment(TextAlignment.CENTER).setBold().setFontSize(10));
			table_b.addCell(
					new Paragraph(Float.toString(accept1)).setTextAlignment(TextAlignment.CENTER).setFontSize(10));
			table_b.addCell(
					new Paragraph(Float.toString(accept)).setTextAlignment(TextAlignment.CENTER).setFontSize(10));
			table_b.addCell(
					new Paragraph(Float.toString(accept1-accept)).setTextAlignment(TextAlignment.CENTER).setFontSize(10));
			table_b.setHorizontalAlignment(HorizontalAlignment.CENTER);
			doc.add(table_b);
			
			  System.out.println("merging pdf..");

		JOptionPane.showMessageDialog(null, "PDF generated..");
			doc.close();
			
		
		} catch (Exception e) {
			// TODO: handle exception
		}

	}// reportGenerat(); B.pdf
	
	
	
}// class


