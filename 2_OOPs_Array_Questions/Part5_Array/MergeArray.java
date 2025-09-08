

class MergeArray
{
    public static void main(String[] args) 
    {
        int[] arr1 = {5,8,2,9};
        int[] arr2 = {1,6,3};
        int[] arr3 ={};

        for(int i=0 ; i < arr1.length ; i++)
        {
            arr3[i] = arr1[i];
        }
        for (int i =0; i < arr2.length ; i++)
        {
            arr3[i+arr1.length] = arr2[i];
        }
        
        System.out.print("Merged Array: ");

        for(int i = 0 ; i < arr1.length + arr2.length; i++)
        {
            System.out.print( arr1[i] + " ");

        }


    }
}