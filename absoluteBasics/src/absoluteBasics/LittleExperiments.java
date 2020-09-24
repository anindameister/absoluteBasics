
package absoluteBasics;

import java.util.ArrayList;

public class LittleExperiments {
  public int fibonaciNumbers.get(0);
  public int fibonaciNumberSecondElement;
  public int ithElement;
  public int i2thElement;
  
  
  public static void main(String [] args) {
    LittleExperiments s = new LittleExperiments();

  
  ArrayList<String> fibonaciNumbers =new ArrayList<String>();
	

	
	int j;
	
	for(j=1;j<50;j++) {
		
		String randomString="abc";
		String repeatedrandomString = randomString.repeat(j);
		fibonaciNumbers.add(repeatedrandomString);

	}
    s.fibonaciNumbers.get(0) = 0;
    s.fibonaciNumberSecondElement = 1;
    try {
      int b = (Integer) LittleExperiments.class.getField("fibonaciNumberFirstElement").get(s);
//      System.out.println(b);
    } catch  (Exception e)  {
      e.printStackTrace();
    } 
    
    try {
        int b = (Integer) LittleExperiments.class.getField("fibonaciNumbers.get(i-1)").get(s);
//        System.out.println(b);
      } catch  (Exception e)  {
        e.printStackTrace();
      } 
    System.out.println("No. 1 from Fibonacci series is "+s.fibonaciNumberFirstElement);
	System.out.println("No. 2 from Fibonacci series is "+s.fibonaciNumberSecondElement);
	int i;
	
	for(i=2; i<fibonaciNumbers.size(); i++){
		
		System.out.println(fibonaciNumbers.get(i-1));
		
		fibonaciNumbers.get(i)=fibonaciNumbers.get(i-1)+fibonaciNumbers.get(i-2);
//		System.out.println("No."+ i+1 +"from Fibonacci series is "+s.ithElement);
		}

	
}
 
}