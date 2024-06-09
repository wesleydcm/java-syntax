# Scopes Variables

Understanding variable scopes in Java

This example demonstrates the use of class variables, instance variables, and local variables in a Java application. The `BankAccount` class simulates a basic bank account with methods for withdrawing money, printing the current balance, and calculating exponential debt. The `App` class contains the `main` method, serving as the entry point of the program and illustrating how to interact with the `BankAccount` class.

## Key Concepts

- **Class Variable (`static`)**: A variable shared among all instances of a class. In this example, `accounts` tracks the total number of `BankAccount` instances created.

- **Instance Variable**: A variable unique to each instance of a class. Here, `balance` represents the account balance for each `BankAccount` instance.

- **Local Variable**: A variable declared within a method and accessible only within that method. Examples include `newBalance` in the `withdraw` method, and `installmentValue`, `valueAmount`, and `calculateValue` in the `calculateExponentialDebt` method.
