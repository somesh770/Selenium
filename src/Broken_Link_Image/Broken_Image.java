package Broken_Link_Image;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Image 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		// initiate driver
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.guru99.com/selenium/newtours/index.php");
		
		Thread.sleep(5000);
		
		List<WebElement> links = driver.findElements(By.tagName("img"));
		
		System.out.println("size of Elements"+ links.size());
		
		for (int i=0; i<links.size(); i++)
		{
			
			WebElement elements = links.get(i);
			String url = elements.getAttribute("src");
			
		
			URL link = new URL(url);
			
			
			HttpURLConnection connection = (HttpURLConnection) link.openConnection();
			
			int responce = connection.getResponseCode();
			
			
			if (responce>=400)
			{
				System.out.println(url + "---"+"is broken image");
			}
			
			else
			{
				System.out.println(url + "----"+"is valid image");
			}
			
		}
		
		driver.quit();
			
	}

}
