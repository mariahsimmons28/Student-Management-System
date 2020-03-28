package adv_algor_final;
import java.util.Scanner;

public class StudentSystem extends Student {
	
	public static void main (String[]args) {
	System.out.println("     Welcome to the Student Management System");
	System.out.println("------------------------------------------------");
	System.out.println("Please choose your menu option:");
	System.out.println("1:New Student Entry");
	System.out.println("2:View Students");
	
	Scanner input = new Scanner(System.in); 
	int choice = input.nextInt();
	 
	if(choice == 1) {// if new student entry is chosen  
		System.out.println("Please enter the number of students you need to add");
		int studCount = input. nextInt(); 
		for (int i = 0; i < studCount; i++) {
		
		 //while (input.hasNext()) {
			Student s1 = new Student();
			
			System.out.println("-----------------------------------");
			//getting variables to add from the student java class first name arraylist, cant remember how to access elements
			for (int i=0; i<firstname.size(); i++) 
				//fName = firstname.get(i)+",";
	            System.out.print(firstname.get(i)+" ");
			
			//System.out.println("Students First Names:"+ s1.firstname);
			
			//1Student s2 = new Student();
		//}//while
	  }//for
		System.out.println("-----------------------------------");
		System.out.println("All of the students have been inputted into the system. Thank you.");
		//System.out.println("Students First Names:"+ s1.fname);
	}//if 
	
	else if(choice == 2) {//if view students is chosen
		System.out.println("             Student Management System");
		System.out.println("------------------------------------------------");
		System.out.println("This is a Student Viewer. You are able to see all of \nyour students here.");
	}
	else {//if exit or any other number is chosen 
		System.out.println("             Student Management System");
		System.out.println("------------------------------------------------");
		System.out.println("You are getting ready to exit the Student Management System \n Thank You for choosing this application.");	
	}
		System.out.println("------------------------------------");
		
		
  }// end of the main

}//end of the class 
