

class BankAccount
{
    private String accountHolder;
    private double balance;
    private static int AccountNumber = 10001;
    private static int totalAccounts=0;

    //constructor
    public BankAccount(String AccountHolder , double Balance)
    {
        this.accountHolder = AccountHolder;
        this.balance = Balance;
        totalAccounts++;                         //incrementing static variable
        

    }

    void showDetails()
    {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        AccountNumber++; 
        System.out.println("Account Number: " + AccountNumber);      //can only directily access static data and method
        System.out.println("Total Account: " + totalAccounts);
    }

    /*static void showTotalAcc()
    {
        AccountNumber++; 
        System.out.println("Account Number: " + AccountNumber);      //can only directily access static data and method
        System.out.println("Total Account: " + totalAccounts);
    }*/

     


}

public class BankAccountMain
{
    public static void main(String[] args) 
    {
        BankAccount acc1 = new BankAccount("Anuja",50000);
        BankAccount acc2 = new BankAccount("Rutuja",70000);

        acc1.showDetails();
        //acc1.showTotalAcc();
        System.out.println();

        acc2.showDetails();
        //acc2.showTotalAcc();
    }
}