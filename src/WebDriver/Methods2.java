package WebDriver;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import Synchronization.ImplicitWait;
import junit.framework.Assert;

public class Methods2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\driver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoqa.com/buttons");
		
		
//-----------------------------------------------------------------------------
		
		WebElement clickme  = driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		Actions act = new Actions(driver);
		
		act.click(clickme).perform();
		
		System.out.println("done");
		
		
		WebElement Text = driver.findElement(By.xpath("//p[text()='You have done a dynamic click']"));
		String ActulText=Text.getText();
		
		String ExpectedText = "You have done a dynamic click";
		
		Assert.assertEquals(ActulText, ExpectedText);
		
		
		
		
		driver.quit();
		
		
	

	}

}
