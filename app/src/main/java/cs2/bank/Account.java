package cs2.bank;

public abstract class Account {
  //Fields
  protected int balance;
  protected int acctNum;
  protected Customer cust;

  private static int nextAccountNumber = 1;

  //Constructor
  public Account(Customer owner) {
    this.cust = owner;
    this.acctNum = nextAccountNumber;
    nextAccountNumber++;
    this.balance = 0;
  }

  //Methods
  //Common methods - with definitions
  public double getAvailableBalance() {
    return this.balance / 100.0;
  }
  public int getAccountNumber() { return this.acctNum; }
  public void deposit(int amt) {
    if(amt <= 0) return;
    this.balance += amt;
  }
  public String toString() {
    return this.acctNum + ": " + this.balance;
  }

  //Abstract methods
  public abstract int withdraw(int amt);
  public abstract void monthlyMaintainence();
}
