package class_practice_questions;

import java.util.Scanner;

public class second_question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of passengers");
		n = input.nextInt();
		passengers p[] = new passengers[n];
		for(int i=0;i<n;i++) {
			p[i] = new passengers();
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
		display1(p);
		display2(p);
		display3(p);
	}
	//passengers travelling to US,UK and Canada
	public static void display1(passengers p[]) {
		System.out.println("Details of all the passengers travelling to US,UK and Canada");
		for(int i=0;i<p.length;i++) {
			if(p[i].destination.equals("US") || p[i].destination.equals("UK") || p[i].destination.equals("Canada")) {
				p[i].showDetails();
			}
		}
	}
	//passengers travelling to Singapore, Malaysia, and Taiwan
	public static void display2(passengers p[]) {
		System.out.println("Details of all the passengers travelling to Singapore,Malaysia, and Taiwan");
		for(int i=0;i<p.length;i++) {
			if(p[i].destination.equals("Singapore") || p[i].destination.equals("Malaysia") || p[i].destination.equals("Taiwan")) {
				p[i].showDetails();
			}
		}
	}
	//displaying passengers for a given flight id
	public static void display3(passengers p[]) {
		System.out.println("Enter the flight ID");
		Scanner input = new Scanner(System.in);
		String fid = input.nextLine();
		for(int i=0;i<p.length;i++) {
			if(p[i].flight.equals(fid)) {
				p[i].showDetails();
			}
		}
	}

}
class passengers{
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
	public void showDetails() {
		System.out.println("Passenger Name: "+this.name);
		System.out.println("Passenger Age: "+this.age);
		System.out.println("Passenger Code: "+this.code);
		System.out.println("Passenger DOB: "+this.dob);
		System.out.println("Passenger Destination: "+this.destination);
		System.out.println("Flight: "+this.flight);
		System.out.println("Ticket Price: "+this.price);
	}
	
}