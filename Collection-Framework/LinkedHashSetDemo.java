package collectionframework;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo 
{

	public static void main(String[] args)
	{
		 LinkedHashSet<String> ihs = new LinkedHashSet<String>();
		 
		 ihs.add(new String("One"));
		 ihs.add(new String("Two"));
		 ihs.add(new String("Three"));
		 
		 Object array[] = ihs.toArray();
		 
		 for(int x=0;x<3;x++)
		 {
			 System.out.println(array[x]);
		 }
	}

}
