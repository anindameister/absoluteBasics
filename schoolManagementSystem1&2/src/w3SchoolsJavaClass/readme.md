# Java class

- Note: Java is a strongly typed language. We have got to mention the datatype of the variable that we are declaring
- same method names cannot be used, even if we're trying to create an object of a different class. 
  - This situation came up while dealing with outer and class
  - there are three ways to start writing a kinda java class
    - Illegal modifier for the class Gari; only public, abstract & final are permitted
      - The type Car cannot subclass the final class Gari
    - 1. regular class
      - public 
        - static
        - or without static
      - default
        - without public
        - without static
    - 2. final
    - 3. abstract
      - interface


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

- class with main method
```
package experimentingGettersSetters;

public class Main {

	public static void main(String[] args) {
		Person myObj = new Person();
//	    myObj.name = "John";
		myObj.setName("John");
	    System.out.println(myObj.getName());

	}

}
```
- class without the main method
```
package experimentingGettersSetters;

public class Person {
	
	private String name;

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

- The meaning of **Encapsulation**, is to make sure that "sensitive" data is hidden from users.

![getter&setter](https://github.com/anindameister/absoluteBasics/blob/master/snaps/30.PNG)

- better control of attributes, for sure, how about the methods?????


## Java Packages

- Java Packages & API
- A package in Java is used to group related classes. 
- Think of it as a folder in a file directory. 
- We use packages to avoid name conflicts, and to write a better maintainable code. 
- Packages are divided into two categories:
    - Built-in Packages (packages from the Java API)
      - https://docs.oracle.com/en/java/javase/14/docs/api/java.base/module-summary.html
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

![scanner](https://github.com/anindameister/absoluteBasics/blob/master/snaps/34.PNG) [[2]](#2).

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
- protected:The code is accessible in the same package and subclasses. You will learn more about subclasses and superclasses in the **Inheritance** chapter	
- Right now, as of 4th Feb2021, I see that protected has been used for attributes and not methods and constructors, as claimed...

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


## Java Polymorphism

- Java Polymorphism
- Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
  - 1. polymorphism means many forms
  - 2. Inheritance
    - inheriting from parent(super class) by child(sub class)
  - 3. Considering a situation, where many classes are inheriting from a super class
  - 4. According to my understanding at 20:35 on 4thFeb2021, this is exactly where the concept of polymorphism is coming up that is when several classes are inheriting from a superClass.

- Like we specified in the previous chapter; Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.

- For example, think of a superclass called Animal that has a method called animalSound(). Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have their own implementation of an animal sound (the pig oinks, and the cat meows, etc.):

- super class
```
package experimentingPolymorphism;

public class Animal {
	
	public void animalSound() {
	    System.out.println("The animal makes a sound");
	  }

}
```
- sub class 1
```
package experimentingPolymorphism;

public class Pig {
	public void animalSound() {
	    System.out.println("The pig says: wee wee");
	  }

}
```
- sub class 2
```
package experimentingPolymorphism;

public class Dog extends Animal{
	
	public void animalSound() {
	    System.out.println("The dog says: bow wow");
	  }

}
```
- class with main method
```
package experimentingPolymorphism;

public class Main {

	public static void main(String[] args) {
		Dog kutta=new Dog();
		kutta.animalSound();
		Pig suorerBachha=new Pig();
		suorerBachha.animalSound();

	}

}
```
## Java Inner Classes

- In Java, it is also possible to nest classes (a class within a class). 
- The purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable.
- To access the inner class, 
  - create an object of the outer class, 
  - and then create an object of the inner class:

- creating inner and outer class
```
package experimentingPolymorphism;

class OuterClass {
	
	int x = 10;
	
	class InnerClass {
		    int y = 5;
		  }

}
```
- using the inner and outer class within another calss whicj contains the main method

```
package experimentingPolymorphism;

public class Main {

