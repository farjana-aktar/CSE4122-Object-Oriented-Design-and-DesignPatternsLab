import java.util.Hashtable;

public class BankService {
    private Hashtable<Integer, IAccount> bankAccounts;

    public  BankService() {
        this.bankAccounts = new Hashtable<Integer, IAccount>();
    }

    public int createNewAccount(String type, int initAmount) {
        IAccount newAccount = null;
        switch (type) {
            case "Chequing":
                newAccount = new Chequing(this.bankAccounts.size(),initAmount);
                break;
            case "Saving":
                newAccount = new Saving(this.bankAccounts.size(),initAmount);
                break;
            case "Investment":
                newAccount = new Investment(this.bankAccounts.size(), initAmount) {
                };
                break;
            default:
                System.out.println("Invalid account type.");
                break;
        }
        if (newAccount != null) {
            this.bankAccounts.put(newAccount.getAcountNumber(), newAccount);
            return newAccount.getAcountNumber();
        }
        return -1;

    }

    public void transferMoney(int to, int from, int amount) {
        IAccount toAccount = this.bankAccounts.get(to);
        IAccount fromAccount = this.bankAccounts.get(from);

        fromAccount.transfer(toAccount, amount);
    }

    public void depositMoney(int accountNumber, int amount){
        IAccount account = bankAccounts.get(accountNumber);
        account.deposit(amount);

    }

    public void withdrawMoney(int accountNumber,int amount){
        IAccount account = bankAccounts.get(accountNumber);
        account.withdraw(amount);
    }
}