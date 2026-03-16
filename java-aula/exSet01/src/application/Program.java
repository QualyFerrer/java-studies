package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		/*
		 * Set<String> set = new HashSet<>(); /////Hash set é o mais rápido porem n
		 * garante a ordem dos elementos
		 * 
		 * set.add("Tv"); set.add("Notebook"); set.add("Tablet");
		 * 
		 * System.out.println(set.contains("Notebook"));
		 * 
		 * for (String p : set) { System.out.println(p); }
		 */

		/*
		 * Set<String> set = new TreeSet<>(); // TreeSet é um pouco mais lento porém
		 * garante a ordem em que os elemtnos // foram adcionados
		 * 
		 * set.add("Tv"); set.add("Notebook"); set.add("Tablet");
		 * 
		 * System.out.println(set.contains("Notebook"));
		 * 
		 * for (String p : set) { System.out.println(p); }
		 */

		/*Set<String> set = new LinkedHashSet<>(); // LinkedHashSet garante a ordem em que os elementos foram adcionados

		set.add("Tv");
		set.add("Notebook");
		set.add("Tablet");

		System.out.println(set.contains("Notebook"));

		for (String p : set) {
			System.out.println(p);
		}*/
		
		Set<String> set = new LinkedHashSet<>(); // LinkedHashSet garante a ordem em que os elementos foram adcionados

		set.add("Tv");
		set.add("Notebook");
		set.add("Tablet");

		set.removeIf(x -> x.charAt(0) == 'T');
		
		for (String p : set) {
			System.out.println(p);
		}
	}
}