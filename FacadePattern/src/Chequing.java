import java.math.BigDecimal;

public class Chequing implements IAccount{
    private int balance;
    private int accountNumber;

    public Chequing(int balance, int accountNumber)
    {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    @Override
    public void deposit(int amount) {
            balance = balance + amount;
            System.out.println("Deposite " +amount + " to Chequing AccountNumber " + accountNumber);

    }

    @Override
    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;

            System.out.println("Balance " + amount + " is withdraw from Chequing AccountNumber " + accountNumber);
        }
        else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public void transfer(IAccount toAccount, int amount) {
        withdraw(amount);
        toAccount.deposit(amount);
        System.out.println("Successfully transferred $" + amount + " from this account to another account.");
    }


    @Override
    public int getAcountNumber()
    {
        return accountNumber;
    }
}
