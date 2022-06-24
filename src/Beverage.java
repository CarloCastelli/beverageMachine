public class Beverage {

  private final String name;
  private final String description;
  private int quantity;
  private double price;


  public Beverage(String name, String description, int quantity, double price) {
    this.name = name;
    this.description = description;
    this.quantity = quantity;
    this.price = price;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }
}
