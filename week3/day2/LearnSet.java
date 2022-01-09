package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
	//	List<String> l = new ArrayList<String>();
		Set<String> names = new LinkedHashSet<String>();
		
		boolean isPresent = names.add("Haja");
		names.add("Babu");
		names.add("Hari");
		boolean isDuplicate = names.add("Haja");
		
		System.out.println(isPresent);
		System.out.println(isDuplicate);
		
		System.out.println(names);
		
		// Set doesn't have get()
		
		List<String> list = new ArrayList<String>(names);
		System.out.println(list);
		
		System.out.println(list.get(0));
		
		
	}
}
