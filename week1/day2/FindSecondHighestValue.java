package week1.day2;

import java.util.Arrays;

public class FindSecondHighestValue {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7}; //0,1,2,3,4,5
		
		//sort array
		Arrays.sort(data); //2,3,4,6,7,11
		
		int secondLargest = data.length-2;
		System.out.println(secondLargest);
				
		System.out.println(data[secondLargest]);
		
		
		/*
		 * 	int[] newArray = new int[data.length];
		 * for (int i = 0; i < data.length; i++) {
		 * 
		 * newArray[i] = data[i];
		 * 
		 * }
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		

	}

}
