/*
1. I couldn't find the video anywhere on lynda.com.
Peggy Fisher did have an essential training course but it was for COBOL

2. Encapsulation is the grouping of data into a single unit, and also keeping it hidden from the user.

3. A null reference is when a variable doesn't point to any memory. It is mostly redundant

4. Inheritance is when a class inherits the properties of another class. Composition is when a class has a reference to another class. Inheritance is an Is-A relationship, Composition is a Has-A relationship.

*/

public class Main {
  public static void main(String[] args) 
  {
    Automobile[] arr = new Automobile[4];

    arr[0] = new Automobile(1990, "Toyota");
    arr[1] = new Car(1994, "Honda", "ABC123");
    arr[2] = new sportsCar(1995, "Mazda", "John Doe");
    arr[3] = new junkCar(1996, "Ford", "Used");

    

    
    for (Automobile a : arr)
    {
      a.setSpeed((int)(Math.random() * 151));
    }

    arr[0].brake();
    arr[1].reverse();
    arr[2].accelerate();
    arr[3].honk();
    
    int fastestCar = 0;
    
    System.out.println("\n" + arr[0]);
    
    for (int i = 1; i < arr.length; i++)
    {
      System.out.println(arr[i]);
      if (arr[i].compareTo(arr[fastestCar]) > 0) fastestCar = i;
    }
    System.out.println("\nFastest car:\n" + arr[fastestCar]);
  }
}