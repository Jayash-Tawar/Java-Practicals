package basic;
import java.util.*;

public class iFElseLadder {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Day Between 0 to 6 =");
		int day = s.nextInt();
		if(day==0)
		{
			System.out.println("\nSunday");
		}
		else if (day==1)
		{
			System.out.println("\nMonday");	
		}
		
		else if (day==2)
		{
			System.out.println("\nTuesday");	
		}
		
		else if (day==3)
		{
			System.out.println("\nWednesday");	
		}
		else if (day==4)
		{
			System.out.println("\nThursday");	
		}
		else if (day==5)
		{
			System.out.println("\nFriday");	
		}
		else if (day==6)
		{
			System.out.println("\nSaturday");	
		}
		

	}

}
