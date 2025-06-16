package MiniProject.BankManagmentSysytem;

public class BankAccount {
    // BankAccount class to represent a bank account
    private final String accountHolderName;
    private final long mobileNumber;
    private double balance;
    private final int id;
    private final int pin;

    // Constructor to initialize the bank account details
    public BankAccount(String accountHolderName, long mobileNumber, double balance, int id, int pin) {
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.balance = balance;
        this.id = id;
        this.pin = pin;
    }

    // Getters for the bank account details
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Method to get the account ID
    public int getPin() {
        return pin;
    }
    // Method to get the account ID
    public  int checkPin() {
        return pin;
    }
    // Method to get the account ID
    public long getMobileNumber() { return mobileNumber; }

    // Method to get the account ID
    public void depositMoney(double money) {
        if (money < 100) {
            System.out.println("Enter a minimum amount of 100 rupees.");
            return;
        }
        balance += money;
        System.out.println("You have successfully deposited " + money +
                "\nYour current balance is: " + balance);
    }

    // Method to withdraw money from the account
    public void withdrawMoney(double money) {
        if (money > balance) {
            System.out.println("Insufficient balance.");
            return;
        }
        balance -= money;
        System.out.println("You have successfully withdrawn: " + money +
                "\nYour current balance is: " + balance);
    }
    // Method to get the current balance

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", balance=" + balance +
                ", id=" + id +
                '}';
    }
}