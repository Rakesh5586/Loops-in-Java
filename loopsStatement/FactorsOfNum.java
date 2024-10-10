package loopsStatement;

import java.util.Scanner;
public class FactorsOfNum
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		int i = 1;
		System.out.println("Factor is-> ");
		while(i<=n)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
			i++;
		}

	}

}
