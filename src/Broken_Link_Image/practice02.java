package Broken_Link_Image;

import java.util.Arrays;

public class practice02 {

	public static void main(String[] args) 
	{
		
		String s = "SOMESH";
		int count=0;
		
		for (int i=0; i<s.length(); i++)
		{
			for (int j=1; j<s.length(); j++)
			{
				if (s.charAt(i) == s.charAt(j))
				{
					count++;
				}
			}
		}
		System.out.println(count);
		     	     
	  
		
	}

}
