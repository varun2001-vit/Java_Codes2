package method_overriding;

public class method_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subclass s1 = new subclass();
		//this will call the superclass function display IF 
        //there is no display function in subclass due to inheritance
		//but if subclass also has display function then
		//it will call subclass display function
		s1.display(); 
	}

}

	//FINAL CLASS
	//you can also have a class to
	//be final when I make a class to be final you cannot
	//inherit the class you can prevent users
	//from inheriting a class if the class is final

class superclass{
	
	//FINAL VARIABLE 
	//once when you declare a variable to be final you
	//cannot go and do any kind of assignment
	//to that variable later on but once when
	//you are declaring a variable to be final
	//you should see to that you initialize that variable
	//protected final int a = 10;
	protected int a;
	public superclass() {
		a = 10;
	}
	
	//FINAL METHOD
	//if i make a method final, you cannot 
	//override that in your subclasses 
	
//	public final void display() {
//		System.out.println("Super class function "+a);
//	}
	
	public void display() {
		System.out.println("Super class function "+a);
	}
	public static void display1() {
		
	}
}
class subclass extends superclass{
	
	//you can never override
	//variables in inheritance
	//you can only override methods 
	
	//same variable as superclass
	protected int a;
	public subclass() {
		a = 20;
	}
	
	//if you have the same function with the same
	//signature in your subclass that will
	//overwrite the definition of the function
	//in your superclass that is called method overriding
	
	//same function as superclass
	//you cannot override static methods in inheritance
	//if we use static display() in superclass then it will give error
	//This instance method cannot override the static method from
	public void display() {
		//invoking superclass display method from subclass
		super.display();
		System.out.println("Sub class function "+a); //->gives 20
		System.out.println(super.a); //->gives 10 (not overrided)
	}
	
}

	//you can inherit a static method from
	//your superclass into your subclass when
	//you create objects of subclass the
	//static method will be working for your
	//subclass but you cannot give a new
	//definition for the static method in your subclass
