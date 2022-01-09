package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
//		Declare a String as PayPal India
		String s = "PayPal India";
		s = s.replace(" ", "");

//		Convert it into a character array
		char[] chArray = s.toCharArray();

//		Declare a Set as charSet for Character
		Set<Character> charSet = new LinkedHashSet<Character>();

//		Declare a Set as dupCharSet for duplicate Character
		Set<Character> dupSet = new LinkedHashSet<Character>();
		
//		Iterate character array and add it into charSet
//		if the character is already in the charSet then, add it to the dupCharSet
		for (char eachChar : chArray) {
			boolean add = charSet.add(eachChar);
			if(!add) {
				dupSet.add(eachChar);
			}
			
		}
		System.out.println(dupSet);
		
//		Check the dupCharSet elements and remove those in the charSet
		charSet.removeAll(dupSet);
		
		System.out.println(charSet);
		


//		Iterate using charSet

//		Check the iterator variable isn't equals to an empty space

//		print each character for charSet
	}
}
