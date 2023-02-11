package WPAPI;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Resources.StringResources;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import io.restassured.path.json.JsonPath;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	
    	String testName="Device1_FM_Test";
    	String deviceName=testName.substring(0, 7);
    	String whatsAppAccount= StringUtils.substringBetween(testName, "_", "_") + " WhatsApp";

		LogMethods.printOnConsole("🔥 Device1_FM_Test Started 🔥");
		LogMethods.printOnConsole("🔥 "+deviceName+" 🔥");
		LogMethods.printOnConsole("🔥 "+whatsAppAccount+" 🔥");

    } 
    
    	
    	
    
}
