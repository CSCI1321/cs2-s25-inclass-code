package cs2.bank;

public class CheckingAccount extends Account {
  private int overdraftFee;

  public CheckingAccount(Customer c) {
    super(c);
    this.overdraftFee = 2000;
  }

  public int withdraw(int amt) {
    if(amt <= 0) { return 0; }
    if(amt < this.balance) { 
      this.balance -= amt;
      return amt;
    }
    int ret = this.balance;
    this.balance = -this.overdraftFee;
    return ret;
  }

  public void monthlyMaintainence() {
    this.balance -= 500;
  }
}
