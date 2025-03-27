package cs2.bank;

import java.util.ArrayList;

public class Bank {
  private ArrayList<Account> accts;
  public Bank() {
    accts = new ArrayList<Account>();
  }
  public void addAccount(Account a) {
    accts.add(a);
  }
  public String toString() {
    return accts.toString();
  }

  public static void main(String[] args) {
    Bank bank = new Bank();
    bank.addAccount(new CheckingAccount(null));
    bank.addAccount(new CheckingAccount(null));
    bank.addAccount(new CheckingAccount(null));
    bank.addAccount(new SavingsAccount(null));
    bank.addAccount(new SavingsAccount(null));
    bank.addAccount(new SavingsAccount(null));
    System.out.println(bank);

    for(Account a : bank.accts) {
      a.deposit(100000);
    }
    System.out.println(bank);
    for(Account a : bank.accts) {
      a.withdraw(5000);
    }
    System.out.println(bank);
    for(Account a : bank.accts) {
      a.withdraw(5000000);
    }
    System.out.println(bank);


  }


}
