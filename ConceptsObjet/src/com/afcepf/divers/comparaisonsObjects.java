package com.afcepf.divers;

import javax.swing.JOptionPane;
import com.afcepf.divers.Voiture;

public class comparaisonsObjects {

	// on veut comprendre les differences entre == et .equals()
	// il faut tester sur les types primitifs : integer, double, string, boolean
	public static void main(String[] args) {
		// test sur des strings
		
		System.out.println("\t--COMPARAISON DE STRING---");
		
		// CAS 1 - on rentre la même valeur (en boites de dialogue)
		System.out.println("\nCAS 1 - on rentre la même valeur (en boites de dialogue)");
		String s1 = JOptionPane.showInputDialog("String 1");
		String s2 = JOptionPane.showInputDialog("String 2");
		
		testEqualsString(s1, s2);
		
		// CAS 2
		System.out.println("\nCAS 2 - s1 = s2 puis test");
		s1 = s2;
		testEqualsString(s1, s2);
		
		// CAS 3 : la casse n'est pas la même mais même contenu otherwise
		System.out.println("\nCAS 3 - s1 et s2 sont même textes mais avec differentes casses");
		s1 = "txt";
		s2 = "tXt";
		testEqualsString(s1, s2);
		
		System.out.println("\n\t--COMPARAISON DE INTEGERS---");
		// test sur des integers
		int n1 = Integer.valueOf(JOptionPane.showInputDialog("Choix entier n°1 ?"));
		int n2 = Integer.valueOf(JOptionPane.showInputDialog("Choix d\'un entier ?"));
		n1 = n2;
		testEqualsInteger(n1, n2);
		
		
		System.out.println("\n\t--COMPARAISON DE OBJETS---");
		System.out.println("Cas 1 - Comparaison de deux nouvelles instances aux parametres identiques");
		Voiture v1 = new Voiture();
		Voiture v2 = new Voiture();
		compareObject(v1,v2);
		
		System.out.println("Cas 2 - V1 = V2 puis test");
		v1 = v2;
		compareObject(v1,v2);
	}
	
	// methode de tests des string
	public static void testEqualsString (String s, String s2) {
		System.out.println("Equals fonctionne  ? " + s.equals(s2));
		System.out.println("== fonctionne  ? " + (s == s2));
	}
	
	// methode de tests des integer
	public static void testEqualsInteger(int a, int b ) {
		System.out.println("Integer.compare fonctionne  ? " + Integer.compare(a, b));
		System.out.println("== fonctionne  ? " + (a==b));
	}
	
	// methode de tests sur des Objets
	public static void compareObject(Voiture voit, Voiture auto) {
		System.out.println("Equals fonctionne  ? " + voit.equals(auto));
		System.out.println("== fonctionne  ? " + (voit==auto));
	}
	
}
