package CollectionInJAVA;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayListMethod 
{

	public static void main(String[] args) 
	{
		
//		int a = 10;
//		int b = 20;
//		System.out.println(a+b);
		
		           //not possible
//		int a [] = {10.99,"RAHUL", 10,20,30,40,50,60};

		
		
///////////////////////////////////////////////////////////////////////////////////		
		ArrayList a = new ArrayList();
		
		a.add(10);      // 0
		a.add(20);      // 1
		a.add(30);      // 2
		
		
//////////////////////////////////// advantages of collection///////////////////////////////
		// 1. we can add any type of data
		
		a.add(10);     // 3
		a.add(10.10);  // 4
		a.add('A');    // 5
		a.add("somesh"); // 6
		
		System.out.println(a);     // output --> [10, 20, 30, 10, 10.1, A, somesh]
		// it will print all data
////////////////////////////////////////////////////////////////////////////////////////
		
	   //we can print any specific data by using index and get method
		
		 System.out.println(a.get(6));   // ootput -->  somesh 
		 
		 
////////////////////////////////////////////////////////////////////////////////////////////////
		  // 2. specific dataTYpe data
		 
		           // if we want integer type data
		 ArrayList<Integer> b  = new ArrayList<Integer>();   
		 
		 b.add(10);    // --> possible   
	//	 b.add(10.10);    --> not possible
	//	 b.add("somesh"); --> not possible
		 
	         	 // if we want string type data
		 ArrayList<String> c  = new ArrayList<String>(); 
		 
		 c.add("ABC");  // 0 --> possible
		 c.add("DEF");  // 1 
		 c.add("IJK");  // 2
		 c.add("LMN");  // 3
	//	 c.add('A');         ---> not possible
	//	 c.add(10);           --> not possible
		 
		 System.out.println(c);   // to print all string data
		  // output --> [ABC, DEF, IJK, LMN]
		 
/////////////////////////////////////////////////////////////////////////////////////////////////////
		 // 3. To replace any data (set method )
		 
		 c.set(2, "somesh");
		 System.out.println(c);
		 
		 //output -->[ABC, DEF, somesh, LMN]
		 
///////////////////////////////////////////////////////////////////////////////////////////
		 
		 // 4. size of ArrayList
		 
		 System.out.println(c.size());  
		 
		 // output --> 4
		 
///////////////////////////////////////////////////////////////////////////////
		 
		// remove method
		  // to "LMN" data
		 
		 c.remove(3);
		 System.out.println(c);
		 
		 /// output   --> [ABC, DEF, somesh]
		 
///////////////////////////////////////////////////////////////////////////////////
	// if we want removed data at same index
		 
		 ArrayList<Integer>d = new ArrayList<Integer>();
		 
		 d.add(10);   // 0
		 d.add(20);   // 1
		 d.add(30);   // 2
		 d.add(40);   // 3
		 
		 System.out.println(d);   // output-->[10, 20, 30, 40]
		 
		 // remove index 1
		 d.remove(1);
		 System.out.println(d);   // output --> [10, 30, 40]
		 
		 // to add 20 at saame index
		 // if we use normal add method
		 
//		 d.add(20);
//		 System.out.println(d);     // output --> [10, 30, 40, 20] ---- not possible
		 
		 // use this method
		 
		 d.add(1, 20);
	     System.out.println(d);  // output --->[10, 20, 30, 40]
	 
		 
				 
		 	 	 	 
		
	}

}
