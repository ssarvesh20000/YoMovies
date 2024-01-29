// Assignment: 7
// Name: Sarvesh Shanmugam
// StudentID: 1225321968
// Lecture: Tue, Thurs 1:30 - 2:45
// Description: The method returns the difference in rating. If both movies received the same number of stars, the comparison should return an integer in an alphabetical order of movies.

import java.util.*;

public class ReviewRatingComparator implements Comparator<Movie>{
    public int compare(Movie one, Movie two){
       
        if (one.getStars() == two.getStars()){

            if((one.getMovieName().equals(two.getMovieName()))){
            
                if(one.getDirector().equals(two.getDirector())){
                
                    if(one.getReview().equals(two.getReview())){
                        return 0;
                    }
        //checks if the attributes are equal to each other

                    else{
                        return one.getReview().compareTo(two.getReview());
                    }
                }else{
                    return one.getDirector().compareTo(two.getDirector());
                }
            }else{
                return one.getMovieName().compareTo(two.getMovieName());
            }
        }else{
            return one.getStars() - two.getStars();
            
        }
        //if any attributes wernt the same then it will compare them in this order from top to bottom
    }

}



/*int starCheck = one.getStars() - two.getStars();
        if (starCheck != 0) {
            return starCheck;
        } else if(starCheck == 0){
            return 0;
        }

        int nameCheck = one.getMovieName().compareTo(two.getMovieName());
        if (nameCheck != 0) {
            return nameCheck;
        }
        
        int directorCheck = one.getDirector().compareTo(two.getDirector());
        if (directorCheck != 0) {
            return directorCheck;
        }
        
        int reviewCheck = two.getReview().compareTo(one.getReview());
        if (reviewCheck != 0) {
            return reviewCheck;
        }
        //an If statement that checks if the two Movie objects
        //and uses their stars, name, director, and review to compare.


        // if everything is the same then it will return 0
        return 0;
*/