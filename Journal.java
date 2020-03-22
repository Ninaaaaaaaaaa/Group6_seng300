import java.awt.EventQueue;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.JToolBar;
import javax.swing.JLabel;

public class Journal {

	private JFrame frame;
	private JTextField textField;

	
	
	
	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Journal window = new Journal();
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
	public Journal() {
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
		panel_2.setBounds(248, 52, 987, 560);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		List list = new List();
		list.setBounds(60, 45, 610, 280);
		list.add("Effects of AI Conditioning to Infants - First submission");
		list.add("AI conditioning Ethics");
		list.add("Art Made by AI");
		list.add("Human Perception as  compared to AI perception");
		panel_2.add(list);
		
		JButton btnSubmit = new JButton("Accept");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSubmit.setBounds(60, 350, 90, 23);
		panel_2.add(btnSubmit);
		
		JButton btnSubmit1 = new JButton("Reject");
		btnSubmit1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSubmit1.setBounds(180, 350, 90, 23);
		panel_2.add(btnSubmit1);
		
		JButton btnSubmit2 = new JButton("DeadLine");
		btnSubmit2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DeadLine newWin = new DeadLine();
				newWin.NewScreen();
			}
		});
		btnSubmit2.setBounds(300, 350, 90, 23);
		panel_2.add(btnSubmit2);
		
		JButton btnSubmit3 = new JButton("Minor");
		btnSubmit3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSubmit3.setBounds(420, 350, 90, 23);
		panel_2.add(btnSubmit3);
		
		JButton btnSubmit4 = new JButton("Major");
		btnSubmit4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSubmit4.setBounds(540, 350, 90, 23);
		panel_2.add(btnSubmit4);
		
		textField = new JTextField();
		textField.setBounds(60, 385, 500, 23);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JButton btnSubmit5 = new JButton("Submit");
		btnSubmit5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSubmit5.setBounds(580, 380, 90, 23);
		panel_2.add(btnSubmit5);
		
		
	}
}