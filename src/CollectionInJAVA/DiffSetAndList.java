package CollectionInJAVA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DiffSetAndList 
{

	public static void main(String[] args) 
	{
		List a =  new ArrayList();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(30);
		a.add(null);
		a.add(null);
		
		System.out.println(a); // output [10, 20, 30, 30, null, null]
		
		// 1 it allow duplicate value
		// 2 no. of null value can use
		// 3 it print data in sequence 
		
		System.out.println(a.get(1));  //---> output ---20
		
		// 4 there is index concept
		
//-------------------------------------------------------------------------------
		
		Set b = new HashSet();
		
		b.add(10);
		b.add(20);
		b.add(30);
		b.add(30);
		b.add(null);
		b.add(null);
		b.add("somesh");
		
		System.out.println(b);  // output [null, 20, somesh, 10, 30]
		
		// 1 it doen't allow duplicate value
		// 2 allow only one null value
		// 3 it print data randomly
		// 4 there is no index concept ( as there no get method)
	

		

	}

}
