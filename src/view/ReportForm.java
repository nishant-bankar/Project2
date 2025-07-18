package view;

import java.awt.Color;


import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import com.itextpdf.text.log.SysoCounter;
import com.toedter.calendar.JDateChooser;

import DAO.BatchReport;
import DAO.UserDAO;

public class ReportForm {
public static	JTextField textf;
	 JFrame frame1;//creating object of first JFrame
	    JLabel nameLabel;//creating object of JLabel
	    JTextField nameTextField;//creating object of JTextfield
	    JButton fetchButton;//creating object of JButton
	    JButton resetButton;//creating object of JButton
	    private static TableRowSorter sorter;
	   public static JFrame frame2;//creating object of second JFrame
	    static DefaultTableModel defaultTableModel;//creating object of DefaultTableModel
	    static JTable table;//Creating object of JTable
	    static JTable table1;
	    Connection connection;//Creating object of Connection class
	  
	    static int flag=0;
	public static String  batchname,operater;

	public static  JScrollPane scrollPane;
	public static  JScrollPane scrollPane1;

//	public JFrame ourFrame = new JFrame("Subscribe");

	public static JTextField textfield_3;
	public static JTextField textfield_4;
	public static JTextField textfield_5;
	public static JPanel panel_2;
	static JButton button_10, button_4,button_11;
	static JPanel panel_11,panel_12;
	static JLabel searchLbl,searchLbl_1;
	static JTextField  jtf,jtf_1;
	static JTextField textf1;
	/**
	 * @wbp.parser.entryPoint
	 */
	public static  void reportDialog(JFrame ourFrame) {

		Application.headline = "Report generation";

		ourFrame.setBounds((Application.screen_width-450)/2, (Application.screen_height-220)/2, 450, 220);
		ourFrame.setResizable(false);
		ourFrame.setState(JFrame.NORMAL);
		ourFrame.addMouseMotionListener(new MouseMotionListener() {
			
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				panel_2.setBackground(new Color(255,239,213));
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
			}
		});

		Container container = ourFrame.getContentPane();
		container.setLayout(null);
		container.setLayout(null);

		panel_11 = new JPanel();
		   panel_11.setLayout(null);
		   panel_11.setBorder(new LineBorder(Color.ORANGE));
		   panel_11.setBackground(SystemColor.info);
		   panel_11.setBounds(5, 5, 430, 46);
		   panel_11.setVisible(false);
		   container.add(panel_11);
		   //searchLbl = new JLabel("Search :");
		   searchLbl = new JLabel("                     Select the Batch");
		   searchLbl.setFont(new Font("Tahoma", Font.BOLD, 16));
		   searchLbl.setBounds(60, 11, 420, 20);
		   panel_11.add(searchLbl);
		   jtf = new JTextField(15);
		   jtf.setHorizontalAlignment(SwingConstants.CENTER);
		   jtf.setFont(new Font("Tahoma", Font.BOLD, 14));
		   jtf.setBounds(144, 7, 214, 32);
		  panel_11.add(jtf);
		
		  
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
		  
		  
		  
		  
		
		   panel_12 = new JPanel();
		   panel_12.setLayout(null);
		   panel_12.setBorder(new LineBorder(Color.ORANGE));
		   panel_12.setBackground(SystemColor.info);
		   panel_12.setBounds(5, 5, 430, 46);
		   panel_12.setVisible(false);
		   container.add(panel_12);
		   //searchLbl = new JLabel("Search :");
		   searchLbl_1 = new JLabel("                     Select the Operater");
		   searchLbl_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		   searchLbl_1.setBounds(60, 11, 420, 20);
		   panel_12.add(searchLbl_1);
		   jtf_1 = new JTextField(15);
		   jtf_1.setHorizontalAlignment(SwingConstants.CENTER);
		   jtf_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		   jtf_1.setBounds(144, 7, 214, 32);
		 
		   //  panel_12.add(jtf_1);
		   
		   
		
		Statement statement=null;
   
       defaultTableModel = new DefaultTableModel();
       
