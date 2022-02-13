package order_of_constructors;
import java.util.*;
public class order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s = new student("Shobhit","mathura","12bce");
		s.displaystudent();
		s.displayperson();
		//if displayperson is static in both classes then only we can override
		//displayperson in student class and call them by using class name
//		student.displayperson();
//		person.displayperson();
	}

}
class person{
	String name;
	String address;
	
	public person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public void displayperson() {
		System.out.println(name+" " +address);
	}
}
class student extends person{
	String regno;
	String name;
	public student(String name,String address,String regno) {
		super(name,address);
		this.name = "Test";
		this.regno = regno;
		//super(name,address); //->gives error, should be written first
	}
	//overriding
	public void displayperson() {
		super.displayperson();
		System.out.println("I am having a new definition in student class");
	}
	
	public void displaystudent() {
		System.out.println(regno);
		System.out.println(name);
		System.out.println(super.name);
	}
}

//OUTPUT
//12bce
//Test
//Shobhit
//Shobhit mathura
//I am having a new definition in student class
