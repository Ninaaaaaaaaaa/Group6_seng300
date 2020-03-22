package project;

import java.awt.EventQueue;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileSystemView;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.JLabel;


public class Reviewtwo {
	private JFrame frame;
	
	
	/**
	 * Launch the application.
	 */
	public static void SecondScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reviewtwo window = new Reviewtwo();
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
	public Reviewtwo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 987, 560);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//window title
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
		JPanel profile_panel = new JPanel();
		profile_panel.setBounds(39, 52, 135, 116);
		frame.getContentPane().add(profile_panel);
		//name
		JLabel reviewerName = new JLabel("Name: Snow White");
		reviewerName.setBounds(49, 179, 150, 14);
		frame.getContentPane().add(reviewerName);
		//faculty
		JLabel reviewerFaculty = new JLabel("Faculty: CS");
		reviewerFaculty.setBounds(49, 204, 111, 14);
		frame.getContentPane().add(reviewerFaculty);
		
		
		//"review request" panel
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(248, 52, 448, 200);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel Reviewrequests = new JLabel ("Review Requests");
		Reviewrequests.setBounds(15, 15, 150, 14);
		panel_4.add(Reviewrequests);
		
		
		//"Review journals" Panel
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(248, 260, 448, 200);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JLabel Reviewjournals = new JLabel ("Review Journals");
		Reviewjournals.setBounds(15, 15, 150, 14);
		panel_5.add(Reviewjournals);
		
		
		//add list of journals in "review request" panel
		List list1 = new List();
		list1.setBounds(30, 30, 278, 125);
		list1.add("AI conditioning Ethics");
		list1.add("Art Made by AI");
		list1.add("Human Perception as compared to AI perception");
		list1.add("Principles of Operating System");
		panel_4.add(list1);
		
		
		//add button after every paper in list1
		Button button1 = new Button("Accept");
		button1.setBounds(341, 35, 70, 13);
		panel_4.add(button1);
		
		Button button2 = new Button("Accept");
		button2.setBounds(341, 52, 70, 13);
		panel_4.add(button2);
		
		Button button3 = new Button("Accept");
		button3.setBounds(341, 69, 70, 13);
		panel_4.add(button3);
		
		Button button4 = new Button("Accept");
		button4.setBounds(341, 86, 70, 13);
		panel_4.add(button4);
		
		//add list of journals in "Review journals" panel
        List list2 = new List();
		list2.setBounds(30, 30, 278, 125);
		list2.add("Programming About Software Engineering");
		list2.add("Data Structure and Algorithm about Computer Science");
		list2.add("Data Base Management Systems");
		panel_5.add(list2);
		
		//add button after every paper in list2
		Button button5 = new Button("View");
		button5.setBounds(341, 35, 70, 13);
		panel_5.add(button5);
		
		Button button6 = new Button("View");
		button6.setBounds(341, 52, 70, 13);
		panel_5.add(button6);
		
		Button button7 = new Button("View");
		button7.setBounds(341, 69, 70, 13);
		panel_5.add(button7);
		
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reviewthree newWin = new Reviewthree();
				newWin.ThirdScreen();
			}
		});
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reviewthree newWin = new Reviewthree();
				newWin.ThirdScreen();
			}
		});
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reviewthree newWin = new Reviewthree();
				newWin.ThirdScreen();
			}
		});
		
	}
	
	
	
	
	
	
	
}
