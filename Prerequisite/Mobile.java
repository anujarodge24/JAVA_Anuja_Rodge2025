import java.util.Scanner;

class Mobile {
    String brand;
    String model;
    int price;

    // Method to accept details of mobile
    void SetDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mobile brand name: ");
        brand = sc.nextLine();

        System.out.print("Enter mobile model name: ");
        model = sc.nextLine();

        System.out.print("Enter mobile price: ");
        price = sc.nextInt();
    }

    // Method to show details
    void ShowDetails() {
        System.out.println("\n**Mobile Information**");
        System.out.println("Mobile brand name: " + brand);
        System.out.println("Mobile model name: " + model);
        System.out.println("Mobile price: " + price);
    }

    // Main function
    public static void main(String[] args) {
        Mobile M = new Mobile();
        M.SetDetails();    // Calling method to input details
        M.ShowDetails();   // Calling method to display details
    }
}
