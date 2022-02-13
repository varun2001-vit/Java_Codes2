package nested_classes;
import java.util.*;
public class nested_classes_exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		faculty f = new faculty("Satish","101");
		faculty.degree d = f.new degree();
		d.setdetails();
		d.getdetails();
	}

}
class faculty{
	private String name;
	private String empid;
	
	public faculty(String name,String empid) {
		this.empid = empid;
		this.name = name;
	}
	
	public class degree{
		Scanner input = new Scanner(System.in);
		
		String degname;
		String degyear;
		String deguni;
		
		public void setdetails() {
			System.out.println("Enter degree name");
			degname = input.next();
			System.out.println("Enter the degree year");
			degyear = input.next();
			System.out.println("Enter the degree university");
			deguni = input.next();
		}
		
		public void getdetails() {
			System.out.println(name+" "+empid);
			System.out.println(degname+" "+degyear+" "+deguni);
		}
	}
}