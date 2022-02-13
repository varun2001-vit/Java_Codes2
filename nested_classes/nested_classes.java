package nested_classes;
import java.util.*;
public class nested_classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//we need to create an object of the outer class
		outer outobj = new outer();
		//creating an object of the nested class using the outer class object
		outer.nested innobj = outobj.new nested();
		innobj.display();
		
	}

}

//there can be situations wherein the inner class will be used only once
//and that can be used within another class so no other class or no other places we
//are going to use the inner class and will be used only once
//within our outer class so in such a scenario we'll go in for a nested class
//you can very well make this class access the private data members of your outer class
//so a nested class is allowed to access all the variables
//no matter what data type they are maybe private protected static or public
//the outer class cannot access any of the variables of the inner class
//even though the variables are public

class outer{
	
	public String var1;
	private String var2;
	protected String var3;
	public static int count = 1;
	
	//constructor of outer class
	public outer() {
		var1 = "test1";
		var2 = "test2";
		var3 = "test3";
	}
	
	//this is a nested class
//	so a class like this which is non-static and which
//	is nested within another class is also known as an inner class
//	a class that is non-static and that is nested within another class
//	or that is defined within another class is also known as an inner class
	class nested{
		//declare a data member of the nested class
		public String nestedvar;
		public nested() {
			nestedvar = "nestaedvalue";
		}
		
		public void display() {
			System.out.println(var1+var2+var2+count);
		}
		
		//can we have static data members and methods in out nested class?
		//answer is NO
//		because you see a nested class is a data member of the outer class
//		and how will you access a nested class using an object of the outer class
//		so everything inside the nested class is associated with an
//		object of the outer class and that's why we cannot have any static 
//		declarations inside our nested class because the nested class itself is
//		associated to an object
		
		//BOTH NOT ALLOWED
//		public static String statvar = "test";
//		public static void display1() {
//			System.out.println(statvar);
//		}
		
	}
	
	//this is a method in outer class
	//gives error - can't access inner class variables in outer class
//	public void display_nested() {
//		System.out.println(nestedvar);  
//	}
	
}