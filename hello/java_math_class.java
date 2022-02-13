package hello;

import java.util.*;
import java.lang.Math;
import java.util.Random;
public class java_math_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a=3,b=2;
//		double n = 3.23443;
//		System.out.println(Math.min(a, b));
//		System.out.println(Math.max(a, b));
//		System.out.println(Math.pow(a, b));
//		System.out.println(Math.sqrt(a));
//		System.out.println(Math.ceil(Math.sqrt(a))); //gives 2.0
//		System.out.println(Math.floor(Math.sqrt(a))); //gives 1.0
//		System.out.println(Math.round(Math.sqrt(a))); //gives nearest integer i.e. 2 (1.732)
//		System.out.println(Math.round(n*100.0)/100.0); //rounding to two decimal places 
		
		//generating random number between 0.0 and 1.0
		System.out.println(Math.random());
		
		//creating an object of random class
		Random rand = new Random();
		
		//creating a random integer
		int res = rand.nextInt();
		System.out.println(res);
		
		//if we want to generate random numbers between 0 to 500
		res = rand.nextInt(500);
		System.out.println(res);
		
	}

}
