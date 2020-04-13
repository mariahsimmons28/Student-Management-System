/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maria
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*; 

public class Textbox implements ActionListener {
	private static JLabel introName;
	private static JLabel introName2;
        private static JLabel space1;
	private static JLabel labelName;
	private static JLabel labelName2;
	private static JLabel labelName3;
	private static JLabel success;
	private static JTextField txtName;
	private static JTextField txtName2;
	private static JTextField txtName3;
	private static JButton button;
	
	//create arraylists to hold names 
	ArrayList <String> fname = new ArrayList();
	ArrayList <String> lname = new ArrayList();
       ArrayList <String> grade = new ArrayList();
	
	
		
	public static void main (String [] args) {
		
		Textbox test = new Textbox(); // called to access the inputed values from the input box 
		
		JFrame homescreen = new JFrame ();
		//Frame configuration
		homescreen.setSize(700,300);
		homescreen.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		homescreen.setTitle("Welcome to the Student Management System");
		homescreen.setLayout(new FlowLayout());
		
                
		introName = new JLabel("\"Welcome to the Student Management System!"); 
		homescreen.add(introName);
		
		introName2 = new JLabel("We will track your students' information for you as well as help you enter them into your class list.\n"); 
		homescreen.add(introName2);
		
		
		labelName = new JLabel("Enter in your First Name: ");
		labelName.setBounds(10,20,80,25);
		homescreen.add(labelName);
		
		txtName = new JTextField(30);
		txtName.setBounds(100,20,165,25);
		homescreen.add(txtName);
		
                space1 = new JLabel("\n");
                homescreen.add(space1);
                
                System.out.println("\n");
		labelName2 = new JLabel(" \nEnter in your last Name: ");
		labelName2.setBounds(10,70,80,25);
		homescreen.add(labelName2);
		
	    txtName2 = new JTextField(30);
		txtName2.setBounds(100,50,165,25);
		homescreen.add(txtName2);
		
		labelName3 = new JLabel("\nEnter in your grade level: ");
		labelName3.setBounds(10,80,80,25);
		homescreen.add(labelName3);
		
		txtName3 = new JTextField(15);
		txtName3.setBounds(100,80,165,25);
		homescreen.add(txtName3);
		
		button = new JButton("Enter");
		button.setBounds(10,80,80,25);
		button.addActionListener(new Textbox());
		homescreen.add(button);
		
		success = new JLabel("");
		success.setBounds(10,110,300,25);
		homescreen.add(success);
		
		
		homescreen.setVisible(true);
		
	//prints the arraylists that are holding the values inputted in the box 	
	 System.out.print(test.fname);//get first name 
         System.out.print(test.lname);//get last name 
         System.out.print(test.grade);//get grade 
	
	
	
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String flabelName = txtName.getText(); //  first name 
		String llabelName = txtName2.getText();// last name 
		String glabelName = txtName3.getText();//grade level 
		//System.out.println(flabelName + "," +  llabelName + ":" + glabelName);
		fname.add(flabelName);//adds to firstname arraylist
                lname.add(llabelName);//adds to lastname arraylist
                grade.add(glabelName);//adds to grade arraylist 
		
	}
}
    

