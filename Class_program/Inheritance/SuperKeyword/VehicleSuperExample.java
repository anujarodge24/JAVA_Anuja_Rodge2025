class Vehicle
{
    String brand;
    int price;

    //vehicle constructor
    Vehicle(String brand,int price) 
    {
        this.brand = brand;
        this.price = price;
    }

    //Getter for brand
    public String getBrand()
    {
        return brand;
    }

    //Getter for price
    public int getPrice()
    {
        return price;
    }

    void showDetails()
    {
        System.out.println("Brand: "+ brand);
        System.out.println("Price: "+price);
    }
}

class Car extends Vehicle 
{
    String fuelType;

    Car(String brand,int price,String fuelType)
    {
        super(brand, price);
        this.fuelType = fuelType;
    }
    
    //Getter for fueltype
    public String getfuelType()
    {
        return fuelType;
    }

    void showDetails()
    {
        super.showDetails();
        System.out.println("fuelType: "+fuelType);
    }
}

class ElectricCar extends Car 
{
    int batteryCapacity;

    ElectricCar(String brand,int price,String fuelType,int batteryCapacity) 
    {
        super(brand,price,fuelType);
        this.batteryCapacity = batteryCapacity;
    }

    //getter for batterycapacity

    public int getCapacity()
    {
        return batteryCapacity;
    }

    void showDetails()
    {
        super.showDetails();
        System.out.println("battrycapacity:"+ this.batteryCapacity);
    }

    
}

public class VehicleSuperExample
{
    public static void main(String[] args) {
        
        ElectricCar ec = new ElectricCar("Audi",400000,"petrol",45);
        ec.showDetails();
    }
}