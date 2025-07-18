package event;
// 
// Decompiled by Procyon v0.5.36
// 


import java.awt.Image;

import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Component;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import util.Utility;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;

import test.RS232Test1;

import javax.swing.JFrame;

public class ProgressBar
{
    public static JFrame frame;
    static int i;
    int num;
    public static JLabel label1;
    public static JLabel label2;
    
    static {
        ProgressBar.i = 0;
    }
    
    public ProgressBar() {
        this.num = 0;
        ProgressBar.frame = new JFrame();
        ProgressBar.frame.getContentPane().setBackground(Color.white);
        final Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        final int screen_height = size.height;
        final int screen_width = size.width;
        (ProgressBar.label1 = new JLabel()).setBackground(Color.PINK);
        ProgressBar.label1.setHorizontalAlignment(0);
        final ImageIcon iconLogo = new ImageIcon(Utility.application_logo);
        ProgressBar.label1.setIcon(iconLogo);
        ProgressBar.label1.setBounds((screen_width-1200)/2,50, 1200, 393);
        (ProgressBar.label2 = new JLabel()).setBackground(Color.PINK);
        ProgressBar.label2.setHorizontalAlignment(0);
        final ImageIcon iconLogo2 = new ImageIcon(Utility.gifimag);
        ProgressBar.label2.setIcon(iconLogo2);
        ProgressBar.label2.setBounds((screen_width-1200)/2, 450, 1200, 90);
      
        //ProgressBar.frame.setBounds((screen_width-1366)/2,(screen_height-768)/2, 1366,768);
       // setBounds((screen_width-1366)/2,(screen_height-768)/2, 1366,768);
        ProgressBar.frame.setLocationRelativeTo(null);
        ProgressBar.frame.setDefaultCloseOperation(3);
        final Image icon = Toolkit.getDefaultToolkit().getImage("D:\\MPApplication\\Eddysorter\\Image\\anpl_logo99.png");
        ProgressBar.frame.setIconImage(icon);
        ProgressBar.frame.getContentPane().setLayout(null);
        ProgressBar.frame.setExtendedState(6);
        ProgressBar.frame.getContentPane().add(ProgressBar.label1);
        ProgressBar.frame.getContentPane().add(ProgressBar.label2);
        ProgressBar.frame.setVisible(true);
    }
}