       sorter = new TableRowSorter<>(defaultTableModel);
       table = new JTable(defaultTableModel);
       table.setRowSorter(sorter);
        table = new JTable(defaultTableModel);
        table.setPreferredScrollableViewportSize(new Dimension(400, 300));
        table.setFillsViewportHeight(true);
        table.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 13));
        table.getTableHeader().setBackground(Color.orange);
        ListSelectionModel cellSelectionModel = table.getSelectionModel();
        cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
          public void valueChanged(ListSelectionEvent e) {
            String selectedData = null;

            int[] selectedRow = table.getSelectedRows();
            int selectedColumns =1;// table.getSelectedColumns();

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
        scrollPane.setBounds(41, 60, 350, 200);
        scrollPane.setVisible(false);
       container.add(scrollPane);
		
		
        
		
      //  defaultTableModel.addColumn("Batch Name");
        ((DefaultTableModel) defaultTableModel).addColumn("Component Name");
	     ((DefaultTableModel) defaultTableModel).addColumn("Batch Name");




        try {
        	
            try {
				 statement = UserDAO.connection().createStatement();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//crating statement object
            String query = "select * from details2";//Storing MySQL query in A string variable
            ResultSet resultSet = statement.executeQuery(query);//executing query and storing result in ResultSet


            while (resultSet.next()) {
            	
            	
                String name = resultSet.getString("BNAME");
                String roll = resultSet.getString("DSIZE");
                //if (userName.equalsIgnoreCase(name)) {
                    flag = 1;
                    defaultTableModel.addRow(new Object[]{roll,name});//Adding row in Table

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
		
		
/*===============================================================*/		

		Statement statement1=null;
   
       defaultTableModel = new DefaultTableModel();
       
       
        table1 = new JTable(defaultTableModel);
        table1.setPreferredScrollableViewportSize(new Dimension(400, 300));
        table1.setFillsViewportHeight(true);
        table1.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 13));
        table1.getTableHeader().setBackground(Color.orange);
        ListSelectionModel cellSelectionModel1 = table1.getSelectionModel();
        cellSelectionModel1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        cellSelectionModel1.addListSelectionListener(new ListSelectionListener() {
          public void valueChanged(ListSelectionEvent e) {
            String selectedData = null;

            int[] selectedRow = table1.getSelectedRows();
            int selectedColumns =0;// table.getSelectedColumns();

            
            for (int i = 0; i < selectedRow.length; i++) {
              for (int j = 0; j <= selectedColumns; j++) {
                selectedData = (String) table1.getValueAt(selectedRow[i], selectedColumns);
              }
            }
           // System.out.println("Selected: " + selectedData);
            //batchname=selectedData;
            operater=selectedData;
            
          }

        });
         scrollPane1 = new JScrollPane(table1);
        scrollPane1.setBounds(41, 60, 350, 200);
        scrollPane1.setVisible(false);
       container.add(scrollPane1);
		
		
        
		
        defaultTableModel.addColumn("Operater Name");
       




        try {
        	
            try {
				 statement1 = UserDAO.connection().createStatement();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//crating statement object
            String query = "select * from login";//Storing MySQL query in A string variable
            ResultSet resultSet = statement.executeQuery(query);//executing query and storing result in ResultSet


            while (resultSet.next()) {
            	
            	
                String name = resultSet.getString("NAME");
              
                //if (userName.equalsIgnoreCase(name)) {
                    flag = 1;
                    defaultTableModel.addRow(new Object[]{name});//Adding row in Table

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
		
		

		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(4, 5, 435, 80);
		panel_2.setBackground(new Color(255,239,213));	
		panel_2.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 255, 0), new Color(75, 0, 130)));
		container.add(panel_2);
panel_2.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				panel_2.setBackground(Color.ORANGE);
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
			}
		});
		JLabel lable_2 = new JLabel("2)  Supplier Wise Report Generate.");
		lable_2.setBounds(15, 5, 350, 30);
		lable_2.setFont(new Font("Arial", Font.TYPE1_FONT, 15));
		panel_2.add(lable_2);
		
		 
		 textf=new JTextField("  -: Select the Batch :- ");
		textf.setBounds(30, 40, 150, 30);
		//textf.setBackground();
		textf.setEditable(false);
		textf.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_2.add(textf);
		
		ImageIcon imgsetting = new ImageIcon("D:\\MPApplication\\Eddysorter\\Image\\dropdownicon.png");
		Image i_setting = imgsetting.getImage();

		Image new_imgsetting = i_setting.getScaledInstance(30, 20, Image.SCALE_REPLICATE);

		imgsetting = new ImageIcon(new_imgsetting);
		JButton button_5 = new JButton(imgsetting);
		button_5.setBounds(180, 40, 50, 30);
		button_5.setFont(new Font("Arial", Font.BOLD, 15));
		button_5.setLayout(null);
		panel_2.add(button_5);
		
		button_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(false);
	//			panel_11.setVisible(true);
