import java.util.Scanner;

class ArrayPrinting
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];

        System.out.print("Enter Array Elements:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        
        
        System.out.print("Array Printing: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" " + arr[i]);
        }
    }
}

        