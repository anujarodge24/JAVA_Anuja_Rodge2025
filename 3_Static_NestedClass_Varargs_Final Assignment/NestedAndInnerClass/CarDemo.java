//Inner class Example

class Car 
{
    String brand;
    Car(String brand)
    {
        this.brand = brand;
    }

    //inner class
    class Engine{
        int horsePower;

        Engine(int hp)
        {
            this.horsePower = hp;
        }

        void showDetails()
        {
            System.out.println("Car Brand : " + brand + "  Engine hp: "+ horsePower);
        }
    }
}

public class CarDemo
{
    public static void main(String[] args) {
        //Create outer class object first
        Car car1 = new Car("Tesla");
        Car car2 = new Car("BMW");

        //Create inner class object using outer class
        Car.Engine engine1 = car1.new Engine(500);
        Car.Engine engine2 = car2.new Engine(600);

        //Show details
        engine1.showDetails();
        engine2.showDetails();
    }
}