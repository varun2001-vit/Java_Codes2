package class_practice_questions;
import java.util.*;
public class third_question {

	public static void viewAll(bank b1[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Administrator username");
		String auser = input.next();
		System.out.println("Enter the Administrator password");
		String apass = input.next();
		if(auser.equals("Admin") && apass.equals("Admin123")) {
			for(int i=0;i<b1.length;i++) {
				b1[i].showAccount();
			}
		}else {
			System.out.println("Only administrators are allowed!");
		}
	}
	
	public static void viewLess(bank b1[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Administrator username");
		String auser = input.next();
		System.out.println("Enter the Administrator password");
		String apass = input.next();
		if(auser.equals("Admin") && apass.equals("Admin123")) {
			int flag = 0;
			for(int i=0;i<b1.length;i++) {
				if(b1[i].balance<1000) {
					flag = 1;
					b1[i].showAccount();
				}
			}
			if(flag == 0) {
				System.out.println("No account holders have less than Rs.1000");
			}
		}else {
			System.out.println("Only administrators are allowed!");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of accounts to open");
		n = input.nextInt();
		bank b[] = new bank[n];
		for(int i=0;i<n;i++) {
			b[i] = new bank();
			b[i].openAccount();
		}
		int ch;
		do {
			System.out.println("1.Deposit Money\n2.Withdraw Money\n3.Change Address");
			System.out.println("4.Change Phone Number\n5.Change Email ID");
			System.out.println("6.View all customers (Only Administrators)");
			System.out.println("7.Account holders having deposits less than Rs. 1000 (Only Administrators)");
			System.out.println("8.Exit");
			System.out.println("Enter your choice");
			ch = input.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter the customer ID");
				String cid = input.next();
				for(int i=0;i<b.length;i++) {
					if(b[i].custid.equals(cid)) {
						b[i].deposit();
					}
				}
				break;
			case 2:
				System.out.println("Enter the customer ID");
				cid = input.next();
				for(int i=0;i<b.length;i++) {
					if(b[i].custid.equals(cid)) {
						b[i].withdraw();
					}
				}
				break;
			case 3:
				System.out.println("Enter the customer ID");
				cid = input.next();
				for(int i=0;i<b.length;i++) {
					if(b[i].custid.equals(cid)) {
						b[i].changeAddress();
					}
				}
				break;
			case 4:
				System.out.println("Enter the customer ID");
				cid = input.next();
				for(int i=0;i<b.length;i++) {
					if(b[i].custid.equals(cid)) {
						b[i].changephno();
					}
				}
				break;
			case 5:
				System.out.println("Enter the customer ID");
				cid = input.next();
				for(int i=0;i<b.length;i++) {
					if(b[i].custid.equals(cid)) {
						b[i].changeemail();
					}
				}
				break;
			case 6:
				viewAll(b);
				break;
			case 7:
				viewLess(b);
				break;
			case 8:
				break;
			}
		}while(ch!=8);
	}

}
class bank{
	String accno;
	String custid;
	String address;
	String phno;
	String email;
	String name;
	long balance;
	Scanner input = new Scanner(System.in);
	public void openAccount() {
		System.out.println("Enter account number");
		accno = input.next();
		System.out.println("Enter the customer ID");
		custid = input.next();
		System.out.println("Enter the name");
		name = input.next();
		System.out.println("Enter the address");
		address = input.next();
		System.out.println("Enter the phone number");
		phno = input.next();
		System.out.println("Enter the email");
		email = input.next();
		System.out.println("Enter the balance");
		balance = input.nextLong();
	}
	public void showAccount() {
		System.out.println("Name of account holder: "+name);
		System.out.println("Account number: "+accno);
		System.out.println("Balance: "+balance);
	}
	public void deposit() {
		long amount;
		System.out.println("Enter the amount to be deposited");
		amount = input.nextLong();
		balance = balance + amount;
		System.out.println("Updated Balance: "+balance);
	}
	public void withdraw() {
		long amount;
		System.out.println("Enter the amount to be withdrawed");
		amount = input.nextLong();
		if(balance>=amount) {
			balance = balance - amount;
			System.out.println("Balance after withdrawal: "+balance);
		}else {
			System.out.println("Your balance is less than "+amount);
			System.out.println("Transaction failed!");
		}
	}
	public void changeAddress() {
		System.out.println("Enter the new address");
		String add = input.next();
		this.address = add;
	}
	public void changephno() {
		System.out.println("Enter the new phone number");
		String pno = input.next();
		this.phno = pno;
	}
	public void changeemail() {
		System.out.println("Enter the new email");
		String e = input.next();
		this.email = e;
	}
}