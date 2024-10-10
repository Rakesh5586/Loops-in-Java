package loopsStatement;
import java.util.Scanner;
public class SceondLrgNum {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int max=0,max2=0;
		for(int i=1;i<=3;i++)
		{
		System.out.println("enter the number "+i);
		 int num=s.nextInt();
		  if(num>max)	
		{
			max2=max;
			max=num;
		}
		else if(num>max2)
		{
			max2=num;
		}
	}
		System.out.println("Largest number:"+max);
		System.out.println("Second largest number"+max2);
	}
}
