/*
 * @Author CodyTang
 */
package state;

import java.util.*;

public class HuluState implements State {

    private TV tv;
    private String[] movies = new String[] {"Cars", "Cinderella", "Wall-E", "ET"};
    private String[] tvShows = new String[] {"Sesame Street","Care Bears", "Loney Tunes"};

    public String presssHomeButton() 
    {
        return "\nLoading the Home Screen...";
    }

    public String pressNetflixButton() 
    {
        tv.setState(tv.getNetflixState());
        return "\nLoading Netflix...";
        
    }

    public String pressHuluButton() 
    {
       return "\nYou are already on Hulu Screen";
    }

    public String pressMovieButton() 
    {
        String move[] = {"Cars", "Cinderella", "Wall-E", "ET"};
        System.out.println("Hulu Moveis: ");
        for(int i = 0; i<movies.length; i++)
        {
            System.out.println(movies[i]);
        }
        return "";
    }

    public String pressTVButton() 
    {
       String shows[] = {"Sesame Street","Care Bears", "Loney Tunes"};
       System.out.println("Hulu TV Shows: ");
       for(int i = 0; i<tvShows.length; i++)
        {
            System.out.println(tvShows[i]);
        }
        return "";
    }
}