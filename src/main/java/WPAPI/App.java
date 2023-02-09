package WPAPI;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

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
    	ArrayList<String> groupId=new ArrayList<>();
    		XSSFWorkbook workbook=new XSSFWorkbook("C:\\Users\\patil\\Desktop\\API\\A1_DUAL.xlsx");
    		XSSFSheet sheet=workbook.getSheetAt(0);
    		int rowcount=sheet.getLastRowNum()+1;
    		int coloumncount=sheet.getRow(1).getLastCellNum();
    		System.out.println(rowcount);         
    		System.out.println(coloumncount);

    		System.out.println("Hello");
    		Object[][] readExcel=new Object [rowcount][coloumncount];
    		for(int i=1; i<rowcount; i++)
    		{

    			XSSFRow row=sheet.getRow(i);
    			
    			for(int j=1; j<coloumncount; j++)
    			{
                  
                	   readExcel[i][j]= groupId.add(row.getCell(1).toString());
                			   
       				System.out.println("readExcel["+i+"]["+j+"]="+row.getCell(1).toString());
                   
    				

    			//	readExcel[i][j]=row.getCell(j).toString();
    			//	System.out.println("readExcel["+i+"]["+j+"]="+row.getCell(j).toString());
    				
    			}
    			
    		}
   
    		System.out.println("Inside End");

    		System.out.println(groupId);

    
    		System.out.println(groupId.size());
    } 
    
    	
    	
    
}
