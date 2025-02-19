import java.lang.*;
public class Automobile
{
  private int speed;
  private int modelYear;
  private String brand;

  

  public Automobile()
  {
    speed = 0;
    modelYear = -1;
    brand = "unknown";
  }

  public Automobile(int modelYear, String brand)
  {
    speed = 0;
    this.modelYear = modelYear;
    this.brand = brand;
  }

  public void honk()
  {
    System.out.println("beep");
  }

  public void accelerate() {speed += 10;}

  public void brake() 
  {
    if (speed >= 10) speed -= 10;
    if (speed <= -10) speed += 10;
    else speed = 0;
  }

  public void stop() {speed = 0;}
  
  public void reverse() 
  {
    if (speed > 0) stop(); 
    speed -= 10;
  }

  public int getSpeed() {return speed;}

  public void setSpeed(int speed) {this.speed = speed;}
  
  public void setModelYear(int modelYear) {this.modelYear = modelYear;}

  public int getModelYear() {return modelYear;}

  public void setBrand(String brand) {this.brand = brand;}

  public String getBrand() {return brand;}

  @Override
  public String toString()
  {
    return "Model Year: " + modelYear + ", Brand: " + brand + ", Speed: " + speed;
  }

  public int compareTo(Automobile other)
  {
    return Integer.compare(this.speed, other.getSpeed());
  }
  
}