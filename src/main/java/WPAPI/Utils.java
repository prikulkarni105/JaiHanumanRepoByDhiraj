package WPAPI;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utils {

	//method to pick random message from 5 text messages
	public static String setMessage() throws Exception
	{
				String messages= new String[] {"https://wapiconnect.com/messages/1.txt",
				"https://wapiconnect.com/messages/2.txt",
				"https://wapiconnect.com/messages/3.txt",		
				"https://wapiconnect.com/messages/4.txt",
				"https://wapiconnect.com/messages/5.txt",
				}[(int)(Math.random()*5)];

		URL url = new URL(messages);
		Scanner myReader = new Scanner(url.openStream());
		StringBuilder stringBuilder = new StringBuilder();
		String ls = System.getProperty("line.separator");
		
		while (myReader.hasNextLine()) {
		    String data = myReader.nextLine();
			stringBuilder.append(data);
			stringBuilder.append(ls);
		  }
		  myReader.close();
		
		
		String message = stringBuilder.toString();
	//	System.out.println(message);
		return message;	

}
	
	//method is to red data from excel sheet
	public static ArrayList<String> readGroupIdFromLocalFile(String GroupIdFilepath) throws IOException
	{
    	ArrayList<String> groupIds=new ArrayList<>();

		XSSFWorkbook workbook=new XSSFWorkbook(GroupIdFilepath);
		XSSFSheet sheet=workbook.getSheetAt(0);
		int rowcount=sheet.getLastRowNum()+1;
		int coloumncount=sheet.getRow(1).getLastCellNum();
		
		Object[][] readExcel=new Object [rowcount][coloumncount];
		for(int i=1; i<rowcount; i++)
		{
			XSSFRow row=sheet.getRow(i);
			
			for(int j=1; j<coloumncount; j++)
			{
				
				readExcel[i][j]=groupIds.add(row.getCell(1).toString());
										
			}
		}
		
		workbook.close();
		return groupIds;
	}
	
	
	 public static void readMediaFromServer() throws Exception, IOException {
	    	
	    	
	    	FTP ftpClient = new FTPClient();    			//FTP Client Object From Apache Commons Library
			ftpClient.connect("89.117.53.127", 21);        //Server Address and Port Number
			((FTPClient) ftpClient).login("indulgencesystems", "Ads@40000");  // Username And Password
			FTPFile[] files = ((FTPClient) ftpClient).listFiles();   //Get all Files From Server Folder
			FileWriter myWriter = new FileWriter("mediaFileNames.txt");  // Create or replace new file
			for (FTPFile file : files) {
				
			    String filename = file.getName();			//get file name
			    if(!filename.startsWith(".")) {			
			       myWriter.write(filename+"\n");			//write filename in local text file 
			    }
			    
			}
		      myWriter.close();                           //close writer

			 
			((FTPClient) ftpClient).logout();				//logout ftp
			ftpClient.disconnect();					//disconnect ftp
	    	
	    	
	    }
	 
	 
	 public static String setMediaFileName() throws Exception
	 {
		
	        List<String> lines=Files.readAllLines(Paths.get("mediaFileNames.txt"));
	        Random random = new Random();
	        return lines.get(random.nextInt(lines.size()));
	 }
}
