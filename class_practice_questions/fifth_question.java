package class_practice_questions;
import java.util.*;
public class fifth_question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		matrix M1 = new matrix();
		matrix M2 = new matrix();
		System.out.println("Enter the elements of the first matrix");
		M1.getElements();
		System.out.println("Enter the elements of the second matrix");
		M2.getElements();
		System.out.println("The addition is:");
		M1.addition(M2);
		System.out.println("The subtraction is:");
		M1.subtraction(M2);
		System.out.println("The multiplication is:");
		M1.multiplication(M2);
	}

}
class matrix{
	int a[][] = new int[3][3];
	public void getElements() {
		Scanner input = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j] = input.nextInt();
			}
		}
	}
	public void addition(matrix m2) {
		matrix ans = new matrix();
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				ans.a[i][j] = this.a[i][j] + m2.a[i][j];
			}
		}
		print_ans(ans);
	}
	public void subtraction(matrix m2) {
		matrix ans = new matrix();
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				ans.a[i][j] = this.a[i][j] - m2.a[i][j];
			}
		}
		print_ans(ans);
	}
	public void multiplication(matrix m2) {
		matrix ans = new matrix();
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
					ans.a[i][j] += this.a[i][k] * m2.a[k][j];
				}
			}
		}
		print_ans(ans);
	}
	public void print_ans(matrix m) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(m.a[i][j] + " ");
			}
			System.out.println();
		}
	}
}