package absoluteBasics;



public class Fibonacci2 {

		
		public static void main(String[]args) {
			
			
			String[] myList = {};
			int j;
			for(j=1; j<50; j++){
				String randomString = "a";
				randomString.repeat(j);
				
				int listLength=myList.length;
				
	            String arbitaryVariable;
	            
	            arbitaryVariable=randomString.repeat(j);
	            
	            if (myList.length!=0) {
	            	
	            	listLength=listLength+j;
	            	myList[listLength]=arbitaryVariable;
	            	
	            }else {
	            	myList[listLength]=arbitaryVariable;
	            }
	            

	           
			}
			
			int foo0 = Integer.parseInt(myList[0]);
			foo0=0;
			int foo1 = Integer.parseInt(myList[1]);
			foo1=1;


				
					System.out.println("No. 1 from Fibonacci series is "+foo0);
					System.out.println("No. 2 from Fibonacci series is "+foo1);
					int i;
					for(i=2; i<myList.length; i++){

					  myList[i]=myList[i-1]+myList[i-2];
					  System.out.println("No."+i+1+"from Fibonacci series is "+myList[i]);
					}

		}

	}


