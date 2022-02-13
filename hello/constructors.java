package hello;

import java.util.*;
public class constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//constructor will be called automatically
		//this type is knows as default constructor
		//with no arguments
		students1 s = new students1();
		
		//if we want to pass some values for an object and initialize it
		//we use a parameterized constructor
		students1 s2 = new students1("shobhit","20bds0162",20);
		
	}

}

class students1{
	String regno;
	String name;
	int marks;
	
	//creating a default constructor
	//same name as class name, it does not have any return type even void
	//it is called as soon as an object of the class is created
	//as soon as object is created on the heap
	//it will assign all the initial values to the data items
	public students1() {
		regno = "";
		name = "";
		marks = 0;
		System.out.println("Initialized");
		System.out.println(regno+name+marks);
	}
	
	//creating a parameterized constructor
//	public students1(String iname,String iregno,int imarks) {
//		regno = iregno;
//		name = iname;
//		marks = imarks;
//		System.out.println(regno + name + marks);
//	}
	
	//when we give same name of the parameters in the constructor
	//i.e. public students1(String name,String regno, String marks)
	//as the data members of the class then we use this keyword
	//this keyword refers to the current object
	public students1(String name,String regno,int marks) {
		this.regno = regno; //this.regno -> s2.regno
		this.name = name; //this.name -> s2.name
		this.marks = marks; //this.marks -> s2.marks
		System.out.println(regno + name + marks);
	}
	
	//Here we have 2 constructors, if we don't pass parameters
	//default will be called, otherwise parameterized
	//this is knows as constructor overloading
	//two constructors having same name but different parameters
	
}