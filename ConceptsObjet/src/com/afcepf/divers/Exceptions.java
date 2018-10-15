package com.afcepf.divers;

import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args)
	{
		int x = 84;
		
		System.out.println("Saisissez un entier : ");
		
		Scanner s = new Scanner(System.in);
		String reponse = s.nextLine();
		
		int resultat = 0;
		
		// conversion de String vers un autre type : PARSE
		// in : "42" out : 42
		try
		{
			int y = Integer.parseInt(reponse);		
			int y2 = Integer.parseInt(reponse);
			resultat = x / y;
			int[] tab = new int[2];
			tab[3] = y;
		}
		catch(ArithmeticException exc)
		{
			resultat = Integer.MAX_VALUE;
			System.out.println("Vous ne devriez pas mettre 0");
		}
		catch(NumberFormatException exc)
		{
			resultat = 0;
			System.out.println("On vous a demande un nombre entier, donc sans virgule, cretin");
		}
		catch(Exception exc)
		{
			System.out.println("Une erreur s'est produite...");
		}
		finally
		{
			System.out.println("jusque la, rien de grave");
		}
		// cette ligne s'execute ?
		System.out.println("Resultat final : " + resultat);
	}
	
}
