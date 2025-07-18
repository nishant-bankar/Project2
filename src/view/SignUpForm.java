package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import DAO.UserDAO;


public class SignUpForm {

//	public JFrame ourFrame = new JFrame("Subscribe");
	
	public static JTextField textfield_1;
	public static JTextField textfield_2;
	public static JTextField textfield_3;
	public static JTextField textfield_4;
	public static JTextField textfield_5;
	public static JTextField textfield_6;
	private static DefaultListCellRenderer listRenderer;
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void signUpForm(JFrame ourFrame) {
         
		Application.headline="Batch details";
		//UserDAO.componentlist.clear();
		
		//ourFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ourFrame.setBounds((Application.screen_width-450)/2, (Application.screen_height-390)/2, 450, 390);
		//ourFrame.setBounds(350, 150, 450, 390);
         ourFrame.setResizable(false);
         ourFrame.setState(JFrame.NORMAL);
		Container container = ourFrame.getContentPane();
		container.setLayout(null);
		container.setLayout(null);
		// lable_1
		JLabel label_1 = new JLabel("Shop Name                  :");
		label_1.setBounds(20, 70, 170, 30);
		label_1.setFont(new Font("Arial", Font.BOLD, 15));
		label_1.setLayout(null);
		// textfield_1
		textfield_1 = new JTextField();
		textfield_1.setBounds(170, 70, 250, 30);
		textfield_1.setLayout(null);
		textfield_1.setHorizontalAlignment(SwingConstants.CENTER);
		textfield_1.setFont(new Font("Tahoma", Font.BOLD, 13));

		
		// textfield_2
		textfield_2 = new JTextField();
		textfield_2.setBounds(170, 70, 250, 30);
		textfield_2.setLayout(null);
		textfield_2.setHorizontalAlignment(SwingConstants.CENTER);
		textfield_2.setFont(new Font("Tahoma", Font.BOLD, 13));

		
		  
		
		// lable_3
//		JLabel label_3 = new JLabel("Work Order No.         : ");
//		label_3.setBounds(20, 230, 170, 30);
//		label_3.setFont(new Font("Arial", Font.BOLD, 15));
//		label_3.setLayout(null);
		// textfield_3
//		textfield_3 = new JTextField();
//		textfield_3.setBounds(170, 230, 250, 30);
//		textfield_3.setLayout(null);
//		textfield_3.setHorizontalAlignment(SwingConstants.CENTER);
//		textfield_3.setFont(new Font("Tahoma", Font.BOLD, 13));

		// lable_4
		JLabel label_4 = new JLabel("Mobile Number              :");
		label_4.setBounds(20, 190, 170, 30);
		label_4.setFont(new Font("Arial", Font.BOLD, 15));
		label_4.setLayout(null);
		// textfield_4
		textfield_4 = new JTextField();
		textfield_4.setBounds(170, 190, 250, 30);
		textfield_4.setLayout(null);
		textfield_4.setHorizontalAlignment(SwingConstants.CENTER);
		textfield_4.setFont(new Font("Tahoma", Font.BOLD, 13));

		// lable_5
		JLabel label_5 = new JLabel("Supplier Name              :");
		label_5.setBounds(20, 110, 170, 30);
		label_5.setFont(new Font("Arial", Font.BOLD, 15));
		label_5.setLayout(null);
		// textfield_5
		textfield_5 = new JTextField();
		textfield_5.setBounds(170, 110, 250, 30);
		textfield_5.setLayout(null);
		textfield_5.setHorizontalAlignment(SwingConstants.CENTER);
		textfield_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		
		// lable_6
				JLabel label_6 = new JLabel("City                       :");
				label_6.setBounds(20, 150, 170, 30);
				label_6.setFont(new Font("Arial", Font.BOLD, 15));
				label_6.setLayout(null);
				// textfield_6
				textfield_6 = new JTextField();
				textfield_6.setBounds(170, 150, 250, 30);
				textfield_6.setLayout(null);
				textfield_6.setHorizontalAlignment(SwingConstants.CENTER);
				textfield_6.setFont(new Font("Tahoma", Font.BOLD, 13));

		// Submit Button
		JButton subBtn = new JButton("Done");
		subBtn.setBounds(90, 290, 125, 30);
		subBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// ourFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				if (textfield_1.getText().equals("") 
						|| textfield_4.getText().equals("")
						|| textfield_5.getText().equals("") || textfield_6.getText().equals("")) {

					JOptionPane.showMessageDialog(null, "All Fields Required..");
				} else {
					try {
					UserDAO.batchData(textfield_6.getText(),textfield_4.getText(),textfield_5.getText(),textfield_1.getText());
				//		UserDAO.batchData2(textfield_6.getText(),textfield_4.getText(),textfield_5.getText(),textfield_1.getText(),Application.mode);
						
						
						System.out.println("Shri krishna...");
						JOptionPane.showMessageDialog(null, "Batch Create Successfully..");
						Application.lblbname.setText(textfield_1.getText());
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					ourFrame.dispose();
					Application.headline="______";
					//++++++++++++++++++++++++++++++++++++++++    
					
					JButton jmenu_2 = new JButton("Create Batch");
					jmenu_2.setHorizontalAlignment(SwingConstants.CENTER);
					jmenu_2.setForeground(Color.WHITE);
					jmenu_2.setBounds(157, 2, 110, 29);
					jmenu_2.setLayout(null);
					jmenu_2.setBackground(new Color(105, 105, 105));
					
				}
			}
		});
		
		
		
		
		
		container.add(label_1);
		container.add(textfield_1);
	
//		container.add(label_3);
		
		//container.add(label_3);
		//container.add(textfield_3);

		container.add(label_4);
		container.add(textfield_4);
		container.add(label_5);
		container.add(textfield_5);
		container.add(label_6);
		container.add(textfield_6);

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