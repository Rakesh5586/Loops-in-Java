package loopsStatement;
//1st method---
public class ProFstLst {

	public static void main(String[] args) 
	{
		   int n= 5492;
	  int r,fd=1;
	   r = n%10;
	   while(n!=0)
	   {
		  fd = n%10;
		  n=n/10;
	   }
      System.out.println(fd+ " " +r);
      System.out.println("the product of first and last digit is "+(fd*r));
      
//2nd method---	
      
	/*int n= 5492,fd=0,ld=0;
	ld= n%10;
	while(n!=0)
	{
		if(n>=10)
		{
		n=n/10;
	   }
		 fd=n;
		n=n/10;
	}
	System.out.println(fd);
	System.out.println(ld);
	System.out.println(fd*ld);
	}*/
}
}
