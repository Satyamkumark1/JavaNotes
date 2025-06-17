# Java Bank Management System

This is a console-based Bank Management System implemented in Java. It allows users to create bank accounts, deposit and withdraw money, view account details, securely log in and out, view transaction history, and delete accounts. The system demonstrates advanced OOP concepts and includes security features.

---

## OOP Concepts Used

This project demonstrates several core Object-Oriented Programming (OOP) concepts:

- **Encapsulation**:  
  The `BankAccount` and `Bank` classes encapsulate their data and provide public methods for interaction, hiding internal details from the user.

- **Abstraction**:  
  The system exposes only necessary operations (like deposit, withdraw, create account) to the user, abstracting away the implementation details.

- **Inheritance**:  
  While this project does not use inheritance directly, it is structured in a way that could be extended using inheritance (e.g., different types of accounts).

- **Polymorphism**:  
  The code is designed to be extensible for polymorphism (e.g., if you add subclasses for different account types), though it is not explicitly demonstrated in the current implementation.

- **Class and Object Usage**:  
  The system uses classes (`Bank`, `BankAccount`) to model real-world entities, and creates objects to represent individual accounts and the bank itself.

---

## Features

- **Create Account**: Users can create a new bank account by providing their name, a 10-digit mobile number, an initial deposit, and a 4-digit PIN.
- **Login**: Users can log in to their account using their mobile number and PIN. After 3 failed login attempts, the account is locked for security.
- **Deposit Money**: Logged-in users can deposit money into their account.
- **Withdraw Money**: Logged-in users can withdraw money from their account, provided they have sufficient balance.
- **View All Accounts**: View details of all accounts in the system (for demonstration purposes).
- **Find Account**: Search for an account by providing the mobile number and PIN.
- **Transaction History**: View a detailed transaction history for the logged-in account.
- **Delete Account**: Logged-in users can delete their own account after confirmation.
- **Logout**: Securely log out of the current session.
- **Account Locking**: Accounts are locked after 3 failed login attempts to enhance security.
- **Input Validation**: The system checks for valid mobile numbers (10 digits) and PINs (4 digits).

---

## How It Works

1. **Startup**: The application starts by creating a default account for testing.
2. **Menu**: The user is presented with a menu to select actions (create account, deposit, withdraw, etc.).
3. **Account Management**: All account operations are managed through the `Bank` class, which maintains a list of `BankAccount` objects.
4. **Security**: Each account is protected by a 4-digit PIN. Users must log in to perform sensitive operations. Accounts are locked after 3 failed login attempts.
5. **Transaction History**: All deposits and withdrawals are recorded with timestamps and can be viewed by the account holder.
6. **Account Deletion**: Users can delete their account after confirmation.

---

## Usage

1. **Compile the code**:
    ```sh
    javac src/MiniProject/BankManagmentSysytem/*.java
    ```

2. **Run the application**:
    ```sh
    java -cp src MiniProject.BankManagmentSysytem.BankApp
    ```

3. **Follow the on-screen menu** to create accounts, log in, deposit, withdraw, view account details, view transaction history, and delete accounts.

---

## Example Menu

```
Welcome to your bank
***************************
Select an option:
1.  Create a Bank account
2.  Deposit Money
3.  Withdraw Money
4.  View all bank accounts
5.  Find your bank Details
6.  Login to your account
7.  Log Out
8.  View Transaction History
9.  Delete My Account
0.  Exit
***************************
Select an option:
```

---

## Notes

- Only one user can be logged in at a time.
- All data is stored in memory; exiting the application will erase all accounts.
- For demonstration, a default account is created at startup with mobile number `1234567890` and PIN `1234`.
- Accounts are locked after 3 failed login attempts for security.

---

## Authors

- Developed as a mini-project for learning Java OOP and console applications.

