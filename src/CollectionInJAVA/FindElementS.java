package CollectionInJAVA;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementS 
{
	
	public static void main(String[] args) 
	{
	 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 System.out.println("Browser is opened");
	 driver.manage().window().maximize();
	 System.out.println("window is maximized");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 System.out.println("Wait is applied");
	 
	 driver.get("https://www.saucedemo.com/");
	 System.out.println("saucedemo site is opened");
	 
	 WebElement usernme = driver.findElement(By.xpath("//input[@id='user-name']"));
	 usernme.clear();
	 usernme.sendKeys("standard_user");
	 System.out.println("username is entered");
	 
	 WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	 password.clear();
	 password.sendKeys("secret_sauce");
	 System.out.println("password is entered");
	 
	 WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
	 login.click();
	 System.out.println("clicked on login button");
	 System.out.println("home page is opened");
//--------------------------------------------------------------------------------------------------------------
	 
//	 WebElement pro1addtocard = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
//	 pro1addtocard.click();
//	 System.out.println("product 1 is added in card");
	 
//--------------------------------------------------------------------------------------------------------------	 
	 
// to add multiple element in card we have to perform this repeatedly 
// but if we want to add multiple element at a time then we have to find out common element in xpath
	 // of all the element
	 
	 //// adding multiple element in card
	
	 
	 List <WebElement> addtocard = driver.findElements(By.xpath("//button[text()='Add to cart']"));
	
// there are 6 product indicated by index
	 // 1 element --- o
	 // 2 element --- 1
	 // 3 element --- 2
	 // 4 element --- 3
	 // 5 element --- 4
	 // 6 element --- 5
	 
	 // to get single element
	 
//	 addtocard.get(0).click();  System.out.println(" no 1 product added ");
//	 addtocard.get(1).click();  System.out.println(" no 2 product added ");
//	 addtocard.get(2).click();  System.out.println(" no 3 product added ");
//	 addtocard.get(3).click();  System.out.println(" no 4 product added ");
//	 addtocard.get(4).click();  System.out.println(" no 5 product added ");
//	 addtocard.get(5).click();  System.out.println(" no 6 product added ");
	 
	 
	 for(int i=0; i< addtocard.size(); i++)
	 {
		 addtocard.get(i).click(); 
	 }
	 
	 System.out.println("All product are added to card");
	  	 
	}

}
