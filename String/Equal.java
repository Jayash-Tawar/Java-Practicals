package string;

public class Equal 
{

	public static void main(String[] args) 
	{
		String language = "jayash";
		String language2= new String("jayash");
		
		System.out.println("language");
		if(language.equals(language2))
		{
			System.out.println("Both are equal");
		}
		if(language==language2)
		{
			System.out.println("Both are ==");
		}
	}

}
