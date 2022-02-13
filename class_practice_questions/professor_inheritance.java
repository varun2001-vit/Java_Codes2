package class_practice_questions;
import java.util.*;
public class professor_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		dependent d[] = new dependent[4];
		d[0] = new professor();
		d[1] = new associate();
		d[2] = new assistant();
		d[3] = new tra();
		for(int i=0;i<d.length;i++) {
			d[i].calcsalary();
		}
		String search;
		System.out.println("Enter the id of the faculty you want to search");
		search = input.next();
		for(int i=0;i<d.length;i++) {
			if(d[i].id.equals(search)) {
				d[i].display();
			}
		}
	}

}
abstract class dependent{
	String id,name,phone,dob;
	double salary;
	public void get() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter details");
		id = input.next();
		name = input.next();
		phone = input.next();
		dob = input.next();
	}
	public void display() {
		System.out.println(id + " " + name + " " + phone + " " + dob + " " + salary);
	}
	public abstract void calcsalary();
}
class professor extends dependent{
	public void calcsalary() {
		super.get();
		salary = 150000 + (0.3*150000);
		super.display();
	}
}
class associate extends dependent{
	public void calcsalary() {
		super.get();
		salary = 120000 + (0.2*120000);
		super.display();
	}
}
class assistant extends dependent{
	public void calcsalary() {
		super.get();
		salary = 100000 + (0.1*100000);
		super.display();
	}
}
class tra extends dependent{
	public void calcsalary() {
		super.get();
		salary = 20000;
		super.display();
	}
}