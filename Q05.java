/*Movie Details Manager. Create a Movie class with attributes: name, language, rating (out of 5). 
Create a method displayMovieDetails(). In main(), create 4 Movie objects and call displayMovieDetails(). */

class Movie{
    String name;
    String language;
    int rating;

    Movie(String n, String l, int r){
        this.name = n;
        this.language = l;
        this.rating = r;
    }

    public void displayMovieDetails(){
        System.out.println("Name: " + name);
        System.out.println("Language: " + language);
        System.out.println("Rating: " + rating);
        System.out.println(" ");
    }
}

public class Q05{
    public static void main(String[] args){
        Movie movie1 = new Movie("Star wars", "English", 3);
        Movie movie2 = new Movie("Dune", "English", 5);
        Movie movie3 = new Movie("Batman", "Hindi", 4);
        Movie movie4 = new Movie("Harry Potter", "English", 3);

        movie1.displayMovieDetails();
        movie2.displayMovieDetails();
        movie3.displayMovieDetails();
        movie4.displayMovieDetails();
    }
}