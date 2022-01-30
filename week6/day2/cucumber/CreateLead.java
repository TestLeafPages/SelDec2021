package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass{

	@When("Click on {string} link")
	public void clickLink(String link) {
		driver.findElement(By.linkText(link)).click();
	}
	
	@Then("{string} Page should be displayed")
	public void verifyPage(String page) {
		boolean displayed = driver.findElement(By.linkText(page)).isDisplayed();
		/*
		 * if(displayed) { System.out.println("Success"); } else {
		 * System.out.println("Failure"); }
		 */
		Assert.assertTrue(displayed);
	}
	
}
