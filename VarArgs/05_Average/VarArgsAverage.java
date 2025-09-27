/*
- Create a method average(int... nums) that returns the average of given numbers. 
- Handle the case when no numbers are passed (return 0).

*/
class VarArgsAverage 
{
    static double average(int... nums) 
    {

        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        if (nums.length == 0) {
            return 0; 
        }

        return (float) sum / nums.length;
    }

    public static void main(String[] args) 
    {
        System.out.println("Average of 11, 23, 30 = " + average(10, 20, 30));
        System.out.println("Average of 5, 15 = " + average(5, 15));
        System.out.println("Average of single number (7) = " + average(7));
        System.out.println("Average of no numbers = " + average());
    }
}
