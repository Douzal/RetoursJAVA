package main;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		// modif du MAIN pour tester eGit

		// creation d'un HashSet
		HashSet<Integer> Hash = Main.createHash(11);

		Hash.add(5);
		Iterator i = Hash.iterator();

		while(i.hasNext()) {
//			System.out.println("Element au hasard : " + i);
			System.out.println("\tElement au hasard : " + i.next());
		}
	}

	public static HashSet<Integer> createHash(Integer n) {
		HashSet<Integer> monHash = new HashSet<Integer>();

		for (Integer i=0; i<n; i++) {
			monHash.add(i);
		}

		return monHash;

	}

}
