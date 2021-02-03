package w3schoolsJavaMethods;



public class Main {
	static void myMethod() {
		System.out.println("I just got executed!");
	  }
	static int myMethod(int x) {
		return x;
	  }
	
	static void TvSeriesHimymFamily(String fname, int age) {
		System.out.print( fname + " Himym"+ " is "+age+" years old ");
	}
	
	static int addition(int x, int y) {
		return x+y;
	}
	
	static void legalAlcoholDrinking(int age) {
		if (age>=18) {
			System.out.println("the person can drink alcohol");
		}else if (age<18 && age>=10) {
			System.out.println("the person cannot drink alcohol");

			
		}else if(age<10) {
			System.out.print("dont even think about giving alcohol or sharing the idea of it's existence");
			
		}
	}
	
	
	
	public static void main(String[]args) {
	    myMethod();
	    myMethod();
	    TvSeriesHimymFamily("Barney",32);
	    TvSeriesHimymFamily("Ted",28);
	    TvSeriesHimymFamily("Marshall",34);
	    TvSeriesHimymFamily("Lily",33);
	    int z=addition(17,07);
	    System.out.println(z);
	    System.out.println(addition(17,07));
	    TvSeriesHimymFamily("Marvin",9);
	    System.out.print(" and since the age is that ");
	    legalAlcoholDrinking(9);
	    System.out.println("**************");
	    System.out.println(MethodOverloading.myMethod(9));
	    
	    Recurssion r=new Recurssion();
	    int result = r.sum(10);

	    System.out.println(result);
	    
	    Loop2BreakDownRecurssion aninda=new Loop2BreakDownRecurssion();
	    System.out.println(aninda.Ap());
	    System.out.println("*******************");
	    
	    Loop2BreakDownRecurssion aninda1=new Loop2BreakDownRecurssion();
	    aninda1.LoopZeroToTen();
	    System.out.println("^^^^^^^^^^^^");
	    Loop2BreakDownRecurssion aninda2=new Loop2BreakDownRecurssion();
	    aninda2.LoopAP();
	    


	}

}
