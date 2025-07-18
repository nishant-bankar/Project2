package view;

import java.awt.AWTException;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import com.toedter.calendar.JDateChooser;

import DAO.UserDAO;
import util.Utility;

public class Application extends JFrame implements FocusListener {
public static JLabel lblNewLabel_4_4_4_1;
	private JPanel contentPane;
	public static JTextField textField;
	public static JTextField textField_1;
	public static JTextField textField_3;
	static int countKeyPress = 0;
	public static JLabel lblNewLabel_18;
	public static JLabel lblNewLabel_19;
	public static JLabel lblNewLabel_22;
	public static boolean textdataflag = false;
	public static boolean escflag = false;
	public static JLabel lblNewLabel_4_5p,lblNewLabel_4_5p1;
	public static boolean jobflagcnt = false;
	public static boolean reversflag = true;
	public static JLabel lblNewLabel_14;
	public static JLabel lblNewLabel_15;
	public static JDateChooser date_chooser,date_choosera;
public static  String[] aquinas;
	private static DefaultListCellRenderer listRenderer;
	public static JLabel lblNewLabel_16;
	public static JLabel lblNewLabel_2_1_1_3;
	public static JLabel lblNewLabel_2_1_1_3_2;
	public static JLabel lblNewLabel_4_4_3_1_1_1;
	public static JLabel lblNewLabel_13;
	public static JLabel lblNewLabel_17;
	public static JPanel panel_35;
	public static boolean balanceflag = false;
	public static int autoEllipseStatus = 2;
	public static JPanel panel_1_5_2;
	public static JPanel panel_1_6_1;
	public static JButton btnNewButton_4;
	public static JLabel lblNewLabel_4_4_3_1_1_1_1;
	public static JPanel panel_5;
	public static boolean tubcntflag = false;
	public static JLabel lblNewLabel_4_4_3_1_1;
	public static JSpinner spinner;
	public static JSpinner spinner_2;
	public static JLabel lblNewLabel_21;
	public static JSpinner spinner_2_2;
	public static JSpinner spinner_2_3;
	public static JSpinner spinner_1;
	public static JSpinner spinner_1_1_1_1;
	public static JSpinner spinner_1_1_1;
	public static JSpinner spinner_3;
	public static JPanel panel_19;
	public static JPanel panel_1_3_1_2_1;
	public static JPanel panel_20;
	public static JPanel panel_21;
	public static JPanel panel_22;
	public static JButton btnNewButton;
	public static JButton btnNewButton_2;
	public static JSpinner spinner_1_1;
	public static String headline = "BALANCE THE MACHINE";
	public static int mode = 26298;
	JFrame ourFrame;
	public static
	JPanel panel_30;
	JPanel panel_31;
	JPanel panel_65;
	JPanel panel_15;
	public static JPanel panel_1_3_1_2;
	public static JLabel lblbname;
	static Application frame;
	public static String tpre, tpre_1, tpre_2, tpre_3, tpre_4, tpre_5, tpre_6, tpre_7, tpre_8, tpre_9, tpre_19, tpre_20,
			tpre_21, tpre_22, tpre_23, tpre_24, tpre_25;
	public static JTextField textField_2;
	public static JTextField textField_7;
	public static JTextField textField_8;
	public static JTextField textField_9;
	public static JTextField textField_15;
	public static JTextField textField_10;
	public static JTextField textField_11;
	public static JTextField textField_12;
	public static String choosedFileName;
	public static JLabel lblNewLabel_8;
	public static int tableRowCount;
	public static JLabel lblNewLabel_2_1_2;
	public static JLabel lblNewLabel_2_1_2_1;
	public static JLabel lblNewLabel_2_1_2_2;
	static JLabel lblPartInLevel_2_1_1_1_3_1;
	static JLabel lblPartInLevel_2_1_1_1_3;
	public static JLabel lblNewLabel_12_3_1_1;
	public static JLabel lblNewLabel_12_3_1_1_1;
	public static JLabel lblNewLabel_1_1;
	public static JPanel panel_90;
	public static JPanel panel_1_3_1_1_1_1;
	public static JPanel panel_91;
	public static JPanel panel_92;
	public static JPanel panel_1_5_1_1;
	public static JSpinner spinner_1_1_1_2_2;
	public static JLabel lblNewLabel_4_4_4;
	public static JLabel lblNewLabel_4_4_2_1;
	public static JSpinner spinner_1_1_1_2_3;
	public static boolean magflag = false;
	public static JLabel lblNewLabel_24;
	public static DefaultTableCellRenderer cellRender;
	public static JPanel panel_1_3_1_1_1;
	static int q = 90;
	public static JRadioButton rdbtnNewRadioButton_1;
	public static JRadioButton rdbtnNewRadioButton_1_1;
	public static ButtonGroup bg;
	public static JLabel lblNewLabel_26;
	public static ArrayList<String> showingTableData=new ArrayList<>();
	public static JSpinner spinner_1_1_1_1_1;
	public static int rotation_angle = 0;
	// public static int demo_angle = 0;
	public static JSpinner spinner_1_1_2;
	public static JSpinner spinner_1_1_1_3;
	public static JSpinner spinner_3_1, spinner_4;
	public static String ccnt = "0";
	public static JTextField textField_4;
	private JTextField textField_5;
	public static JTextField textField_6,textField_6a,textField_6a1,textField_6as;
	private JTextField textField_13;
	private JTextField textField_14;
	public static 	int screen_width ;
	public static boolean bopnflag=true;
	public static String dbatchname;
//	    JFrame frame1;//creating object of first JFrame
//	    JLabel nameLabel;//creating object of JLabel
//	    JTextField nameTextField;//creating object of JTextfield
//	    JButton fetchButton;//creating object of JButton
//	    JButton resetButton;//creating object of JButton
	//    
	//   public static JFrame frame2;//creating object of second JFrame
	
//	    DefaultTableModel defaultTableModel;//creating object of DefaultTableModel
//	    JTable table;//Creating object of JTable
//	    Connection connection;//Creating object of Connection class
	//  
//	    static int flag=0;
	public static String  date;
	public static String  time;



	public static JFrame frame2;
	public JTextField jtf;
	public JLabel searchLbl;
	public static TableModel model;
	private JTable table;
	private TableRowSorter sorter;
	public JScrollPane jsp;
public static int screen_height;
	static int flag=0;
	public static String  batchname;
	public static String  componentName;
	public static  String data_pamount, data_ptype, data_rpdescription;
	private JPanel panel_1;
	private JTextField textField_16;

	/**
	 * Launch the application.
	 */
	public static void mainFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Application();

