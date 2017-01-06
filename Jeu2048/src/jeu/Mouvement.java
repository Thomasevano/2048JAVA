package jeu;

public class Mouvement
{

	public int moveDown(int[][] a, int i, int j)
	{
		if (i < 3)
		{
			return a[i + 1][j];
		} 
		else
		{
			return 1;
		}
	}

	public int moveUp(int[][] a, int i, int j)
	{
		if (i > 0)
		{
			return a[i - 1][j];
		} 
		else
		{
			return 1;
		}
	}

	public int moveLeft(int[][] a, int i, int j)
	{
		if (j > 0)
		{
			return a[i][j - 1];
		} 
		else
		{
			return 1;
		}
	}

	public int moveRight(int[][] a, int i, int j)
	{

		if (j < 3)
		{
			return a[i][j + 1];
		} 
		else
		{
			return 1;
		}

	}

}