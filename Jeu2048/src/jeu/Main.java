package jeu;

import java.util.Random;

public class Main
{

	public static int[][] grille = new int[][]
	{
			{ 0, 0, 0, 0 },
			{ 0, 0, 0, 0 },
			{ 0, 0, 0, 0 },
			{ 0, 0, 0, 0 }		
	};

	public static void main(String args[])
	{
		Affichage afficher = new Affichage();
		boolean start = true;
		String appuyer = "";
        
//		System.out.println("Appuyez sur R pour réessayer");
		System.out.println("Appuyer sur 2 - 4 - 6 - 8 pour déplacer en bas - gauche - droite - haut");

		while (start)
		{
			afficher.doPrintArray(grille);
		}

		if (appuyer.equals("r"))
		{
			afficher.doPrintArray(grille);
		}

	}
}