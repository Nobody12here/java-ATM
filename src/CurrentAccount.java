public class CurrentAccount extends Account {
    private double withdrawLimit;

    public CurrentAccount(String accountHolderName, String accountNumber, double withdrawLimit) {
        super(accountHolderName, accountNumber);
        this.withdrawLimit = withdrawLimit;
    }

    @Override
    public void withdrawAmount(double amount) {
        if (accountBalance + amount > withdrawLimit) {
            throw new InvalidAmountException("Amount exceeds the withdraw limit !");

        }
        accountBalance -= amount;
        System.out.println("Amount withdrawn \nCurrent Balance now is: " + accountBalance);

    }
}
