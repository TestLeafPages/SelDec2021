package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("http://www.leafground.com/pages/disapper.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement ele = driver.findElement(By.id("btn"));
		
		Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(250));
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.invisibilityOf(ele));
		
	//	Thread.sleep(5000);
		
		String text = driver.findElement(By.tagName("strong")).getText();
		System.out.println(text);
		
	}
}
