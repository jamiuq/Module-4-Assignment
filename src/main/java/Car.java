public class Car extends Automobile
{
  private String license_plate;
  
  public Car()
  {
    super();
    license_plate = "unknown";
  }
  
  public Car(int modelYear, String brand)
  {
    super(modelYear, brand);
    license_plate = "unknown";
  }

  public Car(int modelYear, String brand, String license_plate)
  {
    super(modelYear, brand);
    this.license_plate = license_plate;
  }

  public void setLicensePlate(String license_plate) {this.license_plate = license_plate;}

  public String getLicensePlate() {return license_plate;}

  @Override
  public String toString()
  {
    return super.toString() + ", License Plate: " + license_plate;
  }
}