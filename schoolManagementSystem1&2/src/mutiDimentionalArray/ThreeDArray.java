package mutiDimentionalArray;

public class ThreeDArray {
	
	public int aMethod() {
		int[][] myNumbers = { {17, 02, 29, 04}, {7, 6, 10, 12}, {88,58,47,91} };
		int x = myNumbers[0][1];
		System.out.println("the length of the array is: "+myNumbers.length);
		return x;
		
		
		/*
		 * (17,7,88),(2,6,58),(29,10,47),(4,12,91)
		 */
	}

}
