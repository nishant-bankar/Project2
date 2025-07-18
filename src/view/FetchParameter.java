package view;

import java.awt.Color;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import DAO.UserDAO;

public class FetchParameter {

public static boolean bopnflag=true;
public static String dbatchname;
public static String  date;
public static String  time;



public static JFrame frame2;
public JTextField jtf;
public JLabel searchLbl;
private TableModel model;
private JTable table;
private TableRowSorter sorter;
public JScrollPane jsp;

static int flag=0;
public static String  batchname;
public static String  componentName;
public static String  cityname;
private JPanel panel_1;

/**
 * @wbp.parser.entryPoint
 */
public  void frameSecond() {
	Application.headline="Component display";
	   frame2 = new JFrame("Database Results");
	   frame2.getContentPane().setBackground(new Color(255, 250, 250));
//    frame2.setBounds(200, 200, 400, 400);
//    frame2.setResizable(false);
    
	   model = new DefaultTableModel();
	   Statement statement=null;
	   frame2.setTitle("Batch Display");
	      //String[] columnNames = {"Name", "Technology"};
	     
	   ((DefaultTableModel) model).addColumn("Supplier Name");
	      ((DefaultTableModel) model).addColumn("Shop Name");
	      ((DefaultTableModel) model).addColumn("City");
	      
	     // HashMap<Object, Object> rowdata=new HashMap<Object, Object>();
	      
    try {
    	
        try {
				 statement = UserDAO.connection().createStatement();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//crating statement object
        String query = "select * from registration";//Storing MySQL query in A string variable
        ResultSet resultSet = statement.executeQuery(query);//executing query and storing result in ResultSet


        while (resultSet.next()) {
        	
        	//Retrivind details from the database and stroing it in the String variables
            String name = resultSet.getString("SHOPNAME");
            String roll = resultSet.getString("SUPPNAME");
           String status = resultSet.getString("CITY");
          /*
            System.out.println("==============>>"+dept.substring(0,10));
            //if (userName.equalsIgnoreCase(name)) {
                flag = 1;
                if(dept.substring(0,9).contains(".")) {
                	date=dept.substring(0,8);
                	if(dept.substring(9,15).startsWith(".")) {
                		time=dept.substring(10,15);	
                	}
                	
                	
                }else {
                	date=dept.substring(0,9);
                	if(dept.substring(9,15).startsWith(".")) {
                		time=dept.substring(10,15);	
                	}
                }
                
                */
                String[] aquinas = { roll,name,status};
                ((DefaultTableModel) model).addRow(aquinas);   
               // ((DefaultTableModel) model).addRow(aquinas);
            //}

        }

//        if (flag == 0) {
//            JOptionPane.showMessageDialog(null, "No Such Username Found");//When invalid username is entered
//        }
        try {
				UserDAO.connection().close();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

    } catch (SQLException throwables) {
        throwables.printStackTrace();
    }
	   
  
    //model = new DefaultTableModel(mod., columnNames);
   sorter = new TableRowSorter<>(model);
   table = new JTable(model);
   table.setRowSorter(sorter);
   //getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
   frame2.getContentPane().setLayout(null);
   ListSelectionModel cellSelectionModel = table.getSelectionModel();
   cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

   cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
     public void valueChanged(ListSelectionEvent e) {
       String selectedData = null;
       String selectedData2 = null;
       String selectedData5 = null;

       int[] selectedRow = table.getSelectedRows();
       int selectedColumns =1;// table.getSelectedColumns();
       int selectedColumns1 =0;
       int selectedColumns5 =2;
       for (int i = 0; i < selectedRow.length; i++) {
         for (int j = 0; j <= selectedColumns; j++) {
           
           selectedData= (String) table.getValueAt(selectedRow[i], selectedColumns);
         }
         
         for (int u = 0; u <= selectedColumns1; u++) {
             selectedData2 = (String) table.getValueAt(selectedRow[i], selectedColumns1);
             
           }
         
         for (int u = 0; u <= selectedColumns5; u++) {
        	 selectedData5 = (String) table.getValueAt(selectedRow[i], selectedColumns5);
             
           }
       }
       System.out.println("Selected: " + selectedData);
       System.out.println("Selected: " + selectedData2);
       componentName=selectedData2;
       batchname=selectedData;
       cityname=selectedData5;
     }

   });
   jsp = new JScrollPane(table);
   jsp.setBounds(5, 55, 485, 230);
   frame2.getContentPane().add(jsp);
   
   JPanel panel = new JPanel();
   panel.setBorder(new LineBorder(Color.ORANGE));
   panel.setBackground(SystemColor.info);
   panel.setBounds(5, 288, 485, 46);
   frame2.getContentPane().add(panel);
   panel.setLayout(null);
   
   JButton btnNewButton = new JButton("OPEN");
   btnNewButton.setBackground(Color.LIGHT_GRAY);
   btnNewButton.setBounds(5, 5, 100, 36);
   panel.add(btnNewButton);
   btnNewButton.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// Application.btnNewButton_2_2_1_1_1_1_1.setBackground(SystemColor.activeCaption);
		 System.out.println("Shop Name :"+batchname+"     "+componentName+"     "+cityname);
		 Application.lblNewLabel_4_4_4_1.setText(componentName);
		 Application.lblNewLabel_4_4_2_1.setText(cityname);
		 Application.lblNewLabel_4_4_4.setText(batchname);
		 UserDAO.fetchedpara.clear();
		try {
			UserDAO.batchOpen(batchname);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
});
   
