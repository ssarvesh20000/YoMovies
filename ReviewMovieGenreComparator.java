// Assignment: 7
// Name: Sarvesh Shanmugam
// StudentID: 1225321968
// Lecture: Tue, Thurs 1:30 - 2:45
// Description: The method returns an integer that denotes which movie object comes earlier in this hierarchy. If both movie genres are the same, the method should return an integer that denotes which movie has a less total collection. If the total collection is identical, the method should return an integer that denotes which movie name comes earlier in the alphabet


import java.util.*;

public class ReviewMovieGenreComparator implements Comparator<Movie>{

    public int compare(Movie one, Movie two) {

        if (one.getMovieGenre().getGenre().equals(two.getMovieGenre().getGenre())){

            if(one.getTotalCollection() == two.getTotalCollection()){
            
                if(one.getMovieName().equals(two.getMovieName())){
                
                    if(one.getDirector().equals(two.getDirector())){
                        
                        if(two.getReview().equals(one.getReview())){
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
                return one.getTotalCollection() - two.getTotalCollection();
            }
        }else{
            return one.getMovieGenre().getGenre().compareTo(two.getMovieGenre().getGenre());
            }
        //if any attributes wernt the same then it will compare them in this order from top to bottom
        }
    }





/*        
if (one.getTotalCollection() > two.getTotalCollection()){
    return 1;
    }
    else if (one.getTotalCollection() < two.getTotalCollection()){
        return -1;
}
 */


 /*
  if (one.getMovieGenre().getGenre().equals(two.getMovieGenre().getGenre())){

            if(one.getTotalCollection() == two.getTotalCollection()){
            
                if(one.getMovieName().equals(two.getMovieName())){
                
                    if(one.getDirector().equals(two.getDirector())){
                        
                        if(two.getReview().equals(one.getReview())){
                            return 0;
                        }

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
                return one.getTotalCollection() - two.getTotalCollection();
            }
        }else{
            return one.getMovieGenre().getGenre().compareTo(two.getMovieGenre().getGenre());
            }
  */
