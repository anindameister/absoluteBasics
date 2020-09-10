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

```
package absoluteBasics;



public class Fibonacci2 {

		
		public static void main(String[]args) {
			
			
			String[] myList = {};
			int j;
			for(j=1; j<50; j++){
				String randomString = "a";
				randomString.repeat(j);
				
				int listLength=myList.length;
				
	            String arbitaryVariable;
	            
	            arbitaryVariable=randomString.repeat(j);
	            
	            if (myList.length!=0) {
	            	
	            	listLength=listLength+j;
	            	myList[listLength]=arbitaryVariable;
	            	
	            }else {
	            	myList[listLength]=arbitaryVariable;
	            }
	            

	           
			}
			
			int foo0 = Integer.parseInt(myList[0]);
			foo0=0;
			int foo1 = Integer.parseInt(myList[1]);
			foo1=1;


				
					System.out.println("No. 1 from Fibonacci series is "+foo0);
					System.out.println("No. 2 from Fibonacci series is "+foo1);
					int i;
					for(i=2; i<myList.length; i++){

					  myList[i]=myList[i-1]+myList[i-2];
					  System.out.println("No."+i+1+"from Fibonacci series is "+myList[i]);
					}

		}

	}

```

![bad output](https://github.com/anindameister/absoluteBasics/blob/master/snaps/6.PNG)


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