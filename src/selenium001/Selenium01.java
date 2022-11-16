package selenium001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium01 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		
// get method------> url open	
		driver.get("https://www.youtube.com/");
		
		Thread.sleep(5000); // -----------------> to pause 5 second 
		
}
}