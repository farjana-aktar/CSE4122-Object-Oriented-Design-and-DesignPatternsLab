public class Customer {
    public static void main(String arg[]) {
        BankService myBankService = new BankService();

        int mySaving = myBankService.createNewAccount("Saving", 500);
        int myChequing = myBankService.createNewAccount("Chequing", 800);
        int myInvestment = myBankService.createNewAccount("Investment", 1000);

        myBankService.transferMoney(mySaving, myInvestment, 700);

        myBankService.depositMoney(mySaving,1300);
        myBankService.withdrawMoney(mySaving,200);

        myBankService.transferMoney(myChequing,myInvestment,1500);
    }
}
