package inheritance;
import java.util.Scanner;
public class person {

	String username;
	String password;
	String name;	
	public void login() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter user name");
		String u = input.next();
		System.out.println("Enter password");
		String p = input.next();
		if(u.equals(username) && p.equals(password)) {
			System.out.println("Successful Login");
		}else {
			System.out.println("Login Failed");
		}
	}
	
}
