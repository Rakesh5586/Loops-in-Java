package loopsStatement;
import java.util.Scanner;
public class CountDigits {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		  int n = s.nextInt();
		  int cnt = 0;
		 while(n!=0)
		 {
			 cnt = cnt+1;
			 n = n/10;
		 }
      System.out.println("Count of the number is "+cnt);
	}

}
