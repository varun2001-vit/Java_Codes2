package class_practice_questions;

public class area_of_shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square s = new square();
		s.getCoordinates(3, 3);
		s.calcarea();
		circle c = new circle();
		c.getCoordinates(3, 3);
		c.calcarea();
		cube cu = new cube();
		cu.getCoordinates(1, 2, 3);
		cu.calcarea();
		sphere sp = new sphere();
		sp.getCoordinates(1, 2, 3);
		sp.calcarea();
	}

}
abstract class shape{
	double area;
	public void display() {
		System.out.println("Area: "+area);
	}
	public abstract void calcarea();
}
abstract class twoD extends shape{
	double x,y,s;
	public void getCoordinates(double p,double q) {
		this.x = p;
		this.y = q;
		s = Math.sqrt((x*x)+(y*y));
	}
}
abstract class threeD extends shape{
	double x,y,z,s;
	public void getCoordinates(double p,double q,double r) {
		this.x = p;
		this.y = q;
		this.z = r;
		s = Math.sqrt((x*x)+(y*y)+(z*z));
	}
}
class square extends twoD{
	public void calcarea() {
		area = s*s;
		super.display();
	}
}
class circle extends twoD{
	public void calcarea() {
		area = 3.14*s*s;
		super.display();
	}
}
class cube extends threeD{
	public void calcarea() {
		area = 6*s*s;
		super.display();
	}
}
class sphere extends threeD{
	public void calcarea() {
		area = 4*3.14*s*s;
		super.display();
	}
}