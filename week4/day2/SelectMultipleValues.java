package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectMultipleValues {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("http://www.leafground.com/pages/Dropdown.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Creating Actions Object
		Actions builder = new Actions(driver);

		WebElement selenium = driver.findElement(By.xpath(
				"//option[text()='Select your programs']/following-sibling::option[text()='Selenium']"));
		WebElement loadRunner = driver.findElement(By.xpath(
				"//option[text()='Select your programs']/following-sibling::option[text()='Loadrunner']"));

		builder.keyDown(Keys.CONTROL).click(selenium).click(loadRunner).keyUp(Keys.CONTROL).perform();
	}
}
