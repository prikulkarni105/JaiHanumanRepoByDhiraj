package AllTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import WPAPI.GroupsManiaLogic;
import WPAPI.LogMethods;

public class demoTests {

	public static ExtentReports extent= new ExtentReports();
	public static ExtentSparkReporter spark=new ExtentSparkReporter("report.html");
	public static ExtentTest test;
	
	@Test
	public void Test1() {
		
		GroupsManiaLogic.logic();
	}
	
}
