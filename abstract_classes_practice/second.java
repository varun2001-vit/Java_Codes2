package abstract_classes_practice;
import java.util.*;
public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Result r = new Result();
		int total = r.Total();
		String avg = r.Average(total);
		System.out.println(total);
		System.out.println(avg);
	}
}
interface CourseTotal{
	int Total();
}
interface CourseAverage{
	String Average(int total);
}
class Result implements CourseTotal,CourseAverage{
	double avg;
	int n;
	public int Total() {
		int s=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter total number of marks");
		n = input.nextInt();
		System.out.println("Enter the marks");
		int marks[] = new int[n];
		for(int i=0;i<n;i++) {
			marks[i] = input.nextInt();
			s += marks[i];
		}
		return s;
	}
	public String Average(int total) {
		avg = (double)total/n;
		if(avg>=60) {
			return "First";
		}else if(avg>=50) {
			return "Second";
		}else {
			return "Fail";
		}
	}
}