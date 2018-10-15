package com.afcepf.entities;

public class Roue {

	private int diametre;
	private double pressionCourante;
	private boolean estCrevee;
	private double pressionMax;
	
	public Roue(int diametre, double pressionMax) 
	{
		this.diametre = diametre;
		this.pressionMax = pressionMax;
		this.regonfler();
	}
	
	public void degonfler(double pression)
	{
		this.pressionCourante -= pression;
		
		if (pressionCourante < 0)
		{
			pressionCourante = 0;
		}
	}
	
	public void regonfler()
	{
		this.pressionCourante = pressionMax;
	}
	
	public void crever()
	{
		this.estCrevee = true;
		this.pressionCourante = 0;
	}

	public void reparer()
	{
		this.estCrevee = false;
		this.regonfler();
	}
	
	public int getDiametre() {
		return diametre;
	}

	public void setDiametre(int diametre) {
		this.diametre = diametre;
	}

	public double getPression() {
		return pressionCourante;
	}

	public boolean estCrevee() {
		return estCrevee;
	}
	
}
