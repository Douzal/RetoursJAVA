package com.afcepf.entities;

import java.util.ArrayList;

public class DemoCollections {

	public static void main(String[] args)
	{
		// cr�ation d'une collection :
		ArrayList<Voiture> cars = new ArrayList<>();
		
		cars.add(new Voiture(new nbAlea().valeur, new nbAlea().valeur));
		cars.add(new Voiture(new nbAlea().valeur, new nbAlea().valeur));
		cars.add(new Voiture(new nbAlea().valeur, new nbAlea().valeur));
		cars.add(new Voiture(new nbAlea().valeur, new nbAlea().valeur));
		cars.add(new Voiture(new nbAlea().valeur, new nbAlea().valeur));
		cars.add(new Voiture(new nbAlea().valeur, new nbAlea().valeur));
		cars.add(new Voiture(new nbAlea().valeur, new nbAlea().valeur));
		cars.add(new Voiture(new nbAlea().valeur, new nbAlea().valeur));
		
		/*
		for(int i = 0; i < cars.size(); i++)
		{
			Voiture car = cars.get(i);
			System.out.println(car.getModele());
		}
		*/
		
		ArrayList<Voiture> listeFiltree = new ArrayList<>();
		
		// foreach
		for(Voiture v : cars)
		{
			System.out.println(v.getModele());
		}
		
	}
	
}
