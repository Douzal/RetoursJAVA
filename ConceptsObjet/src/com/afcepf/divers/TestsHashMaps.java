package com.afcepf.divers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestsHashMaps {

	public static void main(String[] args) {

		
		// declaration d'une hasMap
		HashMap<Integer, String> HM = new HashMap<Integer, String> ();
		for (int i = 0; i < 10; i++) {
			HM.put(i, "Chaine de texte " + (i+1));
//			System.out.println("Element n° " + i + " : " + HM.get(i));
		}
		
//		System.out.println("Taille de ma map : " + HM.size());
		
		// recuperer le KeySet
		Set<Integer> HMKeySet = HM.keySet();
		for (Iterator iterator = HMKeySet.iterator(); iterator.hasNext();) {
			Integer valKS = (Integer) iterator.next();
			System.out.println("Val " + iterator + " : " + valKS);
			System.out.println("\t\tEt valeur adequate : " + HM.get(valKS) + "\n");
			
		}
		
	}

}
