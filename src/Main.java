import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Enter 1 to Create New account
                Enter 2 to deposit funds
                Enter 3 to withdraw funds\s
                Enter 4 to View balance
                Press any other key to exit""");
        char options = scanner.nextLine().charAt(0);
        switch (options) {
            case '1':
                SavingsAccount savingsAccount = new SavingsAccount("test","1234ABC",1.21);
                bank.addAccount(savingsAccount);
                break;
            case '2':
                System.out.println("Deposit Funds");
                Account account = bank.findAccount("1234ABC");
                try {
                    account.depositFunds(123.11);
                } catch (InvalidAmountException e){
                    System.out.println("error "+ e);
            }
                break;
            case '3':
                System.out.println("Withdraw funds");
                break;
            case '4':
                System.out.println("View Balance");
                break;
            default:
                System.out.println("Exiting.....");
                break;
        }
    }
}