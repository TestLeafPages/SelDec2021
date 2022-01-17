package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDraggable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/drop.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Creating Actions Object
		Actions builder = new Actions(driver);
		
		WebElement dragEle = driver.findElement(By.id("draggable"));
		
		WebElement dropEle = driver.findElement(By.id("droppable"));
		Point location = dropEle.getLocation();
		int x = location.getX();
		int y = location.getY();
		
		
	//	builder.dragAndDropBy(dragEle, x, y).perform();
		
		builder.dragAndDrop(dragEle, dropEle).perform();
	}
}
