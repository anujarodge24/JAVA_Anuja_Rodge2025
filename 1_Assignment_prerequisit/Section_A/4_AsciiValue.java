//4]Accept a character and display its ascii value

import java.util.Scanner;

class AsciiValue
{
	public static void main(String[] args)
	{
		Scanner sc =new  Scanner(System.in);
		System.out.print("Enter Character:");
		
		char ch = sc.next();
		
		int ascii = (int) ch;
		
		System.out.print("Ascii value of entered character:" + ascii);
	}
}
		
		