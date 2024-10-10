package loopsStatement;
import java.util.Scanner;
public class ArithmeticMenuDriven {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int ch;
		char c;
		boolean bln = false;
		int n,m,res;
	     do
	     {
	    	 System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Modulas\n5.Exit");
	    	 System.out.println("Enter your choice: ");
	    	    ch = s.nextInt();
	    	switch(ch)	
	    	{
	    	case 1:System.out.println("you selected Addition");
	    	       System.out.println("Enter a number1");
	    	           n= s.nextInt();	    	
	    	       System.out.println("Enter a number2");
	    	           m= s.nextInt();	 
	    	              res = n+m;
	    	       System.out.println(res);
	    	       break;
	    	case 2:System.out.println("you selected Substraction");
		 	       System.out.println("Enter a number1");
		 	           n= s.nextInt();	    	
		 	       System.out.println("Enter a number2");
		 	           m= s.nextInt();	 
		 	              res = n-m;
		 	       System.out.println(res);
		 	       break;
	    	case 3:System.out.println("you selected Multiplecation");
	 	       System.out.println("Enter a number1");
	 	           n= s.nextInt();	    	
	 	       System.out.println("Enter a number2");
	 	           m= s.nextInt();	 
	 	              res = n*m;
	 	       System.out.println(res);
	 	       break;
	    	case 4:System.out.println("you selected Modulas");
	 	       System.out.println("Enter a number1");
	 	           n= s.nextInt();	    	
	 	       System.out.println("Enter a number2");
	 	           m= s.nextInt();	 
	 	              res = n%m;
	 	       System.out.println(res);
	 	       break;
	    	case 5: System.out.println("you selected Exit");
	    	        System.exit(0);
	    	        
	    default :System.out.println("Select the vslid option");       
	    	    break;
	    	}
	    System.out.println("Do you want to continue yes(y)No(n)");
	           c = s.next().charAt(0);
	    	if(c=='y'|| c =='Y' )
	    	{
	    		bln = true;
	    	}
	    	else
	    	{
	    		System.out.println("bye bye");
	    	}
	    }
	     while(bln);

	}

}
