package basic;
import java.util.*;

public class IfElseStatement {

	public static void main(String[] args)
	{
		
		int marks;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Ur Marks =");
		marks=in.nextInt();
		
		if (marks>=36)
		{
			System.out.println("You Are Pass");
		}
		else
		{
			System.out.println("You Are Fail");
		}
		
	}

}