//				button_10.setVisible(true);
//		        scrollPane.setVisible(true);
				
				Batchwisereport bwr=new Batchwisereport();
				bwr.frameSecond();
		        button_4.setBounds(270, 277, 140, 32);
		        
		        
		       
				
			}//kishor
		});
		
		JButton button_2 = new JButton("Report");
		button_2.setBounds(280, 39, 150, 32);
		button_2.setFont(new Font("Arial", Font.BOLD, 15));
		button_2.setLayout(null);
		panel_2.add(button_2);
		
		button_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(textf.getText().contains("  -: Select the Batch :- ")) {
					JOptionPane.showMessageDialog(null, "Please first select the batch.");
				}else {
					try {
					BatchReport.batchReport(textf.getText());
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
					ourFrame.dispose();
					Application.headline = "______";
				}
				
			}
		});
		
		
		
		
		
		 button_10 = new JButton("Select");
		button_10.setBounds(30, 277, 140, 32);
		button_10.setFont(new Font("Arial", Font.BOLD, 15));
		button_10.setLayout(null);
		button_10.setVisible(false);
		container.add(button_10);
		
		button_10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("=================>"+batchname);
				panel_2.setVisible(true);
				
				textf.setText(""+batchname);
				panel_11.setVisible(false);
				button_10.setVisible(false);
		        scrollPane.setVisible(false);
		        button_4.setBounds(156, 277, 140, 32);
				Application.headline = "______";
				
			}
		});
		
		button_10.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				panel_2.setBackground(new Color(255,239,213));
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
			}
		});
		
		
		
		 button_11 = new JButton("Select");
			button_11.setBounds(30, 277, 140, 32);
			button_11.setFont(new Font("Arial", Font.BOLD, 15));
			button_11.setLayout(null);
			button_11.setVisible(false);
			container.add(button_11);
			
			button_11.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					panel_2.setVisible(true);
					
					textf1.setText(""+operater);
					panel_11.setVisible(false);
					button_10.setVisible(false);
			        scrollPane.setVisible(false);
			        button_4.setBounds(156, 277, 140, 32);
			        button_11.setVisible(false);
			        panel_12.setVisible(false);
			        scrollPane1.setVisible(false);
					Application.headline = "______";
					
				}
			});
			
			button_11.addMouseMotionListener(new MouseMotionListener() {
				
				@Override
				public void mouseMoved(MouseEvent e) {
					// TODO Auto-generated method stub
					panel_2.setBackground(new Color(255,239,213));
				}
				
				@Override
				public void mouseDragged(MouseEvent e) {
					// TODO Auto-generated method stub
				}
			});
			
		
		
		
		 button_4 = new JButton("Cancel");
		button_4.setBounds(156, 125, 140, 32);
		button_4.setFont(new Font("Arial", Font.BOLD, 15));
		button_4.setLayout(null);
		container.add(button_4);
		button_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ourFrame.dispose();
				Application.headline = "______";
				
			}
		});
		
		button_4.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				panel_2.setBackground(new Color(255,239,213));
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
			}
		});

		ourFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				int result = JOptionPane.showConfirmDialog(ourFrame, "Exit the Login Form ?", "Confirm Exit ",
						JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {

					ourFrame.dispose();
					Application.headline = "______";

				} else /* if (result == JOptionPane.NO_OPTION) */ {
					ourFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				}
			}
		});

		ourFrame.addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// System.out.println("1******************");
				// TODO Auto-generated method stub
				// System.out.println("1");
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				// System.out.println("2******************");
				ourFrame.dispose();
				Application.headline = "______";
				// ++++++++++++++++++++++++++++++++++++++++
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				// System.out.println("3******************");
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				// System.out.println("4******************");
				ourFrame.dispose();
				Application.headline = "______";
			}

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				// System.out.println("5******************");
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				// System.out.println("6******************");
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// System.out.println("7******************");

			}
		});

		
		
		
		ourFrame.setVisible(true);

	}

}
