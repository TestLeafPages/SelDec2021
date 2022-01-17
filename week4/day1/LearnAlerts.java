package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlerts {

	public static void main(String[] args) throws InterruptedException {
		// set up the driver
		WebDriverManager.chromedriver().setup();
		
		// Launch the Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		
		// Load the URL
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		// Click on Alert box
	//	driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
	//	driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
	//	driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
	//	driver.findElement(By.xpath("//button[text()='Sweet Alert']")).click();
		
		Thread.sleep(3000);
		
		// Accept the Alert
		
		  Alert alert = driver.switchTo().alert();
		  
		  // Get Alert Text 
		  String text = alert.getText(); 
		  System.out.println(text);
		  
		  // Enter Text to Alert 
	//	  alert.sendKeys("ABC"); 
	//	  alert.accept();
		  
		  driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		 
		// alert.dismiss();
		
		// Accept the Sweet Alert
	//	driver.findElement(By.xpath("//button[text()='OK']")).click();
	}
}
