package hello;

import java.util.*;
public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring strings
		//in this if we create another variable 
		//say name2 = "Shobhit" with same value
		//then name2 will point to the same address
		//new string won't be created
//		String name = "Shobhit";
		//or 
		//in this two objects are created
		//one in the heap and one in the method area
		//but reference will be only to the heap
//		String name1 = new String("Shobhit");
		//strings are immutable in java
		//changing the value of name1 will create a
		//new location where "Agrawal" will be stored
		//and name1 will contain the address of "Agrawal"
		//or it will point to the address of "Agrawal"
//		name1 = "Agrawal";
		
		String name = "Shobhit";
		//length of string
		System.out.println(name.length());
		
		//concatenating two strings
		String name1 = " Agrawal";
		System.out.println(name.concat(name1));
		
		//comparing two strings
		//returns true or false 
		String name2 = "Shobhit";
		if(name.equals(name2)) {
			System.out.println("Equal");
			System.out.println(name.equals(name2));
		}else {
			System.out.println("Not equal");
			System.out.println(name.equals(name2));
		}
		
		//compareTo
		//returns 0 when name = name2
		//return >0 when name>name2
		//returns <0 when name<name2
		System.out.println(name.compareTo(name2)); 
		
		//substring 
		//name.substring(starting index,ending index-1)
		//if name = "shobhit" - name.substring(1,4) gives hob
		System.out.println(name.substring(1,4));
		
		//trimming a string
		//removes white spaces
		String s = " shobhit  ";
		System.out.println(s.trim());
		
		//replacing a character
		//replaces s with r
		System.out.println(name.replace('s','r'));
		
		//searching a string
		//gives the starting index of that particular word
		//in this case it returns 15 - starting index of java
		//if not found it will return -1
		String sentence = "Shobhit learns java";
		String search = "java";
		System.out.println(sentence.indexOf(search));
		
		//converting cases
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
		//checking for an empty string
		String emp = "";
		//return true of false
		if(emp.isEmpty()) {
			System.out.println("Empty");
		}else {
			System.out.println("Not empty");
		}
		
		//converting a character array to a string
		char a[] = {'a','b','c'};
		String s1 = new String(a);
		System.out.println(s1);
		
		//converting a string to character array
		String test = "Programming";
		char c[] = test.toCharArray();
		for(char k:c) {
			System.out.println(k);
		}
		
		//contains method
		//searched the sequence of characters in a string.
		//return true if sequence of char values are found
		//otherwise returns false
		String t = "We are learning java";
		System.out.println(t.contains("ing")); //returns true
		System.out.println(t.contains("gn")); //returns false
		
		//splitting a string
		//splitting a string with space
		String res[] = t.split(" ");
		for(String k:res) {
			System.out.println(k);
		}
		
	}

}
