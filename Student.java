/*
 * Program creates a student instance using a inputted first name, last name, and grade
 */
package studentmanager;

import java.util.*;

public class Student {

  static  public String firstName; 
    static public String lastName;
   static  public String idNumber; 
   static public String gradelevel;
  
    //ArrayLists for storage
     ArrayList<String> fn = new ArrayList();
     ArrayList<String> ln = new ArrayList();
     ArrayList<String> gl = new ArrayList();
     static ArrayList<String> fresh = new ArrayList();
     static ArrayList<String> sopho = new ArrayList();
     static ArrayList<String> jun = new ArrayList();
     static ArrayList<String> sen = new ArrayList();
     static ArrayList<String> grad = new ArrayList();
     
    public Student(String fname, String last, String grade ){ //creates a student and adds them to an arraylist
        this.firstName = fname; 
        this.lastName = last;  
        this.gradelevel = grade; 
        //adds items to arraylists 
        fn.add(firstName);
        ln.add(lastName);
     
    
    }
    
    public void setFirstName(String first){
        this.firstName = first; 
    }
  public String getFirstName(){
      return this.firstName;
  }
  public void setLastName(String last){
      this.lastName = last; 
  }
  public String getLastName(){
      return this.lastName;
  }
   public void setGrade(String grade){
      this.gradelevel = grade; 
  }
  public  static String getGrade(){
      return gradelevel;
  }
  public static String getFullName(){
      String fulln = firstName + " "+ lastName; 
      return fulln; 
  }

  
}
