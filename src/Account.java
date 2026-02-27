

public class Account {
    public String accountHolderName;
    public String accountNumber;
    public double accountBalance;

    //constructor
    public Account(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountBalance = 0;
        this.accountNumber = accountNumber;
    }

    public void depositFunds(double amount) {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be greated then zero");
        }
        accountBalance += amount;
        System.out.println("Amount deposited \nCurrent Balance now is: " + accountBalance);
    }

    public void withdrawAmount(double amount) {
        if ((accountBalance - amount) < 0) {
            throw new InvalidAmountException("Amount Exceeds Balance");
        }
        accountBalance -= amount;
        System.out.println("Amount withdrawn \nCurrent Balance now is: " + accountBalance);
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
