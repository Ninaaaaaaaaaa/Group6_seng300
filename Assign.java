import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.BorderLayout;
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
import javax.swing.JLabel;

public class Assign {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	
	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Assign window = new Assign();
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
	public Assign() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 887, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setName("Papers Submission");
		panel.setBounds(-6, 0, 990, 21);
		panel.setBorder(new TitledBorder(null, "Submission", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JButton btnNewButton = new JButton("Journal 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Journal newWin = new Journal();
				newWin.NewScreen();
			}
		});
		btnNewButton.setBounds(150, 120, 132, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton1 = new JButton("Journal 2");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Journal newWin = new Journal();
				newWin.NewScreen();
			}
		});
		btnNewButton1.setBounds(150, 150, 132, 23);
		frame.getContentPane().add(btnNewButton1);
		
		JButton btnNewButton2 = new JButton("Journal 3");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Journal newWin = new Journal();
				newWin.NewScreen();
			}
		});
		btnNewButton2.setBounds(150, 180, 132, 23);
		frame.getContentPane().add(btnNewButton2);
		
		JButton btnNewButton3 = new JButton("Journal 4");
		btnNewButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Journal newWin = new Journal();
				newWin.NewScreen();
			}
		});
		btnNewButton3.setBounds(150, 210, 132, 23);
		frame.getContentPane().add(btnNewButton3);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSubmit.setBounds(650, 120, 90, 23);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnSubmit1 = new JButton("Submit");
		btnSubmit1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSubmit1.setBounds(650, 150, 90, 23);
		frame.getContentPane().add(btnSubmit1);
		
		JButton btnSubmit2 = new JButton("Submit");
		btnSubmit2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSubmit2.setBounds(650, 180, 90, 23);
		frame.getContentPane().add(btnSubmit2);
		
		JButton btnSubmit3 = new JButton("Submit");
		btnSubmit3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSubmit3.setBounds(650, 210, 90, 23);
		frame.getContentPane().add(btnSubmit3);
		
		textField = new JTextField();
		textField.setBounds(450, 120, 182, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(450, 150, 182, 23);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(450, 180, 182, 23);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(450, 210, 182, 23);
		frame.getContentPane().add(textField_3);
		
		JLabel lblNewLabel = new JLabel("Journal Name:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(95, 96, 132, 14);
		frame.getContentPane().add(lblNewLabel);
	}
}