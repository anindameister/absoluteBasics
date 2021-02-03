# Java Arrays [[1]](#1)

```
String[] cars;
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
```
```
int[] myNum = {10, 20, 30, 40};
```
```

String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]);
// Outputs Volvo
```
```
cars[0] = "Opel";
```

```
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
cars[0] = "Opel";
System.out.println(cars[0]);
// Now outputs Opel instead of Volvo
```
```
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars.length);
// Outputs 4
```
```

String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (int i = 0; i < cars.length; i++) {
  System.out.println(cars[i]);
}

```
```
//Loop Through an Array with For-Each

for (type variable : arrayname) {
  ...
}
```
```
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}
```

### Multidimensional Arrays

1. 
```
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
```
2. 
```
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
int x = myNumbers[1][2];
System.out.println(x); // Outputs 7
```
3. 
```
public class Main {
  public static void main(String[] args) {
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    for (int i = 0; i < myNumbers.length; ++i) {
      for(int j = 0; j < myNumbers[i].length; ++j) {
        System.out.println(myNumbers[i][j]);
      }
    }
  }
}
```
![understanding2dArrayThruGraphVisuals](https://github.com/anindameister/absoluteBasics/blob/master/snaps/19.PNG)

## java methods

- **static** means that the method belongs to the Main class and not an object of the Main class.
```
package w3schoolsJavaMethods;

public class Main {
	static void myMethod() {
	    // code to be executed
	  }

}
```

- **print** and **println** [[2]](#2)

```
package w3schoolsJavaMethods;

public class Main {
	static void myMethod() {
		System.out.println("I just got executed!");
	  }
	
	static void MaulikFamily(String fname, int age) {
		System.out.print(fname + " Maulik"+ " is "+age+" years old");
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
	    MaulikFamily("Aninda",32);
	    MaulikFamily("Arunava",28);
	    MaulikFamily("Asish",72);
	    MaulikFamily("Kalpana",63);
	    int z=addition(17,07);
	    System.out.println(z);
	    System.out.println(addition(17,07));
	    MaulikFamily("Arube",9);
	    System.out.print(" and since the age is that ");
	    legalAlcoholDrinking(9);
	    


	}

}
```

- I got this error“operator + cannot be applied to java.lang.string void” [[3]](#3)



## References
<a id="1">[1]</a> 
https://www.w3schools.com/java/java_arrays.asp
<a id="2">[2]</a> 
https://www.geeksforgeeks.org/difference-between-print-and-println-in-java/
<a id="3">[3]</a> 
https://stackoverflow.com/questions/58586696/i-got-this-erroroperator-cannot-be-applied-to-java-lang-string-void