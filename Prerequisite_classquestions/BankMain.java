import java.util.Scanner;
class BankAccount
{
	String name;
	double balance;
	
	void SetDetails(String n,double b)
	{
		name=n;
		balance=b;
	}
	
	void DisplayDetails()
	{
		System.out.println("Account Holder:"+ name);
		System.out.println("Balance:"+ balance);
	}
	
	void CompareBalance(BankAccount other)
	{
		if(balance>other.balance)
		{
			System.out.println(this.name + " has a higher balance");
		}
		else 
		{
			if (balance<other.balance)
		    {
			    System.out.println(other.name + " has a higher balance balance");
			}
		
	        else{
			    System.out.println("Both account have same balance");
			}
		}
	}
}

public class BankMain
{
	public static void  main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		BankAccount acc1=new BankAccount();
		BankAccount acc2 = new BankAccount();
		
		System.out.println("Enter Details of Account 1:");
		System.out.print("name:");
		String name1 = sc.nextLine();
		System.out.print("Balance:");
		double balance1 = sc.nextDouble();
		sc.nextLine();  // consume nextline
		acc1.SetDetails(name1,balance1);
		
		System.out.println("Enter Details Account2:");
		System.out.print("name:");
		String name2 = sc.nextLine();
		System.out.print("Balance:");
		double balance2 = sc.nextDouble();
		sc.nextLine();  // consume nextline
		acc1.SetDetails(name2,balance2);
		
		acc1.CompareBalance(acc2);
		sc.close();
	}
}
		
		

			