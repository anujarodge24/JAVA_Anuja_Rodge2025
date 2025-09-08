import java.util.Scanner;

class ArrayPrinting1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No. of Element: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        System.out.println("Enter Array Elements:");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        
        
        System.out.println("Array Printing: ");
        for(int i=0;i<n;i++)
        {
            System.out.print( arr[i] + " ");
        }
    }
}

        