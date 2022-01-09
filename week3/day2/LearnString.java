package week3.day2;

public class LearnString {
	public static void main(String[] args) {
		// String Literal
		String s = "Welcome to Java session";
		
		String s2 = new String("Welcome");
		char[] ch = new char[7];
		ch[0] = 'W';
		
		// Validate if both String have same memory
		
		System.out.println(s==s2);
		
		// Compare the Value
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		
		// Find the length of String
		int length = s.length();
		System.out.println(length);
		
		// convert String to Character array
		char[] charArray = s.toCharArray();
		System.out.println(charArray[length-1]);
		
		// get specific character
		char charAt = s.charAt(3);
		System.out.println(charAt);
		
		// get the index of specific character
		int indexOf = s.indexOf('c');
		System.out.println(indexOf);
		
		// How to get part of String
		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 5));
		
		// trim the String
		System.out.println(s.trim());
		
		// Convert String to Uppercase
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		// Split words in String
		String[] split = s.split(" ");
		System.out.println(split[1]);
		
		// How to replace something in String
		System.out.println(s.replace(" ", ""));
	}
}
