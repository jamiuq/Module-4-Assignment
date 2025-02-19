// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

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

    int fastestCar = 0;
    for (int i = 1; i < arr.length; i++)
    {
      if (arr[i].compareTo(arr[fastestCar]) > 0) fastestCar = i;
    }
    System.out.println("Fastest car:\n" + arr[fastestCar]);
  }
}