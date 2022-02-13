package hello;

import java.util.*;
public class Classes_objects_exercise {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter the number of students");
		n = input.nextInt();
		students s[] = new students[n];
		for(int i=0;i<s.length;i++) {
			s[i] = new students();
		}
		for(int i=0;i<s.length;i++) {
			s[i].set_details();
		}
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i].get_details());
		}
		
		//sorting the objects according to the name field
		sort_students(s);
		//displaying all the students who are from vellore
		display_vellore(s);
	}
	
	public static void sort_students(students s[]) {
		for(int i=0;i<s.length-1;i++) {
			for(int j=0;j<s.length-i-1;j++) {
				if(s[j].name.compareTo(s[j+1].name)>0) {
					students temp = s[j];
					s[j] = s[j+1];
					s[j+1] = temp;
				}
			}
		}
		for(students m:s) {
			System.out.println(m.get_details());
		}
	}
	
	public static void display_vellore(students m[]) {
		for(int i=0;i<m.length;i++) {
			if(m[i].address.contains("Vellore")) {
				System.out.println(m[i].get_details());
			}
		}
	}

}

class students{
	String name,regno,address;
	Scanner input = new Scanner(System.in);
	public void set_details() {
		System.out.println("Enter the name");
		name = input.nextLine();
		System.out.println("Enter the registration number");
		regno = input.nextLine();
		System.out.println("Enter the address");
		address = input.nextLine();
	}
	public String get_details() {
		return(name + " " + regno + " " + address);
	}
}