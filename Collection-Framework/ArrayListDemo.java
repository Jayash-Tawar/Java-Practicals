package collectionframework;
import java.util.ArrayList;

public class ArrayListDemo
{

	public static void main(String[] args) 
	{
	  ArrayList alist = new ArrayList();
	  
	  alist.add(new String("Four"));
	  alist.add(new String("Five"));
	  alist.add(new String("Six"));
	  alist.add(new String("Seven"));
      
	  System.out.println(alist.get(0));
	  System.out.println(alist.get(1));
	  System.out.println(alist.get(2));
	  System.out.println(alist.get(3));
	}

}
