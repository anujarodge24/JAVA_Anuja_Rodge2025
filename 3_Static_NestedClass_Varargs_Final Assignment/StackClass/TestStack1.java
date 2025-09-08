class Stack 
{
    int stack[];   // array created at runtime
    private int tos;

    // Constructor with size
    Stack(int size) 
    {
        stack = new int[size];   // created array of given size
        tos = -1;
    }

    // push operation
    void push(int item) 
    {
        if (tos == stack.length - 1)   // FIXED
            System.out.println("Stack is Full");
        else
            stack[++tos] = item;
    }

    // pop operation
    int pop() 
    {
        if (tos < 0) 
        {
            System.out.println("Stack underflow");
            return -1;   // better to return -1 instead of 1
        } 
        else
            return stack[tos--];
    }
}

public class TestStack1
{
    public static void main(String[] args) 
    {
        Stack mystack1 = new Stack(5);

        // push values
        for (int i = 0; i < 5; i++) mystack1.push(i);

        // pop values
        System.out.println("Stack in mystack1: ");
        for (int i = 0; i < 5; i++)
            System.out.println(mystack1.pop());
    }
}
