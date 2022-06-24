public class CoffeeMachine implements IBeverageMachine {

  private double money;
  private Beverage[] beverages;

  CoffeeMachine() {

  }

  @Override
  public void insertMoney(double money) {
    this.money = money;
  }

  @Override
  public Beverage selectBeverage(int selectedBeverage) {
    return beverages[selectedBeverage];
  }
}
