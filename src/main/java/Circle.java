public class Circle extends Shape
{
  private int radius;

  public Circle(int radius)
  {
    super(0);
    this.radius = radius;
  }

  public double getArea() {return Math.PI * (double)(radius * radius);}

  public int getRadius() {return radius;}
  public void setRadius(int radius) {this.radius = radius;}

  public void printCircleInfo()
  {
    System.out.println("\nCircle Info:\nRadius: " + radius + "\nArea: " + getArea() + "\nNumber of Sides: " + super.getNumSides());
  }
}