package DAO;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import oracle.jdbc.driver.OraclePreparedStatement;
import view.Application;
import view.FetchParameter;

public class UserDAO {
	static String login = "SELECT * FROM login WHERE name = ? and password= ?";
	static String bparameters = "select sum(BILLAMOUNT) from purchase where SUPPNAME=?";
	static String repayTotal = "select sum(PAYAMOUNT) from repay where  SUPPNAME=?";
	static String repayEntry = "select * from repay where  SUPPNAME=?";
	 static  String batchReportdetails="SELECT * FROM purchase WHERE  SUPPNAME = ?";
	 static  String batchReportstat="SELECT * FROM repay WHERE  SUPPNAME = ?";
	
	static String detsil = "INSERT INTO registration values(?,?,?,?)";
	static String purchase_detsil = "insert into purchase values (?,?,?,?,?,?,?)";
	static String repay_detsil = "insert into repay values (?,?,?,?,?,?,?,?)";
	static String INSERT_login = "INSERT INTO login values(?,?)";
	static String deletebatchdetails="delete from purchase where billno=? and billamount=?";
	
	static String deleteSupplier="delete from registration  where SHOPNAME=? and SUPPNAME=?";
	static String deleterepayAccount="delete from repay where SUPPNAME=?";
	static String deletepurchaseAccount="delete from purchase where SUPPNAME=?";
	
	
	
	static String deleterepayRecord="delete from repay where PAYAMOUNT=? and PAYTYPE=? and DESCRIPTION=?";
	
	
	int result;
	public static ArrayList<String> fetchedpara = new ArrayList<String>();
	
	public static ArrayList<String> componentlist = new ArrayList<String>();
	public static ArrayList<String> batchreportparam = new ArrayList<String>();
	public static ArrayList<String> componentlistdc = new ArrayList<String>();
	public static ArrayList<String> tableRowData = new ArrayList<String>();
	public static ArrayList<String> tableRowDatap = new ArrayList<String>();
	public static ArrayList<String> newOpenfiledata = new ArrayList<String>();
	public static int modevalue=0;
	static Connection connection;
	public static Connection connection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		 try {
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","system");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	public int checkLogin(String name, String password) throws SQLException, ClassNotFoundException {
		PreparedStatement statement = connection().prepareStatement(login);
		statement.setString(1, name);
		statement.setString(2, password);

		ResultSet rs = statement.executeQuery();

		while (rs.next())
			if (rs.getString(1).equals(name) && rs.getString(2).equals(password)) {
				result = 1;
			} else {
				result = 0;
			}

		connection().close();
		return result;

	}// checkLogin(...,....);

	public static int batchData(String CITY, String CONTACTNUM, String SUPPNAME, String SHOPNAME)
			throws Exception {
		try {
			
		//	System.out.println(SHOPNAME+"      "+SUPPNAME+"     "+CITY+"     "+CONTACTNUM);
			PreparedStatement pstmt = connection().prepareStatement(detsil);

			
				pstmt.setString(1, SHOPNAME);
			pstmt.setString(2, SUPPNAME);
			pstmt.setString(3, CITY);
			pstmt.setString(4, CONTACTNUM);
			pstmt.execute();
			
			//JOptionPane.showInternalMessageDialog(null, "Registation successfully..!");
			
		} catch (Exception e) {
			System.out.print(e);
			e.printStackTrace();
		}

		return 1;
	}// insert

	
	
	
	
	
	
	
	
	
	
	
	public static int registration(String uname, String password) throws Exception {
		int result = 0;
		try {
			PreparedStatement pstmt = connection().prepareStatement(INSERT_login);
			pstmt.setString(1, uname);
			pstmt.setString(2, password);
			// pstmt.execute();
			result = pstmt.executeUpdate();

			connection().close();

		} catch (Exception e) {
			System.out.print(e);
			e.printStackTrace();
		}

		return result;
	}// registration(..,..);
	
	

	
	
