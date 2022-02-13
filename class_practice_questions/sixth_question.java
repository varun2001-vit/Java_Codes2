package class_practice_questions;
import java.util.*;
public class sixth_question {

	public static void editPatient(patient p[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the patient ID");
		String id = input.next();
		for(int i=0;i<p.length;i++) {
			if(p[i].pid.equals(id)) {
				p[i].edit();
			}
		}
	}
	public static void searchPatient(patient p[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the patient ID");
		String id = input.next();
		for(int i=0;i<p.length;i++) {
			if(p[i].pid.equals(id)) {
				p[i].getDetails();
			}
		}
	}
	public static void deletePatient(patient p[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the patient ID");
		String id = input.next();
		for(int i=0;i<p.length;i++) {
			if(p[i].pid.equals(id)) {
				p[i].name = "";
				p[i].address = "";
				p[i].age = 0;
				p[i].disease = "";
				p[i].pid = "";
				p[i].dob = "";
			}
		}
	}
	public static void listAll(patient p[]) {
		for(int i=0;i<p.length;i++) {
				p[i].getDetails();
		}
	}
	public static void displayDisease(patient p[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the disease");
		String d = input.next();
		for(int i=0;i<p.length;i++) {
			if(p[i].disease.equals(d)) {
				p[i].getDetails();
			}
		}
	}
	public static void sortPatients(patient p[]) {
		for(int i=0;i<p.length-1;i++) {
			for(int j=0;j<p.length-i-1;j++) {
				if(p[j].pid.compareTo(p[j+1].pid)>0) {
					patient temp = p[j];
					p[j] = p[j+1];
					p[j+1] = temp;
				}
			}
		}
		for(int i=0;i<p.length;i++) {
			p[i].getDetails();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of patients");
		n = input.nextInt();
		patient p[] = new patient[n];
		for(int i=0;i<n;i++) {
			p[i] = new patient();
			p[i].setDetails(101+i);
		}
		int ch;
		do {
			System.out.println("1.Edit Patient Records\n2.Search for a patient record\n3.Delete a patient record");
			System.out.println("4.List all patient records");
			System.out.println("5.Display list of patients with a certain disease");
			System.out.println("6.Sort Patients according to patient ID");
			System.out.println("7.Exit");
			System.out.println("Enter your choice");
			ch = input.nextInt();
			switch(ch) {
			case 1:
				editPatient(p);
				break;
			case 2:
				searchPatient(p);
				break;
			case 3:
				deletePatient(p);
				break;
			case 4:
				listAll(p);
				break;
			case 5:
				displayDisease(p);
				break;
			case 6:
				sortPatients(p);
				break;
			case 7:
				break;
			default:
				System.out.println("Wrong choice!");
				break;
			}
		}while(ch!=7);
	}
}
class patient{
	String dob;
	int age;
	String disease;
	String pid;
	String address;
	String name;
	Scanner input = new Scanner(System.in);
	public void setDetails(int id) {
		System.out.println("Enter patient name");
		name = input.next();
		System.out.println("Enter the age");
		age = input.nextInt();
		System.out.println("Enter the DOB");
		dob = input.next();
		System.out.println("Enter the address");
		address = input.next();
		System.out.println("Enter the disease");
		disease = input.next();
		String res = Integer.toString(id);
		this.pid = 'P' + res;
	}
	public void getDetails() {
		System.out.println("ID: "+pid);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Date of Birth: "+dob);
		System.out.println("Address: "+address);
	}
	public void edit() {
		System.out.println("Enter the new age");
		int a = input.nextInt();
		this.age = a;
		System.out.println("Enter the new address");
		String add = input.next();
		this.address = add;
	}
	
}