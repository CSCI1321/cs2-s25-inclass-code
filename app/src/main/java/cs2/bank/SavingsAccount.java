package cs2.bank;

public class SavingsAccount extends Account {

  private int minBalance;
  private double interestRate;

  public SavingsAccount(Customer c) {
    super(c);
    this.minBalance = 50000;
    this.interestRate = 0.03;
  }

  public int withdraw(int amt) {
    if(amt <= 0) { return 0; }
    if(this.balance - amt < this.minBalance) {
      return 0;
    }
    this.balance -= amt;
    return amt;
  }
  public void monthlyMaintainence() {
    this.balance *= 1 + this.interestRate;
  }
  
}
