import org.junit.After;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG 
{
	@BeforeSuite
	public void beforeSuit()
	{
		System.out.println("before suit");
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("BeforeTest");
	}
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("BeforeClass");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("before method1");
	}
	
	@Test
	public void test1() 
	{
	   System.out.println("test 1 - log in");	
	}
	

	@AfterMethod
	public void aftermethod1()
	{
		System.out.println("after method1");
	}
	
	@org.testng.annotations.AfterClass
	public void AfterClass()
	{
		System.out.println("After Class");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("After Test");
	}
	
	@AfterSuite
	public void AfterSuit()
	{
		System.out.println("After Suit");
	}
	
	
	
	
	
	
	
	
}
