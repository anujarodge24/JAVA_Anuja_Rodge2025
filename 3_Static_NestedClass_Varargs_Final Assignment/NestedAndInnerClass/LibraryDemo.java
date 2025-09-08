//static nested class 
class Library
{
    static class Book
    {
        String title;
        String author;

        //constructor
        Book(String title,String author)
        {
            this.title = title;
            this.author = author;
        }

        //Method to display details

        void displayBook()
        {
            System.out.println("Book title: " + title + " " + " Author: " + author);
        }

    }
}

public class LibraryDemo
{
    public static void main(String[] args)
    {
        //Create object of static nested class directly(no library obj nedded)
        Library.Book b1 = new Library.Book("Shyamchi Aai","Sane Guruji");
        Library.Book b2 = new Library.Book("Wings of fire","APJ Abdul Kalam");

        //Display Details

        b1.displayBook();
        b2.displayBook();

    }
}