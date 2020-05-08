/*
 * Program that will create a username, email, password, vnumber for the user based on their first and last name and return the information
 */
package studentmanager;


import java.util.*;

public class IDgenerator {

    static String pass;
    static String vn;
    static String em;
    static String use;
    static String fname;


    IDgenerator(String f, String l) {
        User(f, l);
        Password();
    }

    public static void getInfo() {
        System.out.print("Student Name: " + fname);
        System.out.println("\n");
        System.out.print("Banner Password: " + pass);
        System.out.println("\n");
        System.out.print("Student V#: " + vn);
        System.out.println("\n");
        System.out.print("Student Email: " + em);
        System.out.println("\n");
        System.out.print("Student Username: " + use);
          System.out.println("\n");
    }
    //function that will create a login password for the student when they are entered into the system

    public static char[] Password() {
        int len = 9;

        String capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowers = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_-=+/.?<>";
        String all = capitals + lowers + numbers + symbols;
        //password creation 
        Random ran = new Random();
        char[] password = new char[len];
        for (int i = 0; i < len; i++) {

            password[i] = all.charAt(ran.nextInt(all.length()));
        }
       // String pw;
       // pw = new String(password);
      StringBuilder sb = new StringBuilder();
      for (char subArray : password){
          sb.append(subArray);
      }
      String pw = sb.toString();
        pass = pw;
        System.out.print("Student's password:" + password);
         System.out.println("\n");
        System.out.print("Banner Password: "+pw);
        System.out.println("\n");
        return password;
    }

    // function that will create a username for the student to log in to the school system 
    public static void User(String first, String last) {
        System.out.println("\n");
        String fchar = first;//string with first name 
        String lchar = last;//string with last name 
        fname = first + " " + last;
        String finit = fchar.substring(0, 1);// first letter of first name
        String linit = lchar.substring(0, 3);// first 3 letters of last name 
        String numbers = "0123456789";

        Random ran = new Random();//random number generation for the username
        //range values 
        int min = 1000;
        int max = 9999;
        int idnum = ran.nextInt((max - min) + 1);// holds range of number from 1000 to 9999 and prints a number in the range 
        //username creation 
        String user = finit + linit + idnum; // holds the user name 
        use = user;
        System.out.println("Student Username: " + user);
    
        Email(user);
        vnumber(idnum);

    }

    // creates a student email based on the username that is created for the user 
    public static void Email(String inuser) {
        String domain = "@students.vsu.edu";
        String user = inuser;
        String email = inuser + domain;
        em = email;
        System.out.print("Student Email: " + email);//prints the users email to the console 
        System.out.println("\n");

    }

    // creates a student ID number for the school system 
    public static void vnumber(int num) {
        String v = "V00";
        int usernum = num;
        Random ran = new Random();
        //range values 
        int min = 10;
        int max = 99;
        int idnum = ran.nextInt((max - min) + 1);// holds range of number from 1000 to 9999 and prints a number in the range 
        String rest = Integer.toString(idnum);// converts random #s to a string 
        String vnum = v + usernum + rest; // combines the random numbers with the general id number format
        vn = vnum;
        System.out.println("Student V# : " + vnum);
      
    }

}
