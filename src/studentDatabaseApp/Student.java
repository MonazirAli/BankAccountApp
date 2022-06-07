package studentDatabaseApp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String courses="";
	private String studentID;
	private int tutionBalance=0;
	private static int costOfCourse=600;
	private static int id=1000 ;
	
//Constructor: prompt user to enter student's   name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Student First Name: ");
		this.firstName= in.nextLine();
		System.out.print("Enter Student Last Name: ");
		this.lastName= in.nextLine();
		System.out.print("1- Freshmen\n2- Sophmore\n3-Junior\n4- Senior\nEnter Student Class Level: ");
		this.gradeYear= in.nextInt();
	
		setStudentID();
		//System.out.println(firstName+" "+lastName+" "+ gradeYear+" "+studentID);
	
	
		
	}
	
	//Generate a id
	
	private void setStudentID() {
		//Grade level+ID
		id++;
		this.studentID= gradeYear+""+id;
	}
	
	//Enroll in courses

	public void enroll() {
		//Get inside loop, user hit Q
do {
	
	System.out.print("enter Courses to Enroll(Q to quit): ");
		Scanner in =new Scanner(System.in);
		String course= in.nextLine();
		if(!course.equals("Q")) {
			courses= courses+"\n "+course;
			tutionBalance+=costOfCourse; 
		}
		else {break;}
} while (1!=0);
		
//	System.out.println("Enrolled in : "+courses);
	
	}
	
	//View Balance 
	public void viewBalance() {
		System.out.println("Your Balance is: $"+tutionBalance);
	}
	//Pay Tution
	public void payTution() {
	viewBalance();
		System.out.print("Enter your payment: $"); 
		Scanner in =new Scanner(System.in);
		int payment = in.nextInt();
		tutionBalance-=payment;
		System.out.println("Thank you for payment of $"+payment);
		viewBalance();
	}
	
	//Show Status
	public String showInfo() {
	 return "Name: "+firstName+" "+lastName+"\nGrade Level: "+gradeYear+
			 "\nStudent ID: "+studentID+
			 "\nCourses Enrolled: "+courses+"\nBalance: $"+tutionBalance;	
	}
	
}
 