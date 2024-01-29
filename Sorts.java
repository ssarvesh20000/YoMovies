// Assignment: 7
// Name: Sarvesh Shanmugam
// StudentID: 1225321968
// Lecture: Tue, Thurs 1:30 - 2:45
// Description:  slection sort used to sort a list of Movie objects based on different criteria, such as the movie’s rating and genre.
import java.util.ArrayList;
import java.util.*;

public class Sorts {
    private Sorts() {
        // private constructor
    }
    
    public static void sort(ArrayList<Movie> movieList, Comparator<Movie> movieComparator) {
        int n = movieList.size();
        
        // selection sort algorithm
        // sorts the specified array of integers 
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            //smallest value
            for (int j = i + 1; j < n; j++) {
                if (movieComparator.compare(movieList.get(j), movieList.get(minIndex)) < 0) {
                    minIndex = j;

                }
            }
            
                Movie temp = movieList.get(i);
                movieList.set(i, movieList.get(minIndex));
                movieList.set(minIndex, temp);
                //swaps two elements the specified array
            
        }
    }
    
}
