/*
    - Create a method findSum(int... nums) that returns the sum of all arguments passed. 
	- Test it with different sets of numbers.
*/

class VarargsSum 
{
    static void findSum(int... nums) 
    {
        int sum = 0;
        System.out.print("Content: ");
        for (int n : nums) 
        {
            System.out.print(n + " ");
            sum = sum + n;   
        }
        System.out.println("**Sum Of Arguments: " + sum);
    }

    public static void main(String[] args) 
    {
        // Test with different sets of numbers
        findSum(5);
        findSum(30, 20, 60);
        findSum(1,2,3, 4, 5);
        findSum();
    }
}
