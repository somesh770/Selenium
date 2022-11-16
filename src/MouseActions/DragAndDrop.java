package MouseActions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class DragAndDrop 
{
///////////////////////////////// screenshot method/////////////////////////////
	 static WebDriver driver ;
	 
	public static void screenshots(String s) throws IOException 
	{
		TakesScreenshot Tss = (TakesScreenshot)driver;
		File source = Tss.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\admin\\Desktop\\Automation testing\\notes\\selenium\\sceenshots concept\\Drag&Drop Actions "+ s + ".jpg");
		FileHandler.copy(source, destination);
	}
	
///////////////////////////////////4 line code////////////////////////////////	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");	
    driver =  new ChromeDriver();
    System.out.println("browser is opened");
    System.out.println("browser screenshot is taken");
    
    driver.manage().window().maximize();
    System.out.println("window is miximized");
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    System.out.println("implicit wait is applied");
    
    driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
    System.out.println("url is opened");
    screenshots(" homepage");
    System.out.println("Homepage screenshot taken");
    Thread.sleep(2000);
 
 //////////////////////////////////////Drag And Drop Action//////////////
// 1  for oslo capital
     WebElement CapitalOslo = driver.findElement(By.xpath("//div[@id='box1']"));
     
     WebElement CountryNorway = driver.findElement(By.xpath("//div[@id='box101']"));
     // Action class
     Actions act = new Actions(driver);
     
     act.dragAndDrop(CapitalOslo, CountryNorway).perform();
     screenshots("oslo capital screenshot");
     System.out.println("oslo-norway");
     Thread.sleep(2000);
     
 // 2 stockholm capital
     
     WebElement CapitalStockholm = driver.findElement(By.xpath("//div[@id='box2']"));
    
     WebElement CountrySwedan = driver.findElement(By.xpath("//div[@id='box102']"));
     
     act.dragAndDrop(CapitalStockholm, CountrySwedan).perform();
     
     screenshots("Capital Stockholm screenshot ");
     
     System.out.println("Stockholm-Swedan");
     Thread.sleep(2000);
 //3
     WebElement CapitalWashington = driver.findElement(By.xpath("//div[@id='box3']"));
     WebElement CountryUnitedState = driver.findElement(By.xpath("//div[@id='box103']"));
     act.dragAndDrop(CapitalWashington, CountryUnitedState).perform();
     screenshots("Capital Washington screenshot ");
     System.out.println("Washington-UnitedState");
     Thread.sleep(2000);
 //4
     WebElement CapitalCopenhagen = driver.findElement(By.xpath("//div[@id='box4']"));
     WebElement CountryDenmark = driver.findElement(By.xpath("//div[@id='box104']"));
     act.dragAndDrop(CapitalCopenhagen, CountryDenmark).perform();
     screenshots("Capital Copenhagen screenshot ");
     System.out.println("Copenhagen-Denmark");
     Thread.sleep(2000);
 //5
     WebElement CapitalSeoul = driver.findElement(By.xpath("//div[@id='box5']"));
     WebElement CountrySouthkorea = driver.findElement(By.xpath("//div[@id='box105']"));
     act.dragAndDrop(CapitalSeoul, CountrySouthkorea).perform();
     screenshots("Capital Seoul screenshot ");
     System.out.println("Seoul-South korea");
     Thread.sleep(2000);
 //6
     WebElement CapitalRome = driver.findElement(By.xpath("//div[@id='box6']"));
     WebElement CountryItaly = driver.findElement(By.xpath("//div[@id='box106']"));
     act.dragAndDrop(CapitalRome, CountryItaly).perform();
     screenshots("Capital Rome screenshot ");
     System.out.println("Rome-Italy");
     
 // 7
     WebElement CapitalMadrid = driver.findElement(By.xpath("//div[@id='box7']"));
     WebElement CountrySpain = driver.findElement(By.xpath("//div[@id='box107']"));
     act.dragAndDrop(CapitalMadrid, CountrySpain).perform();
     screenshots("All cuntries screenshot ");
     System.out.println("Madrid-Spain");
     
  System.out.println("End of program");
    
	}

}
