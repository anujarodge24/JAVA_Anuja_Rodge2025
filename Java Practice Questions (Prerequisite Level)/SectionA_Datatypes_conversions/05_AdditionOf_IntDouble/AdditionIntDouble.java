//5]Accept two different data types(int and doubles)and add them using typecasting

import java.util.Scanner;

class AdditionIntDouble
{
	public static void main(String[] args)
	{
		Scanner sc =new  Scanner(System.in);
		
		System.out.print("Enter integer value:");
		int value1 = sc.nextInt();
		
		System.out.print("Enter Double value:");
		double value2 = sc.nextDouble();
		
		double sum = (double) value1 + value2;
		
		System.out.print("Sum of integer and double part:" + sum);
	}
}
		