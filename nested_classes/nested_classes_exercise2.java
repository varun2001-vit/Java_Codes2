package nested_classes;
import java.util.*;
public class nested_classes_exercise2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		faculty1 f = new faculty1("Satish","101");
		//A faculty member can have multiple degrees
		//create an array of degree objects
		faculty1.degree1 d1[] = new faculty1.degree1[3];
		String dname,dyear,duni;
		for(int i=0;i<d1.length;i++) {
			System.out.println("Enter degree name");
			dname = input.next();
			System.out.println("Enter the degree year");
			dyear = input.next();
			System.out.println("Enter the degree university");
			duni = input.next();
			d1[i] = f.new degree1(dname,dyear,duni);
		}
		f.display(d1);
	}

}
class faculty1{
	private String name;
	private String empid;
	
	public faculty1(String name,String empid) {
		this.empid = empid;
		this.name = name;
	}
	
	public class degree1{
		Scanner input = new Scanner(System.in);
		
		String degname;
		String degyear;
		String deguni;
		
		public degree1(String degname,String degyear,String deguni) {
			this.degname = degname;
			this.degyear = degyear;
			this.deguni = deguni;
		}
	}
	
	public void display(degree1 d[]) {
		System.out.println(name + " " + empid);
		for(degree1 m:d) {
			System.out.println(m.degname + " " + m.degyear + " " + m.deguni);
		}
	}
}