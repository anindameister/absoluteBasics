package absoluteBasics;
import java.util.*;  
public class ArmstrongNumber {

	public static void main(String[] args) {
	
		Scanner userInputoriginal= new Scanner(System.in);    
		System.out.print("enter a number to check if it's armstrong or not:");  
		int userInput= userInputoriginal.nextInt();  
		userInputoriginal.close();
		String userInput2string = Integer.toString(userInput); 
		ArrayList<String> userInput2string2list =new ArrayList<String>();
//		https://www.tutorialspoint.com/java/java_string_split.htm
	      for (String retval: userInput2string.split("")) {
	  		
	    	 int retvalInted=Integer.parseInt(retval); 
	    	 int cubeddRetvalInted=retvalInted*retvalInted*retvalInted;
	    	 String stringedCubeddRetvalInted=Integer.toString(cubeddRetvalInted);
	    	 

			userInput2string2list.add(stringedCubeddRetvalInted);
//	          System.out.println(userInput2string2list);
	       }
		

		int lengthUserInput=userInput2string2list.size();
		
		ArrayList<Integer> userInput2string2listInteger =new ArrayList<Integer>();
		int i;
		for (i=0;i<lengthUserInput;i++) {
			userInput2string2listInteger.add(Integer.parseInt(userInput2string2list.get(i)));
	
//			System.out.println(userInput2string2listInteger);
		
			}
//		https://stackoverflow.com/questions/16242733/sum-all-the-elements-java-arraylist	
		int sum = 0;
		for(int j = 0; j < userInput2string2listInteger.size(); j++) {
		    sum += userInput2string2listInteger.get(j);
		}
		if (userInput==sum) {
//			System.out.println(userInput);
//			System.out.println(sum);
			System.out.println("congrats, you have chosen an armstrong number");
			
		}else {
//			System.out.println(userInput);
//			System.out.println(sum);
			System.out.println("armstrong number have not been chosen by you");
			
		}
	

		
	

	}

}
