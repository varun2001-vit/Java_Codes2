package hello;

public class ternary_op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 25;
//		int res = 0;
//		res = a>15 ? 10:20;
//		System.out.println(res);
//		int mark = 45;
//		String result;
//		
//		result = mark>=40 ? "passed":"failed";
//		System.out.println(result);
		
//		int mark = 45;
//		int result = 0;
//		
//		result = mark>=40 ? mark+10 :mark+20;
//		System.out.println(result);
		
		//nested ternary operator
		
		int mark = 68;
		char res;
		
		res = mark>=80 ? 'A':mark>=60 && mark<80 ? 'B' : 'C';
		System.out.println(res);
		
	}

}
