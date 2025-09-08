import java.util.scanner;

class Mobile
{
	string brand;
	string model;
	int price;
	
	//accept details of mobile
	void SetDetails()
	{
		scanner sc=new scanner(system.in);
		
		system.out.print("Enter mobile brand name:");
		brand=sc.nextLine();
		
		system.out.print("Enter mobile brand name:");
		model=sc.nextLine();
		
		system.out.print("Enter mobile brand name:");
		brand=sc.nextInt();
	}
	
	//Method to show details
	void ShowDetails()
	{
		system.out.println("**Mobile Information**");
		
		system.out.println("Mobile brand name: " + brand);
		system.out.println("Mobile model name: " + model);
		system.out.println("Mobile price: " + price);
		
	}
	//Main function
	
	public static void main(string[] args)
	{
		Mobile M = new Mobile();
		
		//function calling 
		M.SetDetails();
		M.ShowDetails();
	}
}
		
		
		
		