package session_3_assignment_4; //package declaration

import java.util.Scanner; //Importing scanner class


public class Student {
	
	// declaring the variables as Private
	
	private String name;
	private double phoneNumber;
	private long rollNo;
	private long classs;
	
	//using getters and setters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public long getRollNo() {
		return rollNo;
	}
	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}
	public long getClasss() {
		return classs;
	}
	public void setClasss(long classs) {
		this.classs = classs;
	}
	
	void result(){
		
		float physics = 0;
		float chemistry = 0;
		float mathematics = 0;
		float average;
		
		average = ((physics+chemistry+mathematics)/3)/100;
		
		//Declaring scanner class to accept the input from the user
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Student 1 name");
		
		sc.nextLine();
		System.out.println("Please enter the phone number");
		sc.nextDouble();
		System.out.println("Please enter the roll no");
		sc.nextLong();
		System.out.println("Please enter the class");
		sc.nextLong();
				
		System.out.println("Please enter the marks for physics");
		sc.nextFloat();
		System.out.println("Please enter the marks for chemistry");
		sc.nextFloat();
		System.out.println("Please enter the marks for mathematics");
		sc.nextFloat();
		

		if(average <= 35){
			System.out.println("The result of the student 1 : FAIL");
			System.out.println("                                   ");
		}
		
		else if (average > 35){
			System.out.println("The result of the student 1 : PASS");
			System.out.println("                                   ");
		}
			

		System.out.println("Please enter the Student 2 name");	
		sc.nextLine();
		System.out.println("                                   ");
		System.out.println("Please enter the phone number");
		sc.nextDouble();
		System.out.println("Please enter the roll no");
		sc.nextLong();
		System.out.println("Please enter the class");
		sc.nextLong();
		
		System.out.println("Please enter the marks for physics");
		sc.nextFloat();
		System.out.println("Please enter the marks for chemistry");
		sc.nextFloat();
		System.out.println("Please enter the marks for mathematics");
		sc.nextFloat();
		

		
		if(average <= 35){
			System.out.println("The result of the student 2 : FAIL");
			System.out.println("                                   ");
		}
		
		if (average > 35){
			System.out.println("The result of the student 2 : PASS");
			System.out.println("                                   ");
		}
			


		System.out.println("Please enter the Student 3 name");	
		sc.nextLine();
		System.out.println("                                   ");

		System.out.println("Please enter the phone number");
		sc.nextDouble();
		System.out.println("Please enter the roll no");
		sc.nextLong();
		System.out.println("Please enter the class");
		sc.nextLong();
		
		System.out.println("Please enter the marks for physics");
		sc.nextFloat();
		System.out.println("Please enter the marks for chemistry");
		sc.nextFloat();
		System.out.println("Please enter the marks for mathematics");
		sc.nextFloat();
		
		
		if(average <= 35){
			System.out.println("The result of the student 3 : FAIL");
			System.out.println("                                   ");
		}
		
		if (average > 35){
			System.out.println("The result of the student 3 : PASS");
			System.out.println("                                   ");
		}
				
		//Closing the scanner class
		
		sc.close();
	}


}
