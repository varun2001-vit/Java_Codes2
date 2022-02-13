package hello;

import java.util.*;
public class strings_exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//password checker
//		Scanner input = new Scanner(System.in);
//		String username,password,confirm;
//		int flag = 0;
//		System.out.println("Enter username");
//		username = input.nextLine();
//		System.out.println("Enter password");
//		password = input.nextLine();
//		System.out.println("Confirm password");
//		confirm = input.nextLine();
//		if(username.isEmpty() || password.isEmpty() || confirm.isEmpty()) {
//			if(username.isEmpty()) {
//				System.out.println("Username cannot be empty");
//			}
//			if(password.isEmpty()) {
//				System.out.println("Password cannot be empty");
//			}
//			if(confirm.isEmpty()) {
//				System.out.println("Confirm password cannot be empty");
//			}
//			flag = 1;
//		}else {
//			if(password.length()<8) {
//				System.out.println("Password should be minimum of 8 characters");
//				flag = 1;
//			}
//			if(password.contains(username)) {
//				System.out.println("Password should not contain username");
//				flag = 1;
//			}
//			if(password.compareTo(confirm) != 0) {
//				System.out.println("Password and confirm password should be same");
//				flag = 1;
//			}
//		}
//		if(flag == 0) {
//			System.out.println("Valid");
//		}else {
//			System.out.println("Invalid");
//		}
		
		//display the names in sorted order
//		Scanner input = new Scanner(System.in);
////		Scanner input1 = new Scanner(System.in);
//		int n = input.nextInt();
//		String names[] = new String[n];
//		for(int i=0;i<n;i++) {
//			names[i] = input.next();
//		}
//		for(int i=0;i<n-1;i++) {
//			for(int j=0;j<n-i-1;j++) {
//				if((names[j].compareTo(names[j+1]))>0) {
//					String temp = names[j];
//					names[j] = names[j+1];
//					names[j+1] = temp;
//				}
//			}
//		}
//		for(String k:names) {
//			System.out.println(k);
//		}
		
		//reverse every word of a string
//		Scanner input = new Scanner(System.in);
//		String sen = input.nextLine();
//		String res[] = sen.split(" ");
//		String rev = "";
//		for(int i=0;i<res.length;i++) {
//			String word = res[i];
//			String revword = "";
//			for(int j=word.length()-1;j>=0;j--) {
//				revword += word.charAt(j);
//			}
//			rev = rev + revword +" ";
//		}
//		System.out.println(rev);
		
		//frequency of each word 
//		Scanner input = new Scanner(System.in);
//		String sentence = input.nextLine();
//		String words[] = sentence.split(" ");
//		String word;
//		int wordlen = words.length;
//		for(int i=0;i<wordlen;i++) {
//			word = words[i];
//			int count = 1;
//			for(int j=(i+1);j<=wordlen-1;j++) {
//				if(word.equals(words[j])) {
//					count++;
//					for(int k=j;k<wordlen-1;k++) {
//						words[k] = words[k+1];
//					}
//					wordlen--;
////					j--;
//				}
//			}
//			System.out.println(word + " " +count);
//		}
		//bonus question
