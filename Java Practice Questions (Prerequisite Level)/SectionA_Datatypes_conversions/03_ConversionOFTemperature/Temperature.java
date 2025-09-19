//3]Convert temperature from celcius to farenheit
import java.util.Scanner;


class Temperature
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter Temperature in celcius:");
		int temp = sc.nextInt();
		
		float tempFerenheit = (temp *9/5) + 32;		
		
		System.out.print("Temperature in Ferenheit:"+ tempFerenheit);
	}
}