					frame.setVisible(true);
					frame.addWindowListener(new WindowListener() {

						// overiding the method
						@Override
						public void windowOpened(WindowEvent e) {
							//System.out.println("===========windowOpened()");
						}

						@Override
						public void windowIconified(WindowEvent e) {
							// TODO Auto-generated method stubsyst
						//	System.out.println("===========windowIconified()");
						}

						@Override
						public void windowDeiconified(WindowEvent e) {
							//System.out.println("===========windowDeiconified()");
						}

						@Override
						public void windowDeactivated(WindowEvent e) {
							// TODO Auto-generated method stub
							//System.out.println("===========.windowDeactivated()");
						}

						@Override
						public void windowClosing(WindowEvent e) {// TODO Auto-generated method stub
							//System.out.println("===========.windowClosing()");
							int result = JOptionPane.showConfirmDialog(frame, "Sure? You want to exit?", "Bill Management",
									JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
							if (result == JOptionPane.YES_OPTION) {
								// label.setText("You selected: Yes");
								//CommPortSender.sendFirst(Communication.exitapp);
								frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							} else if (result == JOptionPane.NO_OPTION) {
								// label.setText("You selected: No");
								frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
							} else {
								// System.out.println("Application not closed..");
								frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
							}
						}

						@Override
						public void windowClosed(WindowEvent e) {
							// eratedTODO Auto-gen method stub
							//System.out.println("===========.windowClosed()");
						}

						@Override
						public void windowActivated(WindowEvent e) {}
					});

				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("Application catch block exicuted...");
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws IOException
	 */
	public Application() {
		try {

			setResizable(false);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		 screen_height = size.height;
			 screen_width = size.width;

			Image icon = Toolkit.getDefaultToolkit().getImage("D:\\MPApplication\\Eddysorter\\Image\\anpllogo.png");
			setIconImage(icon);
			setTitle("Bill Management");
			setBounds((screen_width-1366)/2,(screen_height-768)/2, 1366,768);
			contentPane = new JPanel();
			contentPane.setBorder(new LineBorder(Color.ORANGE));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			DecimalFormat df = new DecimalFormat("#.#");

			
			UserDAO.componentlist.add("UPI");
			UserDAO.componentlist.add("RTGS");
			UserDAO.componentlist.add("CHEQUE");
			UserDAO.componentlist.add("CASH");
			UserDAO.componentlist.add("NEFT");
			UserDAO.componentlist.add("IMPS"); 
			
	// Credif/ Debit
			
			UserDAO.componentlistdc.add("Debit");
			UserDAO.componentlistdc.add("Credit");
			JPanel panel = new JPanel();
			panel.setBorder(new LineBorder(Color.ORANGE));
			panel.setBackground(Color.WHITE);
			panel.setBounds(0, 116, 1353, 625);
			contentPane.add(panel);
			panel.setLayout(null);

			JPanel panel_3 = new JPanel();
			panel_3.setBackground(Color.WHITE);
			panel_3.setBorder(new LineBorder(new Color(255, 255, 0)));
			panel_3.setBounds(310, 5, 1041, 618);
			panel.add(panel_3);
			panel_3.setLayout(null);

			panel_5 = new JPanel();
			panel_5.setBorder(new LineBorder(Color.ORANGE));
			panel_5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {

					if ((e.getX() >= ((int) spinner_3.getValue() - 6) && ((int) spinner_3.getValue() + 6) >= e.getX())
							&& (e.getY() >= (int) Application.spinner_1_1_1_1.getValue()
									&& e.getY() <= (int) Application.spinner_1_1.getValue())) {

						Application.panel_19.setBackground(new Color(176, 224, 230));
						Application.panel_20.setBackground(Color.white);
						Application.panel_21.setBackground(new Color(176, 224, 230));
						Application.panel_22.setBackground(new Color(176, 224, 230));
					} else if ((e.getX() >= ((int) spinner_1_1_1.getValue() - 6)
							&& ((int) spinner_1_1_1.getValue() + 6) >= e.getX())
							&& (e.getY() <= (int) Application.spinner_1_1.getValue()
									&& e.getY() >= (int) Application.spinner_1_1_1_1.getValue())) {
						Application.panel_19.setBackground(Color.white);
						Application.panel_20.setBackground(new Color(176, 224, 230));
						Application.panel_21.setBackground(new Color(176, 224, 230));
						Application.panel_22.setBackground(new Color(176, 224, 230));
						
						if (escflag) {
							escapButtonEvent();
						}
					} else if (((e.getX() >= ((int) spinner_1_1_1.getValue() - 6)
							|| ((int) spinner_3.getValue() - 6) <= e.getX())
							&& (((int) spinner_3.getValue() + 6) >= e.getX()
									|| (e.getX() <= ((int) spinner_1_1_1.getValue() + 6))))
							&& (e.getY() >= ((int) Application.spinner_1_1_1_1.getValue() - 6)
									&& e.getY() <= ((int) Application.spinner_1_1_1_1.getValue() + 6))) {

						Application.panel_19.setBackground(new Color(176, 224, 230));
						Application.panel_20.setBackground(new Color(176, 224, 230));
						Application.panel_21.setBackground(Color.white);
						Application.panel_22.setBackground(new Color(176, 224, 230));
						if (escflag) {
							escapButtonEvent();
						}
					} else if (((e.getX() >= ((int) spinner_1_1_1.getValue() - 6)
							|| ((int) spinner_3.getValue() - 6) <= e.getX())
							&& (((int) spinner_3.getValue() + 6) >= e.getX()
									|| (e.getX() <= ((int) spinner_1_1_1.getValue() + 6))))
							&& (e.getY() >= ((int) Application.spinner_1_1.getValue() - 6)
									&& e.getY() <= ((int) Application.spinner_1_1.getValue() + 6))) {
						Application.panel_19.setBackground(new Color(176, 224, 230));
						Application.panel_20.setBackground(new Color(176, 224, 230));
						Application.panel_22.setBackground(Color.white);
						Application.panel_21.setBackground(new Color(176, 224, 230));

						
						if (escflag) {
							escapButtonEvent();
						}
					} else {
						Application.panel_19.setBackground(new Color(176, 224, 230));
						Application.panel_20.setBackground(new Color(176, 224, 230));
						Application.panel_21.setBackground(new Color(176, 224, 230));
						Application.panel_22.setBackground(new Color(176, 224, 230));

						
						if (escflag) {
							escapButtonEvent();
							System.out.println("ESC event performed...");
						}

					}

				}
			});

			panel_5.addMouseMotionListener(new MouseMotionListener() {

				@Override
				public void mouseMoved(MouseEvent e) {
					lblPartInLevel_2_1_1_1_3_1.setText(Integer.toString((440 - e.getX()) * (-1)));
					lblPartInLevel_2_1_1_1_3.setText(Integer.toString(297 - e.getY()));
					// lblNewLabel_24.setText(String.valueOf(Magnification.ellipse.contains(e.getX(),e.getY())));

				}

				@Override
				public void mouseDragged(MouseEvent e) {

				}
			});
			panel_5.setBackground(Color.WHITE);
			panel_5.setBounds(10, 0, 880, 1);
			panel_3.add(panel_5);

			JPanel panel_28 = new JPanel();
			panel_28.setToolTipText("current");
			panel_28.setBackground(Color.BLUE);
			panel_28.setBounds(824, 713, 10, 10);
			panel_3.add(panel_28);

			JLabel lblNewLabel_20 = new JLabel("CUR ->");
			lblNewLabel_20.setForeground(Color.WHITE);
			lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 9));
			lblNewLabel_20.setBounds(789, 714, 35, 9);
			panel_3.add(lblNewLabel_20);

			JLabel lblNewLabel_20_1 = new JLabel("ACC ->");
			lblNewLabel_20_1.setForeground(Color.WHITE);
			lblNewLabel_20_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
			lblNewLabel_20_1.setBounds(843, 714, 35, 9);
			panel_3.add(lblNewLabel_20_1);

			JPanel panel_28_1 = new JPanel();
			panel_28_1.setToolTipText("previous");
			panel_28_1.setBackground(Color.GREEN);
			panel_28_1.setBounds(878, 713, 10, 10);
			panel_3.add(panel_28_1);

			JLabel lblNewLabel_20_2 = new JLabel("REJ ->");
			lblNewLabel_20_2.setForeground(Color.WHITE);
			lblNewLabel_20_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
			lblNewLabel_20_2.setBounds(899, 714, 35, 9);
			panel_3.add(lblNewLabel_20_2);

			JPanel panel_28_2 = new JPanel();
			panel_28_2.setToolTipText("old");
			panel_28_2.setBackground(Color.RED);
			panel_28_2.setBounds(934, 713, 10, 10);
			panel_3.add(panel_28_2);
			
			JPanel panel_39 = new JPanel();
			panel_39.setBackground(new Color(255, 255, 153));
			panel_39.setBorder(new LineBorder(Color.PINK, 1, true));
			panel_39.setBounds(8, 8, 1025, 40);
			panel_3.add(panel_39);
			panel_39.setLayout(null);
			
			JLabel lblNewLabel_4_4 = new JLabel("Shop Name :");
			lblNewLabel_4_4.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_4_4.setForeground(Color.BLACK);
			lblNewLabel_4_4.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_4_4.setBounds(10, 0, 120, 40);
			panel_39.add(lblNewLabel_4_4);
			
			JLabel lblNewLabel_4_4_2 = new JLabel("City :");
			lblNewLabel_4_4_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_4_4_2.setForeground(Color.BLACK);
			lblNewLabel_4_4_2.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_4_4_2.setBounds(758, 0, 120, 40);
			panel_39.add(lblNewLabel_4_4_2);
			
			 lblNewLabel_4_4_4 = new JLabel("");
			lblNewLabel_4_4_4.setForeground(Color.DARK_GRAY);
			lblNewLabel_4_4_4.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_4_4_4.setBounds(123, 0, 236, 40);
			panel_39.add(lblNewLabel_4_4_4);
			
			 lblNewLabel_4_4_2_1 = new JLabel("");
			lblNewLabel_4_4_2_1.setForeground(Color.DARK_GRAY);
			lblNewLabel_4_4_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_4_4_2_1.setBounds(856, 0, 144, 40);
			panel_39.add(lblNewLabel_4_4_2_1);
			
			 lblNewLabel_4_4_4_1 = new JLabel("");
			lblNewLabel_4_4_4_1.setForeground(Color.DARK_GRAY);
			lblNewLabel_4_4_4_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_4_4_4_1.setBounds(482, 0, 236, 40);
			panel_39.add(lblNewLabel_4_4_4_1);
			
			JLabel lblNewLabel_4_4_1 = new JLabel("Supplier Name :");
			lblNewLabel_4_4_1.setForeground(Color.BLACK);
			lblNewLabel_4_4_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_4_4_1.setBounds(369, 0, 120, 40);
			panel_39.add(lblNewLabel_4_4_1);
			
			JPanel panel_39_1 = new JPanel();
			panel_39_1.setLayout(null);
			panel_39_1.setBorder(new LineBorder(Color.PINK, 1, true));
			panel_39_1.setBackground(new Color(255, 255, 255));
			panel_39_1.setBounds(8, 53, 1025, 87);
			panel_3.add(panel_39_1);
			
			JPanel panel_40 = new JPanel();
			panel_40.setBounds(50, 8, 149, 70);
			panel_39_1.add(panel_40);
			panel_40.setLayout(null);
			
			JLabel lblNewLabel_4_4_3 = new JLabel("Total Debit (-)");
			lblNewLabel_4_4_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_4_4_3.setForeground(Color.BLACK);
			lblNewLabel_4_4_3.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_4_4_3.setBounds(0, 2, 167, 25);
			panel_40.add(lblNewLabel_4_4_3);
			
			JLabel lblNewLabel_4_4_3_1 = new JLabel("RS :");
			lblNewLabel_4_4_3_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_4_4_3_1.setForeground(Color.BLACK);
			lblNewLabel_4_4_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_4_4_3_1.setBounds(-1, 19, 45, 40);
			panel_40.add(lblNewLabel_4_4_3_1);
			
			 lblNewLabel_4_4_3_1_1 = new JLabel("0.00");
			lblNewLabel_4_4_3_1_1.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabel_4_4_3_1_1.setForeground(Color.RED);
			lblNewLabel_4_4_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel_4_4_3_1_1.setBounds(54, 19, 89, 40);
			panel_40.add(lblNewLabel_4_4_3_1_1);
			
			JPanel panel_40_1 = new JPanel();
			panel_40_1.setLayout(null);
			panel_40_1.setBounds(430, 8, 149, 70);
			panel_39_1.add(panel_40_1);
			
			JLabel lblNewLabel_4_4_3_2 = new JLabel("Total Credit (+)");
			lblNewLabel_4_4_3_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_4_4_3_2.setForeground(Color.BLACK);
			lblNewLabel_4_4_3_2.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_4_4_3_2.setBounds(0, 2, 167, 25);
			panel_40_1.add(lblNewLabel_4_4_3_2);
			
			JLabel lblNewLabel_4_4_3_1_2 = new JLabel("RS :");
			lblNewLabel_4_4_3_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_4_4_3_1_2.setForeground(Color.BLACK);
			lblNewLabel_4_4_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_4_4_3_1_2.setBounds(-1, 19, 45, 40);
			panel_40_1.add(lblNewLabel_4_4_3_1_2);
			
			 lblNewLabel_4_4_3_1_1_1 = new JLabel("0.00");
			lblNewLabel_4_4_3_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabel_4_4_3_1_1_1.setForeground(new Color(0, 128, 0));
			lblNewLabel_4_4_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel_4_4_3_1_1_1.setBounds(54, 19, 89, 40);
			panel_40_1.add(lblNewLabel_4_4_3_1_1_1);
			
			JPanel panel_40_1_1 = new JPanel();
			panel_40_1_1.setLayout(null);
			panel_40_1_1.setBounds(770, 8, 149, 70);
			panel_39_1.add(panel_40_1_1);
			
			JLabel lblNewLabel_4_4_3_2_1 = new JLabel("Total Bill");
			lblNewLabel_4_4_3_2_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_4_4_3_2_1.setForeground(Color.BLACK);
			lblNewLabel_4_4_3_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_4_4_3_2_1.setBounds(0, 2, 167, 25);
			panel_40_1_1.add(lblNewLabel_4_4_3_2_1);
			
			JLabel lblNewLabel_4_4_3_1_2_1 = new JLabel("RS :");
			lblNewLabel_4_4_3_1_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_4_4_3_1_2_1.setForeground(Color.BLACK);
			lblNewLabel_4_4_3_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_4_4_3_1_2_1.setBounds(-1, 19, 45, 40);
			panel_40_1_1.add(lblNewLabel_4_4_3_1_2_1);
			
			 lblNewLabel_4_4_3_1_1_1_1 = new JLabel("0.00");
			lblNewLabel_4_4_3_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabel_4_4_3_1_1_1_1.setForeground(new Color(128, 0, 0));
			lblNewLabel_4_4_3_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel_4_4_3_1_1_1_1.setBounds(54, 19, 89, 40);
			panel_40_1_1.add(lblNewLabel_4_4_3_1_1_1_1);
			
			JPanel panel_39_1_1 = new JPanel();
			panel_39_1_1.setLayout(null);
			panel_39_1_1.setBorder(new LineBorder(Color.PINK, 1, true));
			panel_39_1_1.setBackground(Color.WHITE);
			panel_39_1_1.setBounds(7, 147, 1027, 460);
			panel_3.add(panel_39_1_1);
			 cellRender=new DefaultTableCellRenderer();
			 
			 model = new DefaultTableModel();
			 
			 cellRender.setHorizontalAlignment(JLabel.RIGHT);
			   Statement statement=null;
			   
			      //String[] columnNames = {"Name", "Technology"};
			     
			     // ((DefaultTableModel) model).setHorizontalAlignment(JLabel.CENTER);
			      ((DefaultTableModel) model).addColumn("Bill Number");
			      ((DefaultTableModel) model).addColumn("Bill Photo");
			      ((DefaultTableModel) model).addColumn("Bill Amount");
			      ((DefaultTableModel) model).addColumn("Purchaase Date");
			      ((DefaultTableModel) model).addColumn("Paid Payment");
			      ((DefaultTableModel) model).addColumn("Payment Date");
			      ((DefaultTableModel) model).addColumn("Payment Method");
			      ((DefaultTableModel) model).addColumn("Description");
			      ((DefaultTableModel) model).addColumn("Balance");
			      
			     // HashMap<Object, Object> rowdata=new HashMap<Object, Object>();
			      
		    try {
		    	
		        try {
						 statement = UserDAO.connection().createStatement();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}//crating statement object
		        String query = "select * from login";
		        ResultSet resultSet = statement.executeQuery(query);//executing query and storing result in ResultSet


		        while (resultSet.next()) {
		        	//BILLNO,BILLAMOUNT,DELIVEREDDATE,PAIDAMOUNT,PAIDDATE,PAYTYPE,BALANCE,SUPPNAME,LOGINNAME,DESCRIPTION
		        	//Retrivind details from the database and stroing it in the String variables
		           // String name = resultSet.getString("Sr.No");
//		            String roll = resultSet.getString("Bill Number");
//		           String status = resultSet.getString("Bill Amount");
//		           String description = resultSet.getString("Delivered Date");
//		           String payMethod = resultSet.getString("Paid Amount");
//		           String debitColumn = resultSet.getString("Paid Date");
//		           String creditColumn = resultSet.getString("Pay Type");
//		           String balanceColumn = resultSet.getString("Balance");
//		           
//		                String[] aquinas = { "11","vd","dgsdgd"};
//		                ((DefaultTableModel) model).addRow(aquinas);   
//		               ((DefaultTableModel) model).addRow(aquinas);
		            //}

		        	//System.out.println(">><<<>>>>"+resultSet.getString("LOGINNAME"));
		        }

//		        if (flag == 0) {
//		            JOptionPane.showMessageDialog(null, "No Such Username Found");//When invalid username is entered
//		        }
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
		 
		   ListSelectionModel cellSelectionModel = table.getSelectionModel();
		   cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		   cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
		     public void valueChanged(ListSelectionEvent e) {
		       String selectedData = null;
		       String selectedData2 = null;
		       String pamount=null;
		       String ptype=null;
		       String rpdescription=null;

		       int[] selectedRow = table.getSelectedRows();
		       int selectedColumns =2;// table.getSelectedColumns();
		       int selectedColumns1 =0;
		       int row_pamount=4;
		       int row_ptype=6;
		       int row_rpdescription=7;
		       for (int i = 0; i < selectedRow.length; i++) {
		         for (int j = 0; j <= selectedColumns; j++) {
		           
		           selectedData= (String) table.getValueAt(selectedRow[i], selectedColumns);
		         }
		         
		         for (int u = 0; u <= selectedColumns1; u++) {
		             selectedData2 = (String) table.getValueAt(selectedRow[i], selectedColumns1);
		             
		           }
		         
		         for (int t = 0; t <= row_pamount; t++) {
		             pamount = (String) table.getValueAt(selectedRow[i], row_pamount);
		             
		           }
		         
		         for (int s = 0; s <= row_ptype; s++) {
		             ptype = (String) table.getValueAt(selectedRow[i], row_ptype);
		             
		           }
		         
		         for (int m = 0; m <= row_rpdescription; m++) {
		             rpdescription = (String) table.getValueAt(selectedRow[i], row_rpdescription);
		             
		           }
		         
		         
		       }
		       System.out.println("Selected: " + selectedData);
		       System.out.println("Selected: " + selectedData2);
		       System.out.println("data_pamount:"+pamount);
		        System.out.println("data_ptype:"+ptype);
		        System.out.println("data_rpdescription:"+rpdescription);
		       componentName=selectedData2;
		       batchname=selectedData;
		       
		      
		       data_pamount=pamount;
		        data_ptype=ptype;
		        data_rpdescription=rpdescription;
		        
		        
		       
		     }

		   });
			
			 jsp = new JScrollPane(table);
			   jsp.setBounds(1, 55, 1025, 405);
			   panel_39_1_1.add(jsp);
			   
			   JButton btnNewButton_2_1_1 = new JButton("Delete");
			   btnNewButton_2_1_1.addActionListener(new ActionListener() {
			   	public void actionPerformed(ActionEvent e) {
			   		if(LoginForm.loginflag) {
	      				if(!lblNewLabel_4_4_4.getText().equals("")) {
	      				
	      					 if(batchname!=null && componentName!=null) {
	      						 
	      					 
	      			       
	      					if(batchname.equals("--")&&componentName.equals("--")) {
	      						JFrame ourFrame = new JFrame("Delete Supplier Form ");
		      					
		      					DeleteRepayRecord.deleteForm(ourFrame);
	      						
	      						//System.out.println("Repayment record Deleted..");
	      					//JOptionPane.showMessageDialog(null, "Repayment record Deleted.!");
	      				}else {
	      					
	      					
	      					JFrame ourFrame = new JFrame("Delete Supplier Form ");
	      					
	      					DeleteFrame.deleteForm(ourFrame);
	      					//System.out.println("Purchase record deeleted..");
	      					//JOptionPane.showMessageDialog(null, "Purchase record deeleted..!");
	      				}
	      					//batchname=null;
	      					//componentName=null;
	      					
	      					
	      					
	      					
	      					 }else {
	      						JOptionPane.showMessageDialog(null, "Please select the table record..!");
							}
	      					
	      				}else {
	      					JOptionPane.showMessageDialog(null, "Please select the supplier..!");
	      				}
	      					 
	      				} else {
	      								JOptionPane.showMessageDialog(null, "Please First LOG IN ..!");
	      							}
			   	}
			   });
			   btnNewButton_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			   btnNewButton_2_1_1.setBackground(SystemColor.activeCaption);
			   btnNewButton_2_1_1.setBounds(903, 6, 119, 45);
			   panel_39_1_1.add(btnNewButton_2_1_1);
			   
			   JButton btnNewButton_2_1_1_1 = new JButton("Refresh");
			   btnNewButton_2_1_1_1.addActionListener(new ActionListener() {
			   	public void actionPerformed(ActionEvent e) {
			   		if(LoginForm.loginflag && !lblNewLabel_4_4_4.getText().equals("") ) {
			   			
				 UserDAO.fetchedpara.clear();
				try {
					UserDAO.batchOpen(lblNewLabel_4_4_4.getText());
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
			   });
			   btnNewButton_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			   btnNewButton_2_1_1_1.setBackground(SystemColor.activeCaption);
			   btnNewButton_2_1_1_1.setBounds(774, 6, 119, 45);
			   panel_39_1_1.add(btnNewButton_2_1_1_1);
			   btnNewButton_2_1_1_1.setVisible(false);

			JPanel panel_4 = new JPanel();

			panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Parameters",
					TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 0, 0)));
			panel_4.setBackground(new Color(240, 255, 255));
			panel_4.setBounds(3, 615, 117, 8);
			panel.add(panel_4);
			panel_4.setLayout(null);
			panel_4.setVisible(false);

			JPanel panel_1 = new JPanel();
			panel_1.setBackground(new Color(255, 239, 213));
			panel_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 255, 0), new Color(75, 0, 130)));
			panel_1.setBounds(4, 20, 109, 51);
			panel_4.add(panel_1);
			panel_1.setLayout(null);

			JLabel lblNewLabel = new JLabel("Frequency (KHz)");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel.setBounds(2, 3, 105, 20);
			panel_1.add(lblNewLabel);

			textField = new JTextField();
			textField.setEditable(false);
			textField.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					countKeyPress = 0;
					textField.setEditable(true);
					textField.setBackground(Color.white);
					textdataflag = true;
					escflag = true;
					Application.headline = "Frequency Range:  0.1 KHz to 100  KHz ";
				}
			});
			textField.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent evt) {
					if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
						countKeyPress++;
						if (countKeyPress == 1 && textdataflag) {
							try {

								String formatted = df.format(Float.parseFloat(textField.getText()));
								float text1 = Float.parseFloat(formatted);
								if (Float.parseFloat(textField.getText()) > 0.9) {
									int textINT = Integer.parseInt(textField.getText());

									if (textINT >= 1 && textINT <= 100) {
										textdataflag = false;
										tpre = Integer.toString(textINT);
									} else {
										JOptionPane.showMessageDialog(null,
												"Invalid Input..!\nFrequency Range:  0.1 KHz to 100  KHz ");
										textField.setText(tpre);
										textdataflag = false;
										textField.setEditable(false);
									}

								} else {

									if (text1 >= 0.1 && text1 <= 0.9) {
										textdataflag = false;
										tpre = formatted;
									} else {
										JOptionPane.showMessageDialog(null,
												"Invalid Input..!\nFrequency Range:  0.1 KHz to 100  KHz ");
										textField.setText(tpre);
										textdataflag = false;
										textField.setEditable(false);
									}
								}
							} catch (NumberFormatException e) {
								JOptionPane.showMessageDialog(null, "Invalid Input..!\nOnly Numeric Value Allowed");
								textField.setText(tpre);
								textdataflag = false;
								textField.setEditable(false);
							}
						} else {
							countKeyPress = 0;
							textdataflag = false;
							textField.setBackground(new Color(176, 224, 230));
							textField.setText(tpre);
							textField.setEditable(false);
							Application.headline = "______";
						}
					} else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
						countKeyPress = 0;
						textdataflag = false;
						textField.setBackground(new Color(176, 224, 230));
						textField.setText(tpre);
						textField.setEditable(false);
						Application.headline = "______";
					}
				}
			});

			textField.setBackground(new Color(176, 224, 230));
			textField.setHorizontalAlignment(SwingConstants.CENTER);
			textField.setFont(new Font("Tahoma", Font.BOLD, 15));
			textField.setBounds(8, 25, 90, 21);
			textField.setColumns(10);
			tpre = textField.getText();
			textField.addFocusListener(this);
			panel_1.add(textField);

			JPanel panel_1_1 = new JPanel();
			panel_1_1.setLayout(null);
			panel_1_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 255, 0), new Color(75, 0, 130)));
			panel_1_1.setBackground(new Color(255, 239, 213));
			panel_1_1.setBounds(4, 75, 109, 51);
			panel_4.add(panel_1_1);

			JLabel lblGaindb = new JLabel("Gain  Diff (dB)");
			lblGaindb.setHorizontalAlignment(SwingConstants.CENTER);
			lblGaindb.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblGaindb.setBounds(2, 3, 105, 20);
			panel_1_1.add(lblGaindb);

			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					countKeyPress = 0;
					textField_1.setEditable(true);
					textField_1.setBackground(Color.white);
					textdataflag = true;
					escflag = true;
					Application.headline = "Gain Diff Range:  1.0 dB to 59.9  dB ";
				}
			});
			textField_1.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent evt) {
					if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
						countKeyPress++;
						if (countKeyPress == 1 && textdataflag) {
							try {

								String formatted = df.format(Float.parseFloat(textField_1.getText()));
								float text1 = Float.parseFloat(formatted);
								if (text1 >= 1.0 && text1 < 60.0) {
									textdataflag = false;
									tpre_1 = formatted;

								} else {
									JOptionPane.showMessageDialog(null,
											"Invalid Input..!\nGain Diff Range:  1.0 dB to 59.9  dB ");
									textField_1.setText(tpre_1);
									textdataflag = false;
									textField_1.setEditable(false);
								}

							} catch (NumberFormatException e) {
								JOptionPane.showMessageDialog(null, "Invalid Input..!\nOnly Numeric Value Allowed");
								textField_1.setText(tpre_1);
								textdataflag = false;
								textField_1.setEditable(false);
							}
						} else {
							countKeyPress = 0;
							textdataflag = false;
							textField_1.setBackground(new Color(176, 224, 230));
							Application.headline = "______";
							textField_1.setText(tpre_1);
							textField_1.setEditable(false);
						}
					} else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
						countKeyPress = 0;
						textdataflag = false;
						textField_1.setBackground(new Color(176, 224, 230));
						Application.headline = "______";
						textField_1.setText(tpre_1);
						textField_1.setEditable(false);
					}
				}
			});
			textField_1.setBackground(new Color(173, 216, 230));
			textField_1.setHorizontalAlignment(SwingConstants.CENTER);
			textField_1.setFont(new Font("Tahoma", Font.BOLD, 15));
			textField_1.setColumns(10);
			textField_1.setBounds(8, 25, 90, 21);
			textField_1.addFocusListener(this);
			tpre_1 = textField_1.getText();
			panel_1_1.add(textField_1);

			JPanel panel_1_2 = new JPanel();
			panel_1_2.setLayout(null);
			panel_1_2.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 255, 0), new Color(75, 0, 130)));
			panel_1_2.setBackground(new Color(255, 239, 213));
			panel_1_2.setBounds(4, 130, 109, 51);
			panel_4.add(panel_1_2);

			JLabel lblPreampGain = new JLabel("Preamp Gain");
			lblPreampGain.setHorizontalAlignment(SwingConstants.CENTER);
			lblPreampGain.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblPreampGain.setBounds(2, 3, 105, 20);
			panel_1_2.add(lblPreampGain);

			String months1[] = { "         LOW", "      MEDIUM", "        HIGH" };

			JPanel panel_29 = new JPanel();
			panel_29.setBackground(new Color(173, 216, 230));
			panel_29.setBounds(8, 25, 90, 21);
			panel_1_2.add(panel_29);
			panel_29.setLayout(null);
			panel_29.addMouseListener(new MouseListener() {

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					if (escflag) {
						escapButtonEvent();
					}
				}

				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub

				}

			});
			spinner_2 = new JSpinner(new SpinnerListModel(months1));
			spinner_2.setBounds(70, 0, 17, 21);
			panel_29.add(spinner_2);
			spinner_2.setForeground(Color.YELLOW);
			spinner_2.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					String parmval = null;

					if (spinner_2.getValue().toString().contains("LOW")) {
						parmval = "1";
						lblNewLabel_21.setText("LOW");
					} else if (spinner_2.getValue().toString().contains("MEDIUM")) {
						parmval = "2";
						lblNewLabel_21.setText("MEDIUM");
					} else if (spinner_2.getValue().toString().contains("HIGH")) {
						parmval = "3";
						lblNewLabel_21.setText("HIGH");
					}
					FetchParameter.bopnflag = true;

				}
			});
			spinner_2.setBackground(Color.RED);
			spinner_2.setFont(new Font("Tahoma", Font.BOLD, 15));
			spinner_2.setEditor(new JSpinner.DefaultEditor(spinner_2));

			lblNewLabel_21 = new JLabel("LOW");
			lblNewLabel_21.setBounds(0, 0, 70, 21);
			panel_29.add(lblNewLabel_21);
			lblNewLabel_21.setBackground(Color.GREEN);
			lblNewLabel_21.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);

			JPanel panel_1_3 = new JPanel();
			panel_1_3.setLayout(null);
			panel_1_3.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 255, 0), new Color(75, 0, 130)));
			panel_1_3.setBackground(new Color(255, 239, 213));
			panel_1_3.setBounds(4, 295, 109, 51);
			panel_4.add(panel_1_3);

			JLabel lblPartInLevel = new JLabel("Part IN Level");
			lblPartInLevel.setHorizontalAlignment(SwingConstants.CENTER);
			lblPartInLevel.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblPartInLevel.setBounds(2, 3, 105, 20);
			panel_1_3.add(lblPartInLevel);

			textField_3 = new JTextField();
			textField_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					countKeyPress = 0;
					textField_3.setEditable(true);
					textField_3.setBackground(Color.white);
					textdataflag = true;
					escflag = true;
				}
			});
			textField_3.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent evt) {
					if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
						countKeyPress++;
						if (countKeyPress == 1 && textdataflag) {
							try {

								String formatted = textField_3.getText();
								int text1 = Integer.parseInt(formatted);
								if (text1 >= 10 && text1 <= 4000) {
									textdataflag = false;
									tpre_3 = formatted;
								} else {
									JOptionPane.showMessageDialog(null,
											"Invalid Input..!\nPart IN Level Range:  10 px  to 4000  px ");
									textField_3.setText(tpre_3);
									textdataflag = false;
									textField_3.setEditable(false);
								}

							} catch (NumberFormatException e) {
								JOptionPane.showMessageDialog(null, "Invalid Input..!\nOnly Numeric Value Allowed");
								textField_3.setText(tpre_3);
								textdataflag = false;
								textField_3.setEditable(false);
							}
						} else {
							countKeyPress = 0;
							textdataflag = false;
							textField_3.setBackground(new Color(176, 224, 230));
							textField_3.setText(tpre_3);
							textField_3.setEditable(false);
						}
					} else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
						countKeyPress = 0;
						textdataflag = false;
						textField_3.setBackground(new Color(176, 224, 230));
						textField_3.setText(tpre_3);
						textField_3.setEditable(false);
					}
				}
			});
			textField_3.setBackground(new Color(173, 216, 230));
			textField_3.setHorizontalAlignment(SwingConstants.CENTER);
			textField_3.setFont(new Font("Tahoma", Font.BOLD, 15));
			textField_3.setColumns(10);
			textField_3.setBounds(8, 25, 90, 21);
			tpre_3 = textField_3.getText();
			textField_3.addFocusListener(this);
			panel_1_3.add(textField_3);

			JPanel panel_1_3_2 = new JPanel();
			panel_1_3_2.setLayout(null);
			panel_1_3_2.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 255, 0), new Color(75, 0, 130)));
			panel_1_3_2.setBackground(new Color(255, 239, 213));
			panel_1_3_2.setBounds(4, 240, 109, 51);
			panel_4.add(panel_1_3_2);

			JLabel lblLpf = new JLabel("LPF (Hz)");
			lblLpf.setHorizontalAlignment(SwingConstants.CENTER);
			lblLpf.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblLpf.setBounds(2, 3, 105, 20);
			panel_1_3_2.add(lblLpf);

			textField_2 = new JTextField();
			textField_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					countKeyPress = 0;
					textField_2.setEditable(true);
					textField_2.setBackground(Color.white);
					textdataflag = true;
					escflag = true;
					Application.headline = "LPF Range:  2 Hz to 255 Hz ";

				}
			});
			textField_2.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent evt) {
					if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
						countKeyPress++;
						if (countKeyPress == 1 && textdataflag) {
							try {

								String formatted = textField_2.getText();
								int text1 = Integer.parseInt(formatted);
								if (text1 >= 2 && text1 <= 255) {
									System.out.println("My error..?");
									textdataflag = false;
									tpre_2 = formatted;
								} else {
									JOptionPane.showMessageDialog(null,
											"Invalid Input..!\nLPF Range:  2 Hz to 255 Hz ");
									textField_2.setText(tpre_2);
									textdataflag = false;
									textField_2.setEditable(false);
								}

							} catch (NumberFormatException e) {
								JOptionPane.showMessageDialog(null, "Invalid Input..!\nOnly Numeric Value Allowed");
								textField_2.setText(tpre_2);
								textdataflag = false;
								textField_2.setEditable(false);
							}
						} else {
							countKeyPress = 0;
							textdataflag = false;
							textField_2.setBackground(new Color(176, 224, 230));
							Application.headline = "______";
							textField_2.setText(tpre_2);
							textField_2.setEditable(false);
						}
					} else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
						countKeyPress = 0;
						textdataflag = false;
						textField_2.setBackground(new Color(176, 224, 230));
						Application.headline = "______";
						textField_2.setText(tpre_2);
						textField_2.setEditable(false);
					}
				}
			});
			textField_2.setText((String) null);
			textField_2.setHorizontalAlignment(SwingConstants.CENTER);
			textField_2.setFont(new Font("Tahoma", Font.BOLD, 15));
			textField_2.setColumns(10);
			textField_2.setBackground(new Color(173, 216, 230));
			textField_2.setBounds(8, 25, 90, 21);
			tpre_2 = textField_2.getText();
			textField_2.addFocusListener(this);
			panel_1_3_2.add(textField_2);

			JPanel panel_1_3_3 = new JPanel();
			panel_1_3_3.setLayout(null);
			panel_1_3_3.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 255, 0), new Color(75, 0, 130)));
			panel_1_3_3.setBackground(new Color(255, 239, 213));
			panel_1_3_3.setBounds(4, 350, 109, 51);
			panel_4.add(panel_1_3_3);

			JLabel lblSolOnDly = new JLabel("Sol ON Dly");
			lblSolOnDly.setHorizontalAlignment(SwingConstants.CENTER);
			lblSolOnDly.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblSolOnDly.setBounds(2, 3, 105, 20);
			panel_1_3_3.add(lblSolOnDly);

			textField_7 = new JTextField();
			textField_7.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					countKeyPress = 0;
					textField_7.setEditable(true);
					textField_7.setBackground(Color.white);
					textdataflag = true;
					escflag = true;
					Application.headline = "ON DLY Range:  1 ms to 10K ms ";
				}
			});
			textField_7.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent evt) {
					if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
						countKeyPress++;
						if (countKeyPress == 1 && textdataflag) {
							try {

								String formatted = textField_7.getText();
								int text1 = Integer.parseInt(formatted);
								if (text1 >= 1 && text1 <= 10000) {
									System.out.println("My error..?");
									textdataflag = false;
									tpre_7 = formatted;
								} else {
									JOptionPane.showMessageDialog(null,
											"Invalid Input..!\nON DLY Range:  1 ms to 10K ms ");
									textField_7.setText(tpre_7);
									textdataflag = false;
									textField_7.setEditable(false);
								}

							} catch (NumberFormatException e) {
								JOptionPane.showMessageDialog(null, "Invalid Input..!\nOnly Numeric Value Allowed");
								textField_7.setText(tpre_7);
								textdataflag = false;
								textField_7.setEditable(false);
							}
						} else {
							countKeyPress = 0;
							textdataflag = false;
							textField_7.setBackground(new Color(176, 224, 230));
							Application.headline = "______";
							textField_7.setText(tpre_7);
							textField_7.setEditable(false);
						}
					} else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
						countKeyPress = 0;
						textdataflag = false;
						textField_7.setBackground(new Color(176, 224, 230));
						Application.headline = "______";
						textField_7.setText(tpre_7);
						textField_7.setEditable(false);
					}
				}
			});
			textField_7.setText("0");
			textField_7.setHorizontalAlignment(SwingConstants.CENTER);
			textField_7.setFont(new Font("Tahoma", Font.BOLD, 15));
			textField_7.setColumns(10);
			textField_7.setBackground(new Color(173, 216, 230));
			textField_7.setBounds(8, 25, 90, 21);
			tpre_7 = textField_7.getText();
			textField_7.addFocusListener(this);
			panel_1_3_3.add(textField_7);

			JPanel panel_1_3_3_1 = new JPanel();
			panel_1_3_3_1.setLayout(null);
			panel_1_3_3_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 255, 0), new Color(75, 0, 130)));
			panel_1_3_3_1.setBackground(new Color(255, 239, 213));
			panel_1_3_3_1.setBounds(4, 405, 109, 51);
			panel_4.add(panel_1_3_3_1);

			JLabel lblPartInLevel_2_1 = new JLabel("Sol Dur Dly");
			lblPartInLevel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblPartInLevel_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblPartInLevel_2_1.setBounds(2, 3, 105, 20);
			panel_1_3_3_1.add(lblPartInLevel_2_1);

			textField_8 = new JTextField();
			textField_8.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					countKeyPress = 0;
					textField_8.setEditable(true);
					textField_8.setBackground(Color.white);
					textdataflag = true;
					escflag = true;
					Application.headline = "DUR DLY Range:  1 ms to 10K ms ";

				}
			});
			textField_8.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent evt) {
					if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
						countKeyPress++;
						if (countKeyPress == 1 && textdataflag) {
							try {

								String formatted = textField_8.getText();
								int text1 = Integer.parseInt(formatted);
								if (text1 >= 1 && text1 <= 10000) {
									System.out.println("My error..?");
									textdataflag = false;
									tpre_8 = formatted;
								} else {
									JOptionPane.showMessageDialog(null,
											"Invalid Input..!\nDUR DLY Range:  1 ms to 10K ms ");
									textField_8.setText(tpre_8);
									textdataflag = false;
									textField_8.setEditable(false);
								}

							} catch (NumberFormatException e) {
								JOptionPane.showMessageDialog(null, "Invalid Input..!\nOnly Numeric Value Allowed");
								textField_8.setText(tpre_8);
								textdataflag = false;
								textField_8.setEditable(false);
							}
						} else {
							countKeyPress = 0;
							textdataflag = false;
							textField_8.setBackground(new Color(176, 224, 230));
							Application.headline = "______";
							textField_8.setText(tpre_8);
							textField_8.setEditable(false);
						}
					} else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
						countKeyPress = 0;
						textdataflag = false;
						textField_8.setBackground(new Color(176, 224, 230));
						Application.headline = "______";
						textField_8.setText(tpre_8);
						textField_8.setEditable(false);
					}
				}
			});
			textField_8.setEditable(false);
			textField_8.setText("0");
			textField_8.setHorizontalAlignment(SwingConstants.CENTER);
			textField_8.setFont(new Font("Tahoma", Font.BOLD, 15));
			textField_8.setColumns(10);

			textField_8.setBackground(new Color(173, 216, 230));
			textField_8.setBounds(8, 25, 90, 21);
			tpre_8 = textField_8.getText();
			textField_8.addFocusListener(this);
			panel_1_3_3_1.add(textField_8);

			JPanel panel_1_3_2_2 = new JPanel();
			panel_1_3_2_2.setLayout(null);
			panel_1_3_2_2.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 255, 0), new Color(75, 0, 130)));
			panel_1_3_2_2.setBackground(new Color(255, 239, 213));
			panel_1_3_2_2.setBounds(4, 185, 109, 51);
			panel_4.add(panel_1_3_2_2);

			JLabel lblPhase = new JLabel("Phase");
			lblPhase.setHorizontalAlignment(SwingConstants.CENTER);
			lblPhase.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblPhase.setBounds(2, 3, 105, 20);
			panel_1_3_2_2.add(lblPhase);

			textField_9 = new JTextField();
			textField_9.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					countKeyPress = 0;
					textField_9.setEditable(true);
					textField_9.setBackground(Color.white);
					textdataflag = true;
					escflag = true;
					Application.headline = "Phase Range:  0 to 359.9 ";

				}
			});
			textField_9.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent evt) {
					if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
						countKeyPress++;
						if (countKeyPress == 1 && textdataflag) {
							try {

								String formatted = df.format(Float.parseFloat(textField_9.getText()));
								float text1 = Float.parseFloat(formatted);
								if (text1 >= 0 && text1 <= 359.9) {
									textdataflag = false;
									tpre_9 = formatted;
								} else {
									JOptionPane.showMessageDialog(null,
											"Invalid Input..!\nPhase Range:  0 to 359.9   ");
									textField_9.setText(tpre_9);
									textdataflag = false;
									textField_9.setEditable(false);
								}

							} catch (NumberFormatException e) {
								JOptionPane.showMessageDialog(null, "Invalid Input..!\nOnly Numeric Value Allowed");
								textField_9.setText(tpre_9);
								textdataflag = false;
								textField_9.setEditable(false);
							}
						} else {
							countKeyPress = 0;
							textdataflag = false;
							textField_9.setBackground(new Color(176, 224, 230));
							Application.headline = "______";
							textField_9.setText(tpre_9);
							textField_9.setEditable(false);
						}
					} else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
						countKeyPress = 0;
						textdataflag = false;
						textField_9.setBackground(new Color(176, 224, 230));
						Application.headline = "______";
						textField_9.setText(tpre_9);
						textField_9.setEditable(false);
					}
				}
			});

			textField_9.setHorizontalAlignment(SwingConstants.CENTER);
			textField_9.setFont(new Font("Tahoma", Font.BOLD, 15));
			textField_9.setColumns(10);
			textField_9.setBackground(new Color(173, 216, 230));
			textField_9.setBounds(8, 25, 90, 21);
			tpre_9 = textField_9.getText();
			textField_9.addFocusListener(this);
			panel_1_3_2_2.add(textField_9);

			/*
			 * JLabel lblAcceptDelay_4 = new JLabel("Alarm Delay");
			 * lblAcceptDelay_4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
			 * lblAcceptDelay_4.setBounds(10, 3, 123, 22);
			 * //panel_37_4.add(lblAcceptDelay_4); textField_15 = new JTextField();
			 * textField_15.setBackground(new Color(173,216,230));
			 * textField_15.setText("0");
			 * textField_15.setText(DefaultFileReading.defpara.get(1));
			 * textField_15.setEditable(false); tpre_24 = textField_15.getText();
			 * textField_15.addFocusListener(this);
			 * textField_15.setHorizontalAlignment(SwingConstants.CENTER);
			 * textField_15.setFont(new Font("Tahoma", Font.BOLD, 11));
			 * textField_15.setColumns(10); textField_15.setBounds(133, 4, 60, 20);
			 * textField_15.addMouseListener(new MouseAdapter() {
			 * 
			 * @Override public void mouseReleased(MouseEvent e) {
			 * if(lblNewLabel_1_1.getText().equals("admin")) { countKeyPress = 0;
			 * textField_15.setEditable(true); textField_15.setBackground(Color.white);
			 * textdataflag = true; escflag = true;
			 * Application.headline="Alarm Delay Range:  0 ms to 9999 ms "; } } });
			 * 
			 * textField_15.addKeyListener(new KeyAdapter() {
			 * 
			 * @Override public void keyReleased(KeyEvent evt) { if (evt.getKeyCode() ==
			 * KeyEvent.VK_ENTER) { countKeyPress++; if (countKeyPress == 1 && textdataflag)
			 * { try {
			 * 
			 * String formatted = textField_15.getText(); int text1 =
			 * Integer.parseInt(formatted); if (text1 >= 0 && text1 <= 9999) {
			 * System.out.println("My error..?"); lpe.leftPanelEnter(frame, formatted,
			 * lblAcceptDelay_4); textdataflag = false; tpre_24 = formatted;
			 * DefaultFileReading.fileupdation(); } else {
			 * JOptionPane.showMessageDialog(null,
			 * "Invalid Input..!\nAlarm Duration Delay Range:  0 ms to 9999 ms ");
			 * textField_15.setText(tpre_24); textdataflag = false;
			 * textField_15.setEditable(false); }
			 * 
			 * } catch (NumberFormatException e) { JOptionPane.showMessageDialog(null,
			 * "Invalid Input..!\nOnly Numeric Value Allowed");
			 * textField_15.setText(tpre_24); textdataflag = false;
			 * textField_15.setEditable(false); } } else { countKeyPress = 0; textdataflag =
			 * false; textField_15.setBackground(new Color(176, 224, 230));
			 * Application.headline="______"; textField_15.setText(tpre_24);
			 * textField_15.setEditable(false); } } else if (evt.getKeyCode() ==
			 * KeyEvent.VK_ESCAPE) { countKeyPress = 0; textdataflag = false;
			 * textField_15.setBackground(new Color(176, 224, 230));
			 * Application.headline="______"; textField_15.setText(tpre_24);
			 * textField_15.setEditable(false); } } });
			 * 
			 * //panel_37_4.add(textField_15);
			 */

			JPanel panel_1_3_3_1_1 = new JPanel();
			panel_1_3_3_1_1.setBounds(4, 460, 109, 47);
			panel_4.add(panel_1_3_3_1_1);
			panel_1_3_3_1_1.setLayout(null);
			panel_1_3_3_1_1
					.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 255, 0), new Color(75, 0, 130)));
			panel_1_3_3_1_1.setBackground(new Color(255, 239, 213));

			JLabel lblPartInLevel_2_1_1 = new JLabel("Points");
			lblPartInLevel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblPartInLevel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblPartInLevel_2_1_1.setBounds(2, 3, 105, 20);
			panel_1_3_3_1_1.add(lblPartInLevel_2_1_1);

			JPanel panel_6 = new JPanel();
			panel_6.setBorder(new LineBorder(Color.ORANGE));
			panel_6.setBackground(Color.WHITE);
			panel_6.setBounds(53, 21, 49, 22);
			panel_1_3_3_1_1.add(panel_6);
			panel_6.setLayout(null);

			JLabel lblPartInLevel_2_1_1_1_2 = new JLabel("Y :");
			lblPartInLevel_2_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblPartInLevel_2_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblPartInLevel_2_1_1_1_2.setBounds(0, 0, 20, 20);
			panel_6.add(lblPartInLevel_2_1_1_1_2);

			lblPartInLevel_2_1_1_1_3 = new JLabel("184");
			lblPartInLevel_2_1_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblPartInLevel_2_1_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblPartInLevel_2_1_1_1_3.setBounds(21, 0, 27, 20);
			panel_6.add(lblPartInLevel_2_1_1_1_3);

			JPanel panel_6_1 = new JPanel();
			panel_6_1.setBorder(new LineBorder(Color.ORANGE));
			panel_6_1.setLayout(null);
			panel_6_1.setBackground(Color.WHITE);
			panel_6_1.setBounds(3, 21, 49, 22);
			panel_1_3_3_1_1.add(panel_6_1);

			JLabel lblPartInLevel_2_1_1_1_2_1 = new JLabel("X :");
			lblPartInLevel_2_1_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblPartInLevel_2_1_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblPartInLevel_2_1_1_1_2_1.setBounds(0, 0, 19, 20);
			panel_6_1.add(lblPartInLevel_2_1_1_1_2_1);

			lblPartInLevel_2_1_1_1_3_1 = new JLabel("300");
			lblPartInLevel_2_1_1_1_3_1.setHorizontalAlignment(SwingConstants.LEFT);
			lblPartInLevel_2_1_1_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblPartInLevel_2_1_1_1_3_1.setBounds(21, 0, 28, 20);
			panel_6_1.add(lblPartInLevel_2_1_1_1_3_1);

			JPanel panel_1_3_3_2 = new JPanel();
			panel_1_3_3_2.setLayout(null);
			panel_1_3_3_2.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 255, 0), new Color(75, 0, 130)));
			panel_1_3_3_2.setBackground(new Color(255, 239, 213));
			panel_1_3_3_2.setBounds(4, 514, 109, 40);
			panel_4.add(panel_1_3_3_2);

			JLabel lblShifft = new JLabel("Shift :");
			lblShifft.setHorizontalAlignment(SwingConstants.CENTER);
			lblShifft.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblShifft.setBounds(2, 10, 50, 20);
			panel_1_3_3_2.add(lblShifft);

			lblNewLabel_13 = new JLabel("A");
			lblNewLabel_13.setForeground(Color.MAGENTA);
			lblNewLabel_13.setFont(new Font("Franklin Gothic Medium", Font.BOLD | Font.ITALIC, 23));
			lblNewLabel_13.setBounds(60, 11, 20, 20);
			panel_1_3_3_2.add(lblNewLabel_13);

			JPanel panel_1_3_3_1_2 = new JPanel();
			panel_1_3_3_1_2.setLayout(null);
			panel_1_3_3_1_2
					.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 255, 0), new Color(75, 0, 130)));
			panel_1_3_3_1_2.setBackground(new Color(255, 239, 213));
			panel_1_3_3_1_2.setBounds(4, 560, 109, 51);
			panel_4.add(panel_1_3_3_1_2);

			lblNewLabel_2_1_1_3 = new JLabel("Feb 1,2021");
			lblNewLabel_2_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNewLabel_2_1_1_3.setBounds(2, 2, 106, 20);
			panel_1_3_3_1_2.add(lblNewLabel_2_1_1_3);

			JPanel panel_10_3_2 = new JPanel();
			panel_10_3_2.setLayout(null);
			panel_10_3_2.setBorder(new LineBorder(new Color(255, 192, 203), 2));
			panel_10_3_2.setBackground(new Color(255, 250, 240));
			panel_10_3_2.setBounds(8, 23, 95, 23);
			panel_1_3_3_1_2.add(panel_10_3_2);

			lblNewLabel_2_1_1_3_2 = new JLabel("5:30:55   PM");
			lblNewLabel_2_1_1_3_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2_1_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_2_1_1_3_2.setBounds(3, 3, 95, 20);
			panel_10_3_2.add(lblNewLabel_2_1_1_3_2);
			
			JPanel panel_37 = new JPanel();
			panel_37.setBounds(5, 5, 300, 609);
			panel.add(panel_37);
			panel_37.setLayout(null);
					      
		      JPanel panel_377 = new JPanel();
				panel_377.setBounds(5, 5, 300, 596);
				panel.add(panel_377);
				panel_377.setLayout(null);
				panel_377.setVisible(false);
				
				JPanel panel_388 = new JPanel();
				panel_388.setBackground(new Color(255, 255, 153));
				panel_388.setBounds(0, 0, 300, 26);
				panel_377.add(panel_388);
				panel_388.setLayout(null);
				
				JLabel lblNewLabel_221 = new JLabel("Purchase Entry");
				lblNewLabel_221.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_221.setFont(new Font("Tahoma", Font.BOLD, 16));
				lblNewLabel_221.setBounds(0, 0, 300, 25);
				panel_388.add(lblNewLabel_221);
				
				JLabel lblNewLabel_4a = new JLabel("Supplier Name :");
				lblNewLabel_4a.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblNewLabel_4a.setForeground(new Color(0, 0, 0));
				lblNewLabel_4a.setBounds(5, 38, 120, 26);
				//panel_377.add(lblNewLabel_4a);
				
				textField_6as = new JTextField();
				textField_6as.setHorizontalAlignment(SwingConstants.CENTER);
				textField_6as.setForeground(new Color(0, 0, 0));
				textField_6as.setFont(new Font("Tahoma", Font.BOLD, 14));
				textField_6as.setBounds(131, 38, 165, 26);
				//panel_377.add(textField_6as);
				textField_6as.setColumns(10);
				

				
				JLabel lblNewLabel_4_3a = new JLabel("Bill Number :");
				lblNewLabel_4_3a.setForeground(Color.BLACK);
				lblNewLabel_4_3a.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblNewLabel_4_3a.setBounds(5, 79, 120, 26);
				panel_377.add(lblNewLabel_4_3a);
				
				textField_6a = new JTextField("");
				textField_6a.setHorizontalAlignment(SwingConstants.CENTER);
				textField_6a.setForeground(new Color(0, 0, 0));
				textField_6a.setFont(new Font("Tahoma", Font.BOLD, 14));
				textField_6a.setBounds(131, 78, 165, 30);
				panel_377.add(textField_6a);
				textField_6a.setColumns(10);
				
				JLabel lblNewLabel_4_3_1a = new JLabel("Date :");
				lblNewLabel_4_3_1a.setForeground(Color.BLACK);
				lblNewLabel_4_3_1a.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblNewLabel_4_3_1a.setBounds(5, 127, 120, 26);
				panel_377.add(lblNewLabel_4_3_1a);
				
				
				
				date_choosera = new JDateChooser();
				date_choosera.setFont(new Font("Tahoma", Font.BOLD, 14));
				date_choosera.setBounds(131, 127, 165, 30);
				date_choosera.setDateFormatString("MM/dd/yyyy");
				panel_377.add(date_choosera);

				JLabel lblNewLabel_4_3_2a = new JLabel("Bill Amount :");
				lblNewLabel_4_3_2a.setForeground(Color.BLACK);
				lblNewLabel_4_3_2a.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblNewLabel_4_3_2a.setBounds(5, 183, 125, 26);
				panel_377.add(lblNewLabel_4_3_2a);
				
				
				textField_6a1 = new JTextField();
				textField_6a1.setHorizontalAlignment(SwingConstants.CENTER);
				textField_6a1.setForeground(new Color(0, 0, 0));
				textField_6a1.setFont(new Font("Tahoma", Font.BOLD, 14));
				textField_6a1.setBounds(131, 183, 165, 30);
				panel_377.add(textField_6a1);
				textField_6a1.setColumns(10);
				
				
				 JLabel lblNewLabel_4_3_2_1a = new JLabel("Choose Bill :");
			      lblNewLabel_4_3_2_1a.setForeground(Color.BLACK);
			      lblNewLabel_4_3_2_1a.setFont(new Font("Tahoma", Font.BOLD, 14));
			      lblNewLabel_4_3_2_1a.setBounds(5, 230, 125, 26);
			      panel_377.add(lblNewLabel_4_3_2_1a);
			      
			      JButton fchoosbtn=new JButton("Choose File");
			      fchoosbtn.setBounds(131, 230, 165, 26);
			      fchoosbtn.setBackground(SystemColor.activeCaption);
			      panel_377.add(fchoosbtn);
			      
			      fchoosbtn.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
					try {
						choosedFileName=	createFileChooser(frame);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					}
					});
			      
			      
			      JLabel lblNewLabel_4_3_3p = new JLabel("Description :");
			      lblNewLabel_4_3_3p.setForeground(Color.BLACK);
			      lblNewLabel_4_3_3p.setFont(new Font("Tahoma", Font.BOLD, 14));
			      lblNewLabel_4_3_3p.setBounds(5, 283, 107, 26);
			      panel_377.add(lblNewLabel_4_3_3p);
			      
			      JPanel panel_41p = new JPanel();
			      panel_41p.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
			      panel_41p.setBounds(131, 270, 165, 75);
			      panel_377.add(panel_41p);
			      panel_41p.setLayout(null);
			      
			      JTextArea textAreap = new JTextArea();
			      textAreap.setBounds(1, 1, 163, 73);
			      panel_41p.add(textAreap);
			      textAreap.setBackground(new Color(255, 255, 255));
			      textAreap.setFont(new Font("Monospaced", Font.BOLD, 13));
			      textAreap.setTabSize(2);
			      textAreap.setWrapStyleWord(true);
			      textAreap.setRows(5);
			      textAreap.setLineWrap(true);
			      
			      JButton btnNewButton_2_3a = new JButton("SAVE");
			      btnNewButton_2_3a.setFont(new Font("Tahoma", Font.BOLD, 13));
			      btnNewButton_2_3a.setBackground(SystemColor.activeCaption);
			      btnNewButton_2_3a.setBounds(76, 380, 119, 45);
			      panel_377.add(btnNewButton_2_3a);
			      btnNewButton_2_3a.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
					//System.out.println(textField_6a.getText()+"  "+textField_6a1.getText()+"  "+date_choosera.getDate().toString()+"   "+lblNewLabel_4_5p1.getText().equals("")+"  "+lblNewLabel_1_1.getText());
				try {
if(LoginForm.loginflag) {
	if(!lblNewLabel_4_4_4.getText().equals("")&&!textField_6a.getText().equals("")&&!textField_6a1.getText().equals("")) {
	UserDAO.purchaseData(textField_6a.getText(), Float.parseFloat(textField_6a1.getText()), date_choosera.getDate().getMonth()+1+"/"+date_choosera.getDate().getDate()+"/"+date_choosera.getDate().toString().substring(date_choosera.getDate().toString().length()-4)+date_choosera.getDate().toString().substring(10,19),lblNewLabel_4_4_4.getText(),lblNewLabel_1_1.getText(),choosedFileName, textAreap.getText());
	textField_6a.setText("");
	textField_6a1.setText("");

		if(LoginForm.loginflag && !lblNewLabel_4_4_4.getText().equals("") ) {
			
 UserDAO.fetchedpara.clear();
try {
	UserDAO.batchOpen(lblNewLabel_4_4_4.getText());
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
	
	}else {
		JOptionPane.showMessageDialog(null, "All fields are required...!");
	}
//	//if(textField_6a.getText().equals("") ||textField_6a1.getText().equals("")|| date_choosera.getDate().toString().equals("")||lblNewLabel_4_4_4.getText().equals("") || lblNewLabel_1_1.getText().equals("")||choosedFileName.equals("")|| textAreap.getText().toString().equals("")) {
//	if(textField_6a1.getText().equals("")|| date_choosera.getDate().toString().equals("")) {
//	UserDAO.purchaseData(textField_6a.getText(), Float.parseFloat(textField_6a1.getText()), date_choosera.getDate().getMonth()+1+"/"+date_choosera.getDate().getDate()+"/"+date_choosera.getDate().toString().substring(date_choosera.getDate().toString().length()-4)+date_choosera.getDate().toString().substring(10,19),lblNewLabel_4_4_4.getText(),lblNewLabel_1_1.getText(),choosedFileName, textAreap.getText());
//	}else {
//		JOptionPane.showMessageDialog(null, "All fields are requird..");
//	}
	} else {
					JOptionPane.showMessageDialog(null, "Please First LOG IN ..!");
				}

					
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					}
				});
			      
			      

					JPanel panel_38 = new JPanel();
					panel_38.setBackground(new Color(255, 255, 153));
					panel_38.setBounds(0, 0, 300, 26);
					panel_37.add(panel_38);
					panel_38.setLayout(null);
					
					JLabel lblNewLabel_2 = new JLabel("Repay Entry");
					lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
					lblNewLabel_2.setBounds(0, 0, 300, 25);
					panel_38.add(lblNewLabel_2);
					
					JLabel lblNewLabel_4 = new JLabel("Supplier Name :");
					lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
					lblNewLabel_4.setForeground(new Color(0, 0, 0));
					lblNewLabel_4.setBounds(5, 38, 120, 26);
					panel_37.add(lblNewLabel_4);
					lblNewLabel_4.setVisible(false);
					
					JLabel lblNewLabel_4_3 = new JLabel("Bill Number :");
					lblNewLabel_4_3.setForeground(Color.BLACK);
					lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 14));
					lblNewLabel_4_3.setBounds(5, 79, 120, 26);
					//panel_37.add(lblNewLabel_4_3);
					
					textField_6 = new JTextField();
					textField_6.setBackground(Color.WHITE);
					textField_6.setEditable(false);
					textField_6.setHorizontalAlignment(SwingConstants.CENTER);
					textField_6.setForeground(new Color(0, 0, 0));
					textField_6.setFont(new Font("Tahoma", Font.BOLD, 14));
					textField_6.setBounds(131, 78, 165, 30);
					//panel_37.add(textField_6);
					textField_6.setColumns(10);
					
					JLabel lblNewLabel_4_3_1 = new JLabel("Date :");
					lblNewLabel_4_3_1.setForeground(Color.BLACK);
					lblNewLabel_4_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
					lblNewLabel_4_3_1.setBounds(5, 127, 120, 26);
					panel_37.add(lblNewLabel_4_3_1);
					
					
					
					date_chooser = new JDateChooser();
					date_chooser.setFont(new Font("Tahoma", Font.BOLD, 14));
					date_chooser.setBounds(131, 127, 165, 30);
					date_chooser.setDateFormatString("MM/dd/yyyy");
					panel_37.add(date_chooser);
					
					JLabel lblNewLabel_4_3_2 = new JLabel("Pay Method :");
					lblNewLabel_4_3_2.setForeground(Color.BLACK);
					lblNewLabel_4_3_2.setFont(new Font("Tahoma", Font.BOLD, 14));
					lblNewLabel_4_3_2.setBounds(5, 183, 125, 26);
					panel_37.add(lblNewLabel_4_3_2);
					
					

					JComboBox cb=new JComboBox(UserDAO.componentlist.toArray());  
				    cb.setBounds(131, 183, 165, 30);    
				        
				    listRenderer = new DefaultListCellRenderer();
				      listRenderer.setHorizontalAlignment(DefaultListCellRenderer.CENTER); // center-aligned items
				      cb.setRenderer(listRenderer);
				      panel_37.add(cb);
				      
				      JLabel lblNewLabel_4_3_2_1 = new JLabel("Paid Amount :");
				      lblNewLabel_4_3_2_1.setForeground(Color.BLACK);
				      lblNewLabel_4_3_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
				      lblNewLabel_4_3_2_1.setBounds(5, 230, 125, 26);
				      panel_37.add(lblNewLabel_4_3_2_1);
				      
				      JLabel lblNewLabel_4_3_3 = new JLabel("Description :");
				      lblNewLabel_4_3_3.setForeground(Color.BLACK);
				      lblNewLabel_4_3_3.setFont(new Font("Tahoma", Font.BOLD, 14));
				      lblNewLabel_4_3_3.setBounds(5, 283, 107, 26);
				      panel_37.add(lblNewLabel_4_3_3);
				      
				      JPanel panel_41 = new JPanel();
				      panel_41.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
				      panel_41.setBounds(131, 275, 165, 75);
				      panel_37.add(panel_41);
				      panel_41.setLayout(null);
				      
				      JTextArea textArea = new JTextArea();
				      textArea.setBounds(1, 1, 163, 73);
				      panel_41.add(textArea);
				      textArea.setBackground(new Color(255, 255, 255));
				      textArea.setFont(new Font("Monospaced", Font.BOLD, 13));
				      textArea.setTabSize(2);
				      textArea.setWrapStyleWord(true);
				      textArea.setRows(5);
				      textArea.setLineWrap(true);
				      
				      JButton btnNewButton_2_3 = new JButton("SUBMIT");
				      btnNewButton_2_3.addActionListener(new ActionListener() {
				      	public void actionPerformed(ActionEvent e) {
				      		try {
				      			if(LoginForm.loginflag) {
				      				if(!lblNewLabel_4_4_4.getText().equals("")) {
				      					if(!textField_16.getText().equals("")) {
				      				UserDAO.repayData( Float.parseFloat(textField_16.getText()), date_chooser.getDate().getMonth()+1+"/"+date_chooser.getDate().getDate()+"/"+date_chooser.getDate().toString().substring(date_chooser.getDate().toString().length()-4)+date_chooser.getDate().toString().substring(10,19),cb.getSelectedItem().toString(),lblNewLabel_4_4_4.getText(),lblNewLabel_1_1.getText(), textArea.getText().toString());
				      				textField_16.setText("");

							   		if(LoginForm.loginflag && !lblNewLabel_4_4_4.getText().equals("") ) {
							   			
								 UserDAO.fetchedpara.clear();
								try {
									UserDAO.batchOpen(lblNewLabel_4_4_4.getText());
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
							   	
				      					}else {
					      					JOptionPane.showMessageDialog(null, "All fields are required..!");
					      				}
				      					}else {
				      					JOptionPane.showMessageDialog(null, "Please select the supplier..!");
				      				}
				      				} else {
				      								JOptionPane.showMessageDialog(null, "Please First LOG IN ..!");
				      							}

				      								
				      								
				      							} catch (Exception e1) {
				      								// TODO Auto-generated catch block
				      								e1.printStackTrace();
				      							}
				      	}
				      });
				      btnNewButton_2_3.setFont(new Font("Tahoma", Font.BOLD, 13));
				      btnNewButton_2_3.setBackground(SystemColor.activeCaption);
				      btnNewButton_2_3.setBounds(76, 375, 119, 45);
				      panel_37.add(btnNewButton_2_3);
				      
				      textField_16 = new JTextField();
				      textField_16.setHorizontalAlignment(SwingConstants.CENTER);
				      textField_16.setForeground(Color.BLACK);
				      textField_16.setFont(new Font("Tahoma", Font.BOLD, 14));
				      textField_16.setColumns(10);
				      textField_16.setBounds(131, 230, 165, 30);
				      panel_37.add(textField_16);
				      
				    
				      
				    
				      
				       lblNewLabel_4_5p = new JLabel("No Supplier");
				      lblNewLabel_4_5p.setHorizontalAlignment(SwingConstants.LEFT);
				      lblNewLabel_4_5p.setForeground(new Color(128, 0, 0));
				      lblNewLabel_4_5p.setFont(new Font("Tahoma", Font.BOLD, 13));
				      lblNewLabel_4_5p.setBounds(131, 38, 165, 26);
				      panel_37.add(lblNewLabel_4_5p);
				      lblNewLabel_4_5p.setVisible(false);
				      
				      //Ppuchaise panel

			SpinnerModel valuechnl2v2 = new SpinnerNumberModel(517, // initial value
					10, // minimum value
					929, // maximum value
					2); // step

			SpinnerModel valuechnl2v1 = new SpinnerNumberModel(417, // initial value
					5, // minimum value
					924, // maximum value
					2); // step

			SpinnerModel valuechnl2h2 = new SpinnerNumberModel(400, // initial value
					10, // minimum value
					695, // maximum value
					2); // step

			SpinnerModel valuechnl2h1 = new SpinnerNumberModel(300, // initial value
					5, // minimum value
					690, // maximum value
					2); // step

			SpinnerModel magnix = new SpinnerNumberModel(0, // initial value
					-7, // minimum value
					8, // maximum value
					1); // step

			SpinnerModel magniy = new SpinnerNumberModel(0, // initial value
					-7, // minimum value
					8, // maximum value
					1); // step

			SpinnerModel pcnt = new SpinnerNumberModel(1, // initial value
					1, // minimum value
					30, // maximum value
					1); // step

			String month[] = { "         LOW", "      MEDIUM", "        HIGH" };
			String mon[] = { "        HIGH" };

			spinner_2_2 = new JSpinner(new SpinnerListModel(month));
			spinner_2_3 = new JSpinner(new SpinnerListModel(mon));

			JPanel panel_2 = new JPanel();
			panel_2.setBorder(new LineBorder(Color.ORANGE));
			panel_2.setBackground(Color.GRAY);
			panel_2.setBounds(118, 61, 1234, 50);
			contentPane.add(panel_2);
			panel_2.setLayout(null);

			JButton btnNewButton_2_1 = new JButton("<html>Registration</html>");
			btnNewButton_2_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (LoginForm.loginflag) {
						JFrame ourFrame = new JFrame("Component Details");
						SignUpForm.signUpForm(ourFrame);
					} else {
						JOptionPane.showMessageDialog(null, "Please First LOG IN ..!");
					}

				}
			});
			btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnNewButton_2_1.setBackground(SystemColor.activeCaption);
			btnNewButton_2_1.setBounds(128, 3, 119, 45);
			panel_2.add(btnNewButton_2_1);

			JButton btnNewButton_2_2 = new JButton("<html>Suppliers</html>");
			btnNewButton_2_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (LoginForm.loginflag) {
						FetchParameter fd = new FetchParameter();
						fd.frameSecond();
						
					} else {
						JOptionPane.showMessageDialog(null, "Please First LOG IN ..!");
					}
				}
			});
			btnNewButton_2_2.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnNewButton_2_2.setBackground(SystemColor.activeCaption);
			btnNewButton_2_2.setBounds(253, 3, 119, 45);
			panel_2.add(btnNewButton_2_2);

			JButton btnNewButton_2_2_1 = new JButton("Report");
			btnNewButton_2_2_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (LoginForm.loginflag) {
						try {
							Robot robot = new Robot();
							String format = "jpg";
							// fileName = "D:\\New Project\\Scrach Pad\\Image\\ki." + format;
							String fileName = "D:\\MPApplication\\Eddysorter\\Image\\src\\ki." + format;
							// Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
							Rectangle captureRect = new Rectangle(0, 142, 1024, 625);
							BufferedImage screenFullImage = robot.createScreenCapture(captureRect);
							ImageIO.write(screenFullImage, format, new File(fileName));

							// System.out.println("A partial screenshot saved!");
						} catch (AWTException | IOException ex) {
							System.err.println(ex);
						}
						ourFrame = new JFrame("Report Generation");
						// ReportForm.reportDialog(ourFrame);
						ReportForm rf = new ReportForm();
						rf.reportDialog(ourFrame);

					} else {
						JOptionPane.showMessageDialog(null, "Please First LOG IN ..!");
					}

				}
			});
			btnNewButton_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnNewButton_2_2_1.setBackground(SystemColor.activeCaption);
			btnNewButton_2_2_1.setBounds(378, 3, 119, 45);
			panel_2.add(btnNewButton_2_2_1);

			lblbname = new JLabel("No batch selected");
			lblbname.setFont(new Font("Dialog", Font.BOLD, 14));
			lblbname.setForeground(new Color(244, 164, 96));
			lblbname.setBounds(803, 15, 175, 26);
			panel_2.add(lblbname);
			lblbname.setVisible(false);

			lblNewLabel_1_1 = new JLabel("No user login");
			lblNewLabel_1_1.setForeground(new Color(244, 164, 96));
			lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1_1.setBounds(1069, 14, 155, 20);
			panel_2.add(lblNewLabel_1_1);

			ImageIcon imglogin = new ImageIcon("D:\\MPApplication\\Eddysorter\\Image\\login.jpg");
			Image i_login = imglogin.getImage();

			Image new_imglog = i_login.getScaledInstance(46, 40, Image.SCALE_REPLICATE);

			imglogin = new ImageIcon(new_imglog);

			JLabel lblNewLabel_6 = new JLabel("", imglogin, JLabel.LEFT);

			lblNewLabel_6.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (LoginForm.loginflag) {

						int result = JOptionPane.showConfirmDialog(frame, "Sure? You want to LOG OUT?",
								"Log Out Dialog", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
						if (result == JOptionPane.YES_OPTION) {
							LoginForm.loginflag = false;
							Application.lblNewLabel_1_1.setText("No user login");
							//btnNewButton_2_2_1_1.setText("Count OFF");
							tubcntflag = false;
							//btnNewButton_2_2_1_1.setBackground(SystemColor.activeCaption);
							Application.lblbname.setText("No batch selected");

							Application.textField_10.setText("0");
							Application.textField_11.setText("0");
							Application.textField_12.setText("0");
						} else if (result == JOptionPane.NO_OPTION) {
							// LoginForm.loginflag=true;
						} else {
							// LoginForm.loginflag=true;
						}
					}
				}
			});
			lblNewLabel_6.setToolTipText("Log out");
			lblNewLabel_6.addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseMoved(MouseEvent e) {

				}
			});
			lblNewLabel_6.setBounds(1013, 3, 46, 40);
			panel_2.add(lblNewLabel_6);

			JPanel panel_14 = new JPanel();
			panel_14.setBounds(1065, 45, 115, 2);
			panel_2.add(panel_14);
			panel_14.setLayout(null);

			ImageIcon imgbatch = new ImageIcon("D:\\MPApplication\\Eddysorter\\Image\\batchimg.png");
			Image i_batch = imgbatch.getImage();

			Image new_imgbatch = i_batch.getScaledInstance(46, 40, Image.SCALE_REPLICATE);

			imgbatch = new ImageIcon(new_imgbatch);

			JLabel lblNewLabel_7 = new JLabel("", imgbatch, JLabel.LEFT);
			lblNewLabel_7.setToolTipText("Batch Out");
			lblNewLabel_7.setBounds(753, 4, 46, 40);
			panel_2.add(lblNewLabel_7);
			lblNewLabel_7.setVisible(false);
			lblNewLabel_7.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (!Application.lblbname.getText().equals("No batch selected")) {
						System.out.println("Batch  opened...!");
						int result = JOptionPane.showConfirmDialog(frame, "Sure? You want to BATCH OUT?",
								"Batch Out Dialog", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
						if (result == JOptionPane.YES_OPTION) {
							//btnNewButton_2_2_1_1.setText("Count OFF");
							tubcntflag = false;
							//btnNewButton_2_2_1_1.setBackground(SystemColor.activeCaption);
							Application.lblbname.setText("No batch selected");

							Application.textField_10.setText("0");
							Application.textField_11.setText("0");
							Application.textField_12.setText("0");
						} else if (result == JOptionPane.NO_OPTION) {
							// LoginForm.loginflag=true;
						} else {
							// LoginForm.loginflag=true;
						}
					} else {
						System.out.println("Batch not opened...!");
					}
				}
			});

			JPanel panel_14_1 = new JPanel();
			panel_14_1.setLayout(null);
			panel_14_1.setBounds(803, 43, 175, 2);
			panel_2.add(panel_14_1);
			panel_14_1.setVisible(false);
			btnNewButton_2 = new JButton("<html>Login</html>");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					if (LoginForm.loginflag) {
						// JOptionPane.showMessageDialog(null,"First LOG OUT existing user ..!");
						ourFrame = new JFrame("User Login");
						LoginForm.signUpForm(ourFrame);
						Application.headline = "Login form";
					} else {
						ourFrame = new JFrame("User Login ");
						LoginForm.signUpForm(ourFrame);
						Application.headline = "Login form";
					}

				}
			});
			btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnNewButton_2.setBackground(SystemColor.activeCaption);
			btnNewButton_2.setBounds(6, 3, 119, 45);
			panel_2.add(btnNewButton_2);
			
			JButton btnNewButton_2_2_1_1 = new JButton("Purchase");
			btnNewButton_2_2_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel_37.setVisible(false);
					panel_377.setVisible(true);
				}
			});
			btnNewButton_2_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnNewButton_2_2_1_1.setBackground(SystemColor.activeCaption);
			btnNewButton_2_2_1_1.setBounds(504, 3, 119, 45);
			panel_2.add(btnNewButton_2_2_1_1);
			
			JButton btnNewButton_2_2_1_1_1 = new JButton("Repay");
			btnNewButton_2_2_1_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel_37.setVisible(true);
					panel_377.setVisible(false);
				}
			});
			btnNewButton_2_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnNewButton_2_2_1_1_1.setBackground(SystemColor.activeCaption);
			btnNewButton_2_2_1_1_1.setBounds(630, 3, 119, 45);
			panel_2.add(btnNewButton_2_2_1_1_1);

			JPanel panel_12 = new JPanel();
			panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			panel_12.setBackground(new Color(255, 255, 255));
			panel_12.setBounds(1, 1, 116, 115);
			contentPane.add(panel_12);
			panel_12.setLayout(null);

			ImageIcon img = new ImageIcon("D:\\MPApplication\\Eddysorter\\Image\\anpllogo.png");
			Image i = img.getImage();

			Image new_img = i.getScaledInstance(115, 155, Image.SCALE_REPLICATE);

			img = new ImageIcon(new_img);

			JLabel lblNewLabel_3 = new JLabel("", img, JLabel.LEFT);
			lblNewLabel_3.setBounds(1, 0, 115, 115);
			panel_12.add(lblNewLabel_3);

			JLabel lblNewLabel_2_1 = new JLabel("ANUP NDT PVT LT");

			JPanel panel_13 = new JPanel();
			panel_13.setBorder(new LineBorder(new Color(255, 215, 0)));
			panel_13.setBackground(new Color(255, 255, 255));
			panel_13.setBounds(117, 2, 1234, 56);
			contentPane.add(panel_13);
			panel_13.setLayout(null);
			panel_13.setVisible(true);

			JLabel lblNewLabel_1 = new JLabel("SHENDAGE KAPAD DUKAN,NATEPUTE");
			lblNewLabel_1.setForeground(new Color(0, 102, 255));
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 43));
			lblNewLabel_1.setBounds(200, 3, 840, 40);
			panel_13.add(lblNewLabel_1);

			JLabel lblNewLabel_4_1 = new JLabel("Configured for");
			lblNewLabel_4_1.setForeground(Color.LIGHT_GRAY);
			lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_4_1.setBounds(1050, 20, 123, 29);
			lblNewLabel_4_1.setVisible(false);
			panel_13.add(lblNewLabel_4_1);

			JLabel lblNewLabel_4_2 = new JLabel("Hirschvogel");
			lblNewLabel_4_2.setForeground(Color.BLACK);
			lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 19));
			lblNewLabel_4_2.setBounds(1236, 3, 150, 29);
			lblNewLabel_4_2.setVisible(false);
			panel_13.add(lblNewLabel_4_2);

			JLabel lblNewLabel_4_2_1 = new JLabel("Components India");
			lblNewLabel_4_2_1.setForeground(Color.BLACK);
			lblNewLabel_4_2_1.setFont(new Font("Tahoma", Font.BOLD, 19));
			lblNewLabel_4_2_1.setBounds(1236, 29, 223, 29);
			lblNewLabel_4_2_1.setVisible(false);
			panel_13.add(lblNewLabel_4_2_1);

			ImageIcon img1 = new ImageIcon("D:\\MPApplication\\Eddysorter\\Image\\HCI_logo.png");
			Image i1 = img1.getImage();
			Image new_img1 = i1.getScaledInstance(55, 55, Image.SCALE_REPLICATE);

			img1 = new ImageIcon(new_img1);

			JLabel lblNewLabel_23 = new JLabel(img1);
			lblNewLabel_23.setBounds(1175, 3, 55, 55);
			lblNewLabel_23.setVisible(false);
			panel_13.add(lblNewLabel_23);

			SpinnerModel value = new SpinnerNumberModel(0, // initial value
					-400, // minimum value
					400, // maximum value
					1); // step

			SpinnerModel value2 = new SpinnerNumberModel(0, // initial value
					-400, // minimum value
					400, // maximum value
					1);

			ImageIcon imgsetting = new ImageIcon("D:\\MPApplication\\Eddysorter\\Image\\settingimg.jpg");
			Image i_setting = imgsetting.getImage();

			Image new_imgsetting = i_setting.getScaledInstance(40, 44, Image.SCALE_REPLICATE);

			imgsetting = new ImageIcon(new_imgsetting);

			JPanel panel_11 = new JPanel();
			panel_11.setBorder(new LineBorder(Color.ORANGE));
			panel_11.setBackground(Color.WHITE);
			panel_11.setBounds(1026, 674, 323, 60);
			contentPane.add(panel_11);
			panel_11.setLayout(null);
			panel_11.setVisible(false);

			JPanel panel_8 = new JPanel();
			panel_8.setBounds(0, 0, 323, 60);
			panel_11.add(panel_8);
			panel_8.setBorder(new LineBorder(Color.ORANGE));
			panel_8.setBackground(new Color(230, 230, 250));
			panel_8.setLayout(null);
			panel_8.setVisible(false);

			JPanel panel_1_3_1 = new JPanel();
			panel_1_3_1.setBounds(166, 5, 75, 50);
			panel_8.add(panel_1_3_1);
			panel_1_3_1.setLayout(null);
			panel_1_3_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 255, 0), new Color(75, 0, 130)));
			panel_1_3_1.setBackground(new Color(255, 239, 213));

			JLabel lblNewLabel_3_1 = new JLabel("X-Shift");
			lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_3_1.setBounds(0, 0, 70, 20);
			panel_1_3_1.add(lblNewLabel_3_1);

			JPanel panel_23 = new JPanel();
			panel_23.setBorder(new LineBorder(Color.GREEN));
			panel_23.setBounds(4, 22, 68, 25);
			panel_1_3_1.add(panel_23);
			panel_23.setLayout(null);
			spinner = new JSpinner(value);
			spinner.setBounds(51, 1, 17, 20);
			panel_23.add(spinner);

			spinner.setFont(new Font("Tahoma", Font.BOLD, 13));

			lblNewLabel_18 = new JLabel("0");
			lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_18.setBounds(1, 1, 50, 20);
			panel_23.add(lblNewLabel_18);

			JPanel panel_1_3_1_1 = new JPanel();
			panel_1_3_1_1.setBounds(244, 5, 75, 50);
			panel_8.add(panel_1_3_1_1);
			panel_1_3_1_1.setLayout(null);
			panel_1_3_1_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 255, 0), new Color(75, 0, 130)));
			panel_1_3_1_1.setBackground(new Color(255, 239, 213));

			JLabel lblNewLabel_3_1_1 = new JLabel("Y-Shift");
			lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_3_1_1.setBounds(0, 0, 70, 20);
			panel_1_3_1_1.add(lblNewLabel_3_1_1);

			JPanel panel_24 = new JPanel();
			panel_24.setBorder(new LineBorder(Color.GREEN));
			panel_24.setBounds(4, 22, 68, 25);
			panel_1_3_1_1.add(panel_24);
			panel_24.setLayout(null);
			spinner_1 = new JSpinner(value2);
			spinner_1.setBounds(51, 1, 17, 20);
			panel_24.add(spinner_1);

			spinner_1.setFont(new Font("Tahoma", Font.BOLD, 13));

			lblNewLabel_19 = new JLabel("0");
			lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_19.setBounds(1, 1, 50, 20);
			panel_24.add(lblNewLabel_19);

			panel_1_3_1_1_1 = new JPanel();
			panel_1_3_1_1_1.setBounds(85, 5, 79, 50);
			panel_8.add(panel_1_3_1_1_1);
			panel_1_3_1_1_1.setLayout(null);
			panel_1_3_1_1_1
					.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 255, 0), new Color(75, 0, 130)));
			panel_1_3_1_1_1.setBackground(new Color(255, 239, 213));
			panel_1_3_1_1_1.setVisible(false);
			JLabel lblNewLabel_3_1_2_2 = new JLabel("H1");
			lblNewLabel_3_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblNewLabel_3_1_2_2.setBounds(3, 2, 13, 20);
			panel_1_3_1_1_1.add(lblNewLabel_3_1_2_2);

			JLabel lblNewLabel_3_1_2_2_1 = new JLabel("H2");
			lblNewLabel_3_1_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3_1_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblNewLabel_3_1_2_2_1.setBounds(3, 26, 13, 20);
			panel_1_3_1_1_1.add(lblNewLabel_3_1_2_2_1);

			panel_21 = new JPanel();
			panel_21.setBackground(new Color(176, 224, 230));
			panel_21.setBorder(new LineBorder(Color.GREEN));
			panel_21.setBounds(17, 4, 59, 20);
			panel_1_3_1_1_1.add(panel_21);
			panel_21.setLayout(null);

			spinner_1_1_1_1 = new JSpinner(valuechnl2h1);
			spinner_1_1_1_1.setBounds(41, 1, 17, 18);
			panel_21.add(spinner_1_1_1_1);
			spinner_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			spinner_1_1_1_1.setEnabled(false);

			lblNewLabel_16 = new JLabel("50");
			lblNewLabel_16.setBackground(SystemColor.textHighlight);
			lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_16.setBounds(1, 1, 40, 18);
			panel_21.add(lblNewLabel_16);

			panel_22 = new JPanel();
			panel_22.setBackground(new Color(176, 224, 230));
			panel_22.setBorder(new LineBorder(Color.GREEN));
			panel_22.setBounds(17, 26, 59, 20);
			panel_1_3_1_1_1.add(panel_22);
			panel_22.setLayout(null);
			spinner_1_1 = new JSpinner(valuechnl2h2);
			spinner_1_1.setBounds(41, 1, 17, 18);
			panel_22.add(spinner_1_1);
			spinner_1_1.setEnabled(false);
			spinner_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));

			lblNewLabel_17 = new JLabel("-50");
			lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_17.setBounds(1, 1, 40, 18);
			panel_22.add(lblNewLabel_17);

			panel_1_3_1_1_1_1 = new JPanel();
			panel_1_3_1_1_1_1.setLayout(null);
			panel_1_3_1_1_1_1
					.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 255, 0), new Color(75, 0, 130)));
			panel_1_3_1_1_1_1.setBackground(new Color(255, 239, 213));
			panel_1_3_1_1_1_1.setBounds(87, 5, 78, 50);
			panel_1_3_1_1_1_1.setVisible(true);
			panel_8.add(panel_1_3_1_1_1_1);

			JLabel lblNewLabel_3_1_2_2_1_1_2 = new JLabel("R1");
			lblNewLabel_3_1_2_2_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3_1_2_2_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblNewLabel_3_1_2_2_1_1_2.setBounds(3, 2, 13, 20);
			panel_1_3_1_1_1_1.add(lblNewLabel_3_1_2_2_1_1_2);

			JLabel lblNewLabel_3_1_2_2_1_1 = new JLabel("R2");
			lblNewLabel_3_1_2_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3_1_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblNewLabel_3_1_2_2_1_1.setBounds(3, 26, 13, 20);
			panel_1_3_1_1_1_1.add(lblNewLabel_3_1_2_2_1_1);

			JPanel panel_21_1 = new JPanel();
			panel_21_1.setLayout(null);
			panel_21_1.setBorder(new LineBorder(Color.GREEN));
			panel_21_1.setBackground(new Color(176, 224, 230));
			panel_21_1.setBounds(17, 4, 59, 20);
			panel_1_3_1_1_1_1.add(panel_21_1);

			SpinnerModel ellipser1 = new SpinnerNumberModel(50, // initial value
					5, // minimum value
					550, // maximum value
					1); // step

			spinner_1_1_1_1_1 = new JSpinner(ellipser1);
			spinner_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			spinner_1_1_1_1_1.setEnabled(true);
			spinner_1_1_1_1_1.setBounds(41, 1, 17, 18);
			panel_21_1.add(spinner_1_1_1_1_1);

			JLabel lblNewLabel_16_1 = new JLabel("50");
			lblNewLabel_16_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_16_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_16_1.setBackground(SystemColor.textHighlight);
			lblNewLabel_16_1.setBounds(1, 1, 40, 18);
			panel_21_1.add(lblNewLabel_16_1);
			JPanel panel_22_1 = new JPanel();
			panel_22_1.setLayout(null);
			panel_22_1.setBorder(new LineBorder(Color.GREEN));
			panel_22_1.setBackground(new Color(176, 224, 230));
			panel_22_1.setBounds(17, 26, 59, 20);
			panel_1_3_1_1_1_1.add(panel_22_1);

			SpinnerNumberModel ellipse_size = new SpinnerNumberModel(150, // initial value
					5, // minimum value
					550, // maximum value
					1); // step

			spinner_1_1_2 = new JSpinner(ellipse_size);
			spinner_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
			spinner_1_1_2.setEnabled(true);
			spinner_1_1_2.setBounds(41, 1, 17, 18);
			panel_22_1.add(spinner_1_1_2);

			JLabel lblNewLabel_17_1 = new JLabel("150");
			lblNewLabel_17_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_17_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_17_1.setBounds(1, 1, 40, 18);
			panel_22_1.add(lblNewLabel_17_1);



			panel_1_3_1_2 = new JPanel();
			panel_1_3_1_2.setBounds(3, 5, 79, 50);
			panel_8.add(panel_1_3_1_2);
			panel_1_3_1_2.setLayout(null);
			panel_1_3_1_2.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 255, 0), new Color(75, 0, 130)));
			panel_1_3_1_2.setBackground(new Color(255, 239, 213));
			panel_1_3_1_2.setVisible(false);
			JLabel lblNewLabel_3_1_2 = new JLabel("V1");
			lblNewLabel_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblNewLabel_3_1_2.setBounds(3, 2, 13, 20);
			panel_1_3_1_2.add(lblNewLabel_3_1_2);

			JLabel lblNewLabel_3_1_2_1 = new JLabel("V2");
			lblNewLabel_3_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblNewLabel_3_1_2_1.setBackground(SystemColor.activeCaptionBorder);
			lblNewLabel_3_1_2_1.setBounds(3, 26, 13, 20);
			panel_1_3_1_2.add(lblNewLabel_3_1_2_1);

			panel_19 = new JPanel();
			panel_19.setBackground(new Color(176, 224, 230));
			panel_19.setBorder(new LineBorder(Color.GREEN));
			panel_19.setBounds(17, 4, 59, 20);
			panel_1_3_1_2.add(panel_19);
			panel_19.setLayout(null);
			spinner_1_1_1 = new JSpinner(valuechnl2v1);
			spinner_1_1_1.setBounds(41, 1, 17, 18);
			panel_19.add(spinner_1_1_1);
			spinner_1_1_1.setForeground(Color.BLACK);
			spinner_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			spinner_1_1_1.setEnabled(false);
			spinner_1_1_1.setBackground(SystemColor.info);

			lblNewLabel_14 = new JLabel("-50");
			lblNewLabel_14.setBackground(Color.WHITE);
			lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_14.setBounds(1, 1, 40, 18);
			panel_19.add(lblNewLabel_14);

			panel_1_3_1_2_1 = new JPanel();
			panel_1_3_1_2_1.setLayout(null);
			panel_1_3_1_2_1
					.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 255, 0), new Color(75, 0, 130)));
			panel_1_3_1_2_1.setBackground(new Color(255, 239, 213));
			panel_1_3_1_2_1.setBounds(5, 5, 79, 50);
			panel_8.add(panel_1_3_1_2_1);

			JLabel lblNewLabel_3_1_2_3 = new JLabel("XP");
			lblNewLabel_3_1_2_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblNewLabel_3_1_2_3.setBounds(3, 2, 13, 20);
			panel_1_3_1_2_1.add(lblNewLabel_3_1_2_3);

			JLabel lblNewLabel_3_1_2_1_1 = new JLabel("YP");
			lblNewLabel_3_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblNewLabel_3_1_2_1_1.setBackground(SystemColor.activeCaptionBorder);
			lblNewLabel_3_1_2_1_1.setBounds(3, 26, 13, 20);
			panel_1_3_1_2_1.add(lblNewLabel_3_1_2_1_1);

			JPanel panel_19_2 = new JPanel();
			panel_19_2.setLayout(null);
			panel_19_2.setBorder(new LineBorder(Color.GREEN));
			panel_19_2.setBackground(new Color(176, 224, 230));
			panel_19_2.setBounds(17, 4, 59, 20);
			panel_1_3_1_2_1.add(panel_19_2);

			SpinnerModel xposition = new SpinnerNumberModel(367, // initial value
					0, // minimum value
					800, // maximum value
					1); // step

			spinner_1_1_1_3 = new JSpinner(xposition);
			spinner_1_1_1_3.setForeground(Color.BLACK);
			spinner_1_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 13));
			spinner_1_1_1_3.setEnabled(true);
			spinner_1_1_1_3.setBackground(SystemColor.info);
			spinner_1_1_1_3.setBounds(41, 1, 17, 18);
			panel_19_2.add(spinner_1_1_1_3);

			JLabel lblNewLabel_14_2 = new JLabel("367");
			lblNewLabel_14_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_14_2.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_14_2.setBackground(Color.WHITE);
			lblNewLabel_14_2.setBounds(1, 1, 40, 18);
			panel_19_2.add(lblNewLabel_14_2);

			JPanel panel_20_1 = new JPanel();
			panel_20_1.setLayout(null);
			panel_20_1.setBorder(new LineBorder(Color.GREEN));
			panel_20_1.setBackground(new Color(176, 224, 230));
			panel_20_1.setBounds(17, 26, 59, 20);
			panel_1_3_1_2_1.add(panel_20_1);

			SpinnerModel yposition = new SpinnerNumberModel(275, // initial value
					0, // minimum value
					600, // maximum value
					1); // step
			spinner_3_1 = new JSpinner(yposition);
			spinner_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			spinner_3_1.setEnabled(true);
			spinner_3_1.setBackground(Color.LIGHT_GRAY);
			spinner_3_1.setBounds(41, 1, 17, 18);
			panel_20_1.add(spinner_3_1);

			JLabel lblNewLabel_15_1 = new JLabel("275");
			lblNewLabel_15_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_15_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_15_1.setBounds(1, 1, 40, 18);
			panel_20_1.add(lblNewLabel_15_1);

			panel_20 = new JPanel();
			panel_20.setBackground(new Color(176, 224, 230));
			panel_20.setBorder(new LineBorder(Color.GREEN));
			panel_20.setBounds(17, 26, 59, 20);
			panel_1_3_1_2.add(panel_20);
			panel_20.setLayout(null);
			spinner_3 = new JSpinner(valuechnl2v2);
			spinner_3.setBounds(41, 1, 17, 18);
			panel_20.add(spinner_3);
			spinner_3.setFont(new Font("Tahoma", Font.BOLD, 13));
			spinner_3.setEnabled(false);
			spinner_3.setBackground(Color.LIGHT_GRAY);

			lblNewLabel_15 = new JLabel("50");
			lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_15.setBounds(1, 1, 40, 18);
			panel_20.add(lblNewLabel_15);


			JPanel panel_7 = new JPanel();
			panel_7.setBorder(new LineBorder(Color.ORANGE));
			panel_7.setBackground(Color.WHITE);
			panel_7.setBounds(1026, 116, 295, 442);
			contentPane.add(panel_7);
			panel_7.setLayout(null);
			panel_7.setVisible(false);

			panel_65 = new JPanel();
			panel_65.setBackground(new Color(240, 255, 240));
			panel_65.setBorder(new LineBorder(new Color(0, 255, 0)));
			panel_65.setBounds(2, 2, 291, 400);
			panel_65.setVisible(false);
			panel_7.add(panel_65);
			panel_65.setLayout(null);

			JLabel lblNewLabel_65 = new JLabel("~: Setting :~");
			lblNewLabel_65.setForeground(new Color(0, 100, 0));
			lblNewLabel_65.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
			lblNewLabel_65.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_65.setBounds(54, 3, 191, 25);
			panel_65.add(lblNewLabel_65);

			JPanel panel_121 = new JPanel();
			panel_121.setBackground(new Color(240, 255, 240));
			panel_121.setBorder(new LineBorder(Color.gray));
			panel_121.setBounds(1, 28, 291, 1);
			panel_121.setVisible(true);
			panel_65.add(panel_121);
			panel_121.setLayout(null);

			JPanel panel_122 = new JPanel();
			panel_122.setBackground(new Color(240, 255, 240));
			panel_122.setBorder(new LineBorder(Color.gray));
			panel_122.setBounds(1, 152 + 27, 291, 1);
			panel_122.setVisible(true);
			panel_65.add(panel_122);
			panel_122.setLayout(null);

			JPanel panel_123 = new JPanel();
			panel_123.setBackground(new Color(240, 255, 240));
			panel_123.setBorder(new LineBorder(Color.gray));
			panel_123.setBounds(1, 292, 291, 1);
			panel_123.setVisible(true);
			panel_65.add(panel_123);
			panel_123.setLayout(null);

			JPanel panel_124 = new JPanel();
			panel_124.setBackground(new Color(240, 255, 240));
			panel_124.setBorder(new LineBorder(Color.gray));
			panel_124.setBounds(146, 28, 1, 380);
			panel_124.setVisible(true);
			panel_65.add(panel_124);
			panel_124.setLayout(null);

			JPanel panel_125 = new JPanel();
			panel_125.setBackground(new Color(255, 239, 213));
			panel_125.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Magnification",
					TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 0, 0)));
			panel_125.setBounds(5, 32, 136, 138);
			panel_125.setVisible(true);
			panel_65.add(panel_125);
			panel_125.setLayout(null);

			JPanel panel_126 = new JPanel();
			panel_126.setBackground(new Color(240, 255, 240));
			panel_126.setBorder(new LineBorder(Color.lightGray));
			panel_126.setBounds(5, 20, 125, 50);
			panel_126.setVisible(true);
			panel_125.add(panel_126);
			panel_126.setLayout(null);

			ImageIcon imgxmag = new ImageIcon("D:\\MPApplication\\Eddysorter\\Image\\X_magnification.jpg");
			Image i_xmag = imgxmag.getImage();
			Image new_imgxmag = i_xmag.getScaledInstance(45, 45, Image.SCALE_REPLICATE);
			imgxmag = new ImageIcon(new_imgxmag);

			JLabel lblxmagimg = new JLabel(imgxmag);
			lblxmagimg.setBounds(-1, 5, 51, 40);
			panel_126.add(lblxmagimg);

			JLabel lblxmag = new JLabel("X-magni");
			lblxmag.setBounds(52, 2, 68, 19);
			lblxmag.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
			panel_126.add(lblxmag);

			JPanel panel_19_1_2 = new JPanel();
			panel_19_1_2.setLayout(null);
			panel_19_1_2.setBorder(new LineBorder(Color.GREEN));
			panel_19_1_2.setBackground(new Color(176, 224, 230));
			panel_19_1_2.setBounds(52, 23, 70, 24);
			panel_126.add(panel_19_1_2);

			spinner_1_1_1_2_2 = new JSpinner(magnix);
			spinner_1_1_1_2_2.setForeground(Color.BLACK);
			spinner_1_1_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 13));
			spinner_1_1_1_2_2.setBackground(SystemColor.info);
			spinner_1_1_1_2_2.setBounds(52, 1, 17, 23);
			panel_19_1_2.add(spinner_1_1_1_2_2);

			JLabel lblNewLabel_14_1_2 = new JLabel("0");
			lblNewLabel_14_1_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_14_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_14_1_2.setBackground(Color.WHITE);
			lblNewLabel_14_1_2.setBounds(0, 1, 52, 23);
			panel_19_1_2.add(lblNewLabel_14_1_2);

			spinner_1_1_1_2_2.addChangeListener(new ChangeListener() {

				@Override
				public void stateChanged(ChangeEvent e) {
					// TODO Auto-generated method stub
					lblNewLabel_14_1_2.setText(spinner_1_1_1_2_2.getValue().toString());
				}
			});

			JPanel panel_127 = new JPanel();
			panel_127.setBackground(new Color(240, 255, 240));
			panel_127.setBorder(new LineBorder(Color.lightGray));
			panel_127.setBounds(5, 78, 125, 50);
			panel_127.setVisible(true);
			panel_125.add(panel_127);
			panel_127.setLayout(null);

			ImageIcon imgxmagy = new ImageIcon("D:\\MPApplication\\Eddysorter\\Image\\Y_magnification.jpg");
			Image i_xmagy = imgxmagy.getImage();
			Image new_imgxmagy = i_xmagy.getScaledInstance(45, 45, Image.SCALE_REPLICATE);
			imgxmagy = new ImageIcon(new_imgxmagy);

			JLabel lblxmagimgy = new JLabel(imgxmagy);
			lblxmagimgy.setBounds(-1, 5, 51, 40);
			panel_127.add(lblxmagimgy);

			JLabel lblxmagy = new JLabel("Y-magni");
			lblxmagy.setBounds(52, 2, 68, 19);
			lblxmagy.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
			panel_127.add(lblxmagy);

			JPanel panel_19_1_3 = new JPanel();
			panel_19_1_3.setLayout(null);
			panel_19_1_3.setBorder(new LineBorder(Color.GREEN));
			panel_19_1_3.setBackground(new Color(176, 224, 230));
			panel_19_1_3.setBounds(52, 23, 70, 24);
			panel_127.add(panel_19_1_3);

			spinner_1_1_1_2_3 = new JSpinner(magniy);
			spinner_1_1_1_2_3.setForeground(Color.BLACK);
			spinner_1_1_1_2_3.setFont(new Font("Tahoma", Font.BOLD, 13));
			spinner_1_1_1_2_3.setBackground(SystemColor.info);
			spinner_1_1_1_2_3.setBounds(52, 1, 17, 23);
			panel_19_1_3.add(spinner_1_1_1_2_3);

			JLabel lblNewLabel_14_1_3 = new JLabel("0");
			lblNewLabel_14_1_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_14_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_14_1_3.setBackground(Color.WHITE);
			lblNewLabel_14_1_3.setBounds(0, 1, 52, 23);
			panel_19_1_3.add(lblNewLabel_14_1_3);
			JPanel panel_33 = new JPanel();

			panel_33.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Mode", TitledBorder.CENTER,
					TitledBorder.TOP, null, Color.RED));
			panel_33.setBounds(150, 32, 136, 138);
			panel_33.setBackground(new Color(255, 239, 213));
			panel_65.add(panel_33);
			panel_33.setLayout(null);
			JPanel panel_34 = new JPanel();
			panel_34.setBackground(Color.WHITE);
			panel_34.setBounds(5, 20, 125, 50);
			panel_33.add(panel_34);
			panel_34.setLayout(null);

			ImageIcon imgrect = new ImageIcon("D:\\MPApplication\\Eddysorter\\Image\\Rectangle.jpg");
			Image i_rect = imgrect.getImage();
			Image new_imgrect = i_rect.getScaledInstance(45, 45, Image.SCALE_REPLICATE);
			imgrect = new ImageIcon(new_imgrect);

			JLabel lblxmagimg_1 = new JLabel(imgrect);
			lblxmagimg_1.setBounds(-1, 5, 51, 40);
			panel_34.add(lblxmagimg_1);

			JLabel lblRectangle = new JLabel("Rectangle");
			lblRectangle.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
			lblRectangle.setBounds(52, 2, 77, 19);
			panel_34.add(lblRectangle);

			rdbtnNewRadioButton_1 = new JRadioButton("");
			rdbtnNewRadioButton_1.setBackground(Color.WHITE);
			rdbtnNewRadioButton_1.setBounds(78, 21, 30, 24);
			rdbtnNewRadioButton_1.setActionCommand("rectangle");

			panel_34.add(rdbtnNewRadioButton_1);

			JPanel panel_34_1 = new JPanel();
			panel_34_1.setLayout(null);
			panel_34_1.setBackground(Color.WHITE);
			panel_34_1.setBounds(5, 78, 125, 50);
			panel_33.add(panel_34_1);

			ImageIcon imgelli = new ImageIcon("D:\\MPApplication\\Eddysorter\\Image\\ellipse.jpg");
			Image i_elli = imgelli.getImage();
			Image new_imgelli = i_elli.getScaledInstance(50, 40, Image.SCALE_REPLICATE);
			imgelli = new ImageIcon(new_imgelli);

			JLabel lblRectangle_1 = new JLabel("Ellipse");
			lblRectangle_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
			lblRectangle_1.setBounds(62, 0, 51, 25);
			panel_34_1.add(lblRectangle_1);
			rdbtnNewRadioButton_1_1 = new JRadioButton("", true);
			rdbtnNewRadioButton_1_1.setBackground(Color.WHITE);
			rdbtnNewRadioButton_1_1.setBounds(70, 21, 27, 25);
			rdbtnNewRadioButton_1_1.setActionCommand("ellipse");
			panel_34_1.add(rdbtnNewRadioButton_1_1);

			ImageIcon imgrot = new ImageIcon("D:\\MPApplication\\Eddysorter\\Image\\rotationimg.png");
			Image i_rot = imgrot.getImage();
			Image new_imgrot = i_rot.getScaledInstance(30, 30, Image.SCALE_REPLICATE);
			imgrot = new ImageIcon(new_imgrot);

			JButton lblNewLabel_3_1_2_2_2 = new JButton("", imgrot);
			lblNewLabel_3_1_2_2_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3_1_2_2_2.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_3_1_2_2_2.setBounds(6, 6, 48, 37);
			lblNewLabel_3_1_2_2_2.setToolTipText("Rotate");
			panel_34_1.add(lblNewLabel_3_1_2_2_2);


			bg = new ButtonGroup();
			bg.add(rdbtnNewRadioButton_1);
			bg.add(rdbtnNewRadioButton_1_1);

			spinner_1_1_1_2_3.addChangeListener(new ChangeListener() {

				@Override
				public void stateChanged(ChangeEvent e) {
					// TODO Auto-generated method stub
					lblNewLabel_14_1_3.setText(spinner_1_1_1_2_3.getValue().toString());
				}
			});

			ImageIcon imgcan = new ImageIcon("D:\\MPApplication\\Eddysorter\\Image\\close.jpg");
			Image i_can = imgcan.getImage();
			Image new_imgcan = i_can.getScaledInstance(20, 20, Image.SCALE_REPLICATE);
			imgcan = new ImageIcon(new_imgcan);

			JButton btncan = new JButton(imgcan);
			btncan.setBounds(255, 3, 22, 22);
			btncan.setToolTipText("Close");
			panel_65.add(btncan);
			JPanel panel_33_1 = new JPanel();
			panel_33_1.setBorder(new TitledBorder(
					new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
					"Part Count", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 0, 0)));
			panel_33_1.setBackground(new Color(255, 239, 213));
			panel_33_1.setBounds(5, 185, 136, 103);
			panel_65.add(panel_33_1);
			panel_33_1.setLayout(null);

			lblNewLabel_22 = new JLabel("0");
			lblNewLabel_22.setFont(new Font("Segoe Script", Font.BOLD, 37));
			lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_22.setBounds(10, 15, 116, 77);
			panel_33_1.add(lblNewLabel_22);
			ImageIcon imgeng = new ImageIcon("D:\\MPApplication\\Eddysorter\\Image\\engicon.png");
			Image i_eng = imgeng.getImage();
			Image new_imgeng = i_eng.getScaledInstance(50, 40, Image.SCALE_REPLICATE);
			imgeng = new ImageIcon(new_imgeng);
			JPanel panel_33_2 = new JPanel();
			panel_33_2.setBorder(new TitledBorder(
					new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Auto",
					TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 0, 0)));
			panel_33_2.setBackground(new Color(255, 239, 213));
			panel_33_2.setBounds(150, 185, 136, 103);
			panel_65.add(panel_33_2);
			panel_33_2.setLayout(null);

			JPanel panel_34_2_1 = new JPanel();
			panel_34_2_1.setBackground(Color.WHITE);
			panel_34_2_1.setBounds(5, 21, 125, 68);
			panel_33_2.add(panel_34_2_1);
			panel_34_2_1.setLayout(null);

			JLabel lblAutoEllipse = new JLabel("Auto Ellipse Mode");
			lblAutoEllipse.setBounds(10, 2, 119, 25);
			lblAutoEllipse.setFont(new Font("Tahoma", Font.BOLD, 12));
			panel_34_2_1.add(lblAutoEllipse);

			JPanel panel_32 = new JPanel();
			panel_32.setBackground(new Color(176, 224, 230));
			panel_32.setBounds(5, 30, 70, 24);
			panel_34_2_1.add(panel_32);
			panel_32.setLayout(null);

			JLabel lblNewLabel_14_1_3_1 = new JLabel("1");
			lblNewLabel_14_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_14_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_14_1_3_1.setBackground(Color.WHITE);
			lblNewLabel_14_1_3_1.setBounds(0, 0, 52, 23);
			panel_32.add(lblNewLabel_14_1_3_1);

			spinner_4 = new JSpinner(pcnt);
			spinner_4.setBounds(52, 1, 17, 23);
			panel_32.add(spinner_4);

			btnNewButton_4 = new JButton("GO");
			btnNewButton_4.setHorizontalAlignment(SwingConstants.LEFT);
			btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 7));
			btnNewButton_4.setBounds(78, 29, 45, 26);
			panel_34_2_1.add(btnNewButton_4);
			spinner_4.addChangeListener(new ChangeListener() {

				@Override
				public void stateChanged(ChangeEvent e) {
					// TODO Auto-generated method stub
					lblNewLabel_14_1_3_1.setText(spinner_4.getValue().toString());

				}
			});
			JPanel panel_33_1_1 = new JPanel();
			panel_33_1_1.setBorder(new TitledBorder(
					new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
					"Dot Setting", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 0, 0)));
			panel_33_1_1.setBackground(new Color(255, 239, 213));
			panel_33_1_1.setBounds(5, 300, 136, 98);
			panel_65.add(panel_33_1_1);
			panel_33_1_1.setLayout(null);
			panel_35 = new JPanel();
			panel_35.setBorder(new LineBorder(Color.LIGHT_GRAY));
			panel_35.setBounds(10, 15, 116, 74);
			panel_35.setBackground(new Color(240, 255, 240));
			panel_35.setVisible(false);
			panel_33_1_1.add(panel_35);
			panel_35.setLayout(null);
			JLabel lblNoofdots = new JLabel("No.Of.Dots");
			lblNoofdots.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
			lblNoofdots.setBounds(8, 5, 94, 29);
			panel_35.add(lblNoofdots);
			JPanel panel_36 = new JPanel();
			panel_36.setBorder(new LineBorder(Color.GREEN));
			panel_36.setBounds(15, 35, 80, 30);
			panel_36.setBackground(new Color(176, 224, 230));
			panel_35.add(panel_36);
			panel_36.setLayout(null);
			textField_4 = new JTextField("20");
			tpre_19 = textField_4.getText();
			textField_4.setBackground(new Color(176, 224, 230));
			textField_4.setHorizontalAlignment(SwingConstants.CENTER);
			textField_4.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField_4.setBounds(1, 1, 78, 28);

			textField_4.setEditable(false);
			panel_36.add(textField_4);
			textField_4.setColumns(10);
			textField_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {

					countKeyPress = 0;
					textField_4.setEditable(true);
					textField_4.setBackground(Color.white);
					textdataflag = true;
					escflag = true;
					Application.headline = "Dot Range:  5 to 2000 ";

				}
			});

			textField_4.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent evt) {
					if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
						countKeyPress++;
						if (countKeyPress == 1 && textdataflag) {
							try {

								String formatted = df.format(Integer.parseInt(textField_4.getText()));
								float text1 = Float.parseFloat(formatted);
								if (text1 >= 5 && text1 <= 2000) {
									Application.tpre_19 = Application.textField_4.getText();
									Application.textField_4.setEditable(false);
									Application.textField_4.setBackground(new Color(176, 224, 230));
									try {
										FileWriter fw = new FileWriter(Utility.no_of_dot);
										fw.write(Application.textField_4.getText());
										fw.close();
									} catch (Exception e4) {
										System.out.println(e4);
									}
									System.out.println("Success...");
									textdataflag = false;
									// tpre_19 = formatted;
								} else {
									JOptionPane.showMessageDialog(null,
											"Invalid Input..!\nDisplay Range:  5 to 2000   ");
									textField_4.setText(tpre_19);
									textdataflag = false;
									textField_4.setEditable(false);
								}

							} catch (NumberFormatException e) {
								JOptionPane.showMessageDialog(null, "Invalid Input..!\nOnly Numeric Value Allowed");
								textField_4.setText(tpre_19);
								textdataflag = false;
								textField_4.setEditable(false);
							}
						} else {
							countKeyPress = 0;
							textdataflag = false;
							textField_4.setBackground(new Color(176, 224, 230));
							Application.headline = "______";
							textField_4.setText(tpre_19);
							textField_4.setEditable(false);
						}
					} else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
						countKeyPress = 0;
						textdataflag = false;
						textField_4.setBackground(new Color(176, 224, 230));
						Application.headline = "______";
						textField_4.setText(tpre_19);
						textField_4.setEditable(false);
					}
				}
			});

			JPanel panel_33_1_1_1 = new JPanel();
			panel_33_1_1_1.setBorder(new TitledBorder(
					new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
					"Delay & Counter", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 0, 0)));
			panel_33_1_1_1.setBackground(new Color(255, 239, 213));
			panel_33_1_1_1.setBounds(150, 300, 136, 98);
			panel_65.add(panel_33_1_1_1);
			panel_33_1_1_1.setLayout(null);

			JButton btnNewButton_3 = new JButton("Reset");
			btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnNewButton_3.setBounds(18, 57, 100, 30);
			panel_33_1_1_1.add(btnNewButton_3);

			JLabel lblAlarmDly = new JLabel("Alarm Dly");
			lblAlarmDly.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
			lblAlarmDly.setBounds(2, 17, 67, 29);
			panel_33_1_1_1.add(lblAlarmDly);

			textField_15 = new JTextField();
			textField_15.setBounds(72, 23, 54, 23);
			textField_15.setBackground(new Color(173, 216, 230));
			textField_15.setText("0");
			// textField_15.setText(DefaultFileReading.defpara.get(1));
			textField_15.setText("100");
			textField_15.setEditable(false);
			tpre_24 = textField_15.getText();
			textField_15.addFocusListener(this);
			textField_15.setHorizontalAlignment(SwingConstants.CENTER);
			textField_15.setFont(new Font("Tahoma", Font.BOLD, 11));

			textField_15.setColumns(10);
			textField_15.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					if (lblNewLabel_1_1.getText().equals("admin")) {
						countKeyPress = 0;
						textField_15.setEditable(true);
						textField_15.setBackground(Color.white);
						textdataflag = true;
						escflag = true;
						Application.headline = "Alarm Delay Range:  0 ms to 9999 ms ";
					}
				}
			});
			textField_15.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent evt) {
					if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
						countKeyPress++;
						if (countKeyPress == 1 && textdataflag) {
							try {

								String formatted = textField_15.getText();
								int text1 = Integer.parseInt(formatted);
								if (text1 >= 0 && text1 <= 9999) {
									System.out.println("My error..?");
									textdataflag = false;
									tpre_24 = formatted;
								} else {
									JOptionPane.showMessageDialog(null,
											"Invalid Input..!\nAlarm Duration Delay Range:  0 ms to 9999 ms ");
									textField_15.setText(tpre_24);
									textdataflag = false;
									textField_15.setEditable(false);
								}

							} catch (NumberFormatException e) {
								JOptionPane.showMessageDialog(null, "Invalid Input..!\nOnly Numeric Value Allowed");
								textField_15.setText(tpre_24);
								textdataflag = false;
								textField_15.setEditable(false);
							}
						} else {
							countKeyPress = 0;
							textdataflag = false;
							textField_15.setBackground(new Color(176, 224, 230));
							Application.headline = "______";
							textField_15.setText(tpre_24);
							textField_15.setEditable(false);
						}
					} else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
						countKeyPress = 0;
						textdataflag = false;
						textField_15.setBackground(new Color(176, 224, 230));
						Application.headline = "______";
						textField_15.setText(tpre_24);
						textField_15.setEditable(false);
					}
				}
			});

			panel_33_1_1_1.add(textField_15);

			btncan.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					jobflagcnt = true;
					panel_15.setVisible(true);
					panel_30.setVisible(false);
					panel_65.setVisible(false);
					panel_31.setVisible(false);
					Application.headline = "______";
				}
			});

			panel_31 = new JPanel();
			panel_31.setBackground(new Color(240, 255, 240));
			panel_31.setBorder(new LineBorder(new Color(0, 255, 0)));
			panel_31.setBounds(2, 2, 291, 397);
			panel_31.setVisible(false);
			panel_7.add(panel_31);
			panel_31.setLayout(null);

			JLabel lblNewLabel_92 = new JLabel("~: About :~");
			lblNewLabel_92.setForeground(new Color(0, 100, 0));
			lblNewLabel_92.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
			lblNewLabel_92.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_92.setBounds(54, 3, 191, 25);
			panel_31.add(lblNewLabel_92);

			JButton btncan1 = new JButton(imgcan);
			btncan1.setBounds(255, 3, 22, 22);
			btncan1.setToolTipText("Close");
			panel_31.add(btncan1);

			btncan1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					panel_15.setVisible(true);
					panel_30.setVisible(false);
					panel_65.setVisible(false);
					panel_31.setVisible(false);

				}
			});

			JPanel panel_18 = new JPanel();
			panel_18.setBorder(new LineBorder(Color.ORANGE));
			panel_18.setBackground(new Color(255, 250, 250));
			panel_18.setBounds(5, 38, 291, 344);
			panel_31.add(panel_18);
			panel_18.setLayout(null);

			JLabel lblNewLabel_11 = new JLabel("ADDRESS ");
			lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_11.setForeground(new Color(0, 0, 128));
			lblNewLabel_11.setBounds(10, 11, 83, 27);
			panel_18.add(lblNewLabel_11);

			JLabel lblNewLabel_12 = new JLabel("Unit No. 305,3rd floor,Yashada Industrial");
			lblNewLabel_12.setFont(new Font("Verdana", Font.BOLD, 11));
			lblNewLabel_12.setBounds(17, 31, 288, 21);
			panel_18.add(lblNewLabel_12);

			JLabel lblNewLabel_12_1 = new JLabel("Complex,Narhe Ambegaon Road,Narhe");
			lblNewLabel_12_1.setFont(new Font("Verdana", Font.BOLD, 11));
			lblNewLabel_12_1.setBounds(20, 49, 288, 21);
			panel_18.add(lblNewLabel_12_1);

			JLabel lblNewLabel_11_1 = new JLabel("CONTACT");
			lblNewLabel_11_1.setForeground(new Color(0, 0, 128));
			lblNewLabel_11_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_11_1.setBounds(10, 79, 83, 27);
			panel_18.add(lblNewLabel_11_1);

			JLabel lblNewLabel_12_2 = new JLabel("+91 94234 30536");
			lblNewLabel_12_2.setFont(new Font("Verdana", Font.BOLD, 11));
			lblNewLabel_12_2.setBounds(61, 99, 224, 21);
			panel_18.add(lblNewLabel_12_2);

			JLabel lblNewLabel_12_2_1 = new JLabel("+91 88881 08681");
			lblNewLabel_12_2_1.setFont(new Font("Verdana", Font.BOLD, 11));
			lblNewLabel_12_2_1.setBounds(61, 117, 224, 21);
			panel_18.add(lblNewLabel_12_2_1);

			JLabel lblNewLabel_11_1_1 = new JLabel("EMAIL");
			lblNewLabel_11_1_1.setForeground(new Color(0, 0, 128));
			lblNewLabel_11_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_11_1_1.setBounds(10, 140, 83, 27);
			panel_18.add(lblNewLabel_11_1_1);

			JLabel lblNewLabel_12_3 = new JLabel("anupndtpvtltd@gmail.com");
			lblNewLabel_12_3.setFont(new Font("Verdana", Font.BOLD, 11));
			lblNewLabel_12_3.setBounds(61, 158, 288, 21);
			panel_18.add(lblNewLabel_12_3);

			JLabel lblNewLabel_11_1_1_1 = new JLabel("WEBSITE");
			lblNewLabel_11_1_1_1.setForeground(new Color(0, 0, 128));
			lblNewLabel_11_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_11_1_1_1.setBounds(10, 178, 83, 27);
			panel_18.add(lblNewLabel_11_1_1_1);

			JLabel lblNewLabel_12_3_1 = new JLabel("www.anupndt.com");
			lblNewLabel_12_3_1.setForeground(new Color(0, 0, 255));
			lblNewLabel_12_3_1.setFont(new Font("Verdana", Font.BOLD, 11));
			lblNewLabel_12_3_1.setBounds(61, 198, 266, 21);
			panel_18.add(lblNewLabel_12_3_1);

			JLabel lblNewLabel_11_1_1_1_1 = new JLabel("SOFTWARE");
			lblNewLabel_11_1_1_1_1.setForeground(new Color(0, 0, 128));
			lblNewLabel_11_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_11_1_1_1_1.setBounds(10, 216, 83, 27);
			panel_18.add(lblNewLabel_11_1_1_1_1);

			lblNewLabel_12_3_1_1 = new JLabel("ESSF_001_01");
			lblNewLabel_12_3_1_1.setForeground(new Color(0, 0, 0));
			lblNewLabel_12_3_1_1.setFont(new Font("Verdana", Font.BOLD, 11));
			lblNewLabel_12_3_1_1.setBounds(71, 240, 288, 21);
			panel_18.add(lblNewLabel_12_3_1_1);

			JLabel lblNewLabel_11_1_1_1_1_1 = new JLabel("REFERENCE NO");
			lblNewLabel_11_1_1_1_1_1.setForeground(new Color(0, 0, 128));
			lblNewLabel_11_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_11_1_1_1_1_1.setBounds(10, 254, 150, 27);
			panel_18.add(lblNewLabel_11_1_1_1_1_1);

			lblNewLabel_12_3_1_1_1 = new JLabel("0324");
			lblNewLabel_12_3_1_1_1.setForeground(Color.BLACK);
			lblNewLabel_12_3_1_1_1.setFont(new Font("Verdana", Font.BOLD, 11));
			lblNewLabel_12_3_1_1_1.setBounds(81, 278, 288, 21);
			panel_18.add(lblNewLabel_12_3_1_1_1);

			panel_30 = new JPanel();
			panel_30.setBackground(new Color(240, 255, 240));
			panel_30.setBorder(new LineBorder(new Color(0, 255, 0)));
			panel_30.setBounds(2, 2, 291, 397);
			panel_30.setVisible(false);
			panel_7.add(panel_30);
			panel_30.setLayout(null);

			JLabel lblNewLabel_91 = new JLabel("~: Balanceing State :~");
			lblNewLabel_91.setForeground(new Color(0, 100, 0));
			lblNewLabel_91.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
			lblNewLabel_91.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_91.setBounds(54, 3, 191, 25);
			panel_30.add(lblNewLabel_91);

			JButton btncan2 = new JButton(imgcan);
			btncan2.setBounds(255, 3, 22, 22);
			btncan2.setToolTipText("Close");
			panel_30.add(btncan2);

			btncan2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					panel_15.setVisible(true);
					panel_30.setVisible(false);
					panel_65.setVisible(false);
					panel_31.setVisible(false);
					jobflagcnt = true;

				}
			});
			JPanel panel_17 = new JPanel();
			panel_17.setBorder(new LineBorder(Color.ORANGE));
			panel_17.setBackground(Color.WHITE);
			panel_17.setBounds(2, 38, 290, 358);
			panel_30.add(panel_17);
			panel_17.setLayout(null);
			panel_17.addMouseMotionListener(new MouseMotionListener() {

				@Override
				public void mouseMoved(MouseEvent e) {
					// TODO Auto-generated method stub
					panel_90.setBackground(SystemColor.info);
					panel_91.setBackground(SystemColor.info);
					panel_92.setBackground(SystemColor.info);
				}

				@Override
				public void mouseDragged(MouseEvent e) {
					// TODO Auto-generated method stub
					// panel_90.setBackground(SystemColor.info);
				}
			});

			panel_33.addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseMoved(MouseEvent e) {
					panel_125.setBackground(new Color(255, 239, 213));
					panel_33.setBackground(new Color(173, 216, 230));
					panel_33_1.setBackground(new Color(255, 239, 213));
					panel_33_2.setBackground(new Color(255, 239, 213));
					panel_33_1_1.setBackground(new Color(255, 239, 213));
					panel_33_1_1_1.setBackground(new Color(255, 239, 213));
				}
			});

			panel_125.addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseMoved(MouseEvent e) {
					panel_33.setBackground(new Color(255, 239, 213));
					panel_125.setBackground(new Color(173, 216, 230));
					panel_33_1.setBackground(new Color(255, 239, 213));
					panel_33_2.setBackground(new Color(255, 239, 213));
					panel_33_1_1.setBackground(new Color(255, 239, 213));
					panel_33_1_1_1.setBackground(new Color(255, 239, 213));
				}
			});

			panel_33_1.addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseMoved(MouseEvent e) {
					panel_125.setBackground(new Color(255, 239, 213));
					panel_33_1.setBackground(new Color(173, 216, 230));
					panel_33.setBackground(new Color(255, 239, 213));
					panel_33_2.setBackground(new Color(255, 239, 213));
					panel_33_1_1.setBackground(new Color(255, 239, 213));
					panel_33_1_1_1.setBackground(new Color(255, 239, 213));
				}
			});

			panel_33_2.addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseMoved(MouseEvent e) {
					panel_125.setBackground(new Color(255, 239, 213));
					panel_33_2.setBackground(new Color(173, 216, 230));
					panel_33_1.setBackground(new Color(255, 239, 213));
					panel_33.setBackground(new Color(255, 239, 213));
					panel_33_1_1.setBackground(new Color(255, 239, 213));
					panel_33_1_1_1.setBackground(new Color(255, 239, 213));
				}
			});

			panel_33_1_1.addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseMoved(MouseEvent e) {
					panel_125.setBackground(new Color(255, 239, 213));
					panel_33_1_1.setBackground(new Color(173, 216, 230));
					panel_33_1.setBackground(new Color(255, 239, 213));
					panel_33_2.setBackground(new Color(255, 239, 213));
					panel_33.setBackground(new Color(255, 239, 213));
					panel_33_1_1_1.setBackground(new Color(255, 239, 213));
				}
			});

			panel_33_1_1_1.addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseMoved(MouseEvent e) {
					panel_125.setBackground(new Color(255, 239, 213));
					panel_33_1_1_1.setBackground(Color.white);
					panel_33_1.setBackground(new Color(255, 239, 213));
					panel_33_2.setBackground(new Color(255, 239, 213));
					panel_33_1_1.setBackground(new Color(255, 239, 213));
					panel_33.setBackground(new Color(255, 239, 213));
				}
			});
			panel_90 = new JPanel();
			panel_90.setBorder(new LineBorder(Color.ORANGE));
			panel_90.setBackground(SystemColor.info);
			panel_90.setBounds(5, 240, 286, 100);
			panel_17.add(panel_90);
			panel_90.setLayout(null);
			panel_90.addMouseMotionListener(new MouseMotionListener() {

				@Override
				public void mouseMoved(MouseEvent e) {
					// TODO Auto-generated method stub
					panel_90.setBackground(Color.pink);
					panel_91.setBackground(SystemColor.info);
					panel_92.setBackground(SystemColor.info);
				}

				@Override
				public void mouseDragged(MouseEvent e) {
					// TODO Auto-generated method stub
					// panel_90.setBackground(SystemColor.info);
				}
			});
			panel_91 = new JPanel();
			panel_91.setBorder(new LineBorder(Color.ORANGE));
			panel_91.setBackground(SystemColor.info);
			panel_91.setBounds(5, 125, 286, 100);
			panel_17.add(panel_91);
			panel_91.setLayout(null);
			panel_91.addMouseMotionListener(new MouseMotionListener() {

				@Override
				public void mouseMoved(MouseEvent e) {
					// TODO Auto-generated method stub
					panel_90.setBackground(SystemColor.info);
					panel_91.setBackground(Color.pink);
					panel_92.setBackground(SystemColor.info);
				}

				@Override
				public void mouseDragged(MouseEvent e) {
					// TODO Auto-generated method stub
					// panel_90.setBackground(SystemColor.info);
				}
			});

			panel_92 = new JPanel();
			panel_92.setBorder(new LineBorder(Color.ORANGE));
			panel_92.setBackground(SystemColor.info);
			panel_92.setBounds(5, 10, 286, 100);
			panel_17.add(panel_92);
			panel_92.setLayout(null);
			panel_92.addMouseMotionListener(new MouseMotionListener() {

				@Override
				public void mouseMoved(MouseEvent e) {
					// TODO Auto-generated method stub
					panel_90.setBackground(SystemColor.info);
					panel_92.setBackground(Color.pink);
					panel_91.setBackground(SystemColor.info);
				}

				@Override
				public void mouseDragged(MouseEvent e) {
					// TODO Auto-generated method stub
					// panel_90.setBackground(SystemColor.info);
				}
			});

			JButton btnNewButton_1 = new JButton("Clear");
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnNewButton_1.setBackground(Color.lightGray);
			btnNewButton_1.setBounds(90, 50, 170, 40);
			panel_92.add(btnNewButton_1);

			JLabel lblNewLabel_10 = new JLabel("Clear The Screen.");
			lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
			lblNewLabel_10.setBounds(10, 5, 225, 35);
			panel_92.add(lblNewLabel_10);

			JButton btnNewButton_1_1 = new JButton("Yes");
			btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnNewButton_1_1.setBackground(Color.lightGray);
			btnNewButton_1_1.setBounds(90, 50, 170, 40);
			panel_91.add(btnNewButton_1_1);

			JLabel lblNewLabel_10_1 = new JLabel("Balance The Machine");
			lblNewLabel_10_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
			lblNewLabel_10_1.setBounds(10, 5, 225, 35);
			panel_91.add(lblNewLabel_10_1);

			JButton btnNewButton_1_2 = new JButton("Exit");
			btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnNewButton_1_2.setBackground(Color.lightGray);
			btnNewButton_1_2.setBounds(90, 50, 170, 40);
			panel_90.add(btnNewButton_1_2);
			btnNewButton_1_2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					panel_30.setVisible(false);
					panel_15.setVisible(true);
					jobflagcnt = true;
					// tubcntflag=true;
				}
			});

			JLabel lblNewLabel_10_2 = new JLabel("Exit The Balanceing");
			lblNewLabel_10_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
			lblNewLabel_10_2.setBounds(10, 5, 225, 35);
			panel_90.add(lblNewLabel_10_2);

			panel_15 = new JPanel();
			panel_15.setBackground(new Color(240, 255, 240));
			panel_15.setBorder(new LineBorder(new Color(0, 255, 0)));
			panel_15.setBounds(2, 2, 291, 397);
			// panel_15.setVisible(false);
			panel_7.add(panel_15);
			panel_15.setLayout(null);

			JLabel lblNewLabel_9 = new JLabel("~: HELP NOTICE :~");
			lblNewLabel_9.setForeground(new Color(0, 100, 0));
			lblNewLabel_9.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
			lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_9.setBounds(54, 3, 191, 25);
			panel_15.add(lblNewLabel_9);

			JEditorPane dtrpnjavaisAGeneralpurpose = new JEditorPane();

			dtrpnjavaisAGeneralpurpose.setBorder(new LineBorder(Color.BLACK));
			dtrpnjavaisAGeneralpurpose.setEditable(false);


			final JScrollPane scrollPane = new JScrollPane(dtrpnjavaisAGeneralpurpose);
			// getContentPane().add(scrollPane);
			scrollPane.setBounds(2, 23, 290, 384);
			panel_15.add(scrollPane);

			ImageIcon imgright = new ImageIcon("D:\\MPApplication\\Eddysorter\\Image\\arrow.gif");
			Image i_right = imgright.getImage();

			Image new_imgright = i_right.getScaledInstance(40, 39, Image.SCALE_REPLICATE);

			imgright = new ImageIcon(new_imgright);

			JPanel panel_16 = new JPanel();
			panel_16.setBorder(new LineBorder(new Color(255, 0, 0), 2));
			panel_16.setBackground(new Color(255, 69, 0));
			panel_16.setBounds(41, 403, 250, 32);
			panel_7.add(panel_16);
			panel_16.setLayout(null);

			lblNewLabel_8 = new JLabel("New label");
			lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 19));
			lblNewLabel_8.setForeground(Color.WHITE);
			lblNewLabel_8.setBounds(0, 0, 250, 32);
			panel_16.add(lblNewLabel_8);

			JPanel panel_25 = new JPanel();
			panel_25.setBorder(new LineBorder(Color.ORANGE));
			panel_25.setBackground(Color.WHITE);
			panel_25.setBounds(1026, 560, 323, 115);
			contentPane.add(panel_25);
			panel_25.setLayout(null);
			panel_25.setVisible(false);

			JPanel panel_7_1 = new JPanel();
			panel_7_1.setBounds(2, 60, 319, 56);
			panel_25.add(panel_7_1);
			panel_7_1.setLayout(null);
			panel_7_1.setBorder(new LineBorder(Color.ORANGE));
			panel_7_1.setBackground(new Color(230, 230, 250));

			panel_1_5_2 = new JPanel();
			panel_1_5_2.setLayout(null);
			panel_1_5_2.setBorder(new LineBorder(Color.MAGENTA, 1, true));
			panel_1_5_2.setBackground(SystemColor.info);
			panel_1_5_2.setBounds(82, 3, 76, 50);
			panel_7_1.add(panel_1_5_2);

			JLabel lblAccept_1_1 = new JLabel("Accept");
			lblAccept_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblAccept_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblAccept_1_1.setBounds(2, 0, 70, 20);
			panel_1_5_2.add(lblAccept_1_1);

			textField_10 = new JTextField();
			textField_10.setText("0");
			textField_10.setHorizontalAlignment(SwingConstants.CENTER);
			textField_10.setForeground(Color.BLACK);
			textField_10.setFont(new Font("Tahoma", Font.BOLD, 15));
			textField_10.setEditable(false);
			textField_10.setColumns(10);
			textField_10.setBackground(new Color(176, 224, 230));
			textField_10.setBounds(4, 22, 68, 25);
			panel_1_5_2.add(textField_10);

			panel_1_6_1 = new JPanel();
			panel_1_6_1.setLayout(null);
			panel_1_6_1.setBorder(new LineBorder(new Color(255, 0, 255), 1, true));
			panel_1_6_1.setBackground(SystemColor.info);
			panel_1_6_1.setBounds(160, 3, 76, 50);
			panel_7_1.add(panel_1_6_1);

			JLabel lblReject_1_1 = new JLabel("Reject");
			lblReject_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblReject_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblReject_1_1.setBounds(2, 0, 70, 20);
			panel_1_6_1.add(lblReject_1_1);

			textField_11 = new JTextField();
			textField_11.setText("0");
			textField_11.setHorizontalAlignment(SwingConstants.CENTER);
			textField_11.setForeground(Color.RED);
			textField_11.setFont(new Font("Tahoma", Font.BOLD, 15));
			textField_11.setEditable(false);
			textField_11.setColumns(10);
			textField_11.setBackground(new Color(176, 224, 230));
			textField_11.setBounds(4, 22, 68, 25);
			panel_1_6_1.add(textField_11);

			JPanel panel_1_7_1 = new JPanel();
			panel_1_7_1.setLayout(null);
			panel_1_7_1.setBorder(new LineBorder(new Color(255, 0, 255), 1, true));
			panel_1_7_1.setBackground(SystemColor.info);
			panel_1_7_1.setBounds(239, 3, 76, 50);
			panel_7_1.add(panel_1_7_1);

			JLabel lblTotal_1_1 = new JLabel("Total");
			lblTotal_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblTotal_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblTotal_1_1.setBounds(2, 0, 70, 20);
			panel_1_7_1.add(lblTotal_1_1);

			textField_12 = new JTextField();
			textField_12.setText("0");
			textField_12.setHorizontalAlignment(SwingConstants.CENTER);
			textField_12.setFont(new Font("Tahoma", Font.BOLD, 15));
			textField_12.setEditable(false);
			textField_12.setColumns(10);
			textField_12.setBackground(new Color(176, 224, 230));
			textField_12.setBounds(4, 22, 68, 25);
			panel_1_7_1.add(textField_12);

			panel_1_5_1_1 = new JPanel();
			panel_1_5_1_1.setLayout(null);
			panel_1_5_1_1.setBorder(new LineBorder(Color.MAGENTA, 1, true));
			panel_1_5_1_1.setBackground(SystemColor.info);
			panel_1_5_1_1.setBounds(3, 3, 76, 50);
			panel_7_1.add(panel_1_5_1_1);

			btnNewButton = new JButton("BALANCE");
			btnNewButton.setToolTipText("BALANCE");
			btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
			btnNewButton.setBackground(Color.LIGHT_GRAY);
			btnNewButton.setBounds(2, 2, 72, 45);
			panel_1_5_1_1.add(btnNewButton);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					panel_15.setVisible(false);
					panel_31.setVisible(false);
					panel_65.setVisible(false);
					panel_30.setVisible(true);
					jobflagcnt = false;
					Application.headline = "______";
					// tubcntflag=false;
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));

			JPanel panel_9 = new JPanel();
			panel_9.setBounds(2, 2, 319, 56);
			panel_25.add(panel_9);
			panel_9.setBackground(new Color(230, 230, 250));
			panel_9.setBorder(new LineBorder(Color.ORANGE));
			panel_9.setLayout(null);

			JPanel panel_10 = new JPanel();
			panel_10.setBackground(SystemColor.info);
			panel_10.setBorder(new LineBorder(new Color(255, 0, 255), 1, true));
			panel_10.setBounds(82, 3, 76, 50);
			panel_9.add(panel_10);
			panel_10.setLayout(null);

			JLabel lblNewLabel_2_1_1 = new JLabel("X-value");
			lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_2_1_1.setBounds(2, 0, 70, 20);
			panel_10.add(lblNewLabel_2_1_1);

			JPanel panel_26_2 = new JPanel();
			panel_26_2.setLayout(null);
			panel_26_2.setBorder(new LineBorder(new Color(211, 211, 211)));
			panel_26_2.setBackground(new Color(176, 224, 230));
			panel_26_2.setBounds(4, 22, 68, 25);
			panel_10.add(panel_26_2);

			lblNewLabel_2_1_2 = new JLabel("0");
			lblNewLabel_2_1_2.setBounds(2, 0, 68, 25);
			panel_26_2.add(lblNewLabel_2_1_2);
			lblNewLabel_2_1_2.setForeground(new Color(0, 0, 128));
			lblNewLabel_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));

			JPanel panel_10_1 = new JPanel();
			panel_10_1.setBackground(SystemColor.info);
			panel_10_1.setLayout(null);
			panel_10_1.setBorder(new LineBorder(new Color(255, 0, 255), 1, true));
			panel_10_1.setBounds(160, 3, 76, 50);
			panel_9.add(panel_10_1);

			JLabel lblNewLabel_2_1_1_1 = new JLabel("Y-value");
			lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_2_1_1_1.setBounds(2, 0, 70, 20);
			panel_10_1.add(lblNewLabel_2_1_1_1);

			JPanel panel_26_1 = new JPanel();
			panel_26_1.setLayout(null);
			panel_26_1.setBorder(new LineBorder(new Color(211, 211, 211)));
			panel_26_1.setBackground(new Color(176, 224, 230));
			panel_26_1.setBounds(4, 22, 68, 25);
			panel_10_1.add(panel_26_1);

			lblNewLabel_2_1_2_1 = new JLabel("0");
			lblNewLabel_2_1_2_1.setBounds(2, 0, 68, 25);
			panel_26_1.add(lblNewLabel_2_1_2_1);
			lblNewLabel_2_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2_1_2_1.setForeground(new Color(0, 0, 128));
			lblNewLabel_2_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));

			JPanel panel_10_2 = new JPanel();
			// panel_10_2.setToolTipText(lblNewLabel_2_1_2_2.getText().toString());
			panel_10_2.setBackground(SystemColor.info);
			panel_10_2.setLayout(null);
			panel_10_2.setBorder(new LineBorder(new Color(255, 0, 255), 1, true));
			panel_10_2.setBounds(239, 3, 76, 50);
			panel_9.add(panel_10_2);

			JLabel lblNewLabel_2_1_1_2 = new JLabel("Z-value");
			lblNewLabel_2_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_2_1_1_2.setBounds(2, 0, 70, 20);
			panel_10_2.add(lblNewLabel_2_1_1_2);

			JPanel panel_26 = new JPanel();
			panel_26.setBorder(new LineBorder(new Color(211, 211, 211)));
			panel_26.setBackground(new Color(176, 224, 230));
			panel_26.setBounds(4, 22, 68, 25);
			panel_10_2.add(panel_26);
			panel_26.setLayout(null);

			lblNewLabel_2_1_2_2 = new JLabel("0");

			lblNewLabel_2_1_2_2.setBounds(2, 0, 68, 25);
			panel_26.add(lblNewLabel_2_1_2_2);
			lblNewLabel_2_1_2_2.setBackground(new Color(176, 224, 230));
			lblNewLabel_2_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2_1_2_2.setForeground(new Color(0, 0, 128));
			lblNewLabel_2_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));

			JPanel panel_27 = new JPanel();
			panel_27.setBorder(new LineBorder(Color.MAGENTA, 1, true));
			panel_27.setBackground(SystemColor.info);
			panel_27.setBounds(3, 3, 76, 50);
			panel_9.add(panel_27);
			panel_27.setLayout(null);

			JButton btnClear = new JButton("<html><u>SCREEN</u><br />CLEAR</html>"); //
			btnClear.setBackground(Color.LIGHT_GRAY);
			btnClear.setBounds(2, 2, 72, 45);
			panel_27.add(btnClear);
			btnClear.setFont(new Font("Tahoma", Font.BOLD, 11));

			lblNewLabel_26 = new JLabel("");
			lblNewLabel_26.setBounds(923, 61, 176, 20);
			contentPane.add(lblNewLabel_26);
			lblNewLabel_26.setForeground(Color.WHITE);
			lblNewLabel_26.setFont(new Font("Tahoma", Font.BOLD, 12));



		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
			System.out.println("window errror....");
		}
	}

	@Override
	public void focusLost(FocusEvent e) {
		if (e.getSource() == textField) {
			// System.out.println("focusLOST...frquency");
			textField.setText(tpre);
			textField.setBackground(new Color(176, 224, 230));
			textField.setEditable(false);
			Application.headline = "______";
		} else if (e.getSource() == textField_1) {
			textField_1.setBackground(new Color(176, 224, 230));
			Application.headline = "______";
			// System.out.println("focusLOST...gainDB");
			textField_1.setText(tpre_1);

			textField_1.setEditable(false);
		} else if (e.getSource() == spinner_2) {
			// System.out.println("focusLOST...PREAMP GAIN");
			// textField_1.setText(tpre_9);
			// textField_1.setBackground(new Color(176, 224, 230));
		} else if (e.getSource() == textField_9) {
			// System.out.println("focusLOST...PHASE");
			textField_9.setText(tpre_9);
			textField_9.setBackground(new Color(176, 224, 230));
			Application.headline = "______";
			textField_9.setEditable(false);
		} else if (e.getSource() == textField_2) {
			// System.out.println("focusLOST...LPF");
			textField_2.setText(tpre_2);
			textField_2.setBackground(new Color(176, 224, 230));
			Application.headline = "______";
			textField_2.setEditable(false);
		} else if (e.getSource() == textField_3) {
			// System.out.println("focusLOST...PART IN LEVEL");
			textField_3.setText(tpre_3);
			textField_3.setBackground(new Color(176, 224, 230));
			textField_3.setEditable(false);
		} else if (e.getSource() == textField_7) {
			// System.out.println("focusLOST...ON DLY");
			textField_7.setText(tpre_7);
			textField_7.setBackground(new Color(176, 224, 230));
			Application.headline = "______";
			textField_7.setEditable(false);
		} else if (e.getSource() == textField_8) {
			// System.out.println("focusLOST...DURAION DLY");
			textField_8.setText(tpre_8);
			textField_8.setBackground(new Color(176, 224, 230));
			Application.headline = "______";
			textField_8.setEditable(false);
		} else if (e.getSource() == textField_4) {
			// System.out.println("focusLOST...PHASE");
			textField_4.setText(tpre_19);
			textField_4.setBackground(new Color(176, 224, 230));
			Application.headline = "______";
			textField_4.setEditable(false);
		} else if (e.getSource() == textField_15) {
			// System.out.println("focusLOST...PHASE");
			textField_15.setText(tpre_24);
			textField_15.setBackground(new Color(176, 224, 230));
			Application.headline = "______";
			textField_15.setEditable(false);
		}

	}

	@Override
	public void focusGained(FocusEvent e) {

		if (e.getSource() == textField) {
			// System.out.println("focusGAIN...frquency");
			textField.setText(tpre);
			textField.setBackground(new Color(176, 224, 230));
			Application.headline = "______";

		} else if (e.getSource() == textField_1) {
			// System.out.println("focusGAIN...gainDB");
			textField_1.setText(tpre_1);
			textField_1.setBackground(new Color(176, 224, 230));
			Application.headline = "______";
		} else if (e.getSource() == spinner_2) {
			System.out.println("focusGAIN...PREAMP GAIN");
			// textField_1.setText(tpre_9);
			// textField_1.setBackground(new Color(176, 224, 230));
		} else if (e.getSource() == textField_9) {
			// System.out.println("focusGANI...PHASE");
			textField_9.setText(tpre_9);
			textField_9.setBackground(new Color(176, 224, 230));
			Application.headline = "______";
		} else if (e.getSource() == textField_2) {
			// System.out.println("focusGAIN...LPF");
			textField_2.setText(tpre_2);
			textField_2.setBackground(new Color(176, 224, 230));
			Application.headline = "______";
		} else if (e.getSource() == textField_3) {
			// System.out.println("focusGAIN...PART IN LEVEL");
			textField_3.setText(tpre_3);
			textField_3.setBackground(new Color(176, 224, 230));
		} else if (e.getSource() == textField_7) {
			// System.out.println("focusGAIN...ON DLY");
			textField_7.setText(tpre_7);
			textField_7.setBackground(new Color(176, 224, 230));
			Application.headline = "______";
		} else if (e.getSource() == textField_8) {
			// System.out.println("focusGAIN...DURAION DLY");
			textField_8.setText(tpre_8);
			textField_8.setBackground(new Color(176, 224, 230));
			Application.headline = "______";
		} else if (e.getSource() == textField_15) {
			// System.out.println("focusGAIN...DURAION DLY");
			textField_15.setText(tpre_24);
			textField_15.setBackground(new Color(176, 224, 230));
			Application.headline = "______";
		}

	}

	public static void escapButtonEvent() {
		countKeyPress = 0;
		escflag = false;
		textdataflag = false;
		textField.setBackground(new Color(176, 224, 230));
		textField.setText(tpre);
		textField.setEditable(false);

		textField_1.setBackground(new Color(176, 224, 230));
		textField_1.setText(tpre_1);
		textField_1.setEditable(false);

		textField_2.setBackground(new Color(176, 224, 230));
		textField_2.setText(tpre_2);
		textField_2.setEditable(false);

		textField_9.setBackground(new Color(176, 224, 230));
		textField_9.setText(tpre_9);
		textField_9.setEditable(false);

		textField_3.setBackground(new Color(176, 224, 230));
		textField_3.setText(tpre_3);
		textField_3.setEditable(false);

		textField_7.setBackground(new Color(176, 224, 230));
		textField_7.setText(tpre_7);
		textField_7.setEditable(false);

		textField_8.setBackground(new Color(176, 224, 230));
		textField_8.setText(tpre_8);
		textField_8.setEditable(false);

		textField_4.setBackground(new Color(176, 224, 230));
		textField_4.setText(tpre_19);
		textField_4.setEditable(false);

		textField_15.setBackground(new Color(176, 224, 230));
		textField_15.setText(tpre_24);
		textField_15.setEditable(false);
		Application.headline = "______";

	}
	
	private static String createFileChooser(final JFrame frame) throws IOException {
		
		System.out.println("bill nuber lengtjh:"+ textField_6a.getText().length());
		 if(!lblNewLabel_4_4_4.getText().equals("") && textField_6a.getText().length()>=1) {
        String filename = File.separator+"tmp";
        JFileChooser fileChooser = new JFileChooser(new File(filename));
 
        //fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); // only directories
         fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY); // only files
        // fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES); // both files and directories
 
        // pop up an "Open File" file chooser dialog
        fileChooser.showOpenDialog(frame);
 
        
        InputStream is = null;
        OutputStream os = null;
      
            is = new FileInputStream(new File(fileChooser.getSelectedFile().toString()));
            os = new FileOutputStream(new File(Utility.graph_img+lblNewLabel_4_4_4.getText()+"_"+textField_6a.getText()+fileChooser.getSelectedFile().getName().substring(fileChooser.getSelectedFile().getName().length()-4)));
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
       
        
        System.out.println("File to open: " +lblNewLabel_4_4_4.getText()+textField_6a.getText()+fileChooser.getSelectedFile().getName().substring(fileChooser.getSelectedFile().getName().length()-4));
		return fileChooser.getSelectedFile().getName();
		 }else {
			 JOptionPane.showMessageDialog(null, "Please select the Supplier and Enter bill number..");
			 return "bad file name..";
		 }
    }

	public static void displayRepayData() {
		showingTableData.clear();
		int tot=0;
		int tot1=0;
		float balance=0;
		for(int i=0;i<UserDAO.tableRowData.size()/7;i++) {
			balance +=Float.parseFloat(UserDAO.tableRowData.get(tot+1));
			showingTableData.add(UserDAO.tableRowData.get(tot));  
			showingTableData.add(UserDAO.tableRowData.get(tot+5));
			showingTableData.add(UserDAO.tableRowData.get(tot+1));
			showingTableData.add(UserDAO.tableRowData.get(tot+2));
			showingTableData.add("--");
			showingTableData.add("--");
			showingTableData.add("--");
			showingTableData.add(UserDAO.tableRowData.get(tot+6));
			showingTableData.add(Float.toString(balance));
	
			((DefaultTableModel) model).addRow(showingTableData.toArray());        
	        showingTableData.clear();
	        tot+=7;
		}
		
		
		
		for(int i=0;i<UserDAO.tableRowDatap.size()/8;i++) {
			
			showingTableData.add("--");
			showingTableData.add("--");
			showingTableData.add("--");
			showingTableData.add("--");
			showingTableData.add(UserDAO.tableRowDatap.get(tot1+1));  
			showingTableData.add(UserDAO.tableRowDatap.get(tot1+2));
			
			showingTableData.add(UserDAO.tableRowDatap.get(tot1+3));
			showingTableData.add(UserDAO.tableRowDatap.get(tot1+6));
			
		showingTableData.add(Float.toString(balance-Float.parseFloat(UserDAO.tableRowDatap.get(tot1+1))));
	
			((DefaultTableModel) model).addRow(showingTableData.toArray());        
	        showingTableData.clear();
	        tot1+=8;
		}
		
		
        tableRowCount=((DefaultTableModel) model).getRowCount();
	}
}
