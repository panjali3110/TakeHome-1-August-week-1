## Disclaimer:- Fork this repl into your account before starting with the Takehome assignment. 

### Instructions
---
1. Create a new Rectangle.java file.
2. A Rectangle should be represented by
the field variables *length* and *breadth* each of data type *double*.
3. Define a parameterized constructor *Rectangle*.
4. Define getters `public String getLength()` and `public String
getBreadth()`.
5. Define a method `public String toString()` that returns a string in the following example format:
```
[ Length : 5.0 Units, Breadth : 8.0 Units ]
```
6. Copy the below code snippet inside main
7.  method of Main.java file.
```
Rectangle r1 = new Rectangle(4,5);
Rectangle r2 = new Rectangle(5,8);

System.out.println(r1);
System.out.println(r2);
System.out.println(r1.calculateArea());
System.out.println(r2.calculateArea());
```
### Output
---
Run Main.java file and. verify the below output.
```
[ Length : 4.0 Units, Breadth : 5.0 Units]
[ Length : 5.0 Units, Breadth : 8.0 Units ]
20.0
40.0
```
