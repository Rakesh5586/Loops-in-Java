package loopsStatement;

public class EvenByLoop {

	public static void main(String[] args)
	{
		int i = 1;
		int n = 20;
		int sum = 0;
		while(i<=n)
		{
			if(i%2==0)
			{
			  sum = sum+i;
			 //System.out.println(i);
			}
			i++;
		}
		 System.out.println(sum);
	}

}
