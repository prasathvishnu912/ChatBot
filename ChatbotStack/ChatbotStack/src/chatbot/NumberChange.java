package chatbot;
import java.io.*;
import java.util.Scanner;
public class NumberChange {
	 Scanner scanner = new Scanner(System.in);
	 void listAvailableFancyNumbers() {
		FileClass.loadingMessages("/home/suren-16923-test/Documents/ChatbotStack/ChatbotStack/src/fancyNums");
	}
	 String getSelectedNum() {
		
		System.out.println("Enter any one option between 1 to 30: ");
		int selectedOpt = scanner.nextInt();
		if(selectedOpt<0 || selectedOpt>30) {
			getSelectedNum();
		}
		try {
			FileReader fReader = new FileReader("/home/suren-16923-test/Documents/ChatbotStack/ChatbotStack/src/fancyNums");
		    BufferedReader buffReader = new BufferedReader(fReader);
		    String curNum = buffReader.readLine();
		    
		    while(curNum!=null) {
		    	String[] numArr = curNum.split("->");
		    	if(Integer.parseInt(numArr[0])==selectedOpt) {
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
	
	public void NumberChangeProcess(String s) {
		
		System.out.println(String.format("Enter your %s old number: ", s));
		String oldNum = scanner.nextLine();
		if(!Main.numberChecking(oldNum)) {
			NumberChangeProcess("valid");
		}
		System.out.println("We have a list of fancy numbers!!");
		
		System.out.println();
		listAvailableFancyNumbers();
		System.out.println();
		
		String selectedNum = getSelectedNum();
		System.out.println("This is your new Mobile number -> "+selectedNum);
		System.out.println("Communicate to your Friends with new Fancy number!");
		Main.exitMessages();
		
	}  
	
}
