package WPAPI;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LogMethods {

	
	public static ExtentReports extent= new ExtentReports();
	public static ExtentSparkReporter spark=new ExtentSparkReporter("report.html");
	public static ExtentTest test;
	
	
	public static void CreateExtentTest(String testName, String deviceName, String WhatsAppAccount) {
		test=extent.createTest(testName).assignCategory(deviceName);
	}
	public static void printOnConsole(String message) {
		System.out.println("\n**************************** \n"+message + "\n ***********************************\n");
	}
	
	public static void SleepLogic(int completedCount,String deviceName, String whatsAppAccount,String totalGroups) throws Exception
	{
		if(completedCount%5==0)
		{
			LogMethods.printOnConsole("\n🟢 Sleeping for 15 Seconds   - \n"+deviceName+"\t"+whatsAppAccount+"\n" +completedCount+"/"+totalGroups+"\t completed \n");
			Thread.sleep(15000);	
		}
		else {
			LogMethods.printOnConsole("\n🟢 Sleeping for 5 Seconds   - \n"+deviceName+"\t"+whatsAppAccount+"\n" +completedCount+"/"+totalGroups+"\t completed \n");
			Thread.sleep(5000);							
		}
	}
	
	public static void ResponseLogic(int completedCount,String deviceName, String whatsAppAccount,String totalGroups,String response,String groupID) throws Exception
	{
		
		if(completedCount%5==0) {
			test.createNode(groupID).log(Status.FAIL, "Failed to Send").fail(response);
			LogMethods.printOnConsole("\n🔴 Failed to send on   - \n"+groupID+"\n"+deviceName+"\t"+whatsAppAccount+"\n" +completedCount+"/"+totalGroups+"\t completed \n");

		}
		else {
			test.createNode(groupID).log(Status.PASS, "Successfully Sent").pass(response);
			LogMethods.printOnConsole("\n🟢 Suceesfully sent to   - \n"+groupID+"\n"+deviceName+"\t"+whatsAppAccount+"\n" +completedCount+"/"+totalGroups+"\t completed \n");

		}
		
		
		/*
		if(response.contains("error")) {
			LogMethods.printOnConsole("\n🔴 Failed to send on   - \n"+groupID+"\n"+deviceName+"\t"+whatsAppAccount+"\n" +completedCount+"/"+totalGroups+"\t completed \n");
			test.createNode(groupID).log(Status.FAIL, "Failed to Send").fail(response);
		
		}
		else {
			LogMethods.printOnConsole("\n🟢 Suceesfully sent to   - \n"+groupID+"\n"+deviceName+"\t"+whatsAppAccount+"\n" +completedCount+"/"+totalGroups+"\t completed \n");
			test.createNode(groupID).log(Status.PASS, "Successfully Sent").pass(response);

		}
		*/
	}
	public static void flush() {
		extent.flush();
	}

}
