/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanager;
import java.util.*;
public class IDgenerator {
    public static void main(String[]args){
        int length = 10;
        
        //System.out.println((Password(length,)));
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
        
    }
    public static void User(String first, String last){
       System.out.println("Please Wait. Generating student username......");
       System.out.println("---------------------------------------");
       System.out.println("The student's username is: ");
       
       String fchar = first;//string with first name 
       String lchar = last;//string with last name 
       String finit = fchar.substring(0);
       String linit = lchar.substring(0,3);
       String numbers = "0123456789";
       
       
        
    }
}
