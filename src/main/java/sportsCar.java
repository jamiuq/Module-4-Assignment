public class sportsCar extends Automobile
{
  private String driverName;

  public sportsCar()
  {
    super();
    driverName = "unknown";
  }

  public sportsCar(int modelYear, String brand)
  {
    super(modelYear, brand);
    driverName = "unknown";
  }

  public sportsCar(int modelYear, String brand, String driverName)
  {
    super(modelYear, brand);
    this.driverName = driverName;
  }

  public void setDriverName(String driverName) {this.driverName = driverName;}

  public String getDriverName() {return driverName;}

  @Override
  public String toString()
  {
    return super.toString() + ", Driver Name: " + driverName;
  }

  
}