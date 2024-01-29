// Assignment: 7
// Name: Sarvesh Shanmugam
// StudentID: 1225321968
// Lecture: Tue, Thurs 1:30 - 2:45
// Description: implements the Serializable interface so that its objects can be stored. A toString is implemented to format the movie descriptions

import java.io.Serializable;

public class Movie implements Serializable {
    private static final long serialVersionUID = 205L;

    private String movieName;
    //private String productionCompany;
    private int stars;
    private String review;
    private int totalCollection;
    private String director;
    private MovieGenre movieGenre;

    public Movie (String movieName, int stars, String review, int totalCollection, String director, MovieGenre movieGenre){

        this.movieName = movieName;
        this.stars = stars;
        this.review = review;
        this.totalCollection = totalCollection;
        this.director = director;
        this.movieGenre = movieGenre;
        //create a constructor to collect the variables from the user

    }

    public String getMovieName(){
        return movieName;
    }

    public int getStars(){
        return stars;
    }

    public int getTotalCollection(){
        return totalCollection;
    }

    public String getDirector(){
        return director;
    }

    public String getReview(){
        return review;
    }

    public MovieGenre getMovieGenre(){
        return movieGenre;
    }
//collects or gets all the values that are shown above

    public String toString(){
        String starString = "";
        for (int i = 0; i < stars; i++){
            starString = starString + "*";
        }  

        String totalCollectionString = "";
        for (int i = 0; i < totalCollection; i++){
            totalCollectionString = totalCollectionString + "$";
        }

//for lopp statement implemented to display what the price and stars
//String to display the movie descriptions
        return(movieName + " Movie\n" + starString + "\n" + 
            "Total Collection earned: " +  totalCollectionString + "\n" +
            movieGenre.toString() + "Director: " + director + "\n" +
            "Review:\t" + review + "\n\n");
    }
}

    

