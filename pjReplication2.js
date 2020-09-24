

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