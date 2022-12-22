package collectionframework;
import java.util.*;

public class HashMapEg2
{

	public static void main(String[] args)
	{
		Map<Integer,String> obj = new HashMap<Integer,String>();
		
		obj.put(new Integer(103),"Jayash");
		obj.put(new Integer(101),"Yash");
		obj.put(new Integer(102),"Abhijeet");
		obj.put(new Integer(104),"Vicky");
		
		Set s = obj.entrySet();
		
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			Map.Entry me = (Map.Entry)itr.next();
			System.out.println(me.getKey()+" "+me.getValue());
		}
	}

}
