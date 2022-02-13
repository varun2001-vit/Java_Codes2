package hello;

import java.util.*;
public class inputs_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using an object of Scanner class to get input
//		Scanner input = new Scanner(System.in);
//		
//		//to read a string - nextLine()
//		String name = input.nextLine();
//		
//		//to read a integer - nextInt()
//		int age = input.nextInt();
//		
//		
//		//to read a character
//		char c = input.next().charAt(0);
//		
//		System.out.println(c);
//		System.out.println(age);
//		System.out.println(name);
		
		//if else
		
//		Scanner input = new Scanner(System.in);
//		
//		int num = input.nextInt();
//		if(num == 1) {
//			System.out.println("One");
//		}else if(num == 2){
//			System.out.println("Two");
//		}else if(num == 3) {
//			System.out.println("Three");
//		}else {
//			System.out.println("Invalid");
//		}
		
		//switch case - can be for integer,character,strings also
//		Scanner input = new Scanner(System.in);
//		
//		int num = input.nextInt();
//		switch(num) {
//			
//		case 1:
//			System.out.println("One");
//			break;
//			
//		case 2:
//			System.out.println("Two");
//			break;
//		
//		default:
//			System.out.println("Invalid");
//			break;
//		}
		
		//for loop
		for(int i=0;i<5;i++) {
			System.out.println("Hello");
		}
		
		//while loop
		int i =0;
		while(i<5) {
			System.out.println("Hello");
			i++;
		}
		//do while
		i = 6;
		do {
			System.out.println("Hello");
			i++;
		}while(i<5);
	}

}
