package hello;

import java.util.*;
public class loops_exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print sum of first N natural numbers. get N from user
		
//		Scanner input = new Scanner(System.in);
//		int N = input.nextInt();
		
//		int s = 0;
//		for(int i=1;i<=N;i++) {
//			s = s+i;
//		}
//		
//		System.out.println(s);
//		
//		//print all natural numbers from 1 to N in reverse
//		
//		for(int i = N;i>=1;i--) {
//			System.out.println(i);
//		}
//		
		//print multiplication table of any number
		
//		for(int i=1;i<=10;i++) {
//			System.out.println(N+" X "+i+" = "+N*i);
//		}
		
		//find first and last digit of a number
//		
//		int firstDigit = 0;
//		int temp = N;
//		while(temp!=0) {
//			firstDigit = temp;
//			temp = temp/10;	
//		}
//		
//		int lastDigit = N%10;
//		System.out.println(firstDigit);
//		System.out.println(lastDigit);
		
		//find the sum of digits of a number 
		
//		int s = 0;
//		int d = 0;
//		while(N!=0) {
//			d = N%10;
//			N = N/10;
//			s += d;
//		}
//		System.out.println(s);
		
		//addition of two numbers until user wants to exit
		
//		Scanner input = new Scanner(System.in);
//		
//		boolean choice = true;
//		int d = 0;
//		do {
//			int n1 = input.nextInt();
//			int n2 = input.nextInt();
//			System.out.println((n1+n2));
//			System.out.println("Do you want to continue? 1-Continue 0-Exit");
//			d = input.nextInt();
//			if(d==0) {
//				choice = false;
//			}
//			
//		}while(choice);
		
		//fibonacci series
//		Scanner input = new Scanner(System.in);
//		int N = input.nextInt();
//		
//		int t1 = 0;
//		int t2 = 1;
//		int nt = t1+t2;
//		System.out.print(t1);
//		System.out.print(t2);
//		for(int i=3;i<=N;i++) {
//			System.out.print(nt);
//			t1 = t2;
//			t2 = nt;
//			nt = t1+t2;
//			
//		}
		
//		Scanner input = new Scanner(System.in);
//		int N = input.nextInt();
//		
//		int t1 = 0;
//		int t2 = 1;
//		int nt = t1+t2;
//		while(nt<N) {
//			t1 = t2;
//			t2 = nt;
//			nt = t1+t2;
//		}if(nt == N) {
//			System.out.println("Valid");
//		}else {
//			System.out.println("Invalid");
//		}
		
		//how many digits are even, odd or prime
		
//		Scanner input = new Scanner(System.in);
//		int num = input.nextInt();
//		int temp = num;
//		int e=0,o=0,p=0;
//		while(temp!=0) {
//			int d = temp%10;
//			temp = temp/10;
//			if(d%2==0) {
//				e++;
//			}else if(d%2!=0) {
//				o++;
//			}
//				int flag = 0;
//				for(int i=2;i<=d/2;i++) {
//					if(d%i==0) {
//						flag =1;
//						break;
//					}
//				}
//				if(flag == 0 && d!=1) {
//					p++;
//				}
//		}
//		
//		System.out.println(e);
//		System.out.println(o);
//		System.out.println(p);
		
		//odd sum property
//		Scanner input = new Scanner(System.in);
//		int num = input.nextInt();
//		int temp = num;
//		int s = 0;
//		int rem = 0;
//		while(temp != 0) {
//			rem = temp%10;
//			s = s*10 + rem;
//			temp = temp/10;
//		}
//		if((s+num)%2 != 0) {
//			System.out.println("Valid");
//		}else {
//			System.out.println("Invalid");
//		}
	}

}
