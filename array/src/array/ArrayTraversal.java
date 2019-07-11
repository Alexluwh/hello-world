package array;

public class ArrayTraversal
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] ns =
		{ 1, 4, 9, 16, 25 };
		for (int i = 0; i < ns.length; i++)
		{
			int n = ns[i];
			System.out.println(n);
		}
		for (int n : ns)
		{
			System.out.println(n);
		}
	}

}
