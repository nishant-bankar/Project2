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

import DAO.BatchReport;
import DAO.UserDAO;

public class Batchwisereport {

public static boolean bopnflag=true;
public static String dbatchname;
//    JFrame frame1;//creating object of first JFrame
//    JLabel nameLabel;//creating object of JLabel
//    JTextField nameTextField;//creating object of JTextfield
//    JButton fetchButton;//creating object of JButton
//    JButton resetButton;//creating object of JButton
//    
//   public static JFrame frame2;//creating object of second JFrame
//    DefaultTableModel defaultTableModel;//creating object of DefaultTableModel
//    JTable table;//Creating object of JTable
//    Connection connection;//Creating object of Connection class
//  
//    static int flag=0;
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
private JPanel panel_1;

/**
 * @wbp.parser.entryPoint
 */
public  void frameSecond() {
	Application.headline="Component display";
	   frame2 = new JFrame("Database Results");
	   frame2.getContentPane().setBackground(new Color(255, 250, 250));
	  // frame2.setBounds((Application.screen_width-450)/2, (Application.screen_height-347)/2, 450, 347);
//    frame2.setBounds(200, 200, 400, 400);
//    frame2.setResizable(false);
    
	   model = new DefaultTableModel();
	   Statement statement=null;
	   frame2.setTitle("Batch Display");
	      //String[] columnNames = {"Name", "Technology"};
	     
	   ((DefaultTableModel) model).addColumn("Suplier Name");
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

       int[] selectedRow = table.getSelectedRows();
       int selectedColumns =1;// table.getSelectedColumns();
       int selectedColumns1 =0;
       for (int i = 0; i < selectedRow.length; i++) {
         for (int j = 0; j <= selectedColumns; j++) {
           
           selectedData= (String) table.getValueAt(selectedRow[i], selectedColumns);
         }
         
         for (int u = 0; u <= selectedColumns1; u++) {
             selectedData2 = (String) table.getValueAt(selectedRow[i], selectedColumns1);
             
           }
       }
      // System.out.println("Selected: " + selectedData);
      // System.out.println("Selected: " + selectedData2);
       componentName=selectedData2;
       batchname=selectedData;
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
   
   JButton btnNewButton = new JButton("Report");
   btnNewButton.setBackground(Color.LIGHT_GRAY);
   btnNewButton.setBounds(5, 5, 100, 36);
   panel.add(btnNewButton);
   btnNewButton.addActionListener(new ActionListener() {
	
	
	public void actionPerformed(ActionEvent e) {
		ReportForm.textf.setText(batchname);
		
		
//			panel_11.setVisible(true);
//		button_10.setVisible(true);
//        scrollPane.setVisible(true);
		
		
		try {
			System.out.println("==>"+batchname+"   "+componentName);
			BatchReport.batchReport(batchname);
			
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// TODO Auto-generated method stub
		 
//			 DigitalWatch.saveparamdesi=0;
//			 DigitalWatch.saveparamflagelli=false;
//			 DigitalWatch.saveparamflagrect=false;
//			 DigitalWatch.saveparamflag=false;
//			 Application.btnNewButton_2_2_1_1_1_1_1.setBackground(SystemColor.activeCaption);
//			 
//			 UserDAO.fetchedpara.clear();
//			UserDAO.batchOpen(batchname);
			 
			 
			
		
	}
});
   
   JButton btnNewButton_1 = new JButton("Cancle");
   btnNewButton_1.setBackground(Color.LIGHT_GRAY);
   btnNewButton_1.setBounds(350, 5, 130, 36);
   panel.add(btnNewButton_1);
   
   JButton btnDelete = new JButton("DELETE");
   btnDelete.addActionListener(new ActionListener() {
   	public void actionPerformed(ActionEvent e) {
   		
//   		JFrame ourFrame = new JFrame("Delete Batch Form ");
//		
//		DeleteFrame.deleteForm(ourFrame);
//		Application.headline="Delete Batch form";
//		dbatchname=batchname;
		
		
//   		try {
//		int result=0;	 
//		result= UserDAO.deleteBatch(batchname);
//		System.out.println("------------------>"+result);
//   		if(result==0) {
//   			JOptionPane.showMessageDialog(null, "Please First Select The Batch");
//   		}else {
//   			JOptionPane.showMessageDialog(null, "\""+batchname+"\" Delete Successfully..!");
//		}
//   		} catch (NumberFormatException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (ClassNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (SQLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
   	}
   });
   btnDelete.setBackground(Color.LIGHT_GRAY);
   btnDelete.setBounds(193, 5, 100, 36);
   //panel.add(btnDelete);
   btnNewButton_1.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	frame2.dispose();
		
		
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
   //frame2.setBounds(380,170, 500,370);
   frame2.setBounds((Application.screen_width-500)/2, (Application.screen_height-370)/2, 500, 370);
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





















       /**
        * @wbp.parser.entryPoint
        */
//       public  void frameSecond() {
//    	   Statement statement=null;
//    	//setting the properties of second JFrame
//        frame2 = new JFrame("Database Results");
//        frame2.setBounds(200, 200, 400, 400);
//        frame2.setResizable(false);
//        //Setting the properties of JTable and DefaultTableModel
//        defaultTableModel = new DefaultTableModel();
//       
//        frame2.getContentPane().setLayout(null);
//        table = new JTable(defaultTableModel);
//        table.setPreferredScrollableViewportSize(new Dimension(400, 300));
//        table.setFillsViewportHeight(true);
//        ListSelectionModel cellSelectionModel = table.getSelectionModel();
//        cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//
//        cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
//          public void valueChanged(ListSelectionEvent e) {
//            String selectedData = null;
//
//            int[] selectedRow = table.getSelectedRows();
//            int selectedColumns =0;// table.getSelectedColumns();
//
//            for (int i = 0; i < selectedRow.length; i++) {
//              for (int j = 0; j <= selectedColumns; j++) {
//                selectedData = (String) table.getValueAt(selectedRow[i], selectedColumns);
//              }
//            }
//           // System.out.println("Selected: " + selectedData);
//            batchname=selectedData;
//          }
//
//        });
//        JScrollPane scrollPane = new JScrollPane(table);
//        scrollPane.setBounds(41, 5, 302, 102);
//        frame2.getContentPane().add(scrollPane);
//        
//        JButton btnNewButton = new JButton("Open");
//        btnNewButton.addActionListener(new ActionListener() {
//        	public void actionPerformed(ActionEvent e) {
//        	//openBatch("Krishna");
//        		try {
//        			//System.out.println(batchname);
//				 UserDAO.batchOpen(batchname);
//					
//			
//					
//				
//        		} catch (ClassNotFoundException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				} 
//        		
//        		catch (SQLException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//        	}
//        } );
//        btnNewButton.setBounds(43, 225, 89, 23);
//        frame2.getContentPane().add(btnNewButton);
//        
//        JButton btnCancel = new JButton("Cancel");
//        btnCancel.setBounds(180, 225, 89, 23);
//        btnCancel.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				frame2.dispose();
//				
//			}
//		});
//        frame2.getContentPane().add(btnCancel);
//        defaultTableModel.addColumn("Username");
//        defaultTableModel.addColumn("Roll No");
//        defaultTableModel.addColumn("Department");
//
//
//
//
//        try {
//        	
//            try {
//				 statement = UserDAO.connection().createStatement();
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}//crating statement object
//            String query = "select * from details";//Storing MySQL query in A string variable
//            ResultSet resultSet = statement.executeQuery(query);//executing query and storing result in ResultSet
//
//
//            while (resultSet.next()) {
//            	
//            	//Retrivind details from the database and stroing it in the String variables
//                String name = resultSet.getString("BNAME");
//                String roll = resultSet.getString("CUSNAME");
//                String dept = resultSet.getString("GRADE");
//                //if (userName.equalsIgnoreCase(name)) {
//                    flag = 1;
//                    defaultTableModel.addRow(new Object[]{name, roll, dept});//Adding row in Table
//                    frame2.setVisible(true);//Setting the visibility of second Frame
//                    frame2.validate();
//                   // break;
//                //}
//
//            }
//
//            if (flag == 0) {
//                JOptionPane.showMessageDialog(null, "No Such Username Found");//When invalid username is entered
//            }
//            try {
//				UserDAO.connection().close();
//			} catch (ClassNotFoundException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//
//
//        frame2.addWindowListener(new WindowListener() {
//			
//			@Override
//			public void windowOpened(WindowEvent e) {}
//			
//			@Override
//			public void windowIconified(WindowEvent e) {
//				frame2.dispose();
//			}
//			
//			@Override
//			public void windowDeiconified(WindowEvent e) {}
//			
//			@Override
//			public void windowDeactivated(WindowEvent e) {
//				frame2.dispose();
//			}
//			
//			@Override
//			public void windowClosing(WindowEvent e) {}
//			
//			@Override
//			public void windowClosed(WindowEvent e) {}
//			
//			@Override
//			public void windowActivated(WindowEvent e) {}
//		});
//        
//    }//frameSecond();
       
       public static void parameterSetting() {
    	   String openpgain = null;
    	   bopnflag=false;
   		Application.textField.setText(UserDAO.fetchedpara.get(0)); 
   		Application.tpre=UserDAO.fetchedpara.get(0);
   		
   		Application.textField_1.setText(UserDAO.fetchedpara.get(1));
   		Application.tpre_1=UserDAO.fetchedpara.get(1);
   		
   		Application.textField_3.setText(UserDAO.fetchedpara.get(5));
  		Application.tpre_3=UserDAO.fetchedpara.get(5);
     	
  		Application.textField_7.setText(UserDAO.fetchedpara.get(6));
   		Application.tpre_7=UserDAO.fetchedpara.get(6);
  		
  		Application.textField_8.setText(UserDAO.fetchedpara.get(7));
   		Application.tpre_8=UserDAO.fetchedpara.get(7);
  		
   		Application.lblbname.setText(UserDAO.fetchedpara.get(8));//Batch namae
   		Application.lblNewLabel_26.setText(componentName);//Component name
   		
   		Application.textField_9.setText(UserDAO.fetchedpara.get(3));
   		Application.tpre_9=UserDAO.fetchedpara.get(3);
   		
   		Application.textField_2.setText(UserDAO.fetchedpara.get(4));
   		Application.tpre_2=UserDAO.fetchedpara.get(4);
   		
   		Application.textField_10.setText(UserDAO.fetchedpara.get(9));
   		Application.textField_11.setText(UserDAO.fetchedpara.get(10));
   		Application.textField_12.setText(UserDAO.fetchedpara.get(11));
   		
   		if(UserDAO.modevalue==29300) {
   		//rectangle
   			Application.panel_1_3_1_2.setVisible(true);
   			Application.panel_1_3_1_1_1.setVisible(true);
   			Application.panel_1_3_1_2_1.setVisible(false);
   			Application.panel_1_3_1_1_1_1.setVisible(false);
   		Application.spinner_1_1_1.setValue(Integer.parseInt(UserDAO.fetchedpara.get(12)));  
		Application.spinner_3.setValue(Integer.parseInt(UserDAO.fetchedpara.get(13)));      
		Application.spinner_1_1_1_1.setValue(Integer.parseInt(UserDAO.fetchedpara.get(14)));  
		Application.spinner_1_1.setValue(Integer.parseInt(UserDAO.fetchedpara.get(15)));   
		Application.spinner.setValue(Integer.parseInt(UserDAO.fetchedpara.get(16)));    
		Application.spinner_1.setValue(Integer.parseInt(UserDAO.fetchedpara.get(17)));
		//Application.spinner_1.setValue(Integer.parseInt(UserDAO.fetchedpara.get(16)));  //angle
   		}else if(UserDAO.modevalue==26298) {
   			Application.panel_1_3_1_2.setVisible(false);
   			Application.panel_1_3_1_1_1.setVisible(false);
   			Application.panel_1_3_1_2_1.setVisible(true);
   			Application.panel_1_3_1_1_1_1.setVisible(true);
   	   		
   			Application.spinner_1_1_1_3.setValue(Integer.parseInt(UserDAO.fetchedpara.get(12)));  
   			Application.spinner_3_1.setValue(Integer.parseInt(UserDAO.fetchedpara.get(13)));      
   			Application.spinner_1_1_1_1_1.setValue(Integer.parseInt(UserDAO.fetchedpara.get(14)));  
   			Application.spinner_1_1_2.setValue(Integer.parseInt(UserDAO.fetchedpara.get(15)));   
   			
   			Application.spinner.setValue(Integer.parseInt(UserDAO.fetchedpara.get(16)));    
   			Application.spinner_1.setValue(Integer.parseInt(UserDAO.fetchedpara.get(17)));
   			Application.rotation_angle=Integer.parseInt(UserDAO.fetchedpara.get(18)); //angle
   		}
   		//elipse
   		if(UserDAO.fetchedpara.get(2).contains("LOW")) {
   			Application.spinner_2.setValue(Application.spinner_2_2.getValue());	
   			openpgain="1#";
   			Application.lblNewLabel_21.setText("LOW");
   		}else if(UserDAO.fetchedpara.get(2).contains("MEDIUM")) {
   			Application.spinner_2.setValue(Application.spinner_2_2.getNextValue());
   			openpgain="2#";
   			Application.lblNewLabel_21.setText("MEDIUM");
   		}else if(UserDAO.fetchedpara.get(2).contains("HIGH")) {
   			Application.spinner_2.setValue(Application.spinner_2_3.getValue());
   			openpgain="3#";
   			Application.lblNewLabel_21.setText("HIGH");
   		}
   		
   		//System.out.println("Open file data :  "+UserDAO.fetchedpara);
   		
   		UserDAO.newOpenfiledata.add(0,"#02");
   		UserDAO.newOpenfiledata.add(1,UserDAO.fetchedpara.get(0)+"#");  
   		UserDAO.newOpenfiledata.add(2,UserDAO.fetchedpara.get(1)+"#");  
   		UserDAO.newOpenfiledata.add(3,UserDAO.fetchedpara.get(3)+"#"); 
   		UserDAO.newOpenfiledata.add(4,openpgain);         
   		UserDAO.newOpenfiledata.add(5,UserDAO.fetchedpara.get(4)+"#");
   		
   		UserDAO.newOpenfiledata.add(6,UserDAO.fetchedpara.get(6)+"#");
   		UserDAO.newOpenfiledata.add(7,UserDAO.fetchedpara.get(7)+"#");
   		
   		
  		
  		
   	}//parameterSetting()
}

