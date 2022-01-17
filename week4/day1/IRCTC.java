package week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IRCTC {

	public static void main(String[] args) throws IOException {
		// set up the driver
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--start-maximized");

		// Launch the Chrome Browser
		ChromeDriver driver = new ChromeDriver(options);

		// Load the URL
		driver.get("https://www.irctc.co.in/nget/train-search");

		driver.manage().window().maximize();
		
		WebElement okButton = driver.findElement(By.xpath("//button[text()='OK']"));
		
		File source = okButton.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("./images/OKButton.png");
		
		FileUtils.copyFile(source, destination);
		
		
		/*
		 * driver.findElement(By.xpath("//button[text()='OK']")).click();
		 * 
		 * driver.findElement(By.linkText("FLIGHTS")).click();
		 * 
		 * Set<String> windowHandles = driver.getWindowHandles();
		 * 
		 * List<String> windows = new ArrayList<String>(windowHandles);
		 * 
		 * driver.switchTo().window(windows.get(1));
		 * 
		 * System.out.println(driver.getTitle());
		 * 
		 * driver.switchTo().window(windows.get(0));
		 * 
		 * driver.close();
		 */
		
	}
}
