# Java class

- Note: Java is a strongly typed language. We have got to mention the datatype of the variable that we are declaring


## modify attributes

![modify attributes](https://github.com/anindameister/absoluteBasics/blob/master/snaps/20.PNG)

- Static vs. Non-Static

![Static vs. Non-Static](https://github.com/anindameister/absoluteBasics/blob/master/snaps/21.PNG)

- the example showing the difference between static and non-static method
    - non static method has been referred to as public method

![Static vs. Non-Static code ](https://github.com/anindameister/absoluteBasics/blob/master/snaps/22.PNG)

## Java Constructors
    - A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:
        - Note that the constructor name must match the class name, and it cannot have a return type (like void).
        - Also note that the constructor is called when the object is created.
        - All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. However, then you are not able to set initial values for object attributes.

```
    // Create a Main class
public class Main {
  int x;  // Create a class attribute

  // Create a class constructor for the Main class
  public Main() {
    x = 5;  // Set the initial value for the class attribute x
  }

  public static void main(String[] args) {
    Main myObj = new Main(); // Create an object of class Main (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
  }
}

// Outputs 5
```

- Constructor Parameters

![Constructor Parameters](https://github.com/anindameister/absoluteBasics/blob/master/snaps/23.PNG)

- the concept of **this** would come up when we try to create a constructor for private attributes.

- but in the below snap, we are not using private, so it's straight forward

![Constructor Parameters, multiple](https://github.com/anindameister/absoluteBasics/blob/master/snaps/24.PNG)

- Java Modifiers
- Modifiers
- By now, you are quite familiar with the **public** keyword that appears in almost all of our examples:
```
public class Main
```
- The **public** keyword is an **access modifier**, meaning that it is used to set the access level 
    -for classes, 
    - attributes, 
    - methods and 
    - constructors.
- We divide modifiers into two groups:
    - **Access Modifiers** - controls the access level
    - **Non-Access Modifiers** - do not control access level, but provides other functionality

## Access Modifiers
- For classes, 
    - you can use either 
        - public :The class is accessible by any other class **in all the packages within the same project**
        - or default: The class is only accessible by classes in the same package. This is used when you don't specify a modifier. 

- default for classes
```
class MyClass {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
```
- For attributes, methods and constructors, you can use the one of the following:
    - public: The code is accessible for all classes **in all the packages within the same project**
    - private: The code is only accessible within the declared class
    - default: The code is only accessible in the same package. This is used when you don't specify a modifier.
    - protected:The code is accessible in the same package and subclasses. You will learn more about subclasses and superclasses in the **Inheritance** chapter	

## Non-Access Modifiers
- For **classes**, you can use either **final** or **abstract**:
    - final: The class cannot be inherited by other classes. It would be covered in details in **Inheritance**
    - abstract: The class cannot be used to create objects (To access an abstract class, it must be inherited from another class. You will learn more about inheritance and abstraction in the **Inheritance** and **Abstraction** chapters)
- For attributes and methods, you can use the one of the following:
    - final:Attributes and methods cannot be overridden/modified
    - static:Attributes and methods belongs to the class, rather than an object
    - abstract: 1. Can only be used in an abstract class, and can only be used on methods.
                2. The method does not have a body, for example abstract void run();. 
                3. The body is provided by the subclass (inherited from)
                4. You will learn more about inheritance and abstraction in the Inheritance and Abstraction chapters
    - transient: Attributes and methods are skipped when serializing the object containing them
    - synchronized: Methods can only be accessed by one thread at a time
    - volatile: The value of an attribute is not cached thread-locally, and is always read from the "main memory"

- final

![final](https://github.com/anindameister/absoluteBasics/blob/master/snaps/26.PNG)

- static

![static](https://github.com/anindameister/absoluteBasics/blob/master/snaps/27.PNG)

- Abstract: An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass:

```
// Code from filename: Main.java
// abstract class
abstract class Main {
  public String fname = "John";
  public int age = 24;
  public abstract void study(); // abstract method
}

// Subclass (inherit from Main)
class Student extends Main {
  public int graduationYear = 2018;
  public void study() { // the body of the abstract method is provided here
    System.out.println("Studying all day long");
  }
}
// End code from filename: Main.java

// Code from filename: Second.java
class Second {
  public static void main(String[] args) {
    // create an object of the Student class (which inherits attributes and methods from Person)
    Student myObj = new Student();

    System.out.println("Name: " + myObj.fname);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study(); // call abstract method
  }
}
```

## Java Encapsulation

- Encapsulation
- The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
    - declare class variables/attributes as private
    - provide public get and set methods to access and update the value of a private variable

- Get and Set
- You learned from the previous chapter that private variables can only be accessed within the same class (an outside class has no access to it). However, it is possible to access them if we provide public get and set methods.
- The **get** method returns the variable value, and the **set** method sets the value.
- Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case:

```
public class Person {
  private String name; // private = restricted access

  // Getter
  public String getName() {
    return name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
  }
}
```
- Example explained
- The get method returns the value of the variable name.
- The set method takes a parameter (newName) and assigns it to the name variable. The **this** keyword is used to refer to the current object.
- However, as the name variable is declared as private, we cannot access it from outside this class:

![getter&setter](https://github.com/anindameister/absoluteBasics/blob/master/snaps/28.PNG)

![getter&setter](https://github.com/anindameister/absoluteBasics/blob/master/snaps/29.PNG)

![getter&setter](https://github.com/anindameister/absoluteBasics/blob/master/snaps/30.PNG)


## Java Packages

- Java Packages & API
- A package in Java is used to group related classes. 
- Think of it as a folder in a file directory. 
- We use packages to avoid name conflicts, and to write a better maintainable code. 
- Packages are divided into two categories:
    - Built-in Packages (packages from the Java API)
    - User-defined Packages (create your own packages)
### Built-in Packages
- The Java API is a library of prewritten classes, that are free to use, included in the Java Development Environment.
- The library contains components for managing input, database programming, and much much more. 
- The complete list can be found at Oracles website: https://docs.oracle.com/javase/8/docs/api/.
- The library is divided into packages and classes. Meaning you can either import a single class (along with its methods and attributes), or a whole package that contain all the classes that belong to the specified package.
- To use a class or a package from the library, you need to use the import keyword:
```
import package.name.Class;   // Import a single class
import package.name.*;   // Import the whole package
```
- Import a Class
- If you find a class you want to use, for example, the Scanner class, which is used to get user input, write the following code:
```
import java.util.Scanner;
```
- In the example above, java.util is a package, while Scanner is a class of the java.util package.
- To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation. In our example, we will use the nextLine() method, which is used to read a complete line:
- Using the Scanner class to get user input:
```
import java.util.Scanner;

class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter username");

    String userName = myObj.nextLine();
    System.out.println("Username is: " + userName);
  }
}
```
#### Import a Package
- There are many packages to choose from. In the previous example, we used the Scanner class from the java.util package. This package also contains date and time facilities, random-number generator and other utility classes.
- To import a whole package, end the sentence with an asterisk sign (*). The following example will import ALL the classes in the java.util package:
```
import java.util.*;

```
- User-defined Packages
- To create your own package, you need to understand that Java uses a file system directory to store them. Just like folders on your computer:

![User-defined Packages](https://github.com/anindameister/absoluteBasics/blob/master/snaps/31.PNG)

- creating a package

```
package JavaClassExperiment;

public class MyPackageClass {

	public static void main(String[] args) {
		System.out.println("This is my package!");

	}

}
```
- using the package

```
package javaClassExperiment2;

import JavaClassExperiment.MyPackageClass;
public class Main {

	public static void main(String[] args) {
		
		MyPackageClass a=new MyPackageClass();
		a.main(args);

	}

}
```

- default for classes
```
class MyClass {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
```

- protected: For attributes, methods and constructors
```
class Person {
  protected String fname = "John";
  protected String lname = "Doe";
  protected String email = "john@doe.com";
  protected int age = 24;
}

class Student extends Person {
  private int graduationYear = 2018;
  public static void main(String[] args) {
    Student myObj = new Student();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
  }
}
```
- output
```
Name: John Doe
Email: john@doe.com
Age: 24
Graduation Year: 2018
```

## Java Inheritance

- Java Inheritance (Subclass and Superclass)
- In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:
    - subclass (child) - the class that inherits from another class
    - superclass (parent) - the class being inherited from
- To inherit from a class, use the extends keyword.
- In the example below, the Car class (subclass) inherits the attributes and methods from the Vehicle class (superclass):

```
class Vehicle {
  protected String brand = "Ford";
  public void honk() {
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustang";
  public static void main(String[] args) {
    Car myFastCar = new Car();
    myFastCar.honk();
    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
  }
}
```
- output

```

Tuut, tuut!
Ford Mustang
```
- Did you notice the protected modifier in Vehicle?
- We set the brand attribute in Vehicle to a protected access modifier. If it was set to private, the Car class would not be able to access it.
- Why And When To Use "Inheritance"?
    - It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.
- Tip: Also take a look at the next chapter, Polymorphism, which uses inherited methods to perform different tasks.

#### The final Keyword

![The final Keyword](https://github.com/anindameister/absoluteBasics/blob/master/snaps/32.PNG)

## private and static in terms of attributes and methods

- so am using private attribute
- using private attribute means that am making that attribute available for the class where it has been specified
- in order to make the private attribute accessed outside this class, then we need to use getters&setters method within the class where it has been declared
- Now, getters and setters, been put to place. hence the private attribute is accessible outside the class
- the way, this private attribute would be accessible is by creating an object of the class and then utilising that object to call the attribute
- Finally **System.out.println** =class+attribute+object [[1]](#1).
- System: It is a final class defined in the java.lang package. 
  - final: The class cannot be inherited by other classes.
- out: This is an instance of PrintStream type, which is a public and static member field of the System class.
  - out is an attribute of the final class named System. 
  - The attribute type is PrintStream
  - Based on my understanding, PrintStream is a class in itself
- println(): As all instances of PrintStream class have a public method println(), hence we can invoke the same on out as well.
  - PrintStream class have a public method println()

## let's try to create a System.out.println
- System => Aninda =>final class called Aninda
- out => love =>attribute of the final class. Attribute type is emotion.
- PrintStream => emotion => emotion is a public and static member field of the class Aninda.
- println =>loveMaking =>loveMaking is a public method of the class called emotion
- java.lang =>AsishKalpanaMaulik

## println and printf
```
package w3SchoolsJavaClass;

class World {

	public static void main(String[] args) {

    Human.getEar().EarFunction();

}}

package w3SchoolsJavaClass;

class Human {

	private static Ear ear;

	protected static Ear getEar() {

		return ear;

	}

	protected static void setEar(Ear ear) {

		Human.ear = ear;

	}

}

package w3SchoolsJavaClass;

class Ear {

	

	static void EarFunction() {

		System.out.printf("5*2=%d",5*2);

	}

}

```

## decimal to binary

- 13 to binary

![ decimal to binary](https://github.com/anindameister/absoluteBasics/blob/master/snaps/33.PNG)



## References
<a id="1">[1]</a> 
https://www.geeksforgeeks.org/system-out-println-in-java/#:~:text=System%3A%20It%20is%20a%20final,same%20on%20out%20as%20well.