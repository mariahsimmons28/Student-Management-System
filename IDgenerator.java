/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.util.stream.IntStream;
public class IDgenerator {
    public static void main(String[]args){
        int length = 10;
        String fn = "Nia";
        String ln = "Simmons";
        System.out.println((Password(length,fn,ln)));
        User(fn,ln);
        
        
    }
    public static char [] Password(int len,String first, String last){
       System.out.println("Please Wait. Generating password......");
       System.out.println("---------------------------------------");
       System.out.println("Your new password is: ");
       
       String capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       String lowers = "abcdefghijklmnopqrstuvwxyz";
       String numbers = "0123456789";
       String symbols = "!@#$%^&*_-=+/.?<>";
       String fchar = first;//string with first name 
       String lchar = last;//string with last name 
       //String all = capitals+lowers+numbers+symbols;
       String all = fchar +lchar+numbers;
       Random ran = new Random();
       char[]password = new char[len];
       for (int i = 0;i<len;i++)
       {
           password[i]= all.charAt(ran.nextInt(all.length()));
       }
       return password;
       
       //System.out.print(password);
        
    }
    
    public static void User(String first, String last){
    	System.out.println("\n");
       System.out.println("Please Wait. Generating student username......");
       System.out.println("---------------------------------------");
       System.out.println("The student's username is: ");
       
       String fchar = first;//string with first name 
       String lchar = last;//string with last name 
       String finit = fchar.substring(0,1);// first letter of first name
       String linit = lchar.substring(0,3);// first 3 letters of last name 
       String numbers = "0123456789";
       
       //random number generation for the username
       Random ran = new Random();
       //range values 
       int min = 1000;
       int max = 9999;
       int idnum = ran.nextInt((max-min)+1);// holds range of number from 1000 to 9999 and prints a number in the range 
       //username creation 
       String user = finit +linit+idnum; // holds the user name 
       System.out.println(user);
       System.out.println("\n");
       Email(user);
   	  
   	   //System.out.print(email);//prints the users email to the console
   	   
        
    }
    public static void getUser(){
    	
    }
    public static void Email(String inuser) {
    	String domain = "@students.vsu.edu";
    	String user = inuser;
    	String email = inuser + domain; 
    	
    	System.out.println("Please Wait. Generating student email address......");
        System.out.println("---------------------------------------");
        System.out.println("\n");
    	System.out.print(email);//prints the users email to the console 
    }
}
