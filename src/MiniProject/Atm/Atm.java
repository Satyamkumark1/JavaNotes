package MiniProject.Atm;

import java.util.Scanner;

public class Atm {

    private  int atmPin = 2626;
    private  double balance = 323232.232;
    Scanner scanner = new Scanner(System.in);



    // Checking The Correct Pin

    public boolean  checkThePin(int enteredPin) {
        return atmPin == enteredPin;
    }

    // Showing the menu

    public  void  showMenu() {
        System.out.println("Welcome to the ATM:");
        System.out.println(" 1 .Check the Balance");
        System.out.println(" 2. Deposit");
        System.out.println(" 3. Withdraw");
        System.out.println("4. Exit");

        System.out.println("Please enter your choice");

    }

    //Checking the Balanace
    public  void checkBalance() {
        System.out.println("Your current balance:" + balance);
    }

    // Depositing
    public void deposit(double amount) {
        balance+=amount;
        System.out.println("₹" + amount + " deposited successfully.");
        System.out.println("Updated balance: ₹" + balance);

    }
    // Withdraw Money
    public  void withdraw(double amount) {
        if (amount < balance) {
            balance-=amount;
            System.out.println("you withdraw:" + amount);
            System.out.println("your current balance:" + balance);
        } else if ( amount == balance){
            balance = 0;
            System.out.println("You withdraw:" + amount);
            System.out.println("your current balance:" + balance);
        } else {
            System.out.println("Enter a vaild amount");
        }

    }

    // Main Start Function
    public void startATM() {
        System.out.println("Enter your ATM PIN:");
        int enteredPin = scanner.nextInt();  // 🔹 Input line

        if (!checkThePin(enteredPin)) {
            System.out.println("Incorrect PIN. Exiting...");

        }

        // 🔜 You’ll write your menu loop here next
        while (true) {
            showMenu(); // show the options
            int choice = scanner.nextInt(); // get user choice

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you! Exiting...");
                    return; // end the ATM session
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }


    }





}
