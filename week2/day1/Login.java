package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		
		// Setup the Driver
	//	WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
	//	System.setProperty("webdriver.chrome.driver", 
		//		"./drivers/chromedriver.exe");
		
		// Launch the Browser
	//	ChromeDriver driver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		
		// Load the url
		driver.get("http://leaftaps.com/opentaps/");
		
		// Maximize the Browser
		driver.manage().window().maximize();
		
		// Get the Title
		String title = driver.getTitle();
		System.out.println(title);
		
		// Enter the USername
		WebElement userName = driver.findElement(By.id("username"));
		
		userName.sendKeys("DemoSalesManager");
		
		// Enter the PAssword
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// Click on Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Click on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// Click on Leads
		driver.findElement(By.linkText("Leads")).click();
		
		// Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		// Enter Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		// Enter First Name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Haja");
		
		// Enter Last NAme
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("J");
		
		// Select Source from dropdown
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select dd = new Select(source);
		
		dd.selectByVisibleText("Conference");
		
		// Click on Create LEad button
		driver.findElement(By.name("submitButton")).click();
		
		// Close the BRowser
		driver.close();
		
		
		
		
		
		
		
	}
}
