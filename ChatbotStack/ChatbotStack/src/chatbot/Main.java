package chatbot;


import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	
	static boolean numberChecking(String mobNum) {
		 if(mobNum.length()!=10) 
			return false;
		 return true;
	}
	
	public static void exitMessages() {
		System.out.println();
		System.out.println("Thank you for using Jio network Customer service!");
		
	}
	public static void entryMessages() {
   	 
        System.out.println("Hi!, Welcome to Jio network!\nWhat's your name?");
        String name = scanner.nextLine();
        System.out.println("Hi "+ name + ", I hope you are good. Select the options below.");
        FileClass.loadingMessages("/home/suren-16923-test/Documents/ChatbotStack/ChatbotStack/src/initialMsgs");
		 
        System.out.println("Enter any of the Option: ");
		int option = scanner.nextInt();
        
        switch(option) {
        case 1 : 
        	BalanceChecking balCheck = new BalanceChecking();
            balCheck.processBalanceChecking("");
        	break;
        case 2 : 
        	NetworkIssue netIssue = new NetworkIssue();
        	netIssue.networkIssue();
       	    break;
        case 3 : 
       	    SlowNetwork slowNet = new SlowNetwork();
            slowNet.slowNetworkProcess();
       	    break;
        case 4 : 
       	   SetCallerTune callTune = new SetCallerTune();
       	   callTune.setCallerTuneProcess();
       	   break;
        case 5 : 
       	   NumberChange numChange = new NumberChange();
       	   numChange.NumberChangeProcess("");
       	   break; 
        }

	}
    public static void main(String[] args) {
    	  entryMessages();      
    }

}
