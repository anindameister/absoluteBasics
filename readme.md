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

####### print in JS means printing as in the ctrl+P

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

