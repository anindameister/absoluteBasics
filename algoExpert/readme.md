- write a function that takes in a non-empty array of distinct integers and an integer representing a target sum. If any two numbers in the input array sum up to the target sum, the function should return them in an array, in sorted order. If no two numbers sum up to the target sum, the function should return an empty array. Assume that there will be at most one pair of numbers summing upto the target sum.

Sample input=[3,5,-4,8,11,1,-1,6],10
Sample output[-1,11]

- current situation
```
def summation(list,integer):
    if list==[]:
        print("this is not allowed")
    else:
        for i in range(0,len(list)):
            for j in range(0,len(list)):
                if (list[i]+list[j]==10):
                    if i!=j:
                        print("kudos")
                        print(i,j,"happened, which are ",list[i],list[j])
                        if list[i]>list[j]:
                            print("the sorted version is [",list[j],list[i],"]")
                            
                        else:
                            print("the sorted version is [",list[i],list[j],"]")
                            
                            
         
                    
                else:
                    continue
summation([3,5,-4,8,11,1,-1,6],10)
```
- output
```
kudos
4 6 happened, which are  11 -1
the sorted version is [ -1 11 ]
kudos
6 4 happened, which are  -1 11
the sorted version is [ -1 11 ]
```

- Q2. Find the closest value in BST

You're given a BST data structure consisiting of BST nodes. **Each BST node has an integer value stored in a property called "value" and the two children nodes stored in properties called "left" and "right", respecitvely. A node is said to be a BST node if and only if it satisfies the BST property; it's value is strictly greater than the values of every node to it's left, it's value is less than or equal to the values of every node to it's right, and both of it's children nodes are either BST nodes themselves or None(null)values.** You're also given a target integer value; write a function that finds the closest value to the target value contained in the BST. Assume that there'll be only one closest value.