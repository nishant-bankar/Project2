package view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import DAO.UserDAO;

public class BatchReport {



public static boolean bopnflag=true;
    JFrame frame1;//creating object of first JFrame
    JLabel nameLabel;//creating object of JLabel
    JTextField nameTextField;//creating object of JTextfield
    JButton fetchButton;//creating object of JButton
    JButton resetButton;//creating object of JButton
    
   public static JFrame frame2;//creating object of second JFrame
    DefaultTableModel defaultTableModel;//creating object of DefaultTableModel
    JTable table;//Creating object of JTable
    Connection connection;//Creating object of Connection class
  
    static int flag=0;
public static String  batchname;

public static  JScrollPane scrollPane;
       /**
        * @wbp.parser.entryPoint
        */
       public  void frameSecond() {
    	   Statement statement=null;
    	//setting the properties of second JFrame
        frame2 = new JFrame("Database Results");
        frame2.setBounds(200, 200, 400, 400);
        frame2.setResizable(false);
        //Setting the properties of JTable and DefaultTableModel
        defaultTableModel = new DefaultTableModel();
       
        frame2.getContentPane().setLayout(null);
        table = new JTable(defaultTableModel);
        table.setPreferredScrollableViewportSize(new Dimension(400, 300));
        table.setFillsViewportHeight(true);
        ListSelectionModel cellSelectionModel = table.getSelectionModel();
        cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
          public void valueChanged(ListSelectionEvent e) {
            String selectedData = null;

            int[] selectedRow = table.getSelectedRows();
            int selectedColumns =0;// table.getSelectedColumns();

            for (int i = 0; i < selectedRow.length; i++) {
              for (int j = 0; j <= selectedColumns; j++) {
                selectedData = (String) table.getValueAt(selectedRow[i], selectedColumns);
              }
            }
           // System.out.println("Selected: " + selectedData);
            batchname=selectedData;
          }

        });
         scrollPane = new JScrollPane(table);
        scrollPane.setBounds(41, 5, 302, 102);
        frame2.getContentPane().add(scrollPane);
        
        JButton btnNewButton = new JButton("Create");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	//System.out.println(batchname);
				try {
				} catch (Exception e2) {
					// TODO: handle exception
				}
        		
        	}
        } );
        btnNewButton.setBounds(43, 225, 89, 23);
        frame2.getContentPane().add(btnNewButton);
        
        JButton btnCancel = new JButton("Cancel");
        btnCancel.setBounds(180, 225, 89, 23);
        btnCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame2.dispose();
				
			}
		});
        frame2.getContentPane().add(btnCancel);
        defaultTableModel.addColumn("Username");
        defaultTableModel.addColumn("Roll No");
        defaultTableModel.addColumn("Department");




        try {
        	
            try {
				 statement = UserDAO.connection().createStatement();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//crating statement object
            String query = "select * from details";//Storing MySQL query in A string variable
            ResultSet resultSet = statement.executeQuery(query);//executing query and storing result in ResultSet


            while (resultSet.next()) {
            	
            	//Retrivind details from the database and stroing it in the String variables
                String name = resultSet.getString("BNAME");
                String roll = resultSet.getString("CUSNAME");
                String dept = resultSet.getString("GRADE");
                //if (userName.equalsIgnoreCase(name)) {
                    flag = 1;
                    defaultTableModel.addRow(new Object[]{name, roll, dept});//Adding row in Table
                    frame2.setVisible(true);//Setting the visibility of second Frame
                    frame2.validate();
                   // break;
                //}

            }

            if (flag == 0) {
                JOptionPane.showMessageDialog(null, "No Such Username Found");//When invalid username is entered
            }
            try {
				UserDAO.connection().close();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        frame2.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {}
			
			@Override
			public void windowIconified(WindowEvent e) {
				frame2.dispose();
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				frame2.dispose();
			}
			
			@Override
			public void windowClosing(WindowEvent e) {}
			
			@Override
			public void windowClosed(WindowEvent e) {}
			
			@Override
			public void windowActivated(WindowEvent e) {}
		});
        
    }//frameSecond();
       
      
       



	
}
