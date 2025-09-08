import java.util.Scanner;

class Student
{
	int roll;
	String name;
	int m1,m2,m3;
	float percentage;
	
	//method to accept inputs
	void AcceptDetails()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Roll no:");
		roll = sc.nextInt();
		
		System.out.println("Enter name: ");
		name = sc.nextLine();
		
		System.out.println("Enter m1 marks:");
		m1 = sc.nextInt();
		
		System.out.println("Enter m2 marks:");
		m2 = sc.nextInt();
		
		System.out.println("Enter m3 marks:");
		m3 = sc.nextInt();
		
	}
	
	//method to calculate percentage
	
	void CalcultePercentage()
	{
		int total=m1+m2+m3;
		
		percentage=(total/300.0f)*100;
	}
	
	//Method to display details
	
	void DisplayDetails()
	{
		System.out.println("***Student Details***");
		
		System.out.println("Roll no: " + roll);
		System.out.println("name: " +name);
		System.out.println("percentage: "+ percentage);
		System.out.println("Grade:" + CalculateGrade());
	}
	
	//Retun Grade Based on percentage
	
	String CalculateGrade()
	{
		if(percentage>=90)
			return "A+";
		else if(percentage>=75)
			return "A";
		else if(percentage>=60)
			return "B";
		else if(percentage>=50)
			return "C";
		else if(percentage>=35)
			return "P";
		else 
			return "Fail";
	}
	
	//main method
	public static void main(String[] args)
	{
		Student s1 = new Student();
		
		s1.AcceptDetails();
		s1.CalcultePercentage();
		s1.DisplayDetails();
	}
}

			
		
	