	public static void main(String[] args) {

		OuterClass oc=new OuterClass();
		OuterClass.InnerClass ic=oc.new InnerClass();
		
		System.out.println(oc.x+ic.y);

	}

}
```
- output:15

### Private Inner Class

- **Unlike a "regular" class, an inner class can be private or protected.** 
- If you don't want outside objects to access the inner class, declare the class as private:

- The inner calss has been set to protected and thus the classContainingTheMainMethod cannot access the inner class

![The final Keyword](https://github.com/anindameister/absoluteBasics/blob/master/snaps/35.PNG)

### Static Inner Class

- An inner class can also be static, which means that you can access it without creating an object of the outer class:
- just look at the code,

```
package experimentingPolymorphism;

public class StaticInnerClass {
	
	int x = 10;
	
	static class InnerClass {
	    int y = 5;
	  }


}
```
- class containing the main method
```
package experimentingPolymorphism;

public class Main {

	public static void main(String[] args) {

		
		OuterClass oc=new OuterClass();
		OuterClass.InnerClass ic=oc.new InnerClass();
		
		System.out.println(oc.x+ic.y);
		
		/*
		 * An inner class can also be static, 
		 * which means that you can access it without creating an object of the outer class:
		 */
		
		StaticInnerClass.InnerClass sic=new StaticInnerClass.InnerClass();
		System.out.println(sic.y);

	}

}
```
- output
```
15
5
```
- Note: just like static attributes and methods, a static inner class does not have access to **members** of the outer class.
  - members meaning attributes and methods
    - in the above code, there's just an attribute
      - so in the last line, we just cannot do the below
```
System.out.println(sic.y+sic.x);
```
- let's just have a look at the below snap
  - which clearly says, **you have got to involve the attribute x in the inner class because, dude, the static inner class doesn't have access to the attribute x as long as it is solely a part of the outer class**

- static inner class doesn't have access to the attribute or method of the outer class

![static inner class doesn't have access to the attribute or method of the outer class](https://github.com/anindameister/absoluteBasics/blob/master/snaps/36.PNG)

- Access Outer Class From Inner Class
- One advantage of inner classes, is that they can access attributes and methods of the outer class: 
  - while they are still a part of the same class and have not showed their face to any other class

```
package experimentingPolymorphism;

public class InnerMethodOfInnerClass {
	
	int x = 10;
	class InnerClass {
		public int myInnerMethod() {
		      return x;
		    }
	}

}
```
- the class with the main method

```
package experimentingPolymorphism;

public class Main {

	public static void main(String[] args) {

		
		OuterClass oc=new OuterClass();
		OuterClass.InnerClass ic=oc.new InnerClass();
		
		System.out.println(oc.x+ic.y);
		
		/*
		 * An inner class can also be static, 
		 * which means that you can access it without creating an object of the outer class:
		 */
		
		StaticInnerClass.InnerClass sic=new StaticInnerClass.InnerClass();
		System.out.println(sic.y);

    		/*
		 * exact repetition of what we did for Java Inner Classes
		 */
		
		InnerMethodOfInnerClass occ=new InnerMethodOfInnerClass();
		InnerMethodOfInnerClass.InnerClass icc=occ.new InnerClass();
		
		System.out.println(icc.myInnerMethod());
		
		
		

	}

}
```
- output
```
15
5
10
```
- Java Inner Classes: https://www.w3schools.com/java/java_inner_classes.asp

<hr>

## Java Abstraction

- Abstract Classes and Methods
- **Data abstraction is the process of hiding certain details and showing only essential information to the user.**
- Abstraction can be achieved with either abstract classes or interfaces (which you will learn more about in the next chapter).
- The abstract keyword is a non-access modifier, used for classes and methods:
  - Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
  - Abstract method: can only be used in an abstract class, and it does not have a body. 
  - The body of the abstract method is provided by the subclass (inherited from).
    - Abstract class would be the parent class
    - sub classes can just inherit, the methods, from the abstract class, and can be given anything.
    - sub classes can also inherit the regular method, and just needs to be mentioned there. Thus while calling in the classWithMainMethod, and object of the subclass can be used to call the nonAbstract method mentioned in the subclass.
    - let's try to call the nonAbstract method, from the parent class.
      - I was wrong, the main purpose of creating the abstract class is that the object of this abstract class cannot be created
  - An abstract class can have both abstract and regular methods:

- abstract class
```
package experimentingWithAbstract;

abstract class Animal {
	  public abstract void animalSound();
	  public void sleep() {
	    System.out.println("Zzz");
	  }

}
```
- sub class
```
package experimentingWithAbstract;

public class Pig extends Animal{
	
	  public void animalSound() {
		  System.out.println("The pig says: wee wee");
	  }


}
```
- classWithMainMethod
```
package experimentingWithAbstract;

public class Main {

	public static void main(String[] args) {
		
		Pig suor=new Pig();
		suor.animalSound();
		suor.sleep();

	}

}
```
- abstract class' object cannot be created

![abstract class' object cannot be created](https://github.com/anindameister/absoluteBasics/blob/master/snaps/37.PNG)

- abstraction cannot happen without interface

![abstraction cannot happen without interface](https://github.com/anindameister/absoluteBasics/blob/master/snaps/38.PNG)

## Interfaces

- Another way to achieve abstraction in Java, is with interfaces.
- An interface is a completely "abstract class" that is used to group related methods with empty bodies:

```
package experimentingWithAbstract;

interface Animals {
	
	public void animalSound(); // interface method (does not have a body)
	public void run(); // interface method (does not have a body)

}
```
- to note in the above example is that the purpose of creating interface is to give access to it's methods to another class.
  - so while the term public could have not been given thereby stating that it's default
    - but we want these interface methods to be accessed by all the packages in the project. Recollect SpringBootProject.

- To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the implements keyword (instead of extends). The body of the interface method is provided by the "implement" class:

```
package experimentingWithAbstract;

class Dog implements Animals{
	
	public void animalSound() {
		
		System.out.println("The dog says: bow wow");
		
	}
	public void run() {
		System.out.println("Dog is a mammal but unlike human it runs with 4 limbs");
		
	}

}
```
- classWithMainMethod
```
package experimentingWithAbstract;

public class Main {

	public static void main(String[] args) {
		

		Dog kuttaRbaccha=new Dog();
		kuttaRbaccha.animalSound();
		kuttaRbaccha.run();

	}

}
```
- output
```
The dog says: bow wow
Dog is a mammal but unlike human it runs with 4 limbs
```
- Notes on Interfaces:
  - **Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)**
  - An interface cannot contain a constructor (as it cannot be used to create objects)
  - Interface methods do not have a body - the body is provided by the "implement" class
  - **On implementation of an interface, you must override all of its methods**
    - It is very important because even the text editor would keep poking you
  - Interface methods are by default abstract and public
  - Interface attributes are by default **public**, **static** and **final**

- Why And When To Use Interfaces?
  - 1. To achieve security - hide certain details and only show the important details of an object (interface).
  - 2. Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved with interfaces, because the class can implement multiple interfaces. Note: To implement multiple interfaces, separate them with a comma (see example below).

- first interface 
```
package experimentingWithAbstract;

interface FirstInterface {
	
	public void myMethod(); // interface method

}
```
- second interface
```
package experimentingWithAbstract;

interface SecondInterface {
	
	public void myOtherMethod(); // interface method

}
```
- sub class which gives body to the methods available in the interfaces by implementing them using ','
```
package experimentingWithAbstract;

public class Demo implements FirstInterface, SecondInterface{
	  public void myMethod() {
		    System.out.println("Some text..");
		  }
	  public void myOtherMethod() {
		    System.out.println("Some other text...");
		  }

}
```
- classWithMainMethod
```
package experimentingWithAbstract;

public class Main {

