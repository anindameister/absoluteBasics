package absoluteBasics;

import java.util.ArrayList;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> fibonaciNumbers =new ArrayList<String>();
		ArrayList<Long> fibonaciNumbersInt =new ArrayList<Long>();
		

		
		int j;
		
		for(j=1;j<50;j++) {
			
			String randomString="121";
			String repeatedrandomString = randomString.repeat(j);
			fibonaciNumbers.add(repeatedrandomString);
			
	
		}

		fibonaciNumbers.set(0,"0");
		fibonaciNumbers.set(1,"1");
		fibonaciNumbersInt.add(Long.parseLong(fibonaciNumbers.get(0)));
		fibonaciNumbersInt.add(Long.parseLong(fibonaciNumbers.get(1)));


		System.out.println("No.1 from Fibonacci series is "+fibonaciNumbersInt.get(0));
		System.out.println("No.2 from Fibonacci series is "+fibonaciNumbersInt.get(1));

		
		int i;

		for(i=2; i<fibonaciNumbers.size(); i++){
		
//			fibonaciNumbersInt.set(i,(fibonaciNumbersInt.get(i-1)+fibonaciNumbersInt.get(i-2)));
			
			
			fibonaciNumbersInt.add(fibonaciNumbersInt.get(i-1)+fibonaciNumbersInt.get(i-2));
			int p=i+1;
			System.out.println("No."+ p +" from Fibonacci series is "+fibonaciNumbersInt.get(i));
			}

		

		
		
			
			
		

		
		
	}
	public static void repeatCharacter(int number) {
		System.out.println('b'*number);
		
	}

	
	
}

