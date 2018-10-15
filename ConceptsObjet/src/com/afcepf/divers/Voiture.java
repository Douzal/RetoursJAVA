package com.afcepf.divers;

/**
 * @author Alexis MASSON
 * 15/10/2018
 */
public class Voiture {

	protected int age=1;
	protected String marque="AldousMobile";
	protected int distParcourue=5;
	
	// CONSTRUCTEURS
	// constructeur vide
	public Voiture () {
//		System.out.println("\n\t---construction d'une voiture - constr vide");
//		System.out.println("\tDescription voiture : " + this.toString());
	}
	
	// constructeur charge
	public Voiture (int age, String brand, int distance) {
//		System.out.println("---\n\tconstruction d'une voiture - constr surchargé");
		this.age = age;
		this.marque = brand;
		this.distParcourue = distance;
//		System.out.println("\tDescription voiture : " + this.toString());
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
				"\tAge : " + this.getAge() + "\n\t"+
				"Marque : " + this.getMarque()+"\n\t"+
				"Distance : " + this.getDistParcourue();
	}
	
	
}
