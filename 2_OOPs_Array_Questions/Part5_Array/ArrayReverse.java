class ArrayReverse
{
    public static void main(String[] args)
    {
        int[] arr = {10,20,30,40,50};

        System.out.println("Reverse Array:");
        
        int temp;
        for(int i = 0; i < arr.length ; i++)
        {
            for(int j = arr.length-1 ; j >= 0 ;j--)
            {
                temp =arr[i];
                arr[i] = arr[j];
                arr[j] = temp;            
            }
        } 
        for(int i =0 ; i<arr.length ; i++)
        {
            System.out.print(" " + arr[i]);
        }
    }
}