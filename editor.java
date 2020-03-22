import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Choice;
import java.awt.List;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Button;

public class editor {

	private JFrame frame;
	private JLabel lblNewLabel_1;
	private JLabel lblSubmissionStatusHere;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					editor window = new editor();
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
	public editor() {
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
		
		JPanel panel = new JPanel();
		panel.setBounds(39, 52, 135, 116);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setName("Papers Submission");
		panel_1.setBounds(-6, 0, 990, 21);
		panel_1.setBorder(new TitledBorder(null, "editor system", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(6, 16, 1045, 23);
		panel_1.add(toolBar);
		
		JLabel lblName = new JLabel("Name: Nero Curry");
		lblName.setBounds(49, 179, 111, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblFaculty = new JLabel("Faculty: CS");
		lblFaculty.setBounds(49, 204, 111, 14);
		frame.getContentPane().add(lblFaculty);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(248, 52, 448, 455);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		List list = new List();
		list.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = "Withdrawn";
				String a1 = "Accepted";
				String a2 = "Major Revision";
				String a3 = "Minor Revision";
				int selected = list.getSelectedIndex();
				if(selected == 1 || selected == 0) {
					lblSubmissionStatusHere.setText(a1);
				}else if (selected == 2){
					lblSubmissionStatusHere.setText(a2);
				}else {
					lblSubmissionStatusHere.setText(a);
				}
				
			}
		});
		list.setBounds(40, 42, 278, 175);
		list.add("Effects of AI Conditioning to Infants - First submission");
		list.add("AI conditioning Ethics");
		list.add("Art Made by AI");
		list.add("Human Perception as  compared to AI perception");
		panel_2.add(list);
		
		JLabel lblSubmissions = new JLabel("Submissions :");
		lblSubmissions.setBounds(40, 22, 113, 14);
		panel_2.add(lblSubmissions);
		
		lblNewLabel_1 = new JLabel("Submission Status:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(40, 227, 133, 14);
		panel_2.add(lblNewLabel_1);
		
		lblSubmissionStatusHere = new JLabel("Submission status here ");
		lblSubmissionStatusHere.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblSubmissionStatusHere.setBounds(135, 227, 136, 14);
		panel_2.add(lblSubmissionStatusHere);
		
		Choice choice = new Choice();
		choice.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		choice.setBounds(341, 111, 70, 20);
		choice.add("View");
		choice.add("Download");	
		panel_2.add(choice);
		
		Button button = new Button("Submission");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Assign newWin = new Assign();
				newWin.NewScreen();
				
			}
		});
		button.setBounds(341, 42, 70, 22);
		panel_2.add(button);
		
		Button button_1 = new Button("DeadLine");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DeadLine newWin = new DeadLine();
				newWin.NewScreen();
			}
		});
		button_1.setBounds(341, 70, 70, 22);
		panel_2.add(button_1);
	
		
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