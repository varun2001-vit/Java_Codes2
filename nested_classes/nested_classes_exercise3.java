package nested_classes;
import java.util.*;
public class nested_classes_exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		faculty2 f[] = new faculty2[2];
		String n,e;
		faculty2.degree2 d1[] = new faculty2.degree2[2];
		String dname,dyear,duni;
		for(int i=0;i<f.length;i++) {
			System.out.println("Enter the faculty name");
			n = input.next();
			System.out.println("Enter the employee id");
			e = input.next();
			f[i] = new faculty2(n, e);
			for(int j=0;j<d1.length;j++) {
				System.out.println("Enter degree name");
				dname = input.next();
				System.out.println("Enter the degree year");
				dyear = input.next();
				System.out.println("Enter the degree university");
				duni = input.next();
				d1[j] = f[i].new degree2(dname,dyear,duni);
			}
		}
		for(int i=0;i<f.length;i++) {
			f[i].display(d1);
		}

	}

}
class faculty2{
	private String name;
	private String empid;

	public faculty2(String name,String empid) {
		this.empid = empid;
		this.name = name;
	}
	
	public class degree2{
		String degname;
		String degyear;
		String deguni;
		
		public degree2(String degname,String degyear,String deguni) {
			this.degname = degname;
			this.degyear = degyear;
			this.deguni = deguni;
		}
	}
	public void display(degree2 d[]) {
		System.out.println(name + " " + empid);
		for(degree2 m:d) {
			System.out.println(m.degname + " " + m.degyear + " " + m.deguni);
		}
	}
}