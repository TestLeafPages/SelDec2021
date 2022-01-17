package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/table.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		int rowCount = driver.findElements(By.xpath("//table[@id='table_id']//tr")).size();

		// String text =
		// driver.findElement(By.xpath("//table[@id='table_id']//tr[2]/td[1]")).getText();

		// System.out.println(text);

		for (int i = 2; i <= rowCount; i++) {
			int colCount = driver.findElements(By.xpath("//table[@id='table_id']//tr[" + i + "]/td")).size();
			for (int j = 1; j <= colCount; j++) {
				String text2 = driver.findElement(By.xpath("//table[@id='table_id']//tr[" + i + "]/td[" + j + "]"))
						.getText();
				System.out.println(text2);
			}
		}

	}
}
