package hello;
import java.util.*;
public class arrays_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,3,4,22,11,13};
		
		//search for value
		//returns index of 11 from a i.e. 4
		System.out.println(Arrays.binarySearch(a, 11));
		//gives negative when element not present
		System.out.println(Arrays.binarySearch(a, 27));
		
		//equals method in Arrays class
		//to check two arrays are equal returns true or false
		//elements should also be in same order
		int a1[] = {1,2,3,4};
		int b1[] = {1,2,3,4};
		System.out.println(Arrays.equals(a1, b1));
		
		//sorting array - ascending order
		Arrays.sort(a);
		for(int k:a) {
			System.out.println(k);
		}
		
	}

}