   JButton btnNewButton_1 = new JButton("END BATCH");
   btnNewButton_1.setBackground(Color.LIGHT_GRAY);
   btnNewButton_1.setBounds(350, 5, 130, 36);
   panel.add(btnNewButton_1);
   
   JButton btnDelete = new JButton("DELETE");
   btnDelete.addActionListener(new ActionListener() {
   	public void actionPerformed(ActionEvent e) {
   		
   		JFrame ourFrame = new JFrame("Delete Supplier Form ");
		
		DeleteSupplier.deleteForm(ourFrame);
		Application.headline="Delete Batch form";
		dbatchname=batchname;
		
   	}
   });
   btnDelete.setBackground(Color.LIGHT_GRAY);
   btnDelete.setBounds(193, 5, 100, 36);
   panel.add(btnDelete);
   btnNewButton_1.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//frame2.dispose();
		Application.headline="End Batch Form";
		JFrame ourFrame = new JFrame("End Batch Form ");
		
	}
});
   panel_1 = new JPanel();
   panel_1.setLayout(null);
   panel_1.setBorder(new LineBorder(Color.ORANGE));
   panel_1.setBackground(SystemColor.info);
   panel_1.setBounds(5, 5, 485, 46);
   frame2.getContentPane().add(panel_1);
   searchLbl = new JLabel("Search :");
   searchLbl.setFont(new Font("Tahoma", Font.BOLD, 16));
   searchLbl.setBounds(60, 11, 74, 20);
   panel_1.add(searchLbl);
    jtf= new JTextField(15);
   jtf.setHorizontalAlignment(SwingConstants.CENTER);
   jtf.setFont(new Font("Tahoma", Font.BOLD, 14));
   jtf.setBounds(144, 7, 214, 32);
   panel_1.add(jtf);
   jtf.getDocument().addDocumentListener(new DocumentListener() {
      @Override
      public void insertUpdate(DocumentEvent e) {
         search(jtf.getText());
      }
      @Override
      public void removeUpdate(DocumentEvent e) {
         search(jtf.getText());
      }
      @Override
      public void changedUpdate(DocumentEvent e) {
         search(jtf.getText());
      }
      public void search(String str) {
         if (str.length() == 0) {
            sorter.setRowFilter(null);
         } else {
            sorter.setRowFilter(RowFilter.regexFilter(str));
         }
      }
   });
//   JScrollPane scrollPane = new JScrollPane(table);
//   scrollPane.setBounds(41, 5, 302, 102);
//   add(scrollPane);
   table.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 13));
   table.getTableHeader().setBackground(Color.orange);
   frame2.setBounds((Application.screen_width-500)/2, (Application.screen_height-370)/2, 500, 370);
   // .setBounds(380,170, 500,370);
   //frame2.setDefaultCloseOperation(frame2.EXIT_ON_CLOSE);
   //getContentPane().setLayout(null);
   //setLocationRelativeTo(null);
   frame2.setResizable(false);
   frame2.setVisible(true);
   frame2.addWindowListener(new WindowListener() {
		
		@Override
		public void windowOpened(WindowEvent e) {}
		
		@Override
		public void windowIconified(WindowEvent e) {
			frame2.dispose();
			Application.headline="______";
		}
		
		@Override
		public void windowDeiconified(WindowEvent e) {}
		
		@Override
		public void windowDeactivated(WindowEvent e) {
			frame2.dispose();
			Application.headline="______";
		}
		
		@Override
		public void windowClosing(WindowEvent e) {}
		
		@Override
		public void windowClosed(WindowEvent e) {}
		
		@Override
		public void windowActivated(WindowEvent e) {}
	});
   
}


       
       public static void parameterSetting() {
    	  
   		//Application.textField_6.setText(UserDAO.fetchedpara.get(0)); 
   		//Application.lblNewLabel_4_4_4.setText(UserDAO.fetchedpara.get(3));
  //Application.lblNewLabel_4_4_2_1.setText(UserDAO.fetchedpara.get(2).toString().substring(0,16));
  Application.lblNewLabel_4_4_3_1_1_1_1.setText(UserDAO.fetchedpara.get(0));
  Application.lblNewLabel_4_4_3_1_1_1.setText(UserDAO.fetchedpara.get(1));
  Application.lblNewLabel_4_4_3_1_1.setText(Float.toString(Float.parseFloat(UserDAO.fetchedpara.get(0)) -Float.parseFloat(UserDAO.fetchedpara.get(1))));
   	}//parameterSetting()
}

