package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {

	public static void main(String[] args) {
		// set up the driver
		WebDriverManager.chromedriver().setup();

		// Launch the Chrome Browser
		ChromeDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.manage().window().maximize();
		
		// Switch to Frame
		driver.switchTo().frame(1);
		
		WebElement frame2 = driver.findElement(By.id("frame2"));
		driver.switchTo().frame("frame2");
		
		driver.findElement(By.id("Click1")).click();
		
		// Come out of all frames
		driver.switchTo().parentFrame();
		
		String text = driver.findElement(By.tagName("h1")).getText();
		System.out.println(text);
		
		

	}
}
