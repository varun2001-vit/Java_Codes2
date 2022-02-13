package hello;

import java.util.*;

public class marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int M = input.nextInt();
		int P = input.nextInt();
		int C = input.nextInt();
		int E = input.nextInt();
		int CS = input.nextInt();
		
		float OA = (float)((float)M+P+C+E+CS)/5;
		float EA = (float)((float)M*2 + (float)P + (float)C/4);
		float CSA = (float)CS;
		System.out.println(OA);
		System.out.println(EA);
		System.out.println(CSA);
//		System.out.println((float)(25/4)); //gives 6.0
//		System.out.println((float)25/4); //gives 6.25
	}

}