	public static int purchaseData(String BILLNO, Float BILLAMOUNT, String DELIVEREDDATE, String SUPPNAME,String LOGIN, String BILLPHOTONAME,String DESCRIPTION)
			throws Exception {
		try
		{
			System.out.println(BILLNO+"    "+BILLAMOUNT+"     "+DELIVEREDDATE+"   "+SUPPNAME+"    "+LOGIN+"   "+BILLPHOTONAME+"     "+DESCRIPTION);
			java.text.SimpleDateFormat MMddyyyyHHmmss = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		OraclePreparedStatement ps = (OraclePreparedStatement)UserDAO.connection().prepareStatement(purchase_detsil);
			String date =DELIVEREDDATE ;
			java.util.Date ud = MMddyyyyHHmmss.parse(date); 
			Timestamp ts = new java.sql.Timestamp(ud.getTime());
			
			ps.setString(1,BILLNO);
		ps.setFloat(2, BILLAMOUNT);
			ps.setTimestamp(3,ts);
			ps.setString(4,SUPPNAME);
		ps.setString(5,LOGIN);
			ps.setString(6,BILLPHOTONAME);
			ps.setString(7,DESCRIPTION);
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Bill saved successfully..");
		}		
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return 1;
	}// insert
	
	

	public static int repayData( Float PAYAMOUNT, String PAYDATE,String PAYTYPE ,String SUPPNAME,String LOGIN,String DESCRIPTION)
			throws Exception {
		try
		{
			System.out.println("    "+PAYAMOUNT+"     "+PAYDATE+"   "+PAYTYPE+"    "+SUPPNAME+"   "+LOGIN+"     "+DESCRIPTION);
			java.text.SimpleDateFormat MMddyyyyHHmmss = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		OraclePreparedStatement ps = (OraclePreparedStatement)UserDAO.connection().prepareStatement(repay_detsil);
			String date =PAYDATE ;
			java.util.Date ud = MMddyyyyHHmmss.parse(date); 
			Timestamp ts = new java.sql.Timestamp(ud.getTime());
			
			ps.setString(1,"KGM");
		    ps.setFloat(2, PAYAMOUNT);
			ps.setTimestamp(3,ts);
			ps.setString(4,PAYTYPE);
		    ps.setString(5,SUPPNAME);
			ps.setString(6,LOGIN);
			ps.setString(7,DESCRIPTION);
			ps.setFloat(8,(float) 12.5);
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Repaid successfully..");
		}		
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return 1;
	}// insert
	
	

