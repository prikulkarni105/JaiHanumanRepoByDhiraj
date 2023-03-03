package AllTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import WPAPI.GroupsManiaLogic;
import WPAPI.LogMethods;

public class demoTests {

	
	
	@Test
	public void Test1() {
		
		System.out.println("******STARTED PROCESSING*******");
			GroupsManiaLogic.logic();
		System.out.println("****** PROCESS ENDED*******");

	}
	
}
