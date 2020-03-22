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


public class Review {

	private JFrame frame;
	private JLabel lblNewLabel_1;
	private JLabel lblSubmissionStatusHere;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Review window = new Review();
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
	public Review() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 987, 560);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//"profile picture" panel
		JPanel panel = new JPanel();
		panel.setBounds(39, 52, 135, 116);
		frame.getContentPane().add(panel);
		
		//"window title"
		JPanel panel_1 = new JPanel();
		panel_1.setName("Papers Submission");
		panel_1.setBounds(0, 0, 990, 21);
		panel_1.setBorder(new TitledBorder(null, "Reviewers System", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(6, 16, 1054, 23);
		panel_1.add(toolBar);
		
		// name and faculty
		JLabel reviewerName = new JLabel("Name: Snow White");
		reviewerName.setBounds(49, 179, 150, 14);
		frame.getContentPane().add(reviewerName);
		
		JLabel reviewerFaculty = new JLabel("Faculty: CS");
		reviewerFaculty.setBounds(49, 204, 111, 14);
		frame.getContentPane().add(reviewerFaculty);
		
		//"reviewed journals" panel
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(248, 52, 448, 455);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		
		//create list of journals
		List list = new List();

		list.setBounds(40, 42, 278, 175);
		list.add("History of Computation");
		list.add("Information Technology Ethics");
		list.add("Human-Computer Interation");
		panel_2.add(list);
		
		JLabel Reviewedjournals = new JLabel("Reviewed journals:");
		Reviewedjournals.setBounds(40, 22, 150, 14);
		panel_2.add(Reviewedjournals);
		


		
		//"my tasks" button
		Button button = new Button("My tasks");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Reviewtwo newWin = new Reviewtwo();
				newWin.SecondScreen();
				
			}
		});
		button.setBounds(341, 42, 70, 22);
		panel_2.add(button);
		
		
		
		
		//"information" panel
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(716, 89, 205, 418);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNotifications = new JLabel("NOTIFICATIONS");
		lblNotifications.setBounds(756, 64, 126, 14);
		frame.getContentPane().add(lblNotifications);
		lblNotifications.setFont(new Font("Arial", Font.BOLD, 16));
	
	}
	
	
	
	
	
	
	
}
