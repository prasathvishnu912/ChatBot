package chatbot;

import java.util.Scanner;

public class BalanceChecking {
	  Scanner scanner = new Scanner(System.in);
	public  void listRechargePlansList() {
		 FileClass.loadingMessages("/home/suren-16923-test/Documents/ChatbotStack/ChatbotStack/src/rechargePlans");
	}
	public  void rechargePlanActivation() {
		 System.out.println("Select any one Recharge plan!");
			 int rechargeOption = scanner.nextInt();
			 if(rechargeOption>0 && rechargeOption<7) {
				System.out.println("Your recharge process is Done!");
				Main.exitMessages();
			 }
			 else {
 				 System.out.println("Select right option!");
 				 rechargePlanActivation();
 				 
 			 }
	}
	
	 void rechargeOptionChecking() {
		String reply = scanner.nextLine();
		 if(reply.toLowerCase().equals("yes")) {
			 listRechargePlansList();
			rechargePlanActivation();
		 }else if(reply.toLowerCase().equals("no")) {
			 System.out.println("Ok, if you want use our services you should subscribe our plan.");
			 Main.exitMessages();
		 }else {
			 System.out.println("Enter valid option!");
			 rechargeOptionChecking();
		 }
	}
	
	  boolean numberChecking(String mobNum) {
		 if(mobNum.length()!=10) 
			return false;
		 return true;
	}
	
     public void processBalanceChecking(String s) {
    	 System.out.println(String.format("Enter %s mobile Number: ", s));
		 String mobNum = scanner.nextLine();
    	boolean cond = numberChecking(mobNum);
    	if(cond) {
 			 System.out.println("Your recharge plan is expired!\nIf you want to recharge your phone enter Yes otherwise Enter No.");
 			  rechargeOptionChecking(); 
 		 }else {
 			 processBalanceChecking("valid");
 		 }
 			  
     }

}
