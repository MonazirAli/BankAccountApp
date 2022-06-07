package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {
public static void main(String [] args) {
	
	//Ask how many student  user we want to add
	System.out.print("Enter number of Student to enroll");
	Scanner in =new Scanner(System.in);
	int numOfStudent= in.nextInt();
	Student [] stud = new Student[numOfStudent];
	
	//Create n number of student 
	for(int i=0;i<numOfStudent;i++) {
	
		stud[i]= new Student();
		stud[i].enroll();
		stud[i].payTution();
		System.out.println(stud[i].showInfo());
	}

	for(int i=0;i<numOfStudent;i++) {
		System.out.println(stud[i].showInfo());
	}
}
}
