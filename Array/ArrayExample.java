import java.util.Scanner;

class ArrayExample
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.print("Enter array element:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Printing of array element:");

        for(int i:arr)
        {
            System.out.print(" " + i );
        }
    }
}


