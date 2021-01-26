### python 
- It is a **scripting language**
- like writing statements.
- we can put out structures that we want.
- A scripting language is a programming language designed for integrating and communicating with other programming languages. [[1]](#1).
- oops is optional
    - it is whiteSpaceSignificant
    - everything is public by default in Python

### Java
- It is a compiled language
- It has an extra step in regards to scripting language
- highly oops
    - everything would be inside classes
    - it is whiteSpaceInsignificant
    - visibility control Eg: public, private
    - static method is going to belong to the class itself. That distinction to understand if this method belongs to an object of the class vs the class itself. That's the difference between the instance method and the static method
        - Static means that this is a function which we are defined inside of a class HelloApp, that objects of type HelloApp wouldn't necessarily use directly, but it belongs to the class. A function being defined inside of a class.
        - watch Alex Lee video again, in order to recollect using **static** keyword for attributes.
    - void is equivalent to None return type
    - **main** name of the method
    - a single parameter which is a array of Strings, named arguments
    - **identifiers** are 
        - HelloApp
        - main
        - args
    - **{}** groups of statements
    - **System** is the name of the class which gives access to some of our system resources including the ability to input and output from our standard source which is in our case the terminal, if we are running this in an editor
        - **out** is a member of system, member means an attribute in here. It is a special variable which belongs to the system class and it holds a reference to our output stream
        - **;** dont forget this
    


```
class HelloApp{
    public static void main(String[]args){
        System.out.println("hello world");

    }


}
```



## References
<a id="1">[1]</a>
https://www.geeksforgeeks.org/introduction-to-scripting-languages/
