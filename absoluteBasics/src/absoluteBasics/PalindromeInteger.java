package absoluteBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PalindromeInteger {
	public static void main(String[] args) {
		Scanner userInputoriginal= new Scanner(System.in);    
		System.out.print("enter a number to check if it's palindrome or not:");  
		int userInput= userInputoriginal.nextInt();  
		userInputoriginal.close();
//		https://www.programiz.com/java-programming/examples/digits-count
		int count = 0;
		int userInput2=userInput;
		while(userInput2 != 0)
        {
          
			userInput2 /= 10;
            ++count;
        }
//		System.out.println(count);
//		System.out.println("_________");

		
		String userInput2string = Integer.toString(userInput); 
		 

		
		
	
		ArrayList<String> userInput2string2list =new ArrayList<String>();
		ArrayList<String> userInput2string2list2 =new ArrayList<String>();
		for (String retval: userInput2string.split("")) {

			int retvalInted=Integer.parseInt(retval); 
			String stringedRetvalInted=Integer.toString(retvalInted);
			userInput2string2list.add(stringedRetvalInted);
			
		}
		for (int j=userInput2string2list.size()-1;j>=0;j--) {
			userInput2string2list2.add(userInput2string2list.get(j));
		
			
		}
		StringBuffer sb = new StringBuffer();
		
	      for (String s : userInput2string2list2) {
	          sb.append(s);
	       }
	      String str = sb.toString();
	      int IntedStr=Integer.parseInt(str); 
	      
//	      System.out.println(IntedStr);
	      
	      if (userInput==IntedStr){
	    	  System.out.println("input palindrome");
	    	  
	      }else {
	    	  System.out.println("input NOT palindrome");
	      }
		
			
			 
	}}