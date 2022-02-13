package hello;

import java.util.*;
public class classes_objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating an object of student class
		student s1 = new student();
		//calling the methods of the class student
		s1.addinfo();
		s1.displayinfo();
		
		//creating an array of object (2) of student class
		student s[] = new student[2];
		//allocating memory to the above 2 objects
		for(int i=0;i<2;i++) {
			s[i] = new student();
		}
		//calling the methods of the class student
		for(int i=0;i<2;i++) {
			s[i].addinfo();
			s[i].displayinfo();
		}
	}

}
//creating a student class
class student{
	
	//data members of class
	String regno;
	String name;
	Scanner input = new Scanner(System.in);
	public void addinfo() {
		System.out.println("Enter the registration number");
		regno = input.next();
		System.out.println("Enter the name");
		name = input.next();
	}
	public void displayinfo() {
		System.out.println(name + " " + regno);
	}
}
