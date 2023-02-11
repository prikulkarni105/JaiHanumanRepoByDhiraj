package WPAPI;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;

import Resources.StringResources;

public class MainPOSTLogic {

	public static void sendMessageToGroups(String testName,String Type, String GroupIdFilename, String InstanceId) throws Exception
	{
		LogMethods.printOnConsole("🔥 "+testName+" Started 🔥");

		
		 
	
    	String deviceName=testName.substring(0, 7);   //DeviceName Extracted From TestName
    	String whatsAppAccount= StringUtils.substringBetween(testName, "_", "_") + " WhatsApp";
		ArrayList<String> GroupIdlist = Utils.readGroupIdFromLocalFile(GroupIdFilename); 
		int totalGroups=GroupIdlist.size();
		
		LogMethods.printOnConsole("🔥 "+testName+" Started 🔥\n" +"with "+totalGroups+" Groups 🤼");

		
		
		if(Type=="text")			 
		{
			
			for(int i=0; i<GroupIdlist.size(); i++) 		
			{
				
				if(i%5==0)
				{
					LogMethods.printOnConsole("🔴 Failed to send on - \n" +GroupIdlist.get(i)+"\n"+deviceName+"\t"+whatsAppAccount);

					
					//Thread.sleep(15000);	
				}
				else {
					LogMethods.printOnConsole("🟢 Sent to  - \n" +GroupIdlist.get(i)+"\n"+deviceName+"\t"+whatsAppAccount);

					//Thread.sleep(5000);							
				}
				

				//sendTextMessageToGroups(GroupIdlist.get(i).toString(), InstanceId);
				


			}
		}	
		else if (Type=="media") 
		{
			for(int i=0; i<GroupIdlist.size(); i++) 		
			{
				if(i%5==0)
				{
					Thread.sleep(15000);
				}
				
				//sendFileMessageToGroups(GroupIdlist.get(i).toString(), InstanceId);
				

			}
		}
		
}

	
	
		
	

	public static void sendFileMessageToGroups(String GroupId, String InstanceId) throws Exception
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
		
		
		JsonPath js=new JsonPath(mediaresponse);  //used to parsing response
		
		String statusresponse = js.getString("status");
		System.out.println(statusresponse);
		
	    String messageresponse =	js.getString("message");
	    System.out.println(messageresponse);
	    
	    if(statusresponse.equalsIgnoreCase("Success") || statusresponse.equalsIgnoreCase("Pending"))
	    {
	    }
	    else
	    {

	    }
		
	}
	
	
	public static void sendTextMessageToGroups(String GroupId, String InstanceId ) throws Exception
	{
			String message=Utils.setMessage();
			RestAssured.baseURI = StringResources.Baseuri;
	       	String textresponse = given().queryParam("group_id", GroupId).queryParam("type", "text")
			.queryParam("message", message)
			.queryParam("instance_id", InstanceId)
			.queryParam("access_token", StringResources.AccessToken)
			.when().post("api/sendgroupmsg.php")
			.then().assertThat().statusCode(200).extract().response().asString();


	       	if(textresponse.contains("error")) {
	       		
	       	
	       	System.out.println("************************ Response ********************");
	       	    System.out.println(textresponse);
	       	System.out.println("************************ Response ********************");

	       	}
		
	}	
}
