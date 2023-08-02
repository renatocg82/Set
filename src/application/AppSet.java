package application;

import java.util.HashSet;
import java.util.Set;

public class AppSet {

	public static void main(String[] args) {

		Set<String> strSet = new HashSet<>();
		
		strSet.add("TV");
		strSet.add("Notebook");
		strSet.add("Tablet");
		
		System.out.println(strSet.contains("Notebook"));
		
		for(String str : strSet) {
			System.out.println(str);
		}
	}
}
