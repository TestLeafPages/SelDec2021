package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;
import steps.BaseClass;

@CucumberOptions(features= "src/test/java/features/F01_Login.feature"
				, glue = "steps"
				, monochrome = true
				, dryRun = false
				, snippets = SnippetType.CAMELCASE
				, publish = true
				//, tags = "@Functional" // Executing a particular tag
				//, tags = "@Functional or @Smoke" // Executing all scenarios belonging to the tags
				//, tags = "@Functional and @Smoke"  // Executing scenarios which belong to multiple tags
				//, tags = "not @Regression"
				)
public class Runner extends BaseClass {
	
	
	@DataProvider(indices=1)
	public Object[][] scenarios() {
		return super.scenarios();
	}
	 

}
