package WPAPI;

public class LogMethods {

	
	public static void printOnConsole(String message) {
	    String SET_BOLD_TEXT = "\033[0;1m";
	    String SET_PLAIN_TEXT = "\033[0;0m";

		System.out.println("\n**************************** \t"+ SET_BOLD_TEXT+message+SET_PLAIN_TEXT + "\t ***********************************\n");
	}
	
	
	public static void insertIntoDatabase(String query) {
		
		
		
		
	}
	
}
