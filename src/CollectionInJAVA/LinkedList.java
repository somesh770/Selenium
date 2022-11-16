package CollectionInJAVA;

import java.util.ArrayList;
import java.util.List;

public class LinkedList 
{

	public static void main(String[] args) 
	{
		LinkedList x = new LinkedList();
		
		// List Concept
		
		// Upcasting
		
		List a = new ArrayList();
		 
		a.add(10);
		a.add(10.10);
		a.add('A');
		a.add("somesh");
		
		System.out.println(a);  // output--> [10, 10.1, A, somesh]
		
/////////////////////////////////////////////////////////////////////////////////////////////
		///to enter specific data
		
		List<Double>b = new ArrayList<Double>();
		
		b.add(100.100);  // possible
		b.add(20.30);   // possible
		 
	//	b.add('A');    not possible
	//	b.add("somesh");    not possible
		
///////////////////////////////////////////////////////////////////////////////	
		// to get add data
		 a.add(20);
		 
		 System.out.println(a);  // output --> [10, 10.1, A, somesh, 20]
		 
///////////////////////////////////////////////////////////////////////////////
		 
		// to remove data
		 
		 a.remove(3);
		 System.out.println(a);   /// outout --> [10, 10.1, A, 20]
		
//////////////////////////////////////////////////////////////////////////
		 
		 // to add removed data at same index
		 
		 a.add(3, "somesh");
		 
		 System.out.println(a);   // output --> [10, 10.1, A, somesh, 20]

//////////////////////////////////////////////////////////////////////////
		 // to clear all data
		 
		 a.clear();
		 System.out.println(a);  // output --> []
///////////////////////////////////////////////////////////////////////////
		 
		 // also we can perform 
		 
//		 List x = new LinkedList();
//			
//			List<String> y = new LinkedList<String>();
	
		
	}

}
