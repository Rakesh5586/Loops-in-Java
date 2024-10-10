package loopsStatement;
import java.util.Scanner;
public class PalindromeNum {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		int r,rev= 0,t=n;
		for(int i =1;n!=0;n=n/10)
		{
			r= n%10;
			rev = (rev*10)+r;
		}
		if(t==rev)
		{
			System.out.println("the number is palindrome");
		}
		else
		{
			System.out.println("the number is not palindrome");
		}
	}

}
