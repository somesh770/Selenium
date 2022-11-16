package FrameProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frame01 {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
//--------------------------------------------------------------------------------------
	driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	System.out.println("URL is opened");
//----------------------------------------------------------------------------------
// select bebycat in dropdown
	WebElement frame2= driver.findElement(By.xpath("//iframe[@id='frame2']"));	
	driver.switchTo().frame(frame2);
	System.out.println("switched main page into frame2");
	
	WebElement dropdown= driver.findElement(By.xpath("//select[@id='animals']"));	
	Select bebycat = new Select(dropdown);
	bebycat.selectByIndex(1);
	System.out.println("beby cat is selected");
	
//-----------------------------------------------------------------------------------
// assingment 1 - try to click on check box

// 1st of all we have to switch from frame2 to main page
	driver.switchTo().parentFrame();
	System.out.println("switched frame 2 page into mainpage");
	
// swtch to main page to frame 1
	WebElement frame1= driver.findElement(By.xpath("//iframe[@id='frame1']"));	
	driver.switchTo().frame(frame1);
	System.out.println("switched main page into frame 1");
	
// toipc
	WebElement topic= driver.findElement(By.xpath("/html/body/input"));
	topic.sendKeys("frame concept");

// switch to frame 3
	WebElement frame3= driver.findElement(By.xpath("//iframe[@id='frame3']"));	
	driver.switchTo().frame(frame3);
	System.out.println("switched frame 1 into frame 3");
	
	
// click on check box 
	WebElement checkbox= driver.findElement(By.xpath("//input[@id='a']"));	
	checkbox.click();

//-----------------------------------------------------------------------------------

	System.out.println("End of program");
	
	
	}

}
