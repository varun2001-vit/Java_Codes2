package hello;

import java.util.*;
public class products_configuration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of products");
		n = input.nextInt();
		product p[] = new product[n];
		for(int i=0;i<n;i++) {
			p[i] = new product();
		}
		for(int i=0;i<n;i++) {
			p[i].get_details();
		}
		String s;
		System.out.println("Enter the company name");
		s = input.next();
		display_all_products(p, s);
		int pr;
		System.out.println("Enter the price");
		pr = input.nextInt();
		display_price(p, pr);
		System.out.println("Enter the lower year");
		String y1 = input.next();
		System.out.println("Enter the upper year");
		String y2 = input.next();
		display_year(p, y1, y2);
		System.out.println("Enter a string");
		String s1 = input.next();
		display_name(p, s1);
	}
	
	public static void display_all_products(product p[],String s) {
		System.out.println("All the products that are manufactured by "+ s);
		for(int i=0;i<p.length;i++) {
			if(p[i].company.compareTo(s)==0) {
				System.out.println(p[i].show_details());
			}
		}
	}
	
	public static void display_price(product p[],int pr) {
		System.out.println("The product whose prices are greater than " + pr);
		for(int i=0;i<p.length;i++) {
			if(p[i].price == pr) {
				System.out.println(p[i].show_details());
			}
		}
	}
	
	public static void display_name(product p[],String s) {
		System.out.println("The products that have " + s + " in their name");
		for(int i=0;i<p.length;i++) {
			if(p[i].product_name.contains(s)) {
				System.out.println(p[i].show_details());
			}
		}
	}
	
	public static void display_year(product p[],String m,String n) {
		System.out.println("The products that are manufactured between " + m + " and" + n);
		for(int i=0;i<p.length;i++) {
			int l = (p[i].manufacture_date.length());
			if((((p[i].manufacture_date.substring(l-4)).compareTo(m))>=0) && (((p[i].manufacture_date.substring(l-4)).compareTo(n))<=0) ) {
				System.out.println(p[i].show_details());
			}
		}
	}

}

class product{
	String product_id;
	String product_name;
	int serial_number;
	String company;
	String manufacture_date;
	int price;
	
	Scanner input1 = new Scanner(System.in);
	Scanner input2 = new Scanner(System.in);
	
	public void get_details() {
		System.out.println("Enter the Product ID");
		product_id = input1.nextLine();
		System.out.println("Enter the Product name");
		product_name = input1.nextLine();
		System.out.println("Enter the serial number");
		serial_number = input2.nextInt();
		System.out.println("Enter the company");
		company = input1.nextLine();
		System.out.println("Enter the date of manufacture");
		manufacture_date = input1.nextLine();
		System.out.println("Enter the price");
		price = input2.nextInt();
	}
	
	public String show_details() {
		return(product_id + " " + product_name + " " + serial_number + " " + company + " " + manufacture_date + " " + price);
	}
	
}