package WPAPI;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import java.util.ArrayList;

import Resources.StringResources;

public class MainPOSTLogic {

	public static void sendMessageToGroups(String Type, String GroupIdFilename, String InstanceId) throws Exception
	{
			
		ArrayList<String> GroupIdlist = Utils.readGroupIdFromLocalFile(GroupIdFilename); 
		int count=1;
		 
		if(Type=="text")			 //here send message if type is text only
		{
			
			for(int i=0; i<GroupIdlist.size(); i++) 		//for loop used to send message using particular group id
			{
				if(count%5==0)
				{
					Thread.sleep(15000);
				}
				
				sendTextMessageToGroups(GroupIdlist.get(i).toString(), InstanceId);
				

			}
		}	
	//here send message if type is media only
		else if (Type=="media") 
		{
			for(int i=0; i<GroupIdlist.size(); i++) 		//for loop used to send message using perticular group id
			{
				if(count%5==0)
				{
					Thread.sleep(15000);
				}
				
				sendFileMessageToGroups(GroupIdlist.get(i).toString(), InstanceId);
				

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
			
			JsonPath js=new JsonPath(textresponse);
			
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
}
