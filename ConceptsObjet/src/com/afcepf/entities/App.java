package com.afcepf.entities;

import java.lang.reflect.Array;
import java.nio.channels.AcceptPendingException;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class App {
	// point d'entree du programme
	public static void main(String[] args) 
	{
		// launch en dessous.
//		testCollection();
		
		int nb = Integer.parseInt(JOptionPane.showInputDialog("combien de tirages ?"));
		int moy=0;
		int count=0;
		int compt0=0;
		int compt50=0;
		int compt100=0;
		
		
		for (int i = 0; i < nb; i++) {
//			System.out.println("Tirage n°" + (i+1) + "\n" + new nbAlea(100) + "\n---\n");
			nbAlea rndm = new nbAlea(100);
			moy = moy + rndm.valeur;
			count++;
			
			switch (rndm.valeur) {
			case 0:
				compt0++;
				break;
			case 50:
				compt50++;
				break;
			case 100:
				compt100++;
				break;

			default:
				break;
			}
		}
		
		System.out.println("\n\n\nMoyenne des " + (count+1) + " lancers : " + moy/(count+1));
		
		int[] Stats = {compt0, compt50, compt100};
		
		for(int i =5;i<8;i++) {
			System.out.println("\n\n\tStat : " + Stats[i-5]);
		}
	}	
	
	public static void testCollection()
	{
		// Creation d'un dictionnaire :
		// cle : immatriculation (String) valeur : Voiture
		HashMap<String, Voiture> garage = new HashMap<>();
		
		// ajout d'un element : methode put
		garage.put("CZ 600 FG", new Voiture("Violet", "Renault", "Fuego", 200, 1600));
		garage.put("AA 452 XS", new Voiture("Vert", "Citroen", "BX", 150, 1500));
		garage.put("RT 678 EZ", new Voiture("Bleu vif", "Fiat", "Multipla", 180, 1000));
		
		Voiture v = garage.get("AA 452 XS");
		System.out.println(v.getModele());
		
		v = garage.get("lkmlk mo mk");
		System.out.println(v.getModele());

	}
	
	public static void tester(Voiture v)
	{
		System.out.println("--------------------------------------------\n");
		System.out.println("\tTEST DE LA VOITURE " + v.getMarque() + " " + v.getModele() + "\n");
		System.out.println("--------------------------------------------");

		
		v.demarrer();

		for (int i = 0; i < 5; i++) {
			v.accelerer();
			//v.freiner();
			
			System.out.println("vitesse : " + v.getVitesse() + " km/h");
			System.out.println("essence : " + v.getNiveauEssence() + " l.");
		}
			
		v.arreter();
	}

}
