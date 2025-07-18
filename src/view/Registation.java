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


public class Registation {

//	public JFrame ourFrame = new JFrame("Subscribe");
	
	public static JTextField textfield_1;
	public static JPasswordField textfield_2;
	public static JTextField textfield_3;
	public static JPasswordField textfield_4;
	public static JTextField textfield_5;
	public static JTextField textfield_6;
	
	public static void registrationForm(JFrame ourFrame) {
         
		
		
		
		//ourFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ourFrame.setBounds((Application.screen_width-450)/2, (Application.screen_height-390)/2, 450, 390);
		//ourFrame.setBounds(350, 150, 450, 390);
         ourFrame.setResizable(false);
         ourFrame.setState(JFrame.NORMAL);
		Container container = ourFrame.getContentPane();
		container.setLayout(null);
		container.setLayout(null);
		// lable_1
		JLabel label_1 = new JLabel("Manager Name        :");
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
		JLabel label_2 = new JLabel("Manager Password      :");
		label_2.setBounds(20, 70, 170, 30);
		label_2.setFont(new Font("Arial", Font.BOLD, 15));
		label_2.setLayout(null);
		// textfield_2
		textfield_2 = new JPasswordField();
		textfield_2.setBounds(170, 70, 250, 30);
		textfield_2.setLayout(null);
		textfield_2.setHorizontalAlignment(SwingConstants.CENTER);
		textfield_2.setFont(new Font("Tahoma", Font.BOLD, 13));

		// lable_3
		JLabel label_3 = new JLabel("User Name        : ");
		label_3.setBounds(20, 110, 170, 30);
		label_3.setFont(new Font("Arial", Font.BOLD, 15));
		label_3.setLayout(null);
		// textfield_3
		textfield_3 = new JTextField();
		textfield_3.setBounds(170, 110, 250, 30);
		textfield_3.setLayout(null);
		textfield_3.setHorizontalAlignment(SwingConstants.CENTER);
		textfield_3.setFont(new Font("Tahoma", Font.BOLD, 13));

		// lable_4
		JLabel label_4 = new JLabel("User Password   :");
		label_4.setBounds(20, 150, 170, 30);
		label_4.setFont(new Font("Arial", Font.BOLD, 15));
		label_4.setLayout(null);
		// textfield_4
		textfield_4 = new JPasswordField();
		textfield_4.setBounds(170, 150, 250, 30);
		textfield_4.setLayout(null);
		textfield_4.setHorizontalAlignment(SwingConstants.CENTER);
		textfield_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		// Submit Button
		JButton subBtn = new JButton("Done");
		subBtn.setBounds(170, 290, 100, 30);
		subBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// ourFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				if (textfield_1.getText().equals("") || textfield_2.getText().equals("")
						|| textfield_3.getText().equals("") || textfield_4.getText().equals("")) {

					JOptionPane.showMessageDialog(null, "All Fields Required..");
				} else {	
					if(textfield_1.getText().equals("admin") && textfield_2.getText().equals("sort8f")) {
					UserDAO dao=new UserDAO();
					try {
						int result=dao.checkLogin(textfield_3.getText(), textfield_4.getText());
					if(result==1) {
						JOptionPane.showMessageDialog(null,"User allredy exist ?");
						//
						ourFrame.dispose();
						Application.headline="______";
						
						 
					}else {
						UserDAO dao1=new UserDAO();
						
						
						try {
							int result1=dao1.registration(textfield_3.getText(), textfield_4.getText());
						if(result1==1) {
							JOptionPane.showMessageDialog(null,"Registration Sucessfully...!");	
						}else {
							JOptionPane.showMessageDialog(null,"Registration Problem...!");
						}
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						ourFrame.dispose();
						System.out.println("New User Name  :"+textfield_3.getText());
						System.out.println("New User Password  :"+textfield_4.getText());
					
					}
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				
				}else {
					JOptionPane.showMessageDialog(null,"Manager Name or Password is Wrong..!");
					ourFrame.dispose();
					Application.headline="______";
				}
			}
			}
		});
		 
		container.add(label_1);
		container.add(textfield_1);
		container.add(label_2);
		container.add(textfield_2);
		container.add(label_3);
		container.add(textfield_2);
		container.add(label_3);
		container.add(textfield_3);

		container.add(label_4);
		container.add(textfield_4);


		container.add(subBtn);
		ourFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				int result = JOptionPane.showConfirmDialog(ourFrame, "Exit the Batch Info Form ?", "Confirm Exit ",
						JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					//ourFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
						

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
				// TODO Auto-generated method stub
				//System.out.println("1");
				Application.headline="Registration form";
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("2");
				ourFrame.dispose();
				    
				Application.headline="______";
				
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("3");
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("4");
				ourFrame.dispose();
				Application.headline="______";
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("5");
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
			//	System.out.println("6");
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				//System.out.println("7");
				
			}
		});
		 
		ourFrame.setVisible(true);
		
	}

}