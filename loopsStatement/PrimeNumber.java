package loopsStatement;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		  int n = s.nextInt();
		  int p=0;
		  for(int i=2;i<=(n/2);i++)
		  {
			  if(n%i==0)
			  {
				  p = 1;
				  break;
			  }
		  }
       if(p==0)
       {
    	   System.out.println("the number is prime");
       }
       else
       {
    	   System.out.println("the number is not prime");  
       }
	}

}
