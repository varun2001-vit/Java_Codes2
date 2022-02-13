package class_practice_questions;
import java.util.*;
public class extra_question {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        Participants par[] = new Participants[2];
        for(int i=0;i<2;i++){
            par[i] = new Participants();
            par[i].setDetails();
        }
        for(int i=0;i<par.length;i++) {
        	par[i].getDetails();
        	Participants.result(par[i].test_class);
        }
	}

}
class Participants{
    String name,branch,uni,Phno,test_class;
	Scanner in = new Scanner(System.in);
    public void setDetails() {
    	name = in.nextLine();
        Phno = in.nextLine();
        branch = in.nextLine();
        uni = in.nextLine();
        test_class = in.nextLine();
    }
    public void getDetails() {
    	System.out.println(name + " " + Phno);
    }
    public static void result(String tc) {
        switch(tc){
            case "L1":
                System.out.println("Full Internship and Full Job");
                break;
            case "L2":
                System.out.println("Full Internship and Job on internship");
                break;
            case "L3":
                System.out.println("Full Internship and Job on internship");
                break;
            case "L4":
                System.out.println("Part time Internship of 21 days");
                break;
            case "L5":
                System.out.println("Part time Internship of 21 days");
                break;
            default:
                System.out.println("Wrong input");
                break;
        }
    }
}
