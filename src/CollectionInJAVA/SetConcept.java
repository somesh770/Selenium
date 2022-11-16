package CollectionInJAVA;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetConcept 
{

	public static void main(String[] args) 
	
	{	
		// HashSet 
		
				HashSet a = new HashSet();
				
				a.add(10);
				a.add("somesh");
				a.add('A');
				a.add(11.12);
				System.out.println(a);   // output [A, somesh, 10, 11.12]
				
				/// to enter specific data
				HashSet<Integer> b = new HashSet <Integer>();
				
				b.add(10);
			//	b.add('A'); --> not possible
				
				HashSet<String> c = new HashSet <String>();
				
				c.add("somesh");
			//	c.add('A');----> not possible
			//	c.add(12); -----> not possible
//----------------------------------------------------------------------------
				
				Set d = new HashSet();
				
				d.add(10);
				d.add(20);
				d.add(30);
				d.add("landge");
				d.add('B');
				d.add(20.20);
				
				System.out.println(d);  // output -->[B, 20, 20.2, 10, landge, 30]
                                        // there is no intex concept
				                        // as there is no get method 
				
	/// to print single data
				// we have to use Iteral interface
				
				Iterator it = d.iterator();
				
		// it will call one by one data
				
//				System.out.println(it.next());
//				System.out.println(it.next());
//				System.out.println(it.next());
//				System.out.println(it.next());
//				System.out.println(it.next());
//				System.out.println(it.next());
//				
				// but this is too lengthy we will use For loop to reduce lengh
		
		// size of the dat
				System.out.println(d.size()); //  6
				
				for(int i=1; i<=d.size(); i++)
				{
					System.out.println(it.next());
				}
				
				// output B
//				20
//				20.2
//				10
//				landge
//				30
				
						
			
		


	}

}
