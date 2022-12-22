package collectionframework;
import java.util.Vector;

public class VectorDemo 
{

	public static void main(String[] args)
	{
	  Vector<String> VC=new Vector<String>();
	    //<E>Element type of Vector e.g. String,Integer,Object...
	  
	    // add vector elements  
	    VC.add("Vector Object 1");
	    VC.add("Vector Object 2");
	    VC.add("Vector Object 3");
	    VC.add("Vector Object 4");
	    VC.add("Vector Object 5");
	    
	    //add vector element at index
	    VC.add(3,"Elements At Fix Position");
	    
	    //vc.size() inform number of elements in Vector
	    System.out.println("Vector Size :"+VC.size());
	}

}
