package com.afcepf.divers;

public class testSimplesComparaison {

	public static void main(String[] args) {
		
		String b = "Bonjour";
		String b2 = new String("Bonjour");

		b2 = "Bonjour";
		System.out.println(b2);

		// test de  b.equals(b2) :
		if(b.equals(b2)) {
			System.out.println("b.equals(b2) : " + b.equals(b2));
		} else {
			System.out.println("not b.equals(b2)...");
		}
		
		// test de b == b2 :
		if(b==b2) {
			System.out.println("b == b2 : " + (b==b2));
		} else {
			System.out.println("not b==b2 : " + (b==b2));
		}
	}
}
