package absoluteBasics;

public class ReverseArray {
	static void reverse(Integer a[], Integer n) 
    { 
        Integer[] b = new Integer[n]; 
        Integer j = n; 
        for (Integer i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        } 
  
        /*prIntegering the reversed array*/
        System.out.println("Reversed array is: \n"); 
        for (Integer k = 0; k < n; k++) { 
            System.out.println(b[k]); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        Integer [] arr = {10, 20, 30, 40, 50}; 
        reverse(arr, arr.length); 
    } 

}
