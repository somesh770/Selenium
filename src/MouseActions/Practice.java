package MouseActions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException 
	{
		
       System.setProperty("webdriver.chrome.driver", "C:\\driver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	}

}
