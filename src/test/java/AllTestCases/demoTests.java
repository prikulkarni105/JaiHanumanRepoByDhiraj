package AllTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import WPAPI.LogMethods;

public class demoTests {

	public static ExtentReports extent= new ExtentReports();
	public static ExtentSparkReporter spark=new ExtentSparkReporter("report.html");
	public static ExtentTest test;
	
	@Test
	public void Test1() {
		
		extent.attachReporter(spark);
		test=extent.createTest("Test1").assignCategory("Device 1");
		LogMethods.DemoMethod(extent, test);
		
	}
	@Test
	public void Test2() {
		
		test=extent.createTest("Test2").assignCategory("Device 2");
		LogMethods.DemoMethod(extent, test);

		
	}
	@Test
	public void Test3() {
		
		test=extent.createTest("Test3").assignCategory("Device 3");

		LogMethods.DemoMethod(extent, test);

	}
	@Test
	public void Test4() {
		
		test=extent.createTest("Test4").assignCategory("Device 4");
		LogMethods.DemoMethod(extent, test);

		
	}
	@Test
	public void Test5() {
		
		test=extent.createTest("Test5").assignCategory("Device 5");
		LogMethods.DemoMethod(extent, test);

		
	}
	@AfterSuite
	public void flush() {
		extent.flush();
		
	}
}
