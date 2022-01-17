package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3SchoolsFrame {

	public static void main(String[] args) {
		// set up the driver
		WebDriverManager.chromedriver().setup();

		// Launch the Chrome Browser
		ChromeDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
		// Switch to Frame
		driver.switchTo().frame("iframeResult");
		// Click on Try it
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		// Enter the text in Alert box and accept
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Haja");
		alert.accept();
		
		String text = driver.findElement(By.id("demo")).getText();
		
		if(text.contains("Haja")) {
			System.out.println("Verified Successfully");
		} else {
			System.out.println("Name mismatch");
		}
		
		

	}
}
