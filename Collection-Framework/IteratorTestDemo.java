package collectionframework;
import java.util.*;
public class IteratorTestDemo
{

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		
		//Display all Contents of ArrayList al...
		
		System.out.println("Orignal Elements of al : "+al);
		
		//Use Iterator to Display Content of ArrayList al..
		
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			Object element = itr.next();
			System.out.println("Element..."+element);
		}

	}

}
