package com.afcepf.entities;

import java.util.ArrayList;
import java.util.Random;

public class Voiture 
{
	// ATTRIBUTS :
	private String couleur = "blanche";
	private String marque = "Renault";
	private String modele = "Clio";
	private int puissance = 60;
	private int cylindree = 1000;
	private int vitesse = 0;
	private int niveauEssence = 40;
	private boolean estDemarree = false;
	int probaCrevaison = 1000000;
	
	private ArrayList<Roue> roues = new ArrayList<>();

	// CONSTRUCTEURS :

	// surcharge du contructeur :
	public Voiture()
	{
		for (int i=0; i<4;i++)
		{
			roues.add(new Roue(15, 3.5));
		}
	}
	
	public Voiture(int puissance, int cylindree)
	{
		this();	
		if (puissance > 0)
		{
			this.puissance = puissance;
		}
		
		if (cylindree > 0)
		{
			this.cylindree = cylindree;
		}
	}
	
	// Même nom que la classe
	// PAS de type de retour
	public Voiture(String couleur, String marque, String modele, int puissance, int cylindree)	
	{
		this(puissance, cylindree);
		this.couleur = couleur;
		this.marque = marque;
		this.modele = modele;
	}
	
	
	// METHODES :
 	public void demarrer()
	{
		if (niveauEssence > 0)
		{
			if (! this.estCrevee())
			{
				estDemarree = true;
				System.out.println("*** démarrer : OK");
			}
			else
			{
				System.out.println("*** démarrer : KO - crevaison");
			}
		}
		else
		{
			System.out.println("*** démarrer : KO - plus d'essence");
		}
	}
	
	public void arreter()
	{
		estDemarree = false;
		vitesse = 0;
		System.out.println("*** arreter : OK");
	}
	
	public void accelerer()
	{
		if (estDemarree)
		{
			// gestion de l'essence :
			niveauEssence -= cylindree / puissance / 10;
						
			if (niveauEssence <= 0)
			{
				System.out.println("*** Panne d'essence !!!!");
				niveauEssence = 0;
				arreter();
			}
			
			// gestion des roues :

			Random r = new Random();
			
			for (Roue roue : roues) 
			{
				roue.degonfler(0.1);
				
				if (r.nextInt(probaCrevaison) == 0)
				{
					roue.crever();
				}
			}
			
			if (this.estCrevee())
			{
				this.arreter();
				System.out.println("*** accélérer : KO - crevaison !!!");
			}
			
			if (this.estDemarree)
			{
				// Accélération effective :
				vitesse += (-0.09 * puissance) + (0.014 * cylindree);
				System.out.println("*** accélérer : OK");
			}
		}
		else
		{
			System.out.println("*** accélérer : KO - pas démarrée");
		}
	}
	
	public void freiner()
	{
		if (vitesse > 5)
		{
			vitesse -= 5; // equivaut à : vitesse = vitesse -5;
		}
		else
		{
			vitesse = 0;
		}
		System.out.println("*** freiner : OK");
	}
	
	//GETTER / SETTERS :
	
	public boolean estCrevee()
	{
		for (Roue roue : roues) 
		{
			if (roue.estCrevee())
			{
				return true;
			}
		}
		// je suis sorti de la boucle et je suis toujours dans la méthode, donc aucune roue n'est crevée :
		return false;
	}
	
	public int getVitesse()
	{
		return vitesse;
	}

	public int getNiveauEssence()
	{
		return niveauEssence;
	}

	public String getModele()
	{
		return modele;
	}
	
	public String getMarque()
	{
		return marque;
	}

	
	public boolean estDemarree() {
		return estDemarree;
	}	
	
	
}
