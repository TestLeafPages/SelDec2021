package week1.day2;

import java.util.Arrays;
import java.util.Iterator;

public class PrintDuplicateValues {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		Arrays.sort(arr); //11,12,13,14,14,15,16,17,17,18,18
						
		for (int i = 0; i < arr.length-1; i++) {
			
			if(arr[i] == arr[i+1]) {
				System.out.println(arr[i]);
			}
				
		}

	}

}
