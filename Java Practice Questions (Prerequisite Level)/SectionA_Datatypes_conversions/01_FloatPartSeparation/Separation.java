import java.util.Scanner;

public class Separation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Float number: ");
        float num = sc.nextFloat();

        int integerpart = (int) num;
        System.out.println("Interger Part: "+ integerpart);

        float decimalPart = num - integerpart;
        System.out.println("Decimal Part: "+ decimalPart);

    }
}