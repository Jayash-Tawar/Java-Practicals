package collectionframework;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo
{

	public static void main(String[] args)
	{
		LinkedList alist = new LinkedList();
		
		alist.add(new String("H2R"));
		alist.add(new String("RR350"));
		alist.add(new String("R15"));
		alist.add(new String("Bullet"));
		alist.add(new String("MT15"));
		alist.add(new String("CBR350"));
		
		System.out.println(alist.get(0));
		System.out.println(alist.get(1));
		System.out.println(alist.get(2));
		System.out.println(alist.get(3));
		System.out.println(alist.get(4));
		System.out.println(alist.get(5));

	}

}
