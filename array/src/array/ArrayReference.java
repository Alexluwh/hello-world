package array;

import java.util.Scanner;

public class ArrayReference
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int[] a = new int[10];
		a[0] = 5;
		int[] b = a;
		System.out.println(a[0]);
		b[0] = 16;
		System.out.println(b[0]);
		System.out.println(a[0]);
	}
}
