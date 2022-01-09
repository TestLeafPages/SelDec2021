package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
//		Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};

		// Convert Array to List
		List<String> companies = Arrays.asList(input);
//		get the length of the array	
		int size = companies.size();
		int length = input.length;
//		sort the array
		Collections.sort(companies);
		Arrays.sort(input);

//		Iterate it in the reverse order
//		print the array
		for (int i = size-1; i >=0; i--) {
			System.out.println(companies.get(i));
		}
		
		for (int i = length-1; i >=0; i--) {
			System.out.println(input[i]);
		}

		
//		Required Output: Wipro, HCL , CTS, Aspire Systems
	}
}
