package adv_algor_final;
import java.util.*;

public class StudentSystemInput {
	public static ArrayList<String> stuFN = new ArrayList();
    public static ArrayList<String> stuLN = new ArrayList();
    public static ArrayList<String> students = new ArrayList();
    
    public static void main(String[] args) {
        Menu();

    }

    public static void Menu() {
        System.out.println("     Welcome to the Student Management System");
  
        System.out.println("------------------------------------------------");
        System.out.println("Please choose your menu option:");
        System.out.println("1:New Student Entry");
        System.out.println("2:View Students");
        System.out.println("3:Exit Manager");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        if (choice == 1) {// if new student entry is chosen  
            studentInput();
            Menu();
          
            
        }//if 
        else if (choice == 2) {//if view students is chosen
            studentView(students);
            Menu();
        } else {//if exit or any other number is chosen 
            exit();
        }
        System.out.println("------------------------------------");
        
    }
    

    public static void studentInput() {
        ArrayList<String> firstname = new ArrayList();
        ArrayList<String> lastname = new ArrayList();
        ArrayList<String> gradelevel = new ArrayList();
        System.out.println("Please enter the number of students you need to add");
        Scanner input = new Scanner(System.in);
        int studCount = input.nextInt();
        boolean cont = true;
       
        for (int i = 0; i < studCount; i++) {
	

			System.out.println("Adding Student ");

            String fn = JOptionPane.showInputDialog("Please Enter Student's First Name");
            firstname.add(fn);
            String ln = JOptionPane.showInputDialog("Please Enter in Student's Last name");
            lastname.add(ln);
            String grade = JOptionPane.showInputDialog("Please Enter Student's Grade Level ");
            gradelevel.add(grade); 
            stuFN = firstname;
            stuLN = lastname;
            //String fullname = fn +" "+ ln; 
            //students.add(fullname);
        }
        }
		
         
            

       
           // Idgenerator gen1 = new Idgenerator();
           // gen1.User(fn, ln);
            //gen1.Password(6, fn, ln);
           // String user = gen1.User(fn, ln);
            //String fullname = fn +" "+ ln; 
          // stuFN = firstname;
           //stuLN = lastname;
            //students.add(fullname);
            
           ////JOptionPane.//showMessageDialog(null, "The Student Full Name is : " + students , "Student Management System", JOptionPane.PLAIN_MESSAGE );

        

		

       // System.out.println("-----------------------------------");
       // System.out.println("\n");
       //System.out.println("All of the students have been inputted into the system. Thank you.");
       // System.out.println("Student firstnames:" + stuFN);
       // System.out.println("Student lastnames:" + stuLN);
       // System.out.println("Student full names: "+ students);
      // System.out.println("Students First Names:"+ s1.fname);

    

    public static void studentView(ArrayList<String> students) {
        System.out.println("             Student Management System");
        System.out.println("------------------------------------------------");
        System.out.println("This is a Student Viewer. You are able to see all of \nyour students here.");
        ArrayList<String> firstname = students;
        stuFN = firstname;
        System.out.println("Students:" + stuFN);
        //JOptionPane.showMessageDialog(null, "The Student Full Name is : " + stuFN , "Student Management System", JOptionPane.PLAIN_MESSAGE );
    }

    public static void exit() {
        System.out.println("             Student Management System");
        System.out.println("------------------------------------------------");
        System.out.println("You are getting ready to exit the Student Management System \n Thank You for choosing this application.");
    }
}
