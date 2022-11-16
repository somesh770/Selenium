package KeyWords;

import org.testng.annotations.Test;

public class Priority_Keyword 
{

	@Test(priority = 5)
	public void testA()
	{
		System.out.println("test 1");
	}
	
	@Test(priority = 4)
	public void testB()
	{
		System.out.println("test 2");
	}
	
	@Test(priority = 3)
	public void testC()
	{
		System.out.println("test 3");
	}
	
	@Test
	public void testD()
	{
		System.out.println("test 4");
	}
	
	@Test(priority = 1)
	public void testE()
	{
		System.out.println("test 5");
	}
	
	
}
