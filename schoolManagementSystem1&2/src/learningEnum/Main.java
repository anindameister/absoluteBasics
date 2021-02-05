package learningEnum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Level myVar = Level.MEDIUM;

		
		
		switch(myVar) {
		case LOW:
			System.out.println("your level is low in regards to java");
			
			break;
			/*
			 * it should be all in caps
			 * Medium is no-no
			 * MEDIUM
			 */
		case MEDIUM:
			System.out.println("your level is medium in regards to java");
			break;
		case HIGH:
			System.out.println("your level is high in regards to java");
			break;
			
		}
		/*
		 * object of Enum called Level is being created with the object name myVar2
		 */
		for (Level myVar2 : Level.values()) {
			  System.out.println(myVar2);
			}
		
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter username");

	    String userName = myObj.nextLine();  // Read user input
	    System.out.println("Username is: " + userName);  // Output user input
	    
	    System.out.println("*******************************************************");
	    
	    
	    Scanner myObj2 = new Scanner(System.in);

	    System.out.println("Enter name, age and salary:");

	    // String input
	    String name = myObj2.nextLine();

	    // Numerical input
	    int age = myObj.nextInt();
	    double salary = myObj2.nextDouble();

	    // Output input by user
	    System.out.println("Name: " + name);
	    System.out.println("Age: " + age);
	    System.out.println("Salary: " + salary);


	}
	
	
}
