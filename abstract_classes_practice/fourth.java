package abstract_classes_practice;
import java.util.*;
public class fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		school s = new school();
		s.getDetails();
		school.department d[] = new school.department[3];
		for(int i=0;i<d.length;i++) {
			d[i] = s.new department();
			d[i].getDetails();
		}
		s.display(d);
	}

}
class school{
	String name;
	String id;
	Scanner input = new Scanner(System.in);
	public void getDetails() {
		System.out.println("Enter school name");
		name = input.next();
		System.out.println("Enter school id");
		id = input.next();
	}
	
	public class department{
		String dname,did,ns;
		public void getDetails() {
			System.out.println("Enter the department name");
			dname = input.next();
			System.out.println("Enter the department id");
			did = input.next();
			System.out.println("Enter the number of students");
			ns = input.next();
		}
	}
	public void display(department d[]) {
		System.out.println("School name: "+name);
		System.out.println("School id: "+id);
		for(int i=0;i<d.length;i++) {
			System.out.println(d[i].did);
			System.out.println(d[i].dname);
			System.out.println(d[i].ns);
		}
	}
}