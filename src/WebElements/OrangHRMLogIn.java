package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class OrangHRMLogIn 
{

	public static void main(String[] args) throws InterruptedException 
	{
// set property
		System.setProperty("webdriver.chrome.driver", "./");
		
// upcating   
		WebDriver driver = new ChromeDriver();
			
// method
			
		driver.get("https://opensource-demo.orangehrmlive.com/");
			
		Thread.sleep(3000);
// miximize			
		driver.manage().window().maximize();
			
// username 
		WebElement username = driver.findElement(By.name("txtUsername"));
		username.sendKeys("Admin");
		Thread.sleep(3000);
		
// password 
		
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		Thread.sleep(3000);
		
// login 
		
		WebElement Login = driver.findElement(By.id("btnLogin"));
		Login.click();
		Thread.sleep(3000);
		
// assign leave 
		
		WebElement AssignLeave = driver.findElement(By.linkText("Assign Leave"));
		
		AssignLeave.click();
		Thread.sleep(3000);
		
//Employee Name
		WebElement EmployeeName  = driver.findElement(By.id("assignleave_txtEmployee_empName"));
		EmployeeName.sendKeys("somesh landge");
		Thread.sleep(3000);
		
// select leave type
		
		WebElement LeaveType = driver.findElement(By.id("assignleave_txtLeaveType"));
		LeaveType.click();
		
		Select x = new Select(driver.findElement(By.id("assignleave_txtLeaveType")));
		x.selectByVisibleText("CAN - Personal");
		
// add date 
		
//	ui-datepicker-trigger
		
// from date
		WebElement calenderFrom = driver.findElement(By.name("assignleave[txtFromDate]"));
		calenderFrom.clear();
		calenderFrom.sendKeys("2022-03-04");
		Thread.sleep(3000);
		
// to date		
		WebElement CalenderTo = driver.findElement(By.id("assignleave_txtToDate"));
		CalenderTo.clear();
		CalenderTo.sendKeys("2022-03-07");
		Thread.sleep(3000);
		

		
// comment 
//		WebElement Comment = driver.findElement(By.id("assignleave_txtComment"));
//		Comment.sendKeys("please approve my leave");
//		Thread.sleep(3000);
		
		
	}

}
