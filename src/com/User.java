package com;

public class User {
    private int accountNumber;
    private String accountHolderName;
    private  double balance;

    //Deposit moneny method
    public void depositMoey(double money){
      if(money < 0){
          System.out.println("Invaid deposit");
      } else {
          balance += money;
      }
        System.out.println("Your deposited: " + money);
        System.out.println("current balance: " + balance);
    }

    // WithrawMOney method
    public double withdrawMoney(double money){
        if (balance >= money){
            balance-=money;
            System.out.println("Your balance after withdrawl :" + balance);
        } else if (money <= 0) {
            System.out.println("Invaild transactions");
        } else {
            money = balance;
            balance = 0;

        }

        return money;
    }


}
