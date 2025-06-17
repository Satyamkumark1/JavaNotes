package MiniProject.BankManagmentSysytem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankAccount {
    private final String accountHolderName;
    private final long mobileNumber;
    private double balance;
    private final int id;
    private final int pin;
    private final List<String> transactionHistory = new ArrayList<>();
    private int failedLoginAttempts = 0;
    private boolean locked = false;

    public BankAccount(String accountHolderName, long mobileNumber, double balance, int id, int pin) {
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.balance = balance;
        this.id = id;
        this.pin = pin;
        transactionHistory.add(new Date() + ": Account created with balance " + balance);
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getPin() {
        return pin;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public boolean isLocked() {
        return locked;
    }

    public int getId() {
        return id;
    }

    public void incrementFailedLoginAttempts() {
        failedLoginAttempts++;
        if (failedLoginAttempts >= 3) {
            locked = true;
        }
    }

    public void resetFailedLoginAttempts() {
        failedLoginAttempts = 0;
    }

    public void depositMoney(double money) {
        try {
            if (money <= 0) {
                System.out.println("Deposit amount must be positive.");
                return;
            }
            balance += money;
            String entry = new Date() + ": Deposited " + money + ", Balance: " + balance;
            transactionHistory.add(entry);
            System.out.println("You have successfully deposited: " + money +
                    "\nYour current balance is: " + balance);
        } catch (Exception e) {
            System.out.println("An error occurred during deposit: " + e.getMessage());
        }
    }

    public void withdrawMoney(double money) {
        try {
            if (money <= 0) {
                System.out.println("Withdrawal amount must be positive.");
                return;
            }
            if (money > balance) {
                System.out.println("Insufficient balance.");
                return;
            }
            balance -= money;
            String entry = new Date() + ": Withdrew " + money + ", Balance: " + balance;
            transactionHistory.add(entry);
            System.out.println("You have successfully withdrawn: " + money +
                    "\nYour current balance is: " + balance);
        } catch (Exception e) {
            System.out.println("An error occurred during withdrawal: " + e.getMessage());
        }
    }

    public void printTransactionHistory() {
        System.out.println("Transaction History for " + accountHolderName + ":");
        for (String entry : transactionHistory) {
            System.out.println(entry);
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", balance=" + balance +
                ", id=" + id +
                ", locked=" + locked +
                '}';
    }
}