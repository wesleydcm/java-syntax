public class App {
    public static void main(String[] args) {

        // Create two instances of BankAccount
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();


        // Access and modify the static variable
        BankAccount.accounts++;
        BankAccount.accounts++;
        System.out.println("Number of accounts: " + BankAccount.accounts);

        // Acess and modify the instance variable
        System.out.println("Initial balance of account1: " + account1.balance);
        account1.withdraw(2.0);
        System.out.println("Balance of account1 after withdraw " + account1.balance);

        
        // Use the instance method to print balance
        account1.printBalance();


        // Calculate exponential debt using intance method
        double debt = account1.CalculateExponentialDebt();
        System.out.println("Exponential debt calculated: " + debt);

        // Each instance has its own balance
        System.out.println("Initial balance of account2: " + account2.balance);



    }
}
