
# Java Mini Projects Collection

This repository contains several Java mini-projects, each demonstrating core Object-Oriented Programming (OOP) concepts and practical application development. The projects included are:

- **Bank Management System**
- **ATM Simulation**
- **Library Management System**
- **Todo List Application**

---

## Table of Contents

- [Bank Management System](#bank-management-system)
- [ATM Simulation](#atm-simulation)
- [Library Management System](#library-management-system)
- [Todo List Application](#todo-list-application)
- [OOP Concepts Used](#oop-concepts-used)
- [How to Run](#how-to-run)
- [Notes](#notes)
- [Authors](#authors)

---

## Bank Management System

A console-based system for managing bank accounts. Features include account creation, login/logout, deposit, withdrawal, transaction history, account deletion, and account locking after failed login attempts.

**Key Features:**
- Create, view, and delete bank accounts
- Secure login with PIN and account locking after 3 failed attempts
- Deposit and withdraw money
- View transaction history
- Input validation for mobile numbers and PINs

**How to Run:**
```sh
javac src/MiniProject/BankManagmentSysytem/*.java
java -cp src MiniProject.BankManagmentSysytem.BankApp
```

---

## ATM Simulation

A simple ATM simulation that allows users to check balance, deposit, and withdraw money after PIN verification.

**Key Features:**
- PIN-based authentication
- Balance inquiry, deposit, and withdrawal
- Input validation and user-friendly prompts

**How to Run:**
```sh
javac src/MiniProject/Atm/*.java
java -cp src MiniProject.Atm.AtmStart
```

---

## Library Management System

A console-based library system to manage books, allowing users to add, borrow, return, and view books.

**Key Features:**
- Add new books
- Borrow and return books
- View all books and their status

**How to Run:**
```sh
javac src/MiniProject/LibrabaryManagment/*.java
java -cp src MiniProject.LibrabaryManagment.LibraryApp
```

---

## Todo List Application

A simple task manager to add, complete, view, and delete tasks.

**Key Features:**
- Add new tasks with unique IDs
- Mark tasks as complete
- View all tasks
- Delete tasks by ID

**How to Use:**
Integrate with your own main class or extend as needed.

---

## OOP Concepts Used

All projects demonstrate the following OOP principles:

- **Encapsulation:** Data and methods are bundled within classes, with access controlled via private/protected/public modifiers.
- **Abstraction:** Only essential operations are exposed to the user, hiding implementation details.
- **Inheritance:** The code is structured for extensibility, allowing for future subclassing (e.g., different account or book types).
- **Polymorphism:** The design supports polymorphism, though not all projects use it explicitly.
- **Class and Object Usage:** Real-world entities are modeled as classes and instantiated as objects.

---

## How to Run

1. **Compile the code** for the desired project as shown above.
2. **Run the main class** for the project you want to use.
3. **Follow the on-screen instructions** in the console.

---

## Notes

- All data is stored in memory; exiting the application will erase all records.
- Each project is self-contained and demonstrates clean, maintainable Java code.
- For demonstration, some projects create default data at startup.

---

## Authors

Developed as a collection of mini-projects for learning and demonstrating Java OOP and console application development.

