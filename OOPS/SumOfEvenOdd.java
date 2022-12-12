package oops;
import java.util.*;

public class SumOfEvenOdd
{

	public static void main(String[] args) 
	{
		int even=0;
		int odd=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range = ");
		int range = sc.nextInt();
		
		for(int i=1;i<=range;i++)
		{
			if(i==0)
			{
				even=even+i;
			}
			else
			{
				odd=odd+i;
			}
		}
		System.out.println("Sum of Even Numbers are ="+even);
		System.out.println("Sum of ODD Numbers are ="+odd);
		sc.close();
	}

}
