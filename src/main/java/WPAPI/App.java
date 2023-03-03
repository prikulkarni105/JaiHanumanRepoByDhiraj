package WPAPI;

import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.github.siyoon210.ogparser4j.OgParser;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	String link = null;
    	String category;
    	String language;
    	String country;
    	int count=93074; //Already defined
    	
    	try{    

    		
    		
    		Connection con=DriverManager.getConnection(  
    		"jdbc:mysql://89.117.53.127:3306/groupsmania","GroupsMania","Ads@40000");  
    		//here sonoo is database name, root is username and password  
    		Statement stmt=con.createStatement();  
    		ResultSet rs=stmt.executeQuery("SELECT *  FROM groups");

    		int i=0;
    		int valid_groups=0;
    		while(rs.next())  
        	
    		{
    			i++;
    			link=rs.getString(5);
    			category=rs.getNString(7);
    			country=rs.getNString(8);
    			language=rs.getString(9);


        		OgParser ogParser = new OgParser();
        		com.github.siyoon210.ogparser4j.OpenGraph openGraph = ogParser.getOpenGraphOf("https://chat.whatsapp.com/"+link);
        		String name=openGraph.getContentOf("title").getValue();    	
        		String image=openGraph.getContentOf("image").getValue();    	
        		

        		if(!image.contains("static.whatsapp.net")) {        		
    			    
    			    //Query To Insert into Updated DB
        		
        			
        			try {
        			
    	    		Statement update_statement=con.createStatement();  
    	    		int rs_update=update_statement.executeUpdate("INSERT INTO updated_groups(link, name, category, country, language, image) VALUES ('"+link+"','"+name+"','"+category+"','"+country+"','"+language+"','"+image+"')");

    	    		valid_groups++;
        			}
        			catch(Exception e) {
        	    		System.out.println(e.getMessage());
        	    		continue;
        			}
        			
        		
        		}
    			System.out.println("****************************************");
    			System.out.println("Completed " + i +"  Of " +count +"  Group Links");
    			System.out.println("Valid Groups " + valid_groups);

    			System.out.println("****************************************");

        	}
			con.close();  

    		
    	    	
    		}
    	catch(Exception e){ 
    		
    		System.out.println(e.getMessage());
    	
    	}  
    		
    		 
    		
		}  
    	
    	
    		     	
    } 
    
    	
    	
    

