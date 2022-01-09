package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		// Add values to List
		list.add("Haja");
		list.add("Hari");
		list.add("Babu");
		list.add("Haja");
		System.out.println(list);
		
		// Find size of list
		int size = list.size();
		System.out.println(size);
		
		// Retrive a data from index
		String name = list.get(1);
		System.out.println(name);
		
		// Remove data from list
		list.remove(size-1);
		System.out.println(list);
		
		// Verify if a data is present in list
		boolean isPresent = list.contains("Babu");
		System.out.println(isPresent);
		
		// Remove all data from list
	//	list.clear();
		System.out.println(list);
		
		// Confirm if list is Empty
		boolean empty = list.isEmpty();
		System.out.println(empty);
		
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		
	}
}

