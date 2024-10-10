package loopsStatement;
import java.util.Scanner;
public class SmOfDigSingleVal {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		 int n= s.nextInt();
        int r, sum= 0;
        for(int i=1;n!=0||sum>9;n=n/10)
        {
        	if(n==0)
        	{
        		n= sum;
        		sum =0;
        	}
        	r = n%10;
        	sum = sum+r;
        }
        System.out.println(sum);
	}

}
