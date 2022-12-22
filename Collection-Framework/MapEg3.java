package collectionframework;
import java.util.*;

public class MapEg3 {

	public static void main(String[] args) 
	{
		Map<String,String>fruit = new HashMap<String,String>();
		
		fruit.put("Apple","Red");
		fruit.put("Orange","Orange");
		fruit.put("Grapes","Violet");
		fruit.put("Banana","Yellow");
		fruit.put("Straberry","Red");
		
		for(String key : fruit.keySet())
		{
			System.out.println(key+" : "+fruit.get(key));
		}
	}

}
