class Person
{
    String name;

    Person(String name)
    {
        this.name = name;
        System.out.println("Parent class:Person constructor called");
    }
}

class Student extends Person
{
    int age;

    Student(String name,int age)
    {
        super(name);
        this.age = age;
        System.out.println("child class:Student constructor called");
    }
}

public class SuperDemo{
    public static void main(String[] args) {
        Student S = new Student("Anuja Rodge",21);
    }
}