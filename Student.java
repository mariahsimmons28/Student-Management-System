package adv_algor_final;
import java.util.*;

public class Student {
	private String fName;
	private String lName;
	private String gradeLevel;
	private int studentID;
	private String courses;

	public Student() {
		ArrayList<String> firstname = new ArrayList<String>();
		ArrayList<String> lastname = new ArrayList<String>();
		ArrayList<String> gradel = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the Student Management System!");
		System.out.println("We will track your students' information for you as well as help you enter them into your class list.");
		System.out.println("Enter the student's first name: ");
		this.fName = in.nextLine();
		firstname.add(fName);
		System.out.println("Enter the student's last name: ");
		   this.lName = in.nextLine();
		   lastname.add(fName);
		  String sname = ( firstname +" "+ lastname);
		  System.out.println("Student name: " + sname);
		  
		  System.out.println("Enter student class level: ");
		  System.out.print("Freshman\n Sophomore\n Junior\n Senior\n ");
		  this.gradeLevel = in.nextLine();
		  gradel.add(fName);
		  System.out.println("Student name: " + sname + " "+ gradeLevel);
	}
	
	
	/*public static void sName () {
		  Scanner in = new Scanner(System.in);
		  System.out.println("Database starting");
		  System.out.println("Enter the student's first name: ");
		  String fname = in.next();
		  System.out.println("Enter the student's last name: ");
		  String lname = in.next();
		  String sname = ( fname +" "+ lname); 
		  System.out.print("New Student Name :" + sname);
		
	} */
	
	
}
