import java.util.Scanner;

class CountEvenOddElement
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Array Length: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        System.out.print("Enter Array Elements:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        int EvenCount=1;
        int OddCount = 1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                EvenCount++;
            }
            else 
            { 
                OddCount++;
            }
        }
        
        System.out.println("Number of Odd Element in Array: " + OddCount);

        System.out.println("Number of Even Element in Array: " + EvenCount);
    }
}