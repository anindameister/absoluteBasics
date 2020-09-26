package absoluteBasics;

import java.util.ArrayList;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner userInputoriginal= new Scanner(System.in);    
		System.out.print("enter a word to check if it's palindrome or not:");  
		String userInput= userInputoriginal.nextLine();  
		userInputoriginal.close();

		
		
		
		
	
		ArrayList<String> userInput2string2list =new ArrayList<String>();
		ArrayList<String> userInput2string2list2 =new ArrayList<String>();
		for (String retval: userInput.split("")) {

			
			
			userInput2string2list.add(retval);
			
		}
		for (int j=userInput2string2list.size()-1;j>=0;j--) {
			userInput2string2list2.add(userInput2string2list.get(j));
		
			
		}
		
		//https://www.tutorialspoint.com/How-to-create-a-string-from-a-Java-ArrayList#:~:text=To%20convert%20the%20contents%20of,using%20the%20toString()%20method.

		
		StringBuffer sb = new StringBuffer();
		
	      for (String s : userInput2string2list2) {
	          sb.append(s);
	       }
	      String str = sb.toString();
	      
	      
	      System.out.println(str);
	      System.out.println(userInput);
	      
	      if (userInput.contentEquals(str)==true){
	    	  System.out.println("input palindrome");
	    	  
	      }else {
	    	  System.out.println("input NOT palindrome");
	      }
		
			
			 
	}

}
