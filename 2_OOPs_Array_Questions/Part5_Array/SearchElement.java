import java.util.Scanner;

class SearchElement
{
    public static void main(String[] args) 
    {
        int[] arr = {5,8,3,5,9};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element for Search:");
        int element = sc.nextInt();
        
        boolean found=false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==element)
            {
                found=true;
                break;
            }
        }

        System.out.println(found ?"Element found": "Element not found");


        
    }
}