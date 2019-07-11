package array;

import java.util.Scanner;

public class ArrayTraversalPrimes
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		boolean[] isprime = new boolean[100];
		for (int i = 0; i < isprime.length; i++)
		{
			isprime[i] = true;
		}
		for (int i = 2; i < isprime.length; i++)
		{
			if (isprime[i])
			{
				for (int j = 2; i * j < isprime.length; j++)
				{
					isprime[i * j] = false;
				}
			}

		}
		for (int i = 0; i < isprime.length; i++)
		{
			if (isprime[i])
			{
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
	}

}
