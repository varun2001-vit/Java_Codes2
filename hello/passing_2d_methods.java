package hello;

import java.util.*;
public class passing_2d_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//passing 2d arrays to methods
//		Scanner input = new Scanner(System.in);
//		int a[][] = new int[2][2];
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a[i].length;j++) {
//				a[i][j] = input.nextInt();
//			}
//		}
//		
//		display(a);
//		
//	}
//	
//	public static void display(int k[][]) {
//		for(int i[]:k) {
//			for(int m:i) {
//				System.out.print(m);
//			}
//			System.out.println();
//		}
//	}
		
		//passing 2d anonymous arrays to methods
//		display(new int [][] {{1,1},{2,2}});
//		
//	}
//	
//	public static void display(int k[][]) {
//		for(int i[]:k) {
//			for(int m:i) {
//				System.out.print(m);
//			}
//			System.out.println();
//		}
//	}
		
		//returning 2d anonymous array from method
		int m[][] = returnArray();
		for(int i[]:m) {
			for(int k:i) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
	
	public static int[][] returnArray(){
		return new int[][] {{1,1},{2,2}};
	}
	
}
