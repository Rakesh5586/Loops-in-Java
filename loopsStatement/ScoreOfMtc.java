package loopsStatement;
import java.util.Scanner;
public class ScoreOfMtc {

	public static void main(String[] args) 
	{
		 int i =1;
		Scanner s= new Scanner(System.in);
		 int scr,sos=0;
		while(i<=5)	  
		{
			System.out.println("Enter "+i+" match score");
			 scr= s.nextInt();
			 sos = sos+scr;
			 i++;
		}
		System.out.println("average is "+(sos/5.0));
	}

}
