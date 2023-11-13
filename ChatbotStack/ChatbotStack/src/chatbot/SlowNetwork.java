package chatbot;
import java.util.Scanner;

public class SlowNetwork {
     Scanner scanner = new Scanner(System.in);
	public void slowNetworkProcess() {
	   System.out.println("Enter your current location: ");  
	   String curLoc = scanner.nextLine();
	   System.out.println("Sorry for the inconvenience. Currently we are working on this location to resolve slow network issue");
	   System.out.println("We will sort this issue by today so you will get high network speed on Tommorrow");
	   Main.exitMessages();
   }
}
