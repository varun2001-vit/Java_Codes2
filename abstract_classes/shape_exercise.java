package abstract_classes;
import java.util.*;
public class shape_exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WE CANNOT CREATE AN OBJECT OF ABSTRACT CLASS
		
		//1st way
//		square s = new square();
//		s.calcarea();
//		s.displayarea();
//		rectangle r = new rectangle();
//		r.calcarea();
//		r.displayarea();
		
		//An Abstract class is one whose instance CANNOT be created.
		//Creating an Array which holds the Object Reference Variable
		//of that Abstract class are just the references not the 
		//object itself.
		
		//2nd way
//		shape obj[] = new shape[2];
//		obj[0] = s;
//		obj[1] = r;
//		for(int i=0;i<obj.length;i++) {
//			obj[i].displayarea();
//		}
		
		//3rd way
		shape obj[] = new shape[2];
		obj[0] = new square();
		obj[1] = new rectangle();
		for(int i=0;i<obj.length;i++) {
			obj[i].calcarea();
			obj[i].displayarea();
		}
	}

}
abstract class shape{
	double area;
	public abstract void calcarea();
	public void displayarea() {
		System.out.println("Area is: "+area);
	}
}
class square extends shape{
	double side;
	public square() {
		// TODO Auto-generated constructor stub
		side=10;
	}
	public void calcarea() {
		area = side*side;
		super.displayarea();
	}
	
	//we cannot have a static method to be abstract
	//because static methods cannot be overrided
	
	//we cannot have constructors to be abstract
	//because constructors are not inherited
	
}
class rectangle extends shape{
	double length,breadth;
	public rectangle() {
		// TODO Auto-generated constructor stub
		length = 20;
		breadth = 30;
	}
	public void calcarea() {
		area = length*breadth;
		super.displayarea();
	}
}