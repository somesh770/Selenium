package Broken_Link_Image;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice01 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\driver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://qavalidation.com/demolinks/");
		
		Thread.sleep(2000);
		
		
		List<WebElement> links = driver.findElements(By.tagName("input"));
		System.out.println(links.size());
		
		for (int i=0; i<links.size(); i++)
		{
			
		  WebElement element = links.get(i);
		  String url = element.getAttribute("type");
		  
		  Thread.sleep(2000);
		
		 URL link = new URL(url);
		
		HttpURLConnection connection= (HttpURLConnection) link.openConnection();
		
		Thread.sleep(2000);
		int responcce = connection.getResponseCode();
		
		System.out.println(responcce);
		
		if (responcce >=400)
		{
			System.out.println(url+"---"+"is broken");
		}
		else
		{
			System.out.println(url+"---"+"is valid");
		}
	}
		
		driver.quit();

	}
		


}
