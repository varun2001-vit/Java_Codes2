package hello;

import java.util.*;
public class jagged_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//jagged arrays - each row of the 2d array can be of different size
		
		//initialization of jagged arrays
		
//		int a[][] = {{1,1,1,1},{2,2},{3,3,3},{4,4,4,4}};
		//or
		//number of rows should be specified
		//number of columns are not necessary
//		int a[][] = new int[4][];
//		a[0] = new int[] {1,1,1,1};
//		a[1] = new int[] {2,2};
//		a[2] = new int[] {3,3,3};
//		a[3] = new int[] {4,4,4,4};
//		
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a[i].length;j++) {
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		
//		int a[][] = {{1,1,1,1},{2,2},{3,3,3},{4,4,4,4}};
//		for(int k[]:a) {
//			for(int m:k) {
//				System.out.print(m+ " ");
//			}
//			System.out.println();
//		}
		
		//passing jagged arrays to methods
		
//		int a[][] = {{1,1,1,1},{2,2},{3,3,3},{4,4,4,4}};
//		display(a);
//		
//	}
//	
//	public static void display(int m[][]) {
//		for(int k[]:m) {
//			for(int i:k) {
//				System.out.print(i+ " ");
//			}
//			System.out.println();
//		}
//	}
		
		//returning a jagged array from a method
		
//		int m[][] = returnarray();
//		for(int k[]:m) {
//		for(int i:k) {
//			System.out.print(i+ " ");
//			}
//		System.out.println();
//		}
//	}
//	
//	public static int[][] returnarray(){
////		int a[][] = {{1,1,1,1},{2,2},{3,3,3},{4,4,4,4}};
////		return a;
//		//returning an anonymous jagged array
//		return new int[][] {{1,1,1,1},{2,2},{3,3,3},{4,4,4,4}};
//	}
		
		//finding the sum of each row of a jagged array
//		int a[][] = {{1,1,1,1},{2,2},{3,3,3},{4,4,4,4}};
//		disp_sum(a);
//		
//	}
//	
//	public static void disp_sum(int k[][]) {
//		int s = 0;
//		for(int i=0;i<k.length;i++) {
//			for(int j=0;j<k[i].length;j++) {
//				s += k[i][j];
//			}
//			System.out.println("The sum of row "+(i+1)+" " + "is " + s);
//			s = 0;
//		}
//	}
		
		//taking input from user in a jagged array
//		Scanner input = new Scanner(System.in);
//		int rows;
//		System.out.println("Enter the number of rows");
//		rows = input.nextInt();
//		int a[][] = new int[rows][];
//		for(int i=0;i<a.length;i++) {
//			System.out.println("Enter number of elements in row "+(i+1));
//			int count = input.nextInt();
//			a[i] = new int[count];
//			for(int j=0;j<a[i].length;j++) {
//				System.out.println("Enter element " + (j+1));
//				a[i][j] = input.nextInt();
//			}
//		}
//		int p = 0;
//		for(int k[] : a) {
//			for(int m : k) {
//				if(is_prime(m)==true) {
//					p++;
//				}
//			}
//		}
//		System.out.println(p);
//		
//	}
//	
//	public static boolean is_prime(int d) {
//		int flag = 0;
//		for(int i=2;i<=d/2;i++) {
//			if(d%i==0) {
//				flag =1;
//				break;
//			}
//		}
//		if(flag == 0 && d!=1) {
//			return true;
//		}
//		return false;
//	}
		
		//students pass or fail in different semesterss
		Scanner input = new Scanner(System.in);
		int rows;
		System.out.println("Enter the number of semesters");
		rows = input.nextInt();
		int a[][] = new int[rows][];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter number of marks in semester "+(i+1));
			int count = input.nextInt();
			a[i] = new int[count];
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Enter mark " + (j+1));
				a[i][j] = input.nextInt();
			}
		}
		passed(a);
		
	}
	
	public static void passed(int a[][]) {
		int pass=0,fail=0;
		for(int m[]:a) {
			for(int k:m) {
				if(k>=40) {
					pass++;
				}else {
					fail++;
				}
			}
			System.out.println(pass + " " + fail);
			pass = fail = 0;
		}
	}
	
}
