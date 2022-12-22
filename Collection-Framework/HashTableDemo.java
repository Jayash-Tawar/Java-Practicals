package collectionframework;
import java.util.Hashtable;

public class HashTableDemo
{

	public static void main(String[] args)
	{
		Hashtable table = new Hashtable();
		
		table.put("name", "Jayash");
		table.put("id",new Integer("101"));
		table.put("address",new String("Khamgaon"));

		System.out.println("Table Contents : "+table);
	}

}
