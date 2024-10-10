package loopsStatement;
import java.util.Scanner;
public class PerfectNum {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
          int i = 1;
          int sum = 0;
		while(i<n)
		{
			if(n%i==0)
			{
				System.out.println(i);
				sum = sum+i;
			}
			i++;
		}
		if(sum==n)
		{
			System.out.println("the number is perfect");
		}
		else
		{
			System.out.println("the number is not perfect");
		}
	}

}
