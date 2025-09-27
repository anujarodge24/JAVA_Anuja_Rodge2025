

class Movie 
{
    String title;
    String leadActor;
    float rating;
    
	Movie(String _title, String _leadActor, float _rating) 
	{
        this.title = _title;
        this.leadActor =_leadActor;
        this.rating =_rating;
    }
	
    void display() 
	{
        System.out.println("Title: " + title);
        System.out.println("Lead Actor: " + leadActor);
        System.out.println("Rating: " + rating);
    }
}

public class MovieRating 
{
    public static void main(String[] args) 
	{
        Movie m1 = new Movie("Natsamrat","Nana Patekar",5);
        Movie m2 = new Movie("3 idiots","Amir khan",5);
        Movie m3 = new Movie("Agnipath","Amitabh",3);
        Movie m4 = new Movie("PK","Amir khan",4);
        Movie m5 = new Movie("Deool","Nana Patekar",4);

        
       
        System.out.println("\nMovies with rating above 4:");

        if (m1.rating > 4) 
			m1.display();
        
		if (m2.rating > 4) 
			m2.display();
        
		if (m3.rating > 4) 
			m3.display();
        
		if (m4.rating > 4) 
			m4.display();
        
		if (m5.rating > 4) 
			m5.display();

    }
}