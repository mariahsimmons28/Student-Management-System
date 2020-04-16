package adv_algor_final;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.UIManager;

public class Boxproject  {

	private JFrame frame;
	private JTextField textField_2;
	private JLabel lblFirstName;
	private JLabel lblLastName;
	private JTextField textField_1;
	private JLabel lblGradeLevel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Boxproject window = new Boxproject();
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
	public Boxproject() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(SystemColor.activeCaptionText);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Exit ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You are getting ready to exit the Student Management System \\n Thank You for choosing this application.");
			}
		});
		btnNewButton.setForeground(SystemColor.controlHighlight);
		btnNewButton.setBackground(SystemColor.controlHighlight);
		btnNewButton.setBounds(293, 232, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setBounds(126, 110, 130, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		lblFirstName = new JLabel("First Name: ");
		lblFirstName.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblFirstName.setBounds(28, 71, 91, 16);
		frame.getContentPane().add(lblFirstName);
		
		lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblLastName.setBounds(28, 110, 91, 16);
		frame.getContentPane().add(lblLastName);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_1.setBounds(126, 67, 130, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblGradeLevel = new JLabel("Grade Level:");
		lblGradeLevel.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblGradeLevel.setBounds(28, 152, 91, 16);
		frame.getContentPane().add(lblGradeLevel);
		
		JCheckBox chckbxFreshman = new JCheckBox("Freshman");
		chckbxFreshman.setBounds(126, 149, 128, 23);
		frame.getContentPane().add(chckbxFreshman);
		
		JCheckBox chckbxSophmore = new JCheckBox("Sophmore");
		chckbxSophmore.setBounds(233, 149, 128, 23);
		frame.getContentPane().add(chckbxSophmore);
		
		JCheckBox chckbxJunior = new JCheckBox("Junior");
		chckbxJunior.setBounds(126, 180, 128, 23);
		frame.getContentPane().add(chckbxJunior);
		
		JCheckBox chckbxSenior = new JCheckBox("Senior");
		chckbxSenior.setBounds(233, 180, 128, 23);
		frame.getContentPane().add(chckbxSenior);
		
		JLabel lblWelcomeToThe = new JLabel("  Welcome to the Student Management System");
		lblWelcomeToThe.setForeground(UIManager.getColor("Button.light"));
		lblWelcomeToThe.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		lblWelcomeToThe.setBounds(39, 6, 357, 16);
		frame.getContentPane().add(lblWelcomeToThe);
	}
}
