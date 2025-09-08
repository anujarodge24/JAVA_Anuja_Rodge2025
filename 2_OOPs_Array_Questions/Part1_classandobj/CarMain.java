/*Create a class Car with model, mileage, price. Accept details for 4 cars and display the model of the cheapest 
one with mileage above 20.*/

import java.util.Scanner;

class Car
{
    String model;
    int mileage;
    float price;

    void Acceptdetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Car Model : ");
        model = sc.nextLine();

        System.out.print("Enter Car Mileage: ");
        mileage = sc.nextInt();

        System.out.print("Enter car price:");
        price = sc.nextFloat();
    }

    
    void DisplayDetails()
    {
        System.out.println("****Cheapest Car With 20 above mileage*****");
        System.out.println("Car Model: " + model);
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);
    }

    void CompareDetails(Car C1 , Car C2 , Car C3)
    {
        if(price < C1.price && price < C2.price && price < C3.price)
        DisplayDetails();
        
        else if(C1.price < C2.price && C1.price < C3.price)
        C1.DisplayDetails();
        
        else if(C2.price < C3.price)
        C2.DisplayDetails();
        
        else
        C3.DisplayDetails();
    }
}

public class CarMain
{
    public static void main(String[] args)
    {
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        Car c4 = new Car();

        c1.Acceptdetails();
        System.out.println();

        c2.Acceptdetails();
        System.out.println();

        c3.Acceptdetails();
        System.out.println();

        c4.Acceptdetails();
        System.out.println();
        
        if(c1.mileage>20)
            c4.CompareDetails(c1,c2,c3);

        if(c2.mileage > 20)
            c4.CompareDetails(c1,c2,c3);

        if(c3.mileage >20)
            c4.CompareDetails(c1,c2,c3);
        
        if(c4.mileage > 20)
            c4.CompareDetails(c1,c2,c3);
             

    }
}
