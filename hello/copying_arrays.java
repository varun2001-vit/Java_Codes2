package hello;

import java.util.*;
public class copying_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a[] = {1,2,3,4,5};
//		int b[] = new int[a.length];
		
		//copying a to b
//		b = a;
//		a[0]++;
//		//b also got affected
//		for(int k:b) {
//			System.out.print(k+" ");
//		}
		
		//to avoid this
//		b = a.clone();
//		for(int k:b) {
//			System.out.print(k+" ");
//		}
//		
		//copying only part of array
		//it creates another new copy
//		System.arraycopy(src, srcPos, dest, destPos, length);
//		System.arraycopy(a, 2, b, 0, 3);
//		for(int k:b) {
//			System.out.println(k);
//		}
		
		//copying 2D arrays
		int a[][] = {{1,1},{2,2}};
		int b[][] = new int[2][2];
		
//		b = a.clone();
//		a[0][0] = 2;
//		//b also get affected by using clone - created a shallow copy
		//b will be referencing to the same address
		//2D array is the combination of 1D arrays
		//so after using clone b will be referencing to the
		//same address and when we change a[0][0],
		//b also get affected as it is shallow copy
//		for(int k[]:b) {
//			for(int m:k) {
//				System.out.println(m);
//			}
//		}
		
		//creating a deep copy so b won't be affected
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				b[i][j] = a[i][j];
			}
		}
		a[0][0]++;
		//now b is not affected
		for(int k[]:b) {
			for(int m:k) {
				System.out.println(m);
			}
		}
		
	}

}
