package collectionframework;
import java.util.*;

public class TreeMapDemo 
{

	public static void main(String[] args)
	{
		TreeMap treeMap=new TreeMap();
		
		treeMap.put("Name","Jayash");
		treeMap.put("ID",new Integer("1001"));
		treeMap.put("Address","Khamgaon");
		
		Collection values = treeMap.values();
		Iterator iterator = values.iterator();
		System.out.println("Printing The Values....");
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}

	}

}
