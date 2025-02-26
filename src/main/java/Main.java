/*
1. 
- A class is a blueprint for creating objects.
- An object is an instance of a class that has its own data and methods
- Special methods called constructors are used to initialize objects.
- Encapsulation is the concept of wrapping data (variables) and code (methods) together as a single unit.
- Variables are usually declared as private to restrict direct access from outside the class. These variables can be accessed through getter and setter methods.
- Inheritance allows a class to inherit fields and methods from another class.
- It is utilized using the extends keyword

2. 
Private - Only accessible within the class
Protected - Accessible within the class and its subclasses
Public - Accessible from anywhere

3.
The benefits of using inheritance include code modularity and reusability. It ensures more types of employees can be created without having to rewrite any code.
*/

public class Main {
  public static void main(String[] args) 
  {
    Shape shape1 = new Shape(5);
    Rectangle shape2 = new Rectangle(5, 10);
    Circle shape3 = new Circle(5);

    System.out.println(shape1.getNumSides());
    System.out.println(shape2.getNumSides());
    System.out.println(shape3.getNumSides());
    System.out.println(shape2.getArea());
    System.out.println(shape3.getArea());
  }
}