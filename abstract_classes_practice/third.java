package abstract_classes_practice;
import java.util.*;
public class third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sphere s = new sphere(3);
		s.compute_volume();
		cylinder c = new cylinder(3,4);
		c.compute_volume();
		cube cu = new cube(4);
		cu.compute_volume();
	}

}
abstract class shape{
	double volume;
	public abstract void compute_volume();
	public void show_volume() {
		System.out.println("Volume: "+volume);
	}
}
class sphere extends shape{
	double radius;
	public sphere(double radius) {
		this.radius = radius;
	}
	public void compute_volume() {
		volume = ((double)4/3)*3.14*radius*radius*radius;
		super.show_volume();
	}
	
}
class cylinder extends shape{
	double radius,height;
	public cylinder(double radius,double height) {
		this.radius = radius;
		this.height = height;
	}
	public void compute_volume() {
		volume = 3.14*radius*radius*height;
		super.show_volume();
	}
	
}
class cube extends shape{
	double side;
	public cube(double side) {
		this.side = side;
	}
	public void compute_volume() {
		volume = side*side*side;
		super.show_volume();
	}
	
}