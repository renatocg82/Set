package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class AppSet {

	public static void main(String[] args) {

		Set<String> strSet = new HashSet<>();

		Set<String> strSet2 = new TreeSet<>();

		Set<String> strSet3 = new LinkedHashSet<>();

		strSet.add("TV");
		strSet.add("Tablet");
		strSet.add("Notebook");

		strSet2.add("Television");
		strSet2.add("iPad");
		strSet2.add("PC");
		strSet2.add("Minifigures");

		strSet3.add("Lego");
		strSet3.add("Phone");
		strSet3.add("Computer");

		System.out.println(strSet.contains("Notebook"));
		System.out.println();

		for (String str : strSet) {
			System.out.println(str);
		}
		// HashSet não garante a ordem dos elementos;
		System.out.println("-------------");

		for (String str : strSet2) {
			System.out.println(str);
		}
		/*
		 * TreeSet garante ordena o conjunto, lembrando que letras maiúsculas são
		 * " menores" que minúsculas.
		 */

		System.out.println("-------------");

		for (String str : strSet3) {
			System.out.println(str);
		}
		/*
		 * LinkedHashSet mantém a ordem que os elementos foram inseridos.
		 */

		System.out.println("-------------");

		strSet.remove("Tablet");

		for (String str : strSet) {
			System.out.println(str);
		}

		System.out.println("-------------");

		strSet.add("Tablet");
		for (String str : strSet) {
			System.out.println(str);
		}

		System.out.println("-------------");

		strSet.removeIf(x -> x.length() >= 3);

		for (String str : strSet) {
			System.out.println(str);
		}

		System.out.println("-------------");

		strSet.add("Notebook");
		strSet.add("Tablet");

		for (String str : strSet) {
			System.out.println(str);
		}

		System.out.println("-------------");

		strSet.removeIf(x -> x.charAt(0) == 'T');

		for (String str : strSet) {
			System.out.println(str);
		}
		System.out.println("_____________________");

		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

		// Union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);

		// Intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);

		// Difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
	}
}
