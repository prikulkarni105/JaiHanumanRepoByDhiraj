package WPAPI;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;

import Resources.StringResources;

public class MainPOSTLogic 
{

	public static void sendMessageToGroups(String testName,String Type, String GroupIdFilename, String InstanceId) throws Exception
	{

		
       	System.out.println("\n********************* "+testName+" Started **********************\n");

		String message="Demo From "+testName;

       	
       	URL url=new URL("https://wapiconnect.com/api/sendgroupmsg.php?group_id=120363030286527679@g.us&type=text&message="+message+"&instance_id="+InstanceId+"&access_token="+StringResources.AccessToken);  
       	HttpURLConnection huc=(HttpURLConnection)url.openConnection(); 
       	for(int i=1;i<=8;i++){  
       		System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));  
       		}  
       		huc.disconnect();   
       	
       	
       	/*
       	
		RestAssured.baseURI = StringResources.Baseuri;
       	String textresponse = given().queryParam("group_id", "120363030286527679@g.us").queryParam("type", "text")
		.queryParam("message", message)
		.queryParam("instance_id", InstanceId)
		.queryParam("access_token", StringResources.AccessToken)
		.when().post("api/sendgroupmsg.php")
		.then().assertThat().statusCode(200).extract().response().asString();
         System.out.println("\n********************* "+testName+"\n\n"+textresponse+"\n\n**********************\n");

		/*String deviceName=testName.substring(0, 7);   //DeviceName Extracted From TestName
    	String whatsAppAccount= StringUtils.substringBetween(testName, "_", "_") + " WhatsApp";
		ArrayList<String> GroupIdlist = Utils.readGroupIdFromLocalFile(GroupIdFilename); 
		int totalGroups=GroupIdlist.size();
		LogMethods.printOnConsole("🔥 "+testName+" Started 🔥\n" +"with "+totalGroups+" Groups 🤼");
		LogMethods.CreateExtentTest(testName,deviceName,whatsAppAccount);
		LogMethods.printOnConsole("🔥 "+testName+" Credted in Reports 🔥\n" +"with "+totalGroups+" Groups 🤼");

		
		
		if(Type=="text")			 
		{	
			for(int i=0; i<GroupIdlist.size(); i++) 		
			{
				LogMethods.SleepLogic(i, deviceName, whatsAppAccount, ""+totalGroups);
				String textResponse=sendTextMessageToGroups(GroupIdlist.get(i).toString(), InstanceId);
				//String textResponse="Demo";

				LogMethods.ResponseLogic(i, deviceName, whatsAppAccount, ""+totalGroups, textResponse, GroupIdlist.get(i).toString());
			}
		
		}	
		else if (Type=="media") 
		{
			for(int i=0; i<GroupIdlist.size(); i++) 		
			{
				LogMethods.SleepLogic(i, deviceName, whatsAppAccount, ""+totalGroups);	
				String mediaResponse=sendFileMessageToGroups(GroupIdlist.get(i).toString(), InstanceId);
				LogMethods.ResponseLogic(i, deviceName, whatsAppAccount, ""+totalGroups, mediaResponse, GroupIdlist.get(i).toString());
			}
		}
		*/
	}

	
	
		
	

	public static String sendFileMessageToGroups(String GroupId, String InstanceId) throws Exception
	{
	    String Filename=Utils.setMediaFileName();
		String MediaUrl="https://wapiconnect.com/messages/media/"+Filename;
		RestAssured.baseURI = "https://wapiconnect.com";
		String mediaresponse=  given().queryParam("group_id", GroupId).queryParam("type", "media")
		.queryParam("message", "media demo message")
		.queryParam("media_url", MediaUrl)
		.queryParam("filename", Filename)
		.queryParam("instance_id", InstanceId)
		.queryParam("access_token", "11c91f56d57f6b121c22f6d18c968225")
		.when().post("api/sendgroupmsg.php")
		.then().assertThat().statusCode(200).extract().response().asString();
	    return mediaresponse;
	   
		
	}
	
	
	public static String sendTextMessageToGroups(String GroupId, String InstanceId ) throws Exception
	{
			String message=Utils.setMessage();
			RestAssured.baseURI = StringResources.Baseuri;
	       	String textresponse = given().queryParam("group_id", GroupId).queryParam("type", "text")
			.queryParam("message", message)
			.queryParam("instance_id", InstanceId)
			.queryParam("access_token", StringResources.AccessToken)
			.when().post("api/sendgroupmsg.php")
			.then().assertThat().statusCode(200).extract().response().asString();
	       	return textresponse;
	       
		
	}	
}
