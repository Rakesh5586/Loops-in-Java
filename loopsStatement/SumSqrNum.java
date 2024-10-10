package loopsStatement;

public class SumSqrNum {

	public static void main(String[] args)
	{
		int i =1;
		int n= 20,sq = 0;
		while(i<=n)
		{
			sq = sq + (i*i);
			i++;
		}
		System.out.println(sq);
	}

}
