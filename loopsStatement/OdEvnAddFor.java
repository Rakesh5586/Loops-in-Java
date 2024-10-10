package loopsStatement;
import java.util.Scanner;
public class OdEvnAddFor {
//First method---
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		 int n= s.nextInt();
		 int pro=1,sum = 0,r;
        for(int i=1;n!=0;n=n/10)
        {
        	r= n%10;
        	if(n%2==0)
        	{
        		sum = sum+r;
        	}
        	else
        	{
        		pro = pro*r;
        	}
        }
        System.out.println(pro+" "+sum+"\nThe addition of both of them is "+(pro+sum));
	}
//Second method--
	{
		int n=1234,c=1,po=1,se=0;
		while(n!=0)
		{
			if(c%2==0)
			{
				 po=po*(n%10);  //4*1*4=16
			}
			else
			{
				se=se+(n%10);   // 5+5=10
			}
			n=n/10;
			c++;
		}
		System.out.println(po+" "+se);
}

}

