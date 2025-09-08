class A
{
    int i,j;

    void showij()
    {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A
{
    int k;

    void showk()
    {
        System.out.println("k: " + k);
    }

    void sum()
    {
        System.out.println("i+j+k: "+ (i+j+k));
    }
}

public class InheritanceDemo2
{
    public static void main(String[] args) {
        //created object of superclass A

        A superobj = new A();
        superobj.i = 10;
        superobj.j=20;

        System.out.println("Content of superclass A: ");
        superobj.showij();

        System.out.println();

        //create object of superclass
        B subobj = new B();
        subobj.i = 10;
        subobj.j =20;
        subobj.k=30;

        System.out.println("Content of subclass: ");
        subobj.showij();
        subobj.showk();

        System.out.println();

        System.out.print("Sum of i,j and k: ");
        subobj.sum();
    }
}