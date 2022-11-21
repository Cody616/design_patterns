package state;

import java.util.*;

public class NetflixState implements State {

    private TV tv;
    private String[] movies = new String[] {"Peppa Pig","My Little Pony", "Garfield", "Teenage Mutatn Ninja Turtles"};
    private String[] tvShows = new String[] {"The Land Before Time", "Frozen", "The Little Mermaid", "Ice Age"};

    public String presssHomeButton() 
    {
        return "\nLoading the Home Screen...";
    }

    public String pressNetflixButton() 
    {
        return "\nYou are already on Netflix Screen";
    }

    public String pressHuluButton() 
    {
        tv.setState(tv.getHuluState());
        return "\nLoading Hulu...";
        
    }

    public String pressMovieButton() 
    {
        String move[] = {"The Land Before Time", "Frozen", "The Little Mermaid", "Ice Age"};
        System.out.println("Netflix Moveis: ");
        for(int i = 0; i<movies.length; i++)
        {
            System.out.println(movies[i]);
        }
        return "";
    }

    public String pressTVButton() 
    {
        String shows[] = {"Peppa Pig","My Little Pony", "Garfield", "Teenage Mutatn Ninja Turtles"};
        System.out.println("Netflix TV Shows: ");
        for(int i = 0; i<tvShows.length; i++)
        {
            System.out.println(tvShows[i]);
        }
        return "";
    }
}