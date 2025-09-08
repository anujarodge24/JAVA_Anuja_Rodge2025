import java.util.Scanner;

class Mobile
{
	string brand;
	string model;
	int price;
	
	//accept details of mobile
	void SetDetails()
	{
		Scanner sc=new Scanner(system.in);
		
		System.out.print("Enter mobile brand name:");
		brand=sc.nextLine();
		
		System.out.print("Enter mobile brand name:");
		model=sc.nextLine();
		
		System.out.print("Enter mobile brand name:");
		brand=sc.nextInt();
	}
	
	//Method to show details
	void ShowDetails()
	{
		System.out.println("**Mobile Information**");
		
		System.out.println("Mobile brand name: " + brand);
		System.out.println("Mobile model name: " + model);
		System.out.println("Mobile price: " + price);
		
	}
	//Main function
	
	public static void main(String[] args)
	{
		Mobile M = new Mobile();
		
		//function calling 
		M.SetDetails();
		M.ShowDetails();
	}
}
		
		
		
		