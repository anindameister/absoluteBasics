# WAP to print first 30 multiples of 5

## python

![python](https://github.com/anindameister/absoluteBasics/blob/master/snaps/1.PNG)

## JS

![JS](https://github.com/anindameister/absoluteBasics/blob/master/snaps/2.PNG)

### reminder again

1. create index.html content by doing !+TAB
2. under <body> we do <script src="jsFilename.js"></script>
3. open live server for html page and not JS file
4. check the output

## Java

![Java](https://github.com/anindameister/absoluteBasics/blob/master/snaps/3.PNG)

### remark

We never use "," and instead we always use "+"

# WAP to create a Fibonacci series

![fibonacci basics](https://github.com/anindameister/absoluteBasics/blob/master/snaps/5.jpeg)

### python

```
myList=[]
for j in range(1,50):
  
  myList.append('a'*j)

myList[0]=0
myList[1]=1
print("No. 1 from Fibonacci series is ",myList[0])
print("No. 2 from Fibonacci series is ",myList[1])
for i in range(2,len(myList)):
  myList[i]=myList[i-1]+myList[i-2]
  print("No.",i+1,"from Fibonacci series is ",myList[i])
  
```
![python](https://github.com/anindameister/absoluteBasics/blob/master/snaps/4.PNG)

### JS

python list = JS array

.append = .push

check this
https://www.w3schools.com/jsref/jsref_push.asp#:~:text=The%20push()%20method%20adds,use%20the%20unshift()%20method.


general array methods

https://www.w3schools.com/js/js_array_methods.asp


##### multiplication of string in python 'a'*5

JS 

https://www.w3schools.com/jsref/jsref_repeat.asp

##### print in JS means printing as in the ctrl+P

![JS](https://github.com/anindameister/absoluteBasics/blob/master/snaps/14.PNG)

```
var myList=[]
for(j=1; j<50; j++){

    var randomString = "a";

    myList.push(randomString.repeat(j))
}
 

  

myList[0]=0


myList[1]=1
console.log("No. 1 from Fibonacci series is ",myList[0])
console.log("No. 2 from Fibonacci series is ",myList[1])

for(i=2; i<myList.length; i++){

  myList[i]=myList[i-1]+myList[i-2]
  console.log("No.",i+1,"from Fibonacci series is ",myList[i])
}
```



![JS](https://github.com/anindameister/absoluteBasics/blob/master/snaps/5.PNG)

### java

conversion from string to int

https://stackoverflow.com/questions/5585779/how-do-i-convert-a-string-to-an-int-in-java


## my method java for fibonacci, as a replication to python&JS work
```
package absoluteBasics;

import java.util.ArrayList;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> fibonaciNumbers =new ArrayList<String>();
		ArrayList<Integer> fibonaciNumbersInt =new ArrayList<Integer>();
		

		
		int j;
		
		for(j=1;j<50;j++) {
			
			String randomString="121";
			String repeatedrandomString = randomString.repeat(j);
			fibonaciNumbers.add(repeatedrandomString);
	
		}

		fibonaciNumbers.set(0,"0");
		fibonaciNumbers.set(1,"1");
		fibonaciNumbersInt.add(Integer.parseInt(fibonaciNumbers.get(0)));
		fibonaciNumbersInt.add(Integer.parseInt(fibonaciNumbers.get(1)));


		System.out.println("No. 1 from Fibonacci series is "+fibonaciNumbersInt.get(0));
		System.out.println("No. 2 from Fibonacci series is "+fibonaciNumbersInt.get(1));

		
		int i;

		for(i=2; i<fibonaciNumbers.size(); i++){

			fibonaciNumbersInt.add(fibonaciNumbersInt.get(i-1)+fibonaciNumbersInt.get(i-2));
			int p=i+1;
			System.out.println("No."+ p +" from Fibonacci series is "+fibonaciNumbersInt.get(i));
			}
		
		

		
		
			
			
		

		
		
	}
	public static void repeatCharacter(int number) {
		System.out.println('b'*number);
		
	}

	
	
}



```
- problem with the java output below

![output](https://github.com/anindameister/absoluteBasics/blob/master/snaps/15.PNG)

- same output for JS and python as below for 47 and 48

![output](https://github.com/anindameister/absoluteBasics/blob/master/snaps/16.PNG)

- problem fixed by introducing long

```
package absoluteBasics;

import java.util.ArrayList;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> fibonaciNumbers =new ArrayList<String>();
		ArrayList<Long> fibonaciNumbersInt =new ArrayList<Long>();
		

		
		int j;
		
		for(j=1;j<50;j++) {
			
			String randomString="121";
			String repeatedrandomString = randomString.repeat(j);
			fibonaciNumbers.add(repeatedrandomString);
			
	
		}

		fibonaciNumbers.set(0,"0");
		fibonaciNumbers.set(1,"1");
		fibonaciNumbersInt.add(Long.parseLong(fibonaciNumbers.get(0)));
		fibonaciNumbersInt.add(Long.parseLong(fibonaciNumbers.get(1)));


		System.out.println("No.1 from Fibonacci series is "+fibonaciNumbersInt.get(0));
		System.out.println("No.2 from Fibonacci series is "+fibonaciNumbersInt.get(1));

		
		int i;

		for(i=2; i<fibonaciNumbers.size(); i++){
		
//			fibonaciNumbersInt.set(i,(fibonaciNumbersInt.get(i-1)+fibonaciNumbersInt.get(i-2)));
			
			
			fibonaciNumbersInt.add(fibonaciNumbersInt.get(i-1)+fibonaciNumbersInt.get(i-2));
			int p=i+1;
			System.out.println("No."+ p +" from Fibonacci series is "+fibonaciNumbersInt.get(i));
			}

		

		
		
			
			
		

		
		
	}
	public static void repeatCharacter(int number) {
		System.out.println('b'*number);
		
	}

	
	
}

```

- aritree methods

- java

```
int num1=0;
int num2=1;

int range=10;(or take range from user)

for (int i=0; i<range;i++)
{
      System.out.println(num1);
      int num3= num1+num2;
      num1= num2;
      num2= num3;
}
```


# WAP to check whether the number is Armstrong number or not... Take user input for numbers



### python 

```
userInputoriginal=int(input("enter a number to check if it's armstrong or not:"))

userInput=str(userInputoriginal)

userInput=list(userInput)



lengthUserInput=len(userInput)

newList=[]
for i in range(0,len(userInput)):
  userInput[i]=int(userInput[i])
  userInput[i]=pow(userInput[i], 3)
  newList.append(userInput[i])
  

summed=sum(newList)
if userInputoriginal==summed:
  print("congrats, you have chosen a armstrong number")
else:
  print("not a armstrong number")
  
```

![scribbling](https://github.com/anindameister/absoluteBasics/blob/master/snaps/7.jpeg)

- java

```
package absoluteBasics;
import java.util.*;  
public class ArmstrongNumber {

	public static void main(String[] args) {
	
		Scanner userInputoriginal= new Scanner(System.in);    
		System.out.print("enter a number to check if it's armstrong or not:");  
		int userInput= userInputoriginal.nextInt();  
		userInputoriginal.close();
		String userInput2string = Integer.toString(userInput); 
		ArrayList<String> userInput2string2list =new ArrayList<String>();
//		https://www.tutorialspoint.com/java/java_string_split.htm
	      for (String retval: userInput2string.split("")) {
	  		
	    	 int retvalInted=Integer.parseInt(retval); 
	    	 int cubeddRetvalInted=retvalInted*retvalInted*retvalInted;
	    	 String stringedCubeddRetvalInted=Integer.toString(cubeddRetvalInted);
	    	 

			userInput2string2list.add(stringedCubeddRetvalInted);
//	          System.out.println(userInput2string2list);
	       }
		

		int lengthUserInput=userInput2string2list.size();
		
		ArrayList<Integer> userInput2string2listInteger =new ArrayList<Integer>();
		int i;
		for (i=0;i<lengthUserInput;i++) {
			userInput2string2listInteger.add(Integer.parseInt(userInput2string2list.get(i)));
	
//			System.out.println(userInput2string2listInteger);
		
			}
//		https://stackoverflow.com/questions/16242733/sum-all-the-elements-java-arraylist	
		int sum = 0;
		for(int j = 0; j < userInput2string2listInteger.size(); j++) {
		    sum += userInput2string2listInteger.get(j);
		}
		if (userInput==sum) {
//			System.out.println(userInput);
//			System.out.println(sum);
			System.out.println("congrats, you have chosen an armstrong number");
			
		}else {
//			System.out.println(userInput);
//			System.out.println(sum);
			System.out.println("armstrong number have not been chosen by you");
			
		}
	

		
	

	}

}

```
- website: 

![power](https://github.com/anindameister/absoluteBasics/blob/master/snaps/17.PNG)

# WAP to check whether a number is a palindrome or not.. Take number as user input

### python 

```
userInputoriginal=int(input("enter a number to check if it's palindrome or not:"))


userInput=str(userInputoriginal)
userInput=list(userInput)

userInput2breversed=userInput[:]

userInput2breversed.reverse()

myList=[]
for i in range(0, len(userInput2breversed)): 
    userInput2breversed[i] = int(userInput2breversed[i]) 
    myList.append(userInput2breversed[i])

# print(myList)

def convert(list): 
      
    # Converting integer list to string list 
    s = [str(i) for i in list] 
      
    # Join list items using join() 
    res = int("".join(s)) 
      
    return(res) 
  
reversedUserInput=convert(myList)
# print(reversedUserInput) 

if reversedUserInput==userInputoriginal:
  print("user inputted palindrome")
else:
  print("user's input is not palindrome")
 
```

- java Palindrome for number

```
package absoluteBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PalindromeInteger {
	public static void main(String[] args) {
		Scanner userInputoriginal= new Scanner(System.in);    
		System.out.print("enter a number to check if it's palindrome or not:");  
		int userInput= userInputoriginal.nextInt();  
		userInputoriginal.close();
//		https://www.programiz.com/java-programming/examples/digits-count
		int count = 0;
		int userInput2=userInput;
		while(userInput2 != 0)
        {
          
			userInput2 /= 10;
            ++count;
        }
//		System.out.println(count);
//		System.out.println("_________");

		
		String userInput2string = Integer.toString(userInput); 
		 

		
		
	
		ArrayList<String> userInput2string2list =new ArrayList<String>();
		ArrayList<String> userInput2string2list2 =new ArrayList<String>();
		for (String retval: userInput2string.split("")) {

			int retvalInted=Integer.parseInt(retval); 
			String stringedRetvalInted=Integer.toString(retvalInted);
			userInput2string2list.add(stringedRetvalInted);
			
		}
		for (int j=userInput2string2list.size()-1;j>=0;j--) {
			userInput2string2list2.add(userInput2string2list.get(j));
		
			
		}
		
		//https://www.tutorialspoint.com/How-to-create-a-string-from-a-Java-ArrayList#:~:text=To%20convert%20the%20contents%20of,using%20the%20toString()%20method.

		
		StringBuffer sb = new StringBuffer();
		
	      for (String s : userInput2string2list2) {
	          sb.append(s);
	       }
	      String str = sb.toString();
	      int IntedStr=Integer.parseInt(str); 
	      
//	      System.out.println(IntedStr);
	      
	      if (userInput==IntedStr){
	    	  System.out.println("input palindrome");
	    	  
	      }else {
	    	  System.out.println("input NOT palindrome");
	      }
		
			
			 
	}}
```
![BasicLoopThe otherway](https://github.com/anindameister/absoluteBasics/blob/master/snaps/18.PNG)	
	

#### geels4geeks4ever
1
![geels4geeks4ever](https://github.com/anindameister/absoluteBasics/blob/master/snaps/7.PNG)
2
![geels4geeks4ever](https://github.com/anindameister/absoluteBasics/blob/master/snaps/8.PNG)
3
![geels4geeks4ever](https://github.com/anindameister/absoluteBasics/blob/master/snaps/9.PNG)
4
![geels4geeks4ever](https://github.com/anindameister/absoluteBasics/blob/master/snaps/10.PNG)

# palindrome for strings

### python 

```
userInputoriginal=input("enter a string to check if it's palindrome or not:")


# userInput=str(userInputoriginal)
userInput=list(userInputoriginal)

userInput2breversed=userInput[:]

userInput2breversed.reverse()



def convert(list): 
      

      
    # Join list items using join() 
    res = ("".join(list)) 
      
    return(res) 
  
reversedUserInput=convert(userInput2breversed)


if reversedUserInput==userInputoriginal:
  print("user inputted palindrome")
else:
  print("user's input is not palindrome")
```


![output](https://github.com/anindameister/absoluteBasics/blob/master/snaps/11.PNG)

- java palindrome for strings


```
package absoluteBasics;

import java.util.ArrayList;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner userInputoriginal= new Scanner(System.in);    
		System.out.print("enter a word to check if it's palindrome or not:");  
		String userInput= userInputoriginal.nextLine();  
		userInputoriginal.close();

		
		
		
		
	
		ArrayList<String> userInput2string2list =new ArrayList<String>();
		ArrayList<String> userInput2string2list2 =new ArrayList<String>();
		for (String retval: userInput.split("")) {

			
			
			userInput2string2list.add(retval);
			
		}
		for (int j=userInput2string2list.size()-1;j>=0;j--) {
			userInput2string2list2.add(userInput2string2list.get(j));
		
			
		}
		
		//https://www.tutorialspoint.com/How-to-create-a-string-from-a-Java-ArrayList#:~:text=To%20convert%20the%20contents%20of,using%20the%20toString()%20method.

		
		StringBuffer sb = new StringBuffer();
		
	      for (String s : userInput2string2list2) {
	          sb.append(s);
	       }
	      String str = sb.toString();
	      
	      
	      System.out.println(str);
	      System.out.println(userInput);
	      
	      //https://www.geeksforgeeks.org/compare-two-strings-in-java/
	      
	      if (userInput.contentEquals(str)==true){
	    	  System.out.println("input palindrome");
	    	  
	      }else {
	    	  System.out.println("input NOT palindrome");
	      }
	}

}

```

- 14 mins of java basics
https://youtu.be/RRubcjpTkks

- 9th min summarisation
https://youtu.be/CWYv7xlKydw
oops