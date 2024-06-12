# Java-Super-Keyword-Demo
This repository contains a simple Java program to demonstrate the use of the super keyword. 
The super keyword in Java is used to refer to the immediate parent class object. 
It is used for various purposes such as calling parent class methods, accessing parent class variables, and invoking parent class constructors.

## Code Highlights
Class A & B: Demonstrates method overriding and variable hiding.
super.show(): Calls the method from the parent class.
super.a: Accesses the variable from the parent class.

## Importance of super Keyword
The super keyword is crucial for:

### Differentiating between parent and child class members with the same name.
### Ensuring the correct method or variable is accessed.
### Improving code readability and maintainability.

## Code Description
### Class Definitions
1) Class A
Contains a member variable a with the value 10.
Defines a method show() that prints "hello java".

3) Class B
Extends class A and contains a member variable a with the value 20.
Overrides the show() method to:
Call the show() method of the parent class using super.show().
Print its own member variable a.
Print the member variable a from the parent class using super.a.

### Main Class
Class test
Contains the main method to run the program.
Creates an instance of class B.
Calls the show() method on this instance.

Detailed Comments: Each line of code is commented to provide clear understanding.

## How to Run
Clone the repository:
bash
Copy code
git clone https://github.com/your-username/Java-Super-Keyword-Demo.git
Navigate to the project directory:
bash
Copy code
cd Java-Super-Keyword-Demo
Compile the Java files:
bash
Copy code
javac test.java
Run the program:
bash
Copy code
java test

## Example Output
Copy code
hello java
20
10
This output demonstrates the use of the super keyword to access members of the superclass.

Feel free to clone, modify, and use this example to understand and demonstrate the concept of the super keyword in Java.
