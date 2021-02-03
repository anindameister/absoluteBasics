package w3schoolsJavaMethods;

import java.util.ArrayList;
import java.util.List;

public class Loop2BreakDownRecurssion {
	
//	n(n+1)/2
	int Ap() {
		int result=10*(10+1)/2;
		return result;
	}
	
	void LoopZeroToTen() {
		List<Integer> zeroToTen=new ArrayList();

		
		for (int i=0;i<=10;i++) {
			
			System.out.println(i);
		}
		
	}
	
	/*
	 * x=0
list=[]
for i in range(0,11):
    
    x=x+i
    list.append(x)
print(list[-1])
	 */
	
	void LoopAP() {
		List<Integer> mission55=new ArrayList();
		int x=0;
		for (int i=0;i<=10;i++) {
			x=x+i;
			mission55.add(x);
			
			
			
		}
		
		System.out.println(mission55.get(10));
	}
	

	
	

	

}
