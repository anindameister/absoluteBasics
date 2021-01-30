# school management system
- money management system for school
- keep track of
    - students' total fees
    - fees already paid
    - teachers' salary
- school contains
    - students
    - teachers
    - total money earned
    - total money spent as teachers' salary
- teachers' attributes
    - id
    - name
    - salary
- students' attributes
    - id
    - name
    - grade
    - fees paid
    - fees total
- somethings to remember
    - nouns could be class, objects
    - setters should always be void
    - getters should always return some value

## List
```
package sMs;

import java.util.ArrayList;
import java.util.List;

/*
List in Java is same as Python, except that it can contain only one type of variable like String,int; unlike Python which can contain anything in one list
 */
public class learningList {

    public static void main(String[]args){

        List<Integer>numbers=new ArrayList<>();
        numbers.add(17);
        numbers.add(07);
        numbers.add(1988);
        System.out.println(numbers);
    }
}
```
- output
```
[17, 7, 1988]
```
