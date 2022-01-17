package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultipleElements {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Link.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		List<WebElement> inputTags = driver.findElements(By.xpath("//input[@class='inputLogin']"));

		for (WebElement eachTag : inputTags) {
			String className = eachTag.getAttribute("name");
			System.out.println(className);
		}

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
	}
}
