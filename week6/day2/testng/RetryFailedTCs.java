package testcase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTCs implements IRetryAnalyzer {

	int count = 0;
	public boolean retry(ITestResult result) {
		if(count < 1) {
			count++;
			return true;
		}
		return false;
	}

	
}
