package absoluteBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimitiveIntegerArrayAppend {
//	private static Integer[] append(Integer[] arr, int element)
	public static Integer[] append(Integer[] arr, int element) {
		List<Integer> list = new ArrayList<>(Arrays.asList(arr));
		list.add(element);

		return list.toArray(new Integer[0]);
	}

	public static void main(String[] args) {

		Integer[] nums = { 1, 2, 3, 4 };

		nums = append(nums, 5);	
		// add 5 to nums[]
		System.out.println(Arrays.toString(nums));
	}

}
