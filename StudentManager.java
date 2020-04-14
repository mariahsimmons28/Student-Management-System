package studentmanager;

import java.util.*;

public class StudentManager {

    public static ArrayList<String> stuFN = new ArrayList();
    public static ArrayList<String> stuLN = new ArrayList();
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
        }//if 
        else if (choice == 2) {//if view students is chosen
            studentView(stuFN);
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
        for (int i = 0; i < studCount; i++) {

            System.out.println("Adding Student ");
            System.out.println("Student First Name: ");
            Scanner info = new Scanner(System.in);
            String fn = info.next();
            firstname.add(fn);
            System.out.println("Student Last Name: ");
            String ln = info.next();
            lastname.add(ln);
            System.out.println("Student GradeLevel: ");
            String grade = info.next();
            gradelevel.add(grade);
            System.out.println("------------------------------------------------");
            //IDgenerator email = new IDgenerator();
            stuFN = firstname;

        }//for

        System.out.println("-----------------------------------");
        System.out.println("All of the students have been inputted into the system. Thank you.");
        System.out.println("Student firstnames:" + firstname);
        System.out.println("Student lastnames:" + lastname);
        //System.out.println("Students First Names:"+ s1.fname);

    }

    public static void studentView(ArrayList<String> stuFN) {
        System.out.println("             Student Management System");
        System.out.println("------------------------------------------------");
        System.out.println("This is a Student Viewer. You are able to see all of \nyour students here.");
        ArrayList<String> firstname = stuFN;
        System.out.println("Students:" + firstname);
    }

    public static void exit() {
        System.out.println("             Student Management System");
        System.out.println("------------------------------------------------");
        System.out.println("You are getting ready to exit the Student Management System \n Thank You for choosing this application.");
    }
   
}
