package Broken_Link_Image;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Links 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
	    System.setProperty("webdriver.chrome.driver", "C:\\driver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.guru99.com/selenium/newtours/index.php");
		
		Thread.sleep(5000);

		// capture links
		// count number of links (size)
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		
		// size of links
		
		System.out.println(Links.size());
		
		for (int i=0; i<Links.size(); i++)
		{
			WebElement element =Links.get(i);	
			String url= element.getAttribute("href");
			
			URL link = new URL(url);
			
			// create connection using url object 'link'
			HttpURLConnection httpconnection = (HttpURLConnection) link.openConnection();
			
			Thread.sleep(2000);
			
			// establish connection
			httpconnection.connect();
			
			int responce = httpconnection.getResponseCode();  // if resonce = 400 = broken link
			
			if (responce >=400)
			{
				System.out.println(url+"---"+" is broken link");
			}
			else
			{
				System.out.println(url+"----"+"link is valid");
			}
			
			
		}
		
		driver.quit();
		
	}

}
