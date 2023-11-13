package chatbot;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SetCallerTune {
	Scanner scanner = new Scanner(System.in);
	
	String selectingTunes(){
		System.out.println("Select one tune between 1 to 10");
		int option = scanner.nextInt();
		if(option > 10 || option <0) {
			selectingTunes();
		}
		try {
			FileReader fReader = new FileReader("/home/suren-16923-test/Documents/ChatbotStack/ChatbotStack/src/CallerTunes");
		    BufferedReader buffReader = new BufferedReader(fReader);
		    String curNum = buffReader.readLine();
		    
		    while(curNum!=null) {
		    	String[] numArr = curNum.split("->");
		    	if(Integer.parseInt(numArr[0])==option) {
		    		return numArr[1];
		    	};
		    	curNum = buffReader.readLine();
		    }
		   
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		return "";
	}
	
   public void setCallerTuneProcess() {
	   System.out.println("We have a list of Caller-tunes.");
	   FileClass.loadingMessages("/home/suren-16923-test/Documents/ChatbotStack/ChatbotStack/src/CallerTunes");
	  String selectedTune =  selectingTunes();
	  System.out.println("Your caller-tune now will be "+ selectedTune);
	  System.out.println("Enjoy with your caller-tune!!");
	  Main.exitMessages();
   }
}
