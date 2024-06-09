public class BankAccount {
    // class variable
    public static int accounts = 0;

    // instance variable
    double balance = 10.0;

    public double withdraw(double value) {
        // local variable
        double newBalance = balance - value;

        this.balance = newBalance;

        return balance;
    }

    public void printBalance() {
        // Instance variable accessed within method
        System.out.println(balance);

    }

    public double CalculateExponentialDebt() {
        // local variables
        double installmentValue = 50.0;
        double valueAmount = 0.0;

        for (int x = 1; x < 5; x++) {
            // local variable
            double calculateValue = installmentValue * x;

            valueAmount += calculateValue;
        }

        return valueAmount;
    }
}
