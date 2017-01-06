package jeu;

import java.util.Random;
import java.util.Scanner;

public class Affichage
{
	Scanner scr = new Scanner(System.in);

	public void doPrintArray(int[][] a)
	{

		int count = 0;
		Random randomNum = new Random();

		String s = "22242224222";
		char num = s.charAt(randomNum.nextInt(s.length()));
		String numString = String.valueOf(num);

		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++)
				if (a[i][j] == 0)
					count++;

		String[] storeFreeBlocks = new String[count];
		int localcounter = 0;
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				if (a[i][j] == 0)
				{
					storeFreeBlocks[localcounter] = String.valueOf(i) + "," + String.valueOf(j);
					localcounter++;
				}
			}
		}

		String getFreeBlock = storeFreeBlocks[randomNum.nextInt(storeFreeBlocks.length)];
		String[] getRowCol = getFreeBlock.split(",");
		int p = Integer.parseInt(getRowCol[0]);
		int q = Integer.parseInt(getRowCol[1]);
		a[p][q] = Integer.parseInt(numString);

		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++)
				System.out.print(a[i][j] + "    ");
			System.out.println();
		}

		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				if (a[i][j] == 2048)
				{
					System.out.println("Vous avez gagner");
					System.exit(0);
				}
				// if()
				// {
				// System.out.println("Vous avez perdu");
				// System.out.println("Appuyez sur R pour réessayer");
				// }
			}
		}

		int choice = Integer.parseInt(scr.nextLine());
		Deplacement d = new Deplacement(choice, a);
	}

}