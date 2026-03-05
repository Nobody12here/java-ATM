public class SavingsAccount extends Account {
    private double interestRate;
    public SavingsAccount(String accountHolderName,String accountNumber,double interestRate){
        super(accountHolderName,accountNumber);
        this.interestRate = interestRate;
    }
    public void addInterest(){
        double interest = accountBalance * (interestRate /100);
        accountBalance += interest;
    }
}
