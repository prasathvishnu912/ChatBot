package chatbot;

import java.io.*;
import java.util.Stack;

public class FileClass {

	public  static void loadingMessages(String url) {
	       File file = new File(url);
	       Stack<String> stack=new Stack<>();
	        try {
	        	FileReader reader = new FileReader(file);
	        	BufferedReader bReader = new BufferedReader(reader);
	        	String line = bReader.readLine();
	        	while(line != null) {
	        		stack.push(line);
	        		line = bReader.readLine();
	        	}
	        	bReader.close();
	        	
			} catch (IOException e) {
				e.printStackTrace();
			}
	        System.out.println();
	  	  while(!stack.isEmpty()) {
	  		  System.out.println(stack.pop());
	  	  }
	       System.out.println();
		}
	  

}
