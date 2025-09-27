/*Create a class Car with model, mileage, price. Accept details for 4 cars and display the model of the cheapest 
one with mileage above 20.*/

import java.util.Scanner;

class Car 
{
    String model;
    float mileage;
    float price;

    void acceptDetails() 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Car Model: ");
        model = sc.nextLine();

        System.out.print("Enter Car Mileage: ");
        mileage = sc.nextInt();

        System.out.print("Enter Car Price: ");
        price = sc.nextFloat();
    }

    void displayDetails() 
    {
        System.out.println("Car Model: " + model);
        System.out.println("Mileage: " + mileage );
        System.out.println("Price: Rs. " + price);
    }
}

public class CarMain 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Car[] car = new Car[4];

        // Accept details for 4 cars
        for (int i = 0; i < 4; i++) 
        {
            System.out.println("\nEnter details for Car " + (i + 1) + ":");
            car[i] = new Car();
            car[i].acceptDetails();
        }

        // Find cheapest car with mileage > 20
        Car cheapest = null;
        for (int i = 0; i < 4; i++) 
        {
            if (car[i].mileage > 20) 
            {
                if (car[i].price < cheapest.price) 
                {
                    cheapest = car[i];
                }
            }
        }
        System.out.println("\n*** Cheapest Car with mileage above 20 ***");
        cheapest.displayDetails();
    }
}
