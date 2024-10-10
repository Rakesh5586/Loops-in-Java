package loopsStatement;
import java.util.Scanner;
public class LargestNumFor {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n,lg=0;
		for(int i=1;i<=10;i++)
		{
			System.out.println("enter numbers "+i);
			 n = s.nextInt();
			 if(i==1)
			 {
				 lg = n;
			 }
			 if(n>lg)
			 {
				 lg = n;
			 }
			
		} 
		System.out.println("the largest number is "+lg);
	}

}
