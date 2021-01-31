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

## References
<a id="1">[1]</a> 
https://www.w3schools.com/java/java_arrays.asp
