// Assignment: 7
// Name: Sarvesh Shanmugam
// StudentID: 1225321968
// Lecture: Tue, Thurs 1:30 - 2:45
// Description:  The Sorts class is a class that will be used to sort a list of Movie objects based on the rating and genre.

import java.io.Serializable;
import java.util.ArrayList;

public class ReviewManager implements Serializable {
    // The serialVersionUID is used to verify compatibility of senders and
    // receivers. See the document for more details:
    // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html
    private static final long serialVersionUID = 205L;

    ArrayList<Movie> reviewList;

    public ReviewManager() {
        reviewList = new ArrayList<>();
    }

    public int movieExists(String name, String director) {
        for (int i = 0; i < reviewList.size(); i++) {
            if (reviewList.get(i).getMovieName().equals(name) && reviewList.get(i).getDirector().equals(director)) {
                return i;
            }
        }
        return -1;
    }

    public ArrayList<Integer> movieGenreExists(String genre) {
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        for (int i = 0; i < reviewList.size(); i++) {
            if (reviewList.get(i).getMovieGenre().getGenre().equals(genre)) {
                indexes.add(i);
            }
        }
        return indexes;
    }

    public Movie getMovie(int index) {
        return reviewList.get(index);
    }


    public boolean removeReview(String name, String director) {
       for(int i = 0; i < reviewList.size(); i++){
        if(name.equals(reviewList.get(i).getMovieName()) && director.equals(reviewList.get(i).getDirector())){
            reviewList.remove(i);
            return true;
        }
       }
       return false;
    }
    //removes review 

    public void sortByRating() {
        Sorts.sort(reviewList, new ReviewRatingComparator());
    }
//sorts movies by rating 

    public void sortByMovieGenre() {
        Sorts.sort(reviewList, new ReviewMovieGenreComparator());
    }
//sorts movies by genre

    
    public String listReviews() {
        String list = "";
        for (int i = 0; i < reviewList.size(); i++) {
            list += reviewList.get(i).toString();
        }
        return list;
        //this for statement shows the list of reviews using the toString format from the movie class
    }

    public void closeReviewManager() {
        reviewList.clear();
        //clears the list of reviews
    }

    /**
     * Add a Movie object to the reviewList and return true if such an object
     * is added successfully. Otherwise, return false. Two Movies are
     * considered duplicated if they have exactly the same movie name and genre.
     * 
     * @param  movieName          the name of the movie
     * @param  stars              the number of stars the movie recieved
     * @param  review             the movie review
     * @param  totalCollection    the integer total collection earned by the movie
     * @param  genre              the movie's genre
     * @param  director           the movie's director
     * @param  prodictionCompany  production comapny of the movie
     * @return                    true if the operation is successful; false otherwise
     */
    
    //Adds a movie review to the reviewList
    public boolean addReview(String movieName, int stars, String review, String totalCollection, String genre, String director, String productionCompany) {
        if (movieExists(movieName, director) == -1) {
            int collection = totalCollection.length();
            MovieGenre newGenre = new MovieGenre(genre, productionCompany);
            Movie newMovie = new Movie(movieName, stars, review, collection, director, newGenre);
            reviewList.add(newMovie);
            return true;
        }
        return false;
    }
}
