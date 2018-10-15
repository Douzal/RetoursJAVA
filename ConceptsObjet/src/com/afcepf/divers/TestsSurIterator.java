package com.afcepf.divers;

import java.util.ArrayList;
import java.util.Iterator;

public class TestsSurIterator {

	public static void main(String[] args) {
		
		// déclaration d'une liste
		String str="";
		ArrayList<String> myList = new ArrayList<String>();
		for(Integer i = 0;i<10; i++) {
			str = String.valueOf("100" + i); // on passe les int en string
			myList.add(str);
		}
		
		System.out.println("Taille de ma liste : " + myList.size());	
		

		// FACON 1 - D'utiliser les iterateurs
		Iterator<String> iter = myList.iterator();		
		while(iter.hasNext()) {
			System.out.println("---val : " + iter.next());
		}
		
		// FACON 2 - D'utiliser les iterateurs
		for(Iterator<String> it = myList.iterator(); it.hasNext(); ) {
			System.out.println("---val : " + it.next());
		}
	}
}