	public static void batchOpen(String name ) throws SQLException, ClassNotFoundException {
		try {
		if (name != null) {
			PreparedStatement st = connection().prepareStatement(bparameters);
			
			st.setString(1, name);
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				fetchedpara.add(Float.toString(rs.getFloat(1)));


				}
			
			System.out.println("data purchase sum :"+fetchedpara);
		
			repayTableOpen(name);
			//tubeOpen(name);
		

		} else {
			JOptionPane.showMessageDialog(null, "Please select the batch.");
		}
	}catch (Exception e) {
		// TODO: handle exception
	}
	finally {
	    try {
	        if (connection != null && !connection.isClosed())
	            {
	        	connection.close();
	            //Thread.sleep(1000);
	             }
	        }
	    catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	}// batchOpen(...,....);
	
	
	
	
	public static void repayTableOpen(String name) throws SQLException, ClassNotFoundException {
		if (name != null) {
			PreparedStatement st = connection().prepareStatement(repayTotal);
			
			st.setString(1, name);
			ResultSet rs = st.executeQuery();
		
			 
	           
			while (rs.next()) {
//				tweetCount=Float.toString(rs.getFloat(1));
//				System.out.println("===>"+tweetCount);
				fetchedpara.add(Float.toString(rs.getFloat(1)));


				}
			batchReport(name);
			
			
		} else {
			JOptionPane.showMessageDialog(null, "Please select the batch.");
		}

	}// batchOpen(...,....);
	
	
	
	
	public static void batchReport( String suppliername) throws ClassNotFoundException, SQLException {
try {
		if (suppliername != null) {
			PreparedStatement st = UserDAO.connection().prepareStatement(batchReportdetails);
		
			
			st.setString(1, suppliername);
			ResultSet rs = st.executeQuery();
		tableRowData.clear();
		
			while (rs.next()) {
				tableRowData.add(rs.getString(1));
				tableRowData.add(Float.toString(rs.getFloat(2)));
				tableRowData.add(rs.getTimestamp(3).toString());
				tableRowData.add(rs.getString(4));
				tableRowData.add(rs.getString(5));
				tableRowData.add(rs.getString(6));
				tableRowData.add(rs.getString(7));	
			}
			System.out.println("Batch report details :"+tableRowData);
	
		batchReportStat(suppliername);
			//BatchReportGeneration.batchreportGeneratb();	
			
		} else {
			JOptionPane.showMessageDialog(null, "Please select the batch.");
		}
}catch (Exception e) {
	// TODO: handle exception
}
finally {
    try {
        if (connection != null && !connection.isClosed())
            {
        	connection.close();
            //Thread.sleep(1000);
             }
        }
    catch (SQLException e) {
        e.printStackTrace();
    }
}
	
		
	}
	
	
	public static void batchReportStat( String suppliername) throws ClassNotFoundException, SQLException {
try {
		if (suppliername != null) {
			PreparedStatement st = UserDAO.connection().prepareStatement(batchReportstat);
			
			st.setString(1,suppliername);
			ResultSet rs = st.executeQuery();
			tableRowDatap.clear();
			while (rs.next()) {
				tableRowDatap.add(rs.getString("BILLNO"));

				tableRowDatap.add(Float.toString( rs.getFloat("PAYAMOUNT")));
				tableRowDatap.add(rs.getTimestamp("PAYDATE").toString());
				tableRowDatap.add(rs.getString("PAYTYPE"));
				tableRowDatap.add(rs.getString("SUPPNAME"));
				tableRowDatap.add(rs.getString("LOGINNAME"));
				tableRowDatap.add(rs.getString("DESCRIPTION"));
				tableRowDatap.add(Float.toString( rs.getFloat("BALANCE")));
				
				
			}
			System.out.println("Batch report stat :"+tableRowDatap);
			
			for(int i=0;i<Application.tableRowCount;i++) {
				((DefaultTableModel)Application.model).removeRow(0);
			}
		Application.displayRepayData();
		
            connection().close();
		     FetchParameter.parameterSetting();
			System.out.println(fetchedpara);
			fetchedpara.clear();
			FetchParameter.frame2.dispose();
			
			
			
			
			//BatchReportGeneration.batchreportGeneratb();
			//BatchReportGeneration.batchreportGenerat();
			
		} else {
			JOptionPane.showMessageDialog(null, "Please select the batch.");
		}

}catch (Exception e) {
	// TODO: handle exception
}
finally {
    try {
        if (connection != null && !connection.isClosed())
            {
        	connection.close();
            //Thread.sleep(1000);
             }
        }
    catch (SQLException e) {
        e.printStackTrace();
    }
}
		
	}
	
	
	
	
	

	
	


	
	
	
	

	
	
	
	
	
	public static int deleteBatch(String bno,String bamount) throws NumberFormatException, SQLException, ClassNotFoundException  {
		int result=0;
		PreparedStatement pstrect = connection().prepareStatement(deletebatchdetails);
		pstrect.setString(1, bno);
		pstrect.setFloat(2, Float.parseFloat(bamount));
		
	result=	pstrect.executeUpdate();
	
		connection().close();
		return result;
		
	}
	
	
	
	
	public static int deleteSupplier(String suppName,String shopName) throws NumberFormatException, SQLException, ClassNotFoundException  {
		int result=0;
		PreparedStatement pstrect = connection().prepareStatement(deleteSupplier);
		pstrect.setString(1, suppName);	
		pstrect.setString(2, shopName);	
	result=	pstrect.executeUpdate();
	
	
	
	PreparedStatement pstRepay = connection().prepareStatement(deleterepayAccount);
	pstRepay.setString(1, suppName);	
result=	pstRepay.executeUpdate();



PreparedStatement pstPurchase = connection().prepareStatement(deletepurchaseAccount);
pstPurchase.setString(1, suppName);	
result=	pstPurchase.executeUpdate();



		connection().close();
		return result;
		
	}
	

	public static int deleteRepayRecord(String pamount,String ptype,String rpdescription) throws NumberFormatException, SQLException, ClassNotFoundException  {
		int result=0;
		PreparedStatement pstrect = connection().prepareStatement(deleterepayRecord);
		pstrect.setFloat(1, Float.parseFloat(pamount));
		pstrect.setString(2, ptype);
		pstrect.setString(3, rpdescription);
		
	result=	pstrect.executeUpdate();
	
		connection().close();
		return result;
		
	}
	

	
	
	

}