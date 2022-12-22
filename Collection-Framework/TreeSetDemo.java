package collectionframework;
import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetDemo
{
	public static void main(String[] args) 
	{
		TreeSet<String> tree = new TreeSet<String>();
		
		tree.add("Jayash");
		tree.add("Yash");
		tree.add("Vicky");
		tree.add("Pramod");
		
		Iterator iterator = tree.iterator();
		while (iterator.hasNext())
		{
			System.out.println(iterator.next().toString());
		}
	}

}
