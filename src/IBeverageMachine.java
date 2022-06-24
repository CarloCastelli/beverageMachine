public interface IBeverageMachine {

  void insertMoney(double money);
  Beverage selectBeverage(int selectedBeverage);
  void restockBeverage();
  double calculateChange();
  double cancelOperation();
  void dispenseBeverage();

}
