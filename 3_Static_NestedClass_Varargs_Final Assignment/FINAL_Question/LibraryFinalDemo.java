class LibraryBook
{
    //final variable(must be initialised only once)
    final int BOOK_ID;
    String title;

    //constructor to initialised final variable
    public LibraryBook(int id,String title) 
    {
        this.BOOK_ID = id;
        this.title = title;
    }

    void showDetails()
    {
        System.out.println("Book_ID: " + BOOK_ID);
        System.out.println("Book Title: " + title);
    }
}

public class LibraryFinalDemo
{
    public static void main(String[] args) {
        LibraryBook lb1 = new LibraryBook(101,"Agnipankh");
        LibraryBook lb2 = new LibraryBook(102,"Shyamchi Aai");

        lb1.showDetails();
        lb2.showDetails();

        //lb1.BOOK_ID = 200;       // error: cannot assign a value to final variable BOOK_ID
    }
}