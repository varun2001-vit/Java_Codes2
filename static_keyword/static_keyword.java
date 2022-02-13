package static_keyword;

import java.util.*;

public class static_keyword {

	//static block
	//used for initializing static variables
	//there can be many static blocks in a class
	//static blocks get executed in the order they occur
	static int k;
	static int j;
	//this block will get loaded and initialised
	//even before this main method gets executed 
	//cannot put non-static data inside your static block 
	static {
		System.out.println("First static block");
		k = 23;
		j = 43;
	}
	static {
		System.out.println("Second static block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(j+" "+k);
		
		//static - showing little or no change
		
		student s1 = new student();
		s1.set_details();
		student s2 = new student();
		s2.set_details();
		student s3 = new student();
		s3.set_details();
		System.out.println(s1.get_details());
		System.out.println(s2.get_details());
		System.out.println(s3.get_details());
		s1.print_add();
		
		//if all the students are from VIT university, then
		//the address field will be same for all the objects
		//so they are taking some memory in bytes
		//instead of wasting storage like that when some field
		//is common to all the objects what we can do is
		//we can put that in a separate area we
		//call that to be a class
		//or method area, it's also part of the ram 
		//that's a separate area wherein you're
		//going to put this university
		//university will not be part of the objects 
		//but it will be part of a common area from which 
		//it is available to all the objects
		//so this kind of a variable that is common to all the objects and
		//that is allocated in a separate area called class area or 
		//method area and it is initially loaded and initialized
		//this is called a static variable
		
		//STATIC VARIABLES
		//1.static variable is a variable that is common to all objects 
		//it's not part of any specific object you don't need an object 
		//to actually call a static variable
		//2.static variable is initialized only once at the start of execution
		//3.static variable can be accessed using the class name (student.univ_add)
		
		//STATIC METHODS
		//no need to create an object to invoke the static method
		//method invocation happens using class name
		//declaring a static method - sample
		//public static void display(){}
		
		//invoking static method
		//no need to create another student object to invoke count_objects()
		student.count_objects();
		student.count_objects("test");
		//STATIC METHOD PROPERTIES
		//1. Can access only static variables, can't access 
		//class variables directly inside the static method
		//2. Can invoke only static methods, can't invoke 
		//non static methods from within a static method
		//3. this keyword cannot be used with static
		//4. super keyword cannot be used with static
		//5. static methods can be overloaded but cannot be overridden
		
		
	}

}

class student{
	String name;
	String regno;
	//String univ_add;
	//declaring a static variable
	static String univ_add = "Vellore VIT";
	//count static object
	//so it's initialized to zero once from then on whenever an
	//object is created this will be incremented 
	//this will not be initialized again
	static int count = 0;
	Scanner input = new Scanner(System.in);
	
	public student() {
		count++;
	}
	
	public void set_details() {
		System.out.println("Enter the name");
		name = input.nextLine();
		System.out.println("Enter the registration number");
		regno = input.nextLine();
		//now no need to get input from user
//		System.out.println("Enter the university address");
//		univ_add = input.nextLine();
	}
	public String get_details() {
		return name+" "+regno+" "+student.univ_add;
	}
	//counting the total number of student objects - static method
	//static method is a class level method
	public static void count_objects() {
		//we need an object of the class to access name
		//System.out.println(name); -> gives error (1st property)
		System.out.println("The total number of student objects is " + count);
		
		//we need an object to actually access print address 
		//print_add(); -> gives error(2nd property)
		
		//System.out.println(this.name); ->gives error(3rd property)
		
	}
	//overloading static method
	public static void count_objects(String s) {
		System.out.println("This is from the overloaded static");
	}
	//printing the university address
	public void print_add() {
		//System.out.println(this.name); ->allowed
		System.out.println("The address of university is "+student.univ_add);
		//get_details(); ->allowed
		
		//non static method calling a static method
		count_objects("test");
		
	}
	
}