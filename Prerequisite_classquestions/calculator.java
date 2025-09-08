import java.util.Scanner;

class Calculator {
    // Function for addition
    void Add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // Function for subtraction
    void Subtract(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    // Function for multiplication
    void Multiply(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    // Function for division
    void Divide(int a, int b) {
        if (b != 0)
            System.out.println("Division: " + (a / b));
        else
            System.out.println("Cannot divide by zero.");
    }

    // Main function
    public static void main(String[] args) {
        Calculator C = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Function calls (no data types needed when calling)
        C.Add(num1, num2);
        C.Subtract(num1, num2);
        C.Multiply(num1, num2);
        C.Divide(num1, num2);
    }
}
