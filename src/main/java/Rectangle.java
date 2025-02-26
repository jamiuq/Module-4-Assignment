public class Rectangle extends Shape
{
  private int length;
  private int width;

  public Rectangle(int length, int width)
  {
    super(4);
    this.length = length;
    this.width = width;
  }

  public int getArea() {return length * width;}
  
  public int getLength() {return length;}
  public int getWidth() {return width;}
  public void setLength(int length) {this.length = length;}
  public void setWidth(int width) {this.width = width;}
}