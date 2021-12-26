package week1.day2;

import java.util.Arrays;

/*
 * Index starts with 0
 * length -> to find the number of data in an array
 * array[index] -> to get single data from an array
 * Index of last data -> length-1
 * Arrays.sort(arrayName) -> to sort the data in an array
 * Size of array -> Declared at the creation of array
 * Size of array -> fixed; we can not able to change the size at runtime
 */
public class LearnArray {

	public static void main(String[] args) {
		//int[] -> int 1D array 
		//String[] -> String array
		//data saved with indices
		int[] nums = {10,50,20,80,40,60,70}; //0,1,2,3,4,5,6
		
		//Size of the array should be declared at the starting
		/*
		 * double[] nums = new double[3]; nums[0] = 2342.231; nums[1] = 4234.54543;
		 */
	//	nums[2] = 40;
				
		
		//System.out.println(nums.length); //total number = 7
		
	//	int lastIndex = nums.length -1; // lastIndex = 6
		
	//	System.out.println(nums[lastIndex]);
		
		//to sort the data in an array
		Arrays.sort(nums); //10,20,40,50,60,70,80
		
		//to print all the data 0,1,2,3,4,5,6
		for (int i = nums.length-1; i >= 0 ; i--) { 
			System.out.print(nums[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