	public static void main(String[] args) {

		Demo d=new Demo();
		d.myMethod();
		d.myOtherMethod();

	}

}
```
- output
```
Some text..
Some other text...
```

### Encapsulation, inheritance, polymorphism, abstraction
- Encapsulation: getters&setters
- inheritance: child class extends from parent class, all attributes and methods
- polymorphism:  Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.
- abstraction: dvd player
  - Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
  - Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
  - An interface is a completely "abstract class" that is used to group related methods with empty bodies:
    - so it seems that interface is a type of abstract class





## Java Enums
- An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
- To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. Note that they should be in uppercase letters:
- Enum is short for "enumerations", which means "specifically listed".

```
package learningEnum;

enum Level {
	
	  LOW,
	  MEDIUM,
	  HIGH

}
```
- You can access enum constants with the dot syntax:

- classWithMainMethod
```
package learningEnum;

public class Main {

	public static void main(String[] args) {
		Level myVar = Level.MEDIUM;
		System.out.println(myVar);

	}

}
```
- enum inside a class

![enum inside a class](https://github.com/anindameister/absoluteBasics/blob/master/snaps/39.PNG)

- Enum in a Switch Statement
- Enums are often used in switch statements to check for corresponding values:

```
package learningEnum;

enum Level {
	
	  LOW,
	  MEDIUM,
	  HIGH

}
```
- classWithMainMethod
```
package learningEnum;

public class Main {

	public static void main(String[] args) {
		Level myVar = Level.MEDIUM;

		
		
		switch(myVar) {
		case LOW:
			System.out.println("your level is low in regards to java");
			
			break;
			/*
			 * it should be all in caps
			 * Medium is no-no
			 * MEDIUM
			 */
		case MEDIUM:
			System.out.println("your level is medium in regards to java");
			break;
		case HIGH:
			System.out.println("your level is high in regards to java");
			break;
			
		}

	}

}
```
- Loop Through an Enum
- The enum type has a **values()** method, which returns an array of all enum constants.
- This method is useful when you want to loop through the constants of an enum:

```
package learningEnum;

enum Level {
	
	  LOW,
	  MEDIUM,
	  HIGH

}
```
- classWithMainMethod
```
package learningEnum;

public class Main {

	public static void main(String[] args) {

    	/*
		 * object of Enum called Level is being created with the object name myVar2
		 */
		
		for (Level myVar2 : Level.values()) {
			  System.out.println(myVar2);
			}


	}
	
	
}
```

## Java User Input (Scanner)

- The Scanner class is used to get user input, and it is found in the java.util package.
- To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation. 
- https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Scanner.html
- In our example, we will use the nextLine() method, which is used to read Strings:
```
package learningEnum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter username");

	    String userName = myObj.nextLine();  // Read user input
	    System.out.println("Username is: " + userName);  // Output user input


	}
	
	
}
```
- output along with user input

```
Enter username
anindameister
Username is: anindameister
```
- the other methods in the scanner class

![scanner, the other methods](https://github.com/anindameister/absoluteBasics/blob/master/snaps/41.PNG)

```
package learningEnum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter username");

	    String userName = myObj.nextLine();  // Read user input
	    System.out.println("Username is: " + userName);  // Output user input
	    
	    System.out.println("*******************************************************");
	    
	    
	    Scanner myObj2 = new Scanner(System.in);

	    System.out.println("Enter name, age and salary:");

	    // String input
	    String name = myObj2.nextLine(); // Read user input which is String

	    // Numerical input
	    int age = myObj.nextInt(); // Read user input which is Integer
	    double salary = myObj2.nextDouble(); // Read user input which is double

	    // Output input by user
	    System.out.println("Name: " + name);
	    System.out.println("Age: " + age);
	    System.out.println("Salary: " + salary);


	}
	
	
}
```
- output
```
Enter username
anindameister
Username is: anindameister
*******************************************************
Enter name, age and salary:
aninda
32
600
Name: aninda
Age: 32
Salary: 600.0
```

- scanner class might generate exceptions, the details of the exception can also be read in the documentation

![scanner, the other methods](https://github.com/anindameister/absoluteBasics/blob/master/snaps/42.PNG)













































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

<a id="2">[2]</a> 
https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Scanner.html