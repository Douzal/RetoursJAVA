package com.afcepf.divers;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Collections {

	public static void main(String[] args) {

		HashMap<String, Double> contenances = new HashMap<String, Double>();
			contenances.put("litre", 100.0);
			contenances.put("magnum", 150d);
			contenances.put("nabuchodonosaur", 300.0);
			contenances.put("hectolitre", 10000.0);
			contenances.put("Tonneaux", 600d);
		System.out.println(contenances.get("magnum"));

		System.out.println("--- START --- Test de l\'iteration");

		// declaration d'un myHashSet pour test de l'iterateur
		HashSet<String> myHashSet = new HashSet<String>();
		myHashSet.add("toto");
		myHashSet.add("maillot de couille");
		myHashSet.add("String de bite");
		myHashSet.add("Foutrine du patron - ind4");
		
		
			for(Iterator it = myHashSet.iterator();it.hasNext();) {
					System.out.println("Val : " + it.next());
			}
			
		System.out.println("--- END --- Test de l\'iteration");
		
		
		
		JOptionPane Option = new JOptionPane("Quoi ?", 1);
		String ChoixContenance = Option.showInputDialog("Quel ?");
		if(contenances.get(ChoixContenance)==null) {
			System.out.println("Vous faites de la merde.");
		} else {
			System.out.println("Contenance de " + ChoixContenance + " : " +
					contenances.get(ChoixContenance));
		}

		JOptionPane.showConfirmDialog(null, contenances.get(ChoixContenance));
	}

}
