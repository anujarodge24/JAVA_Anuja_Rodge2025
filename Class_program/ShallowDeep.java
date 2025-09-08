class Address
{
    String city;
    String Street;
    int pincode;


}

class Person
{
    String name;
    Address address;

    //shallow copy
    Person(Person p)
    {
        this.name = p.name;
        this.address = p.address;
    }

    
}