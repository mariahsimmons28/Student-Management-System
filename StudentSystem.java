/*
 * Program that will run the management system that will add students into the system and generate a email, password, v#, and username
*Allows you ti input students, view students, and get information on the last student added to system
 */
import java.util.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class StudentSystem {

    public static ArrayList<String> stuFN = new ArrayList();
    public static ArrayList<String> stuLN = new ArrayList();
    public static ArrayList<String> students = new ArrayList();
    public static ArrayList<String> grades = new ArrayList();
    public static ArrayList<String> namegrade = new ArrayList();

    public static void main(String[] args) {
        Menu();
    }

// function for the main menu of the student management system
    public static void Menu() {

        System.out.println("     Welcome to the VSU Student Management System");
        System.out.println("------------------------------------------------");
        System.out.println("Please choose your menu option:");
        System.out.println("1:New Student Entry");
        System.out.println("2:View Students");
        System.out.println("3:Information of Last Student Inputted");
        System.out.println("4:Exit Manager");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        if (choice == 1) {// if new student entry is chosen  
            studentInput();
            Menu();

        } else if (choice == 2) {//if view students is chosen
            studentView(students, grades, namegrade);
            System.out.println("\n");
            System.out.println("\n");
            Menu();
        } else if (choice == 3) {
            System.out.println("Information for the last student added: ");
            System.out.println("------------------------------------");
            IDgenerator.getInfo();
            Menu();
        } else {//if exit or any other number is chosen 
            exit();
        }
        System.out.println("------------------------------------");

    }

// this is a function that takes in the users input about information for the student 
    public static void studentInput() {
        System.out.println("Please enter the number of students you need to add");
        Scanner input = new Scanner(System.in);
        int studCount = input.nextInt();
          System.out.println("------------------------------------------------");
           System.out.println("\n");
        System.out.println("Adding " + studCount + " Students into the System.....");
        System.out.println("\n");

        //for every new student 
        for (int i = 0; i < studCount; i++) {
            System.out.println("Adding Student ");
            System.out.println("------------------------------------------------");
            String fn = JOptionPane.showInputDialog("Please Enter Student's First Name");
            //firstname.add(fn);
            String ln = JOptionPane.showInputDialog("Please Enter in Student's Last name");
            // lastname.add(ln);
            String grade = JOptionPane.showInputDialog("Please Enter Student's Grade Level ");
            // gradelevel.add(grade); 

            Student s = new Student(fn, ln, grade);

            String full = s.getFullName();
            String nG = full + ":" + grade; //holds students name and grade
            System.out.print("Student: " + full);
            System.out.println("\n");
            System.out.print("Grade Level: " + grade);
            students.add(full);
            grades.add(grade);
            namegrade.add(nG);
            IDgenerator info = new IDgenerator(fn, ln);

        }
    }

    public static void studentView(ArrayList<String> students, ArrayList<String> grades, ArrayList<String> nameGrade) {
        System.out.println("             Student Management System");
        System.out.println("------------------------------------------------");
        System.out.println("This is a Student Viewer. You are able to see all of \nyour students here.");
        System.out.println("------------------------------------------------");
        System.out.println("\n");
        System.out.println("Students:");
        System.out.println(students);
        System.out.println("\n");
        System.out.println("Student,Grade:");
        System.out.println(namegrade);
        System.out.println("------------------------------------------------");
        System.out.println("Grade Levels Entered:" + grades);
        System.out.println("------------------------------------------------");
       
    }
    public static void exit() {
        System.out.println("             Student Management System");
        System.out.println("------------------------------------------------");
        System.out.println("You are getting ready to exit the Student Management System \n Thank You for choosing this application.");
    }
}
