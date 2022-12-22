package collectionframework;
import java.util.HashMap;

public class HashMapEg1 
{

	public static void main(String[] args) 
	{
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("Jayash","A");
		map.put("Yogesh","F");
		map.put("Yash","B");
		
		System.out.println("Name: " +map.get("Jayash"));
		System.out.println("Name: " +map.get("Yogesh"));
		System.out.println("Address: " +map.get("Yash"));
	
	}

}
