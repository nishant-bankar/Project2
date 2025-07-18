// StarBalls7 <StarBalls5 <StarBalls4 <StarBalls3 <StarBalls2 <StarBalls < Hirschvogel_20 < Hirschvogel_18 < Hirschvogel_17< Hirschvogel_16 < Hirschvogel_14 < Hirschvogel_14 < Hirschvogel_13 < Hirschvogel_12 < MorePortApp139.31
package test;
import javax.swing.JOptionPane;




import event.ProgressBar;
import view.Application;

public class RS232Test1 {
	protected static final String TITLE = null;
 

	public static void main(String[] args)  {  
		try { 
    	new ProgressBar();
        Thread.sleep(5000);	
//	  new RS232Test1().connect(Communication.portfirst);
//		CommPortSender.sendFirst(Communication.sponmain);
		Application.mainFrame();
		
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			ProgressBar.frame.dispose();
			JOptionPane.showMessageDialog(null, "COM8 Port is not connected.");
		}
		ProgressBar.frame.dispose();
		
	}

}
