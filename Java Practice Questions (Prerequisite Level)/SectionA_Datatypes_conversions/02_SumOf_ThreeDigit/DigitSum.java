//2]Accept a 3 digit number and print the sun of its digit

public class DigitSum
{
	public static void main(String[] args)
	{
		int num=135,a ,b ,c ;
		int sum;
		
        a=num%10;  //a=5
		num=num/10; //b=13
		b=num%10;   //b=3
		c=num/10;  //num=1
		
		sum=a+b+c;
		
		System.out.println("Sum of digits:"+ sum);
	}
}
		