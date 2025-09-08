import java.util.Scanner;

class BankAccount 
{
    int accnumber;
    String holdername;
    double balance;

    void SetDetails(int num, String n, double b) 
	{
        accnumber = num;
        holdername = n;
        balance = b;
    }

    void DisplayDetails() 
	{
        System.out.println("Account Number: " + accnumber);
        System.out.println("Account Holder: " + holdername);
    }

    void deposit(double amount) 
	{
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("After Deposited amount: Rs." + balance);
        } else {
            System.out.println("Amount cannot be negative.");
        }
    }

    void withdrawl(double amount) 
	{
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance = balance - amount;
            System.out.println("After balance withdrawal: Rs." + balance);
        }
    }
}

public class BankMain 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        BankAccount acc1 = new BankAccount();

        System.out.println("Enter Details of Account 1:");
        System.out.print("Account number: ");
        int accnumber1 = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Holder name: ");
        String holdername1 = sc.nextLine();

        System.out.print("Balance: ");
        double balance1 = sc.nextDouble();

        acc1.SetDetails(accnumber1, holdername1, balance1);

        acc1.DisplayDetails();
        acc1.deposit(1000.0);
        acc1.withdrawl(2000.0);
    }
}
