package chatbot;

import java.util.Scanner;



public class NetworkIssue {
	 Scanner scanner = new Scanner(System.in);
	
	 void listNetworkIssue() {
		 FileClass.loadingMessages("/home/suren-16923-test/Documents/ChatbotStack/ChatbotStack/src/networkIssue");
	}
	
	public void networkIssue() {
		System.out.println("Enter what type of Network issue you faced?");
		String s = scanner.nextLine();
		System.out.println(String.format("You faced %s related problems.", s));
		System.out.println("Ok, we will work on this problem and i list some suggestion to you this might resolve your problems.");
        System.out.println();
		listNetworkIssue();	
        Main.exitMessages();
	}

}

