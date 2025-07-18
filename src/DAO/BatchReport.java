package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import event.BatchReportGeneration;


public class BatchReport {
	 static  String batchReportdetails="SELECT * FROM purchase WHERE  SUPPNAME = ?";
	 static  String batchReportstat="SELECT * FROM repay WHERE  SUPPNAME = ?";
	 static ArrayList<String> brdata=new ArrayList<String>();
public static ArrayList<String> prdata=new ArrayList<String>();
public static ArrayList<String> brdatastat=new ArrayList<String>();
	public static void batchReport( String suppliername) throws ClassNotFoundException, SQLException {

		if (suppliername != null) {
			PreparedStatement st = UserDAO.connection().prepareStatement(batchReportdetails);
		
			
			st.setString(1, suppliername);
			ResultSet rs = st.executeQuery();
			brdata.clear();
			prdata.clear();
			while (rs.next()) {
				prdata.add(rs.getString(1));
				prdata.add(Float.toString(rs.getFloat(2)));
				prdata.add(rs.getTimestamp(3).toString());
				prdata.add(rs.getString(4));
				prdata.add(rs.getString(5));
				prdata.add(rs.getString(6));
				prdata.add(rs.getString(7));	
			}
			//System.out.println("Batch report details :"+prdata);
	
		batchReportStat(suppliername);
			//BatchReportGeneration.batchreportGeneratb();	
			
		} else {
			JOptionPane.showMessageDialog(null, "Please select the batch.");
		}

	
		
	}
	
	
	public static void batchReportStat( String suppliername) throws ClassNotFoundException, SQLException {

		if (suppliername != null) {
			PreparedStatement st = UserDAO.connection().prepareStatement(batchReportstat);
			
			st.setString(1,suppliername);
			ResultSet rs = st.executeQuery();
			brdatastat.clear();
			while (rs.next()) {
				brdatastat.add(rs.getString("BILLNO"));
				brdatastat.add(Float.toString( rs.getFloat("PAYAMOUNT")));
				brdatastat.add(rs.getTimestamp("PAYDATE").toString());
				brdatastat.add(rs.getString("PAYTYPE"));
				brdatastat.add(rs.getString("SUPPNAME"));
				brdatastat.add(rs.getString("LOGINNAME"));
				brdatastat.add(rs.getString("DESCRIPTION"));
				brdatastat.add(Float.toString( rs.getFloat("BALANCE")));
				
				
			}
			System.out.println("Batch report stat :"+brdatastat);
			BatchReportGeneration.batchreportGeneratb();
			//BatchReportGeneration.batchreportGenerat();
			
		} else {
			JOptionPane.showMessageDialog(null, "Please select the batch.");
		}

	
		
	}
	
}
