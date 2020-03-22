package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JInternalFrame;
import javax.swing.SpringLayout;
import javax.swing.JScrollBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Choice;
import java.awt.List;
import javax.swing.JList;
import javax.swing.JTree;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Button;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextField;

public class Reviewthree {
    private JFrame frame;
    public static void ThirdScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reviewthree window = new Reviewthree();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
    /**
	 * Create the application.
	 */
	public Reviewthree() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 980, 560);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//
		JPanel panel_1 = new JPanel();
		panel_1.setName("Papers Submission");
		panel_1.setBounds(0, 0, 990, 21);
		panel_1.setBorder(new TitledBorder(null, "Reviewers System", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(6, 16, 1054, 23);
		panel_1.add(toolBar);
		
		
		//profile panel
		JPanel panel_profile = new JPanel();
		panel_profile.setBounds(40, 40, 135, 135);
		frame.getContentPane().add(panel_profile);
		//name
		JLabel reviewerName = new JLabel("Name: Snow White");
		reviewerName.setBounds(49, 179, 150, 14);
		frame.getContentPane().add(reviewerName);
		//faculty
		JLabel reviewerFaculty = new JLabel("Faculty: CS");
		reviewerFaculty.setBounds(49, 204, 111, 14);
		frame.getContentPane().add(reviewerFaculty);
		
	    //the file panel
		JPanel firstpanel = new JPanel();
		firstpanel.setBounds(200, 40, 700, 350);
		frame.getContentPane().add(firstpanel);
		
		//accept button
		Button button1 = new Button("Accept");
		button1.setBounds(220, 410, 60, 40);
		frame.getContentPane().add(button1);
	    //reject button
		Button button2 = new Button("Reject");
		button2.setBounds(320, 410, 60, 40);
		frame.getContentPane().add(button2);
		//deadline button
		Button button3 = new Button("Deadline");
		button3.setBounds(420, 410, 80, 40);
		frame.getContentPane().add(button3);
		//minor revision button
		Button button4 = new Button("minor revision");
		button4.setBounds(540, 410, 130, 40);
		frame.getContentPane().add(button4);
		//major button
		Button button5 = new Button("Major");
		button5.setBounds(690, 410, 60, 40);
		frame.getContentPane().add(button5);
		
		JTextField textField = new JTextField();
		textField.setBounds(200, 460, 650, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		Button button6 = new Button("Submit");
		button6.setBounds(880, 460, 80, 50);
		frame.getContentPane().add(button6);
		
	}
   
    
}
