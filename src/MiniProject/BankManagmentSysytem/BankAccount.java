package MiniProject.BankManagmentSysytem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * BankAccount class represents a single user's bank account.
 * Stores account details, balance, transaction history, and login state.
 */
public class BankAccount {
    // Account holder's name
    private final String accountHolderName;
    // Mobile number associated with the account
    private final long mobileNumber;
    // Current account balance
    private double balance;
    // Unique account ID
    private final int id;
    // 4-digit PIN for authentication
    private final int pin;
    // List to store transaction history
    private final List<String> transactionHistory = new ArrayList<>();
    // Tracks failed login attempts
    private int failedLoginAttempts = 0;
    // Indicates if the account is locked due to failed logins
    private boolean locked = false;

    /**
     * Constructor to initialize a bank account.
     */
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

    /**
     * Increments failed login attempts and locks the account after 3 failures.
     */
    public void incrementFailedLoginAttempts() {
        failedLoginAttempts++;
        if (failedLoginAttempts >= 3) {
            locked = true;
        }
    }

    /**
     * Resets failed login attempts after a successful login.
     */
    public void resetFailedLoginAttempts() {
        failedLoginAttempts = 0;
    }

    /**
     * Deposits money into the account and records the transaction.
     */
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

    /**
     * Withdraws money from the account and records the transaction.
     */
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

    /**
     * Prints the transaction history for this account.
     */
    public void printTransactionHistory() {
        System.out.println("Transaction History for " + accountHolderName + ":");
        for (String entry : transactionHistory) {
            System.out.println(entry);
        }
    }

    /**
     * Returns a string representation of the account.
     */
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