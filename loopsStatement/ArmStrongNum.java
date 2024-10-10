package loopsStatement;
import java.util.Scanner;
public class ArmStrongNum {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		  int n = s.nextInt();
		  int temp = n;
         int r,sum = 0;
         while(n!=0)
         {
        	 r = n%10;
        	 sum = sum+(r*r*r);
        	 n= n/10;
         }
        if(temp==sum)
        {
        	System.out.println("number is Armstrong");
        }
        else
        {
        	System.out.println("number is not Armstrong");
        }
	}
	
	//For All Armstrong numbers in between range
	
//	System.out.println("Enter the number");
//	int n = sc.nextInt();
//	int r,x=n,y=n,sm,m;
//	int cnt=0;
//	while(n!=0)
//	{
//		cnt=cnt+1;
//		n=n/10;
//	}
//	sm=0;
//	while(x!=0)
//	{
//		r=x%10;
//		m=1;
//		for(int i=1;i<=cnt;i++)
//		{
//			m=m*r;
//		}
//		sm=sm+m;
//		x=x/10;
//	}
//
//	if(sm==y)
//	{
//		System.out.println("THE NUMBER "+y+" is Armstrong");
//	}
//	else
//	{
//		System.out.println("THE NUMBER "+y+" is  Not Armstrong");
//	}

}
