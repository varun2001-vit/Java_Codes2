package hello;

import java.util.*;
public class passing_arrays_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//passing arrays to methods
//		Scanner input = new Scanner(System.in);
//		int a[] = new int[10];
//		for(int i=0;i<10;i++) {
//			a[i] = input.nextInt();
//		}
//		display(a);
//
//	}
//	
//	public static void display(int m[]) {
//		for(int k:m) {
//			System.out.println(k +" ");
//		}
		
		//returning arrays from methods
//		Scanner input = new Scanner(System.in);
//		int m[] = returnArray();
//		for(int k:m) {
//			System.out.println(k);
//		}
//		
//	}
//	
//	public static int[] returnArray() {
//		int a[] = {1,2,3};
//		return a;
//	}
		
		//anonymous arrays - can be of float,char.....any type - new int[] {1,2,3};
//		display(new int[] {1,2,3});
//		
//	}
//	
//	public static void display(int m[]) {
//		for(int k:m) {
//			System.out.println(k);
//		}
//	}
		
		//returning anonymous arrays from method
		
//		int m[] = returnArray();
//		for(int k:m) {
//			System.out.println(k);
//		}
//		
//	}
//	
//	public static int[] returnArray() {
//		return(new int[] {1,2,3});
//	}
	
		//pass by reference - address of array will be passed and any change made in the method will be done to the original array
		int m[] = {2,3,4};
		//k[1] will become 999 after calling the function (pass by reference)
		changeArray(m);
		for(int k:m) {
			System.out.println(k);
		}
		
	}
	
	public static void changeArray(int k[]) {
		k[1] = 999;
	}
	
}