//		Scanner input = new Scanner(System.in);
//		int n = input.nextInt();
//		String names[] = new String[n];
//		long mobile[] = new long[n];
//		int exp[] = new int[n];
//		for(int i=0;i<n;i++) {
//			names[i] = input.next();
//			mobile[i] = input.nextLong();
//			exp[i] = input.nextInt();
//		}
//		for(int i=0;i<n;i++) {
//			if(exp[i]>3) {
//				System.out.println((500*(exp[i]-3)) + " " + mobile[i]);
//			}else {
//				System.out.println("Not eligible for bonus");
//			}
//		}
//		for(int i=0;i<n;i++) {
//			System.out.println(names[i] + " " + mobile[i] + " " + exp[i]);
//		}
		
		//temperature question
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String names[] = new String[n];
		char unit[] = new char[n];
		double value[] = new double[n];
		for(int i=0;i<n;i++) {
			names[i] = input.next();
			value[i] = input.nextDouble();
			unit[i] = input.next().charAt(0);
		}
		for(int i=0;i<n;i++) {
			if(unit[i] == 'F') {
				value[i] = (float)(value[i] - 32)*(float)5/9;
				unit[i] = 'C';
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(Math.round(value[i]*1000.0)/1000.0 + " ");
		}
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(value[j]>value[j+1]) {
					double t = value[j];
					value[j]  = value[j+1];
					value[j+1] = t;
					String t1 = names[j];
					names[j] = names[j+1];
					names[j+1] = t1;
				}else if(value[j] == value[j+1]) {
					if((names[j].compareTo(names[j+1]))>0) {
						double t = value[j];
						value[j]  = value[j+1];
						value[j+1] = t;
						String t1 = names[j];
						names[j] = names[j+1];
						names[j+1] = t1;
					}
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(names[i] + " ");
		}
		
		//remove duplicates from string
//		Scanner input = new Scanner(System.in);
//		String s = input.next();
//		char s1[] = s.toCharArray();
//		int n = s1.length;
//		for(int i=0;i<n;i++) {
//			for(int j=i+1;j<n;j++) {
//				if(s1[i] == s1[j]) {
//					int temp = j;
//					for(int k=temp;k<n-1;k++) {
//						s1[k] = s1[k+1];
//					}
//					j--;
//					n--;
//				}
//			}
//		}
//		String s2 = new String(s1);
//		System.out.println(s2.substring(0,n));
		
		//check whether a name is present or not
//		Scanner input = new Scanner(System.in);
//		int n = input.nextInt();
//		String s[] = new String[n];
//		for(int i=0;i<n;i++) {
//			s[i] = input.next();
//		}
//		String s1 = input.next();
//		int flag = 0;
//		for(int i=0;i<n;i++) {
//			if(s[i].compareTo(s1)==0) {
//				flag = 1;
//				break;
//			}
//		}
//		if(flag == 1) {
//			System.out.println("Yes");
//		}else {
//			System.out.println("No");
//		}
		
		//number of vowels
//		Scanner input = new Scanner(System.in);
//		String s = input.nextLine();
//		char s1[] = s.toCharArray();
//		int c = 0;
//		for(int i=0;i<s1.length;i++) {
//			if(s1[i] == 'a' || s1[i] == 'A' ||s1[i] == 'e' ||s1[i] == 'E' ||s1[i] == 'i' ||s1[i] == 'I' || 
//					s1[i] == 'o' ||s1[i] == 'O' ||s1[i] == 'u' ||s1[i] == 'U') {
//				c++;
//			}
//		}
//		System.out.println(c);
		
		//reverse string
//		Scanner input = new Scanner(System.in);
//		String s = input.nextLine();
//		char rev[] = new char[s.length()];
//		char s1[] = s.toCharArray();
//		int j = 0;
//		for(int i=s1.length-1;i>=0;i--) {
//			char c = s1[i];
//			rev[j] = c;
//			j++;
//		}
//		for(int i =0;i<rev.length;i++) {
//			System.out.print(rev[i]);
//		}
		
		//sorting the BDS reg no
//		Scanner input = new Scanner(System.in);
//		int n = input.nextInt();
//		String s[] = new String[n];
//		for(int i=0;i<n;i++) {
//			s[i] = input.next();
//		}
//		int flag = 0;
//		for(int i=0;i<n-1;i++) {
//			if(s[i].contains("BDS") == true) {
//				for(int j=0;j<n-i-1;j++) {
//					if(s[j].compareTo(s[j+1])>0) {
//						String t = s[j];
//						s[j] = s[j+1];
//						s[j+1] = t;
//					}
//				}
//			}else {
//				flag = 1;
//				System.out.println("Only BDS are allowed");
//				break;
//			}
//		}
//		if(flag == 0) {
//			for(String k:s) {
//				System.out.print(k + " ");
//			}
//		}
//		Scanner input = new Scanner(System.in);
//		String s = input.nextLine();
//		String s1[] = s.split(" ");
//		for(int i=0;i<s1.length;i++) {
//			System.out.println(s1[i]);
//		}
//		for(int i=0;i<s1.length;i++) {
//			if(s1[i].charAt(0) == 'a' || s1[i].charAt(0) == 'e' || s1[i].charAt(0) == 'i' || s1[i].charAt(0) == 'o' || s1[i].charAt(0) == 'u') {
//				System.out.println(s1[i]);
//			}
//		}
//		//capitalize starting letter of each word of a string
//		String temp = "";
//		for(int i=0;i<s1.length;i++) {
//			String first = s1[i].substring(0,1);
//			String remain = s1[i].substring(1);
//			temp += first.toUpperCase() + remain + " ";
//		}
//		System.out.println(temp);
		
		//check names in Dr.bonthu.....
//		Scanner input = new Scanner(System.in);
//		String s[] = new String[5];
//		for(int i=0;i<5;i++) {
//			s[i] = input.next();
//		}
//		String s1 = input.next();
//		int flag = 0;
//		for(int i=0;i<s.length;i++) {
//			if(s[i].contains(s1)) {
//				System.out.println("Name found");
//				flag = 1;
//				break;
//			}else {
//				flag = 0;
//			}
//		}
//		if(flag == 0) {
//			System.out.println("Not found");
//		}
		
		//count how many times VIT occurs in a string
//		Scanner input = new Scanner(System.in);
//		String s = input.nextLine();
//		String word = "VIT";
//		String s1[] = s.split(" ");
//		int c = 0;
//		for(int i=0;i<s1.length;i++) {
//			if(s1[i].contains(word)) {
//				c++;
//			}
//		}
//		System.out.println(c);
		
		//count number of SCOPE(BCE) and SENSE(BEC) schools
//		Scanner input = new Scanner(System.in);
//		String s[] = new String[5];
//		for(int i=0;i<s.length;i++) {
//			s[i] = input.next();
//		}
//		int c = 0;
//		int flag = 0;
//		for(int i=0;i<s.length;i++) {
//			if(s[i].contains("BCE") || s[i].contains("BEC")) {
//				c++;
//				flag = 1;
//			}
//		}
//		
//		if(flag == 0) {
//			System.out.println("NONE");
//		}else {
//			System.out.println(c);
//		}
		
		//converting string to binary
//		Scanner input = new Scanner(System.in);
//		String s = input.nextLine();
//		System.out.println("The string to binary is");
//		string_to_binary(s);
//		System.out.println();
//		System.out.println("The string to hex is");
//		String hex = string_to_hex(s);
//		System.out.println(hex);
//		System.out.println("The hex to binary is");
//		hex_to_binary(hex);
//	}
//	
//	public static void string_to_binary(String s) {
//		for(int i=0;i<s.length();i++) {
//			char c = s.charAt(i);
//			int val = (int)c;
//			String binary = "";
//			while(val>0) {
//				if(val%2==1) {
//					binary += "1";
//				}else {
//					binary += "0";
//				}
//				val /= 2;
//			}
//			binary = reverse(binary);
//			System.out.print(binary + " ");
//		}
//	}
//	
//	public static String reverse(String s) {
//		char a[] = s.toCharArray();
//		for(int i=0;i<a.length/2;i++) {
//			char temp = a[i];
//			a[i] = a[a.length-i-1];
//			a[a.length-i-1] = temp;
//		}
//		String c = new String(a);
//		return c;
//	}
//	
//	public static String string_to_hex(String s) {
//		String hex = "";
//		for(int i=0;i<s.length();i++) {
//			char c = s.charAt(i);
//			int j = (int)c;
//			String part = Integer.toHexString(j);
//			hex += part;
//		}
//		return hex;
//	}
//	
//	public static void hex_to_binary(String s) {
//		String binary = "";
//		s = s.toUpperCase();
//		char c[] = s.toCharArray();
//		for(int i=0;i<c.length;i++) {
//			switch(c[i]) {
//			case '0':
//				binary += "0000";
//				break;
//			case '1':
//				binary += "0001";
//				break;
//			case '2':
//				binary += "0010";
//				break;
//			case '3':
//				binary += "0011";
//				break;
//			case '4':
//				binary += "0100";
//				break;
//			case '5':
//				binary += "0101";
//				break;
//			case '6':
//				binary += "0110";
//				break;
//			case '7':
//				binary += "0111";
//				break;
//			case '8':
//				binary += "1000";
//				break;
//			case '9':
//				binary += "1001";
//				break;
//			case 'A':
//				binary += "1010";
//				break;
//			case 'B':
//				binary += "1011";
//				break;
//			case 'C':
//				binary += "1100";
//				break;
//			case 'D':
//				binary += "1101";
//				break;
//			case 'E':
//				binary += "1110";
//				break;
//			case 'F':
//				binary += "1111";
//				break;
//			}
//		}
//		System.out.println(binary);
//	}
//		
		//valid mobile number and reg. number
	
//		Scanner input = new Scanner(System.in);
//		String regno,mobno;
//		System.out.println("Enter registration number");
//		regno = input.next();
//		System.out.println("Enter mobile number");
//		mobno = input.next();
//		char cmobno[] = mobno.toCharArray();
//		char cregno[] = regno.toCharArray();
//		int flag = 0;
//		if(mobno.length()!=10 || regno.length()!=9) {
//			if(mobno.length()!=10) {
//				System.out.println("Mobile number should be of 10 digits");
//			}else {
//				System.out.println("Registration number should be of 9 digits");
//			}
//			flag = 1;
//		}
//		if(flag==0) {
//			for(int i=0;i<cmobno.length;i++) {
//				int val = (int)cmobno[i];
//				if(val < 48 || val > 57) {
//					System.out.println("Invalid mobile number");
//					flag = 1;
//					break;
//				}
//			}
//			for(int i=0;i<cregno.length;i++) {
//				int val = (int)cregno[i];
//				if((val<48) || (val > 57 && val < 65) || (val >90 && val < 97) || (val > 122)) {
//					System.out.println("Invalid registration number");
//					flag = 1;
//					break;
//				}
//			}
//		}
//		if(flag == 0) {
//			System.out.println("Valid");
//		}
		
//	}
		
	}
		
}
