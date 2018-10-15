package com.afcepf.divers;

import java.util.Scanner;

public class LeveeException {

	public static void main(String[] args)
	{
		int ageDuCapitaine = -1;
		// ceci est un flag :
		boolean estCorrect = false;		
		do
		{
			try 
			{
				ageDuCapitaine = demanderAge();
				estCorrect = true;
			}
			catch (Exception exc) 
			{
				System.out.println("ERREUR : " + exc.getMessage());
			}
		} while(estCorrect == false);
		
		System.out.println("le capitaine a " + ageDuCapitaine + " ans");

	}
	
	
	public static int demanderAge() throws Exception
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Saisissez votre age : ");
		String reponse = scan.nextLine();
		int age;
		
		try
		{
			age = Integer.parseInt(reponse);
		}
		catch (NumberFormatException exc)
		{
			throw new Exception("vous devez entrer une valeur num�rique, cr�tin");
		}
		
		
		if (age < 0 || age > 150)
		{
			// age incoh�rent : je l�ve une exception
			throw new Exception("votre �ge doit �tre compris entre 0 et 130");
		}
		
		System.out.println("Eh bah c'est bien");
		
		return age;
	}
	

}
