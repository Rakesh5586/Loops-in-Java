package loopsStatement;

public class OddByLoop {

	public static void main(String[] args) 
	{
      int i = 1;
      int n= 20,pro = 1;
      while(i<=n)
      {
    	  if(i%2!=0)
    	  {
    		  pro = pro*i;
    	  }
      i++;
      }
      System.out.println(pro);

	}

}
