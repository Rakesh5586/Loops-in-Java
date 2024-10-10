package loopsStatement;
import java.util.Scanner;
public class FibonacciSeriesPro {

	public static void main(String[] args) 
	{ 
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n = s.nextInt();
		int f1 =0;
		int f2 = 1;
		int f3;
		int i = 3;
		do
		{
			f3 = f1+f2;
			System.out.println(f3);
			f1 = f2;
			f2 = f3;
			i++;
		}
		while(i<=n);
		
//using for loop--
		/*int f1 =0;
		int f2 = 1;
		int f3;
		  for(int i=3;i<=n;i++)
		  {
			 f3= f1+f2;
			 System.out.println(f3);
			    f1 = f2;
				f2 = f3;
		  }*/
		//s.close();
	}

}
