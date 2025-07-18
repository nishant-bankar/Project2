package view;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import DAO.UserDAO;





public class DeleteRepayRecord {

//	public JFrame ourFrame = new JFrame("Subscribe");
	public static JTextField textfield_1;
	public static JPasswordField textfield_2;
	public static JTextField textfield_3;
	public static JTextField textfield_4;
	public static JTextField textfield_5;
	public static boolean loginflag=false;
	public static int reserveduser=0;

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void deleteForm(JFrame ourFrame) {
         
		
		
		
		//ourFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ourFrame.setBounds((Application.screen_width-450)/2, (Application.screen_height-200)/2, 450, 200);
	//	ourFrame.setBounds(350, 150, 450, 200);
         ourFrame.setResizable(false);
         ourFrame.setState(JFrame.NORMAL);
         
		Container container = ourFrame.getContentPane();
		container.setLayout(null);
		container.setLayout(null);
		// lable_1
		JLabel label_1 = new JLabel("Manager Name                 :");
		label_1.setBounds(20, 30, 170, 30);
		label_1.setFont(new Font("Arial", Font.BOLD, 15));
		label_1.setLayout(null);
		// textfield_1
		textfield_1 = new JTextField();
		textfield_1.setBounds(170, 30, 250, 30);
		textfield_1.setLayout(null);
		textfield_1.setHorizontalAlignment(SwingConstants.CENTER);
		textfield_1.setFont(new Font("Tahoma", Font.BOLD, 13));

		// lable_2
		JLabel label_2 = new JLabel("Password                   :");
		label_2.setBounds(20, 70, 170, 30);
		label_2.setFont(new Font("Arial", Font.BOLD, 15));
		label_2.setLayout(null);
		// textfield_2
		textfield_2 = new JPasswordField();
		textfield_2.setBounds(170, 70, 250, 30);
		textfield_2.setLayout(null);
		textfield_2.setHorizontalAlignment(SwingConstants.CENTER);
		textfield_2.setFont(new Font("Tahoma", Font.BOLD, 13));


		// Submit Button
		JButton subBtn = new JButton("Submit");
		subBtn.setBounds(210, 130, 100, 30);
		subBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// ourFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				if (textfield_1.getText().equals("") || textfield_2.getText().equals("")) {

					JOptionPane.showMessageDialog(null, "All Fields Required..");
				} else {	
					
					
						
						int result=0;
						if(textfield_1.getText().equals("admin")&&textfield_2.getText().equals("admin")) {
							result=1;
						}
					if(result==1) {
			   		try {
			   			System.out.println("Query parameter :"+Application.data_pamount+"     "+Application.data_ptype+"   "+Application.data_rpdescription);
						int result1=0;	 
						result1= UserDAO.deleteRepayRecord(Application.data_pamount,Application.data_ptype,Application.data_rpdescription);
						System.out.println("------------------>"+result1);
				   		if(result1==0) {
				   			JOptionPane.showMessageDialog(null, "Please First Select The Batch");
				   		}else {
				   			JOptionPane.showMessageDialog(null, " Delete Successfully..!");

					   		if(LoginForm.loginflag && !Application.lblNewLabel_4_4_4.getText().equals("") ) {
					   			
						 UserDAO.fetchedpara.clear();
						try {
							UserDAO.batchOpen(Application.lblNewLabel_4_4_4.getText());
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					   	}else {
					   		JOptionPane.showMessageDialog(null,"Please select the supplier..!");
					   	}
					   	
						}
				   		} catch (NumberFormatException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
					}else {
						JOptionPane.showMessageDialog(null,"Wrong Password or Name...!");
						//Application.lblNewLabel_1_1.setText(textfield_1.getText());
					}
					
					ourFrame.dispose();
				}
			}
		});
		 
		
		container.add(label_1);
		container.add(textfield_1);
		container.add(label_2);
		container.add(textfield_2);
		container.add(subBtn);
		
		ourFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				int result = JOptionPane.showConfirmDialog(ourFrame, "Exit the Login Form ?", "Confirm Exit ",
						JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					
					ourFrame.dispose();
					Application.headline="______";
					    
					
				} else /*if (result == JOptionPane.NO_OPTION)*/ {
					ourFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			}
			}
		});
		
		ourFrame.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
			//	System.out.println("1******************");
				// TODO Auto-generated method stub
				//System.out.println("1");
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("2******************");
				ourFrame.dispose();
				Application.headline="______";
				//++++++++++++++++++++++++++++++++++++++++       
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("3******************");
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("4******************");
				ourFrame.dispose();
				Application.headline="______";
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("5******************");
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("6******************");
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				//System.out.println("7******************");
				
			}
		});
		 
		ourFrame.setVisible(true);

	}

}