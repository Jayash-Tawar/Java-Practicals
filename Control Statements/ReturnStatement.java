package basic;

public class ReturnStatement {

	public int show(int c,int d)
	{
	  return c+d;
	}
    public static void main(String args[])
    {
    	ReturnStatement obj = new ReturnStatement();
    	System.out.println("..."+obj.show(10,20));
    }
}
