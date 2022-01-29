package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass{

	@Given("Launch the Browser")
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Given("Load the application url")
	public void loadURL() {
		driver.get("http://leaftaps.com/opentaps");
	}
	
	@Given("Enter Username as {string}")
	public void enterUserName(String userName) {
		driver.findElement(By.id("username")).sendKeys(userName);
	}
	
	@Given("Enter password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	/*
	 * @When("Click on Login button") public void clickLogin() {
	 * driver.findElement(By.className("decorativeSubmit")).click(); }
	 */
	
	@When("Click on Login button")
	public void clickonloginbutton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Homepage should be displayed")
	public void verifyHomePage() {
		String title = driver.getTitle();
		if(title.contains("TestLeaf")) {
			System.out.println("Login is Successful");
		} else {
			System.out.println("Login is unsuccessful");
		}
	}
}
