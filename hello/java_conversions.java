package hello;

import java.util.*;
public class java_conversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String to int
		String test = "23";
		int result = Integer.parseInt(test);
		System.out.println(result);
		
		//int to string
		int t = 28;
		String res = Integer.toString(t);
		System.out.println(res+"ABC");
		
		//String to char
		String name = "Shobhit";
		char k = name.charAt(0);
		System.out.println(k);
		
		//char to string
		char c = 's';
		String r = Character.toString(c);
		System.out.println(r);
		
		//char to int
		char c1 = '1';
		int i = Character.getNumericValue(c1);
		System.out.println(i+2);
		
		//double to int
		double d = 3.456;
		int j = (int)d;
		System.out.println(j);
		
		//int to double
		int k1 = 2;
		double d1 = k1;
		System.out.println(d1);
		
	}

}
