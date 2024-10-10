package loopsStatement;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		  int n = s.nextInt();
	   int r;
	   int sum = 0;
		while(n!=0)
		{
			r=  n % 10;
			sum = sum+r;
			n = n/10;
		}
  System.out.println("Sum of digits are "+sum);
	}

}
