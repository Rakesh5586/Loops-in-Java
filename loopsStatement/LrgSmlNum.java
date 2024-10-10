package loopsStatement;
import java.util.Scanner;
public class LrgSmlNum {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		 int lg=0,sml=0;
		for(int i=1;i<=3;i++)
		{
			System.out.println("enter the number "+i);
			 int num=s.nextInt();
			 if(i==1)
					sml=num;
			 if(num>lg)
			 {
				 lg=num;
			 }
			 else if(num<sml)
			 {
				 sml=num;
			 }
        }
		 System.out.println("largest number"+lg);
		 System.out.println("smallest number "+sml);
  }
}
