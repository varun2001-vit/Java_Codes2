package abstract_classes;

public class nested_abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c = new circle();
		c.test();
		c.calcarea();
		c.display();
	}	

}
abstract class shape1{
	double area;
	public abstract void calcarea();
	public void display() {
		System.out.println("Area is: "+area);
	}
}
abstract class square1 extends shape1{
	int side;
	public square1() {
		side = 10;
	}
	public abstract void test();
}
class circle extends square1{

	public void test() {
		System.out.println("TEST");
	}
	public void calcarea() {
		area = side*side;
	}
	
}