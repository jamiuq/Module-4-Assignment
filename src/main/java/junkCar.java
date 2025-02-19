public class junkCar extends Automobile {
  private String condition;

  public junkCar() {
    super();
    condition = "unknown";
  }

  public junkCar(int modelYear, String brand) {
    super(modelYear, brand);
    condition = "unknown";
  }

  public junkCar(int modelYear, String brand, String condition) {
    super(modelYear, brand);
    this.condition = condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public String getCondition() {
    return condition;
  }

  @Override
  public String toString() {
    return super.toString() + ", Condition: " + condition;
  }

}