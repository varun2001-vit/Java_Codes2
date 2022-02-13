package hello;

import java.util.*;
public class nested_loops {
	public static void main(String args[]) {
		
//		Scanner input = new Scanner(System.in);
//		int n = input.nextInt();
//		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		for(int i=n-1;i>=1;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		//break
//		int luckyNumber = 13;
//		boolean lucky = false;
//		for(int i=0;i<5;i++) {
//			int n = input.nextInt();
//			if(n==13) {
//				System.out.println("lucky");
//				lucky = true;
//				break;
//			}
//		}
//		if(lucky == false) {
//			System.out.println("Not lucky");
//		}
		
//		for(int i=0;i<2;i++) {
//			System.out.println("Outer loop");
//			for(int j=0;j<3;j++) {
//				System.out.println("Inner loop");
//				//only break the inner for loop
//				break;
//			}
////			break;
//		}
//		System.out.println("Thanks");
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter the number of lines");
//		int n = input.nextInt();
//		for(int i=n;i>=0;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter the number of lines");
//		int n = input.nextInt();
//		int i, j;  
//        for(i=1;i<=n;i++) {
//        	for(j=(n-i);j>0;j--) {
//        		System.out.print(" ");
//        	}
//        	for(j=0;j<i;j++) {
//        		System.out.print("*");
//        	}
//        	System.out.println();
//        }
//         *
//        **
//       ***
//      ****
//     *****
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter the number of lines");
//		int n = input.nextInt();
//		int i, j;  
//		int k = 1;
//		for(i=1;i<=n;i++) {
//			for(j=(n-i);j>0;j--) {
//				System.out.print(" ");
//			}
//			for(j=0;j<k;j++) {
//				System.out.print("*");
//			}
//			k = k+2;
//			for(j=(n-i);j>0;j--) {
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
//		for(i=n-1;i>=1;i--) {
//			for(j=0;j<(n-i);j++) {
//				System.out.print(" ");
//			}
//			for(j=k-4;j>0;j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//			k = k-2;
//		}
//		    *    
//		   ***   
//		  *****  
//		 ******* 
//		*********
//		 *******
//		  *****
//		   ***
//		    *
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter the number of lines");
//		int n = input.nextInt();
//		int i, j;  
//		int k=0;
//		for(i=n;i>0;i--) {
//			for(j=0;j<k;j++) {
//				System.out.print(" ");
//			}
//			k = k+1;
//			for(j=0;j<i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		* * * * * 
//		 * * * * 
//		  * * * 
//		   * * 
//		    * 
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter the number of lines");
//		int n = input.nextInt();
//		int i, j;  
//		int k=0;
//		for(i=n;i>0;i--) {
//			for(j=0;j<k;j++) {
//				System.out.print(" ");
//			}
//			k = k+1;
//			for(j=0;j<i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter the number of lines");
//		int n = input.nextInt();
//		int i, j;  
//		int k=0;
//		for(i=n;i>0;i--) {
//			for(j=0;j<k;j++) {
//				System.out.print(" ");
//			}
//			k = k+1;
//			for(j=0;j<i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		for(i=0;i<n;i++) {
//			for(j=0;j<k-1;j++) {
//				System.out.print(" ");
//			}
//			k = k-1;
//			for(j=0;j<=i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		* * * * * 
//		 * * * * 
//		  * * * 
//		   * * 
//		    * 
//		    * 
//		   * * 
//		  * * * 
//		 * * * * 
//		* * * * * 
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter the number of lines");
//		int n = input.nextInt();
//		int i, j;  
//		int k=1;
//		for(i=1;i<=n;i++) {
//			for(j=n;j>i;j--) {
//				System.out.print(" ");
//			}
//			if(i==1) {
//				System.out.print("*");
//			}else {
//				System.out.print("*");
//				for(j=1;j<=k;j++) {
//					System.out.print(" ");
//				}
//				k = k+2;
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(i=1;i<=(n-1);i++) {
//			for(j=1;j<=i;j++) {
//				System.out.print(" ");
//			}
//			if(i!=n-1) {
//				System.out.print("*");
//				for(j=k-4;j>0;j--) {
//					System.out.print(" ");
//				}
//				k = k-2;
//				System.out.print("*");
//			}else {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		      *
//		     * *
//		    *   *
//		   *     *
//		  *       *
//		 *         *
//		*           *
//		 *         *
//		  *       *
//		   *     *
//		    *   *
//		     * *
//		      *

	}
}
