package OpeningInDifferantBrower;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MicrosoftEdge {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.edge.driver","C:\\Users\\admin\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe" );
	
	WebDriver driver = new EdgeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/");
	
	

	}

}
