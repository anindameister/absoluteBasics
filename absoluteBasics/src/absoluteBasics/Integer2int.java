package absoluteBasics;
import java.util.Arrays;
public class Integer2int {
	

		// Program to convert int array to Integer array in Java
		public static void main (String[] args)
		{
			int[] primitiveArray = { 1, 2, 3, 4, 5 };

			Integer[] boxedArray = new Integer[primitiveArray.length];

			for (int i = 0; i < primitiveArray.length; i++) {
				boxedArray[i] = Integer.valueOf(primitiveArray[i]);
			}

			System.out.println(Arrays.toString(boxedArray));
		}
	}


