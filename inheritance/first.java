package inheritance;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s = new student("Shobhit","20BDS0162","Shobhitagr30","Shobhitagr@8476");
		s.login();
		
		faculty f = new faculty("Satish","12847","Satish12","satish@123");
		f.login();
		
		admin a = new admin("admin","admin","admin");
		a.login();
		
	}

}

//here public class faculty not allowed if we are defining both classes in same file
//class faculty extends person{
//
//	String name;
//	String empid;
//	
//	public faculty(String iname,String iempid, String iuser,String ipass) {
//		name = iname;
//		empid = iempid;
//		username = iuser;
//		password = ipass;
//	}
//	
//}

//MEMORY ALLOCATION FOR SUBCLASS OBJECT
//class superclass{
//	public int a;
//	protected int b;
//	private int c;
//}
//class subclass extends superclass{
//	private int d;
//}
//when we create an object of subclass type say s1
//will an object of superclass be created? -> NO, only the subclass object will be created
//what will be the memory allocation for subclass object s1?
//s1 will hold all the public, protected and also private variables of the superclass
//also s1 will hold it's variable 'd'
//memory gets allocated for all the variables of superclass plus all the variables of subclass
//but we cannot do s1.c, s1 cannot have access to the private variable c of superclass
//because constructor in superclass will run and that constructor internally can initialise any of its data members
