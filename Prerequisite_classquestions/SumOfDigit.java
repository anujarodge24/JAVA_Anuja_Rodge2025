import java.util.Scanner;

class SumOfDigit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter three digit number:");
		int num = sc.nextInt();
		
		int a = num%10;
		num = num/10;
		int b = num%10;
		int c = num/10;
		
		System.out.println("Sum of digit:" + (a+b+c));
	}
}