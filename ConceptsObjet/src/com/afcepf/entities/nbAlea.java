package com.afcepf.entities;

public class nbAlea {
	int valeur = 0;
	
	public nbAlea () {
		this.valeur = (int) Math.random()*5;
//		Integer nbAlea = (int) Math.random()*50;
		System.out.println("nbAlea vaut " + this.valeur);
	}
	
	public nbAlea (int nombreMax) {
		Double x = Math.random()*nombreMax;
		this.valeur = (int) Math.round(x);
		System.out.println("Finalement mon alea est : " + Math.round(x));
//		return  (int) Math.round(x);
	}
}
