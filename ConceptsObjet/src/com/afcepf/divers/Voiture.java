package com.afcepf.divers;

/**
 * @author Alexis MASSON
 *
 */
public class Voiture {

	protected int age=1;
	protected String marque="AldousMobile";
	protected int distParcourue=5;
	
	// constructeurs
	// constructeur vide
	public Voiture () {
		System.out.println("---construction d'une voiture - constr vide");
		System.out.println("description voiture : " + this.toString());
	}
	
	// constructeur charge
	public Voiture (int age, String brand, int distance) {
		System.out.println("---construction d'une voiture - constr surchargé");
		this.age = age;
		this.marque = brand;
		this.distParcourue = distance;
		System.out.println("description voiture : " + this.toString());
	}
	
	// getter et setters
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public int getDistParcourue() {
		return distParcourue;
	}
	public void setDistParcourue(int distParcourue) {
		this.distParcourue = distParcourue;
	}
	
	@Override
	public String toString() {
		return //super.toString()+
				"Age : " + this.getAge() + "\n"+
				"Marque : " + this.getMarque()+"\n"+
				"Distance : " + this.getDistParcourue();
	}
	
	
}
