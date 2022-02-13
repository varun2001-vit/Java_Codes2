package abstract_classes_practice;
import java.util.*;
public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		professor p = new professor("Satish","chennai","101","e10");
		p.disp_professor();
	}

}
abstract class person{
	String name,address;
	public person(String name,String address) {
		this.name = name;
		this.address = address;
	}
	public abstract void display_vitadd();
}
class faculty extends person{
	String empid;
	public faculty(String name,String address,String empid) {
		super(name, address);
		this.empid = empid;
	}
	public void disp_faculty() {
		System.out.println(name+address+empid);
	}
	public void display_vitadd() {
		System.out.println(address);
	}
}
class professor extends faculty{
	String cabno;
	public professor(String name,String address,String cabno,String empid) {
		super(name,address,empid);
		this.cabno = cabno;
	}
	public void disp_professor() {
		System.out.println(name+address+empid+cabno);
	}
}