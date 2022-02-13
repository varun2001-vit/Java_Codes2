package class_practice_questions;
import java.util.*;
public class first_question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of passengers");
		n = input.nextInt();
		passenger p[] = new passenger[n];
		for(int i=0;i<n;i++) {
			p[i] = new passenger();
			p[i].setDetails();
		}
		for(int i=0;i<n;i++) {
			if(p[i].destination.equals("Singapore") || p[i].destination.equals("Malaysia") || p[i].destination.equals("Taiwan")) {
				p[i].flight = "Boeing 703";
				p[i].price = 3500 + (float)0.1*3500;
			}else if(p[i].destination.equals("US") || p[i].destination.equals("UK") || p[i].destination.equals("Canada")) {
				p[i].flight = "Lufthansa 303";
				p[i].price = 75000 + (float)0.2*75000;
			}
		}
		//dispalying passengers according to passenger id
		String pcode;
		System.out.println("Enter your passenger code");
		pcode = input.next();
		System.out.println("The flight details and ticket price of passenger with passenger code " + pcode + " is:");
		for(int i=0;i<n;i++) {
			if(p[i].code.equals(pcode)) {
				System.out.println(p[i].flight + " " + p[i].price);
			}
		}
	}

}
class passenger{
	String name,code,dob,destination;
	int age;
	String flight;
	float price;
	Scanner input = new Scanner(System.in);
	public void setDetails() {
		System.out.println("Enter the Passenger name");
		name = input.next();
		System.out.println("Enter the Passenger Code");
		code = input.next();
		System.out.println("Enter the Passenger Age");
		age = input.nextInt();
		System.out.println("Enter the Passenger DOB");
		dob = input.next();
		System.out.println("Enter the destination");
		destination = input.next();
	}
}