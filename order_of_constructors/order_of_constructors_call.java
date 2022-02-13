//package order_of_constructors;
//
//public class order_of_constructors_call {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		subclass s1 = new subclass();
//	}
//
//}
//class superclass{
//	protected int a;
//	public superclass() {
//		System.out.println("Super class constructor");
//		a = 10;
//	}
//}
//class subclass extends superclass{
//	private int b;
//	public subclass() {
//		super(); //->optional
//		System.out.println("Sub class constructor");
//		b = 20;
//	}
//}

//Output
//Super class constructor
//Sub class constructor

//if you have another class extending the
//subclass then again it will start from
//superclass subclass and then this class
//------------------------------------------------------------
//when superclass has a default constructor and subclass has parameterised constructor
//package order_of_constructors;
//
//public class order_of_constructors_call {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		subclass s1 = new subclass(20);
//	}
//
//}
//class superclass{
//	protected int a;
//	public superclass() {
//		a = 10;
//		System.out.println("Super class constructor "+a);
//	}
//}
//class subclass extends superclass{
//	private int b;
//	public subclass(int b) {
//		this.b = b;
//		System.out.println("Sub class constructor "+b);
//	}
//}

//OUTPUT
//Super class constructor 10
//Sub class constructor 20
//-------------------------------------------------------
//when we have parameterised constructor in superclass too
package order_of_constructors;

public class order_of_constructors_call {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subclass s1 = new subclass(10,20);
	}

}
class superclass{
	protected int a;
	public superclass(int a) {
		this.a = a;
		System.out.println("Super class constructor "+a);
	}
}
class subclass extends superclass{
	private int b;
	public subclass(int a,int b) {
		//now this input a should be passed to your superclass
		//when we use this super method we have to explicitly call
		//that to invoke superclass constructor when it is a 
		//parameterised constructor 
		super(a);
		this.b = b;
		System.out.println("Sub class constructor "+b);
	}
}
//OUTPUT
//Super class constructor 10
//Sub class constructor 20