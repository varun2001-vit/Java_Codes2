package class_practice_questions;
import java.util.*;
public class fourth_question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of students");
		n = input.nextInt();
		markSheet m[] = new markSheet[n];
		for(int i=0;i<n;i++) {
			m[i] = new markSheet();
			m[i].setDetails();
		}
		for(int i=0;i<n;i++) {
			m[i].showDetails();
		}
		find_avg(m);
		find_fail(m);
		find_pass(m);
		find_first(m);
	}
	public static void find_avg(markSheet m[]) {
		System.out.println("The average of students:");
		for(int i=0;i<m.length;i++) {
			int sum = 0;
			for(int j=0;j<5;j++) {
				sum += m[i].marks[j];
			}
			float avg = (float)sum/5;
			System.out.println(avg);
			avg = 0;
		}
	}
	public static void find_fail(markSheet m[]) {
		int count = 0;
		for(int i=0;i<m.length;i++) {
			int c = 0;
			for(int j=0;j<5;j++) {
				if(m[i].marks[j]<30) {
					c++;
				}
			}
			if(c==1) {
				count++;
			}
		}
		System.out.println("Number of students failed in anyone subject:");
		System.out.println(count);
	}
	public static void find_pass(markSheet m[]) {
		int count = 0;
		for(int i=0;i<m.length;i++) {
			int c = 0;
			for(int j=0;j<5;j++) {
				if(m[i].marks[j]>=30) {
					c++;
				}
			}
			if(c==5) {
				count++;
			}
		}
		System.out.println("Number of students that are passed:");
		System.out.println(count);
	}
	public static void find_first(markSheet m[]) {
		int count_first = 0,count_dis=0;
		for(int i=0;i<m.length;i++) {
			int sum = 0;
			for(int j=0;j<5;j++) {
				sum += m[i].marks[j];
			}
			float avg = (float)sum/5;
			if(avg>=60 && avg<=80) {
				count_first++;
			}
			if(avg>=81 && avg<=100) {
				count_dis++;
			}
			avg = 0;
		}
		System.out.println("Number of students scored first class:");
		System.out.println(count_first);
		System.out.println("Number of students scored distinction:");
		System.out.println(count_dis);
	}
}
class markSheet{
	String name,rollno;
	String subcode[] = new String[5];
	String subname[] = new String[5];
	int marks[] = new int[5];
	Scanner input = new Scanner(System.in);
	
	public void setDetails() {
		System.out.println("Enter the name");
		name = input.next();
		System.out.println("Enter the roll number");
		rollno = input.next();
		for(int i=0;i<5;i++) {
			System.out.println("Enter the subject code");
			subcode[i] = input.next();
			System.out.println("Enter the subject name");
			subname[i] = input.next();
			System.out.println("Enter the marks");
			marks[i] = input.nextInt();
		}
	}
	public void showDetails() {
		System.out.println("Name: "+name);
		System.out.println("Roll Number: "+rollno);
		for(int i=0;i<5;i++) {
			System.out.println("Subject Code: "+subcode[i]);
			System.out.println("Subject Name: "+subname[i]);
			System.out.println("Marks: "+marks[i]);
		}
	}
}