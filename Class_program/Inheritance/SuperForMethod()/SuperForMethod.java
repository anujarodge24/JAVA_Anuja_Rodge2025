class Person
{
    String name;        //parent class variable

    Person(String name){
        this.name = name;
    }

    void display()
    {
        System.out.println("Name: " + name);
    }
}

class Student extends Person
{
    int age;          //child class variable

    Student(String name,int age)
    {
        super(name);
        this.age = age;
    }

    void display()              //parent class method override
    {
        super.display();        //to access parent class method (when overriden)
        System.out.println("Age: " + age);
    }
}

public class SuperForMethod
{
    public static void main(String[] args) 
    {
       Student s = new Student("Anuja Rodge",21);
       s.display(); 
    }
}