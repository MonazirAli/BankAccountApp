package emailApp;

import java.util.Scanner;

public class Email {
   private String firstName;
   private String lastName;
   private String password;
   private String email;
   private String department;
   private String alternateEmail;
   private int defaultPasswordLength=10;
   private int mailBoxCapacity=500;
   private String companySuffix="fms.com"; 
   
   //Constructor to receive first and last name
   public Email(String firstName, String lastName) {
	   this.firstName=firstName;
	   this.lastName= lastName;
	   //System.out.println("Email Created :"+ this.firstName+" "+ this.lastName );
	   
	   // Call a method asking for department - return the department 
	
	   this.department = setDepartment();
	//   System.out.println("Department : "+ this.department);
	   
	   // Call a method that return random password
	this.password=randomPassword(defaultPasswordLength); 
	System.out.println("Your password is : "+ this.password);
	
	//Combine element to generate email
	email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
	//System.out.println("Your Email is: "+email);
   }
   
   //Ask for department 
   
   private String setDepartment() {
	   System.out.print("New Worker: "+firstName+". DEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter the Depatment Code: ");
	   Scanner in = new Scanner(System.in);
	   int depChoice=in.nextInt();
	   if(depChoice == 1) {
		   return "Sales";
	   }
	   else if(depChoice == 2) {
		   return "Development";
	   }
	   else if(depChoice == 3) {
		   return "Accounting";
	   }
	   else {
		   return "";
	   }
   }
   
   //Generate random password
   private String randomPassword(int length) {
	   String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
	   char [] password= new char[length];
	   for(int i=0; i<length;i++) {
		   int rand = (int)(Math.random() * passwordSet.length());
		   password[i]=passwordSet.charAt(rand);
		   
	   }
	   	return new String(password);// passing the char password in new string 
   }
   // set alternate email
   public void setAlternateEmail(String altEmail) {
	   this.alternateEmail=altEmail;
   }
   //set mailbox capacity
   public void setMailBoxCapacity(int capacity) {
	   this.mailBoxCapacity= capacity;
   }
   //Change the password
    public void changePassword(String password) {
    	this.password=password;
    }
    
    public int getMailBoxCapacity() {return mailBoxCapacity;}
    public String getAlternateEmail() {return alternateEmail;}
    public String getpassword() {return password;}
    
    public String showInfo() {
    	return "Name is : "+firstName+" "+lastName+"\nEmail is: "+email+"\nMilboxCapacity: "+mailBoxCapacity+"Mb";
    }
    
}
