package jeu;

public class Deplacement
{

	int move;

	Deplacement(int choice, int[][] a)
	{
		move = choice;

		Mouvement m = new Mouvement();

		switch (move)
		{

		case 2:
			for (int j = 0; j < 4; j++)
			{
				for (int i = 3; i >= 0; i--)
				{
					if (a[i][j] != 0)
					{
						int tempi = i;
						while (m.moveDown(a, tempi, j) == 0)
						{
							tempi++;
						}
						if (m.moveDown(a, tempi, j) != 0 && m.moveDown(a, tempi, j) == a[i][j])
						{
							a[tempi + 1][j] += a[i][j];
							a[i][j] = 0;
						}
						if (tempi != i)
						{
							a[tempi][j] = a[i][j];
							a[i][j] = 0;
						}
					}
				}
			}
			break;

		case 8:
			for (int j = 0; j < 4; j++)
			{
				for (int i = 0; i <= 3; i++)
				{
					if (a[i][j] != 0)
					{
						int tempi = i;
						while (m.moveUp(a, tempi, j) == 0)
						{
							tempi--;
						}
						if (m.moveUp(a, tempi, j) != 0 && m.moveUp(a, tempi, j) == a[i][j])
						{
							a[tempi - 1][j] += a[i][j];
							a[i][j] = 0;
						}
						if (tempi != i)
						{
							a[tempi][j] = a[i][j];
							a[i][j] = 0;
						}
					}
				}
			}
			break;

		case 4:
			for (int i = 0; i < 4; i++)
			{
				for (int j = 0; j <= 3; j++)
				{
					if (a[i][j] != 0)
					{
						int tempj = j;
						while (m.moveLeft(a, i, tempj) == 0)
						{
							tempj--;
						}
						if (m.moveLeft(a, i, tempj) != 0 && m.moveLeft(a, i, tempj) == a[i][j])
						{
							a[i][tempj - 1] += a[i][j];
							a[i][j] = 0;
						}
						if (tempj != j)
						{
							a[i][tempj] = a[i][j];
							a[i][j] = 0;
						}
					}
				}
			}
			break;

		case 6:
			for (int i = 0; i < 4; i++)
			{
				for (int j = 3; j >= 0; j--)
				{
					if (a[i][j] != 0)
					{
						int tempj = j;
						while (m.moveRight(a, i, tempj) == 0)
						{
							tempj++;
						}
						if (m.moveRight(a, i, tempj) != 0 && m.moveRight(a, i, tempj) == a[i][j])
						{
							a[i][tempj + 1] += a[i][j];
							a[i][j] = 0;
						}
						if (tempj != j)
						{
							a[i][tempj] = a[i][j];
							a[i][j] = 0;
						}
					}
				}
			}
			break;
			
		default:
			System.out.println("Mauvaise touche");

		}
	}
}