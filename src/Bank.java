import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<Account>();
    public void addAccount(Account account){
        System.out.println("Account added " + account.accountNumber);
        accounts.add(account);
    }
    public Account findAccount(String accountNumber){
        for (Account account:accounts ){
            if (account.accountNumber.equals(accountNumber)){
                return account;
            }
        }
        System.out.println("account not found");
        return null;
    }
}
