package basic;
import java.util.*;

public class NestedIf {

	public static void main(String[] args)
	{
		int a,b,c;
		int max =0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Value of A =");
		
		a = s.nextInt();
		System.out.println("Enter Value of B =");
		
		b = s.nextInt();
		System.out.println("Enter Value of C =");
		
		c=s.nextInt();
		if(a>b)
		{
			  if(a>c)
	           max = a;
	           else
	        	max = c;   
		}
		else
		{
			  if(b>c)
				  max=b;
			  else
				  max=c;
		}
          System.out.println("\nMax Value = "+max);
	}

}
