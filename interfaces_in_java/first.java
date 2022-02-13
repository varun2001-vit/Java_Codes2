package interfaces_in_java;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		button b[] = new button[2];
//		b[0] = new reservation();
//		b[1] = new cancellation();
//		for(int i=0;i<2;i++) {
//			b[i].setButtonColor();
//			b[i].setButtonText();
//			b[i].onClick();
//		}
		form f[] = new form[2];
		for(int i=0;i<2;i++) {
			f[i] = new form();
			if(i==0) {
				f[i].setButtonColor("Blue");
				f[i].setButtonText("Reserve ticket");
				f[i].display();
				f[i].onClick("Reservation successfull");
				f[i].location(1,2,3);
			}else {
				f[i].setButtonColor("Red");
				f[i].setButtonText("Cancel ticket");
				f[i].display();
				f[i].onClick("Cancellation successfull");
				f[i].location(1,2);
			}
		}
	}

}

//AN OBJECT CANNOT BE CREATED FOR AN INTERFACE
//AN INTERFACE CAN EXTEND ANOTHER INTERFACE

//every method is abstract in an interface
//1. interface can contain only abstract methods,they are abstract and public by default
//2. interface cannot be instantiated
//3. interface cannot have a constructor, you cannot create an object for an 
//   interface so there is no point in having a constructor for an interface
//4. interface can contain only static and final variables that are public 
//when you create a variable in an interface it will be static and final by default
//if you create a method in an interface, by default it will be public and abstract
//5. when a class implements an interface it is mandatory for the class to give
//implementation for all the abstract methods in your interface
//6. a class can implement many interfaces

interface button{
	void setButtonColor(String s);
	void setButtonText(String s);
	void onClick(String s);
	default void display(String c) {
		System.out.println(c);
	}
}

interface twoD extends button{
	void location(int x,int y);
}

//IF WE WANT TO CREATE A 3D BUTTON 
//3d button will inherit all the qualities 
//of a button but it might have one more method abstract method 
interface threeD extends button{
	void location(int x,int y,int z);
}
//so a class can implement multiple interfaces but a class cannot extend multiple classes so
//this is the only way through which you can achieve multiple inheritance 
class form implements threeD,twoD{
	String color,text;
	int d1,d2,d3;
	public void setButtonColor(String s) {
		this.color = s;
	}
	public void setButtonText(String s) {
		this.text = s;
	}
	public void onClick(String s) {
		System.out.println(s);
	}
	public void location(int x, int y, int z) {
		this.d1 = x;
		this.d2 = y;
		this.d3 = z;
		System.out.println("Dimensions of 3D button is: "+(d1)+" "+d2+" "+d3);
	}
	public void location(int x, int y) {
		this.d1 = x;
		this.d2 = y;
		System.out.println("Dimensions of 2D button is: "+d1+" "+d2);
	}
	public void display() {
		System.out.println(color+"\n"+text);
	}
	
}
//class reservation implements button{
//	String color,text;
//	public void setButtonColor() {
//		color = "Blue";
//		button.super.display(color);
//	}
//	public void setButtonText() {
//		text = "Reserve Ticket";
//		button.super.display(text);
//	}
//	public void onClick() {
//		System.out.println("Reservation successfull");
//	}
//}
//class cancellation implements button{
//	String color,text;
//	public void setButtonColor() {
//		color = "Red";
//		button.super.display(color);
//	}
//	public void setButtonText() {
//		text = "Cancel ticket";
//		button.super.display(text);
//	}
//	public void onClick() {
//		System.out.println("Reservation cancelled");
//	}
//	
//}