package operators;

public class RightShiftOperator {

	public static void main(String[] args)
	{
		int a = 34;
		int b = -20;
		
		System.out.println("Singned Right Shift 34 Divide by 2 ="+(a>>1));
		System.out.println("Singned Right Shift -20 Divide by 2 ="+(b>>1));
		System.out.println("Singned Left Shift 34 Divide by 2 ="+(a<<1));
		System.out.println("Singned Left Shift -20 Divide by 2 ="+(b<<1));
		System.out.println("UNSingned Right Shift 34  ="+(a>>>1));
		System.out.println("UNSingned Right Shift -20  ="+(b>>>1));

	}

}
