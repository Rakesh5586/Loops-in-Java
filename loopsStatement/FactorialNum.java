package loopsStatement;
import java.util.Scanner;
public class FactorialNum {

	public static void main(String[] args) 
	{
		int i = 1;
		int n= 5;
		int fact = 1;
		while(i<=5)
		{
			fact = fact * i;
			i++;
		}
      System.out.println(fact);
	
		
//Another way of finding factorial
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int f = s.nextInt();
		int g= i;
		int fct = 1;
		while(i>=1)
		{
			fct = fct * i;
			i--;
		}
		 System.out.println(n+"!="+fct);
	}
}
