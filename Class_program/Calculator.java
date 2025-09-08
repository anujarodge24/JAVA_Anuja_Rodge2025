import java.util.Scanner;

class Calculator
{
	//Function for addition
	void Add(int a,int b)
	{
		System.out.print("Sum: " +(a+b));
	}
	
	//function for substraction
	void Substract(int a,int b)
	{
		System.out.print("Substraction: " +(a-b));
	}
	
	//function for Multiplication
	void Multiply(int a,int b)
	{
		System.out.print("Multiplication: " +(a*b));
	}
	
	//function for multiplication
	void Divide(int a,int b)
	{
		System.out.print("Division: " +(a/b));
	}
	
	//main function
	public static void main(String[] args)
	{
		Calculator C = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number:");
		int num1=sc.nextInt();
		
		System.out.print("Enter second number:");
		int num2=sc.nextInt();
		
		C.Add(num1,num2);
		C.Substract(num1,num2);
		C.Multiply(num1,num2);
		C.Divide(num1,num2);
	}
}