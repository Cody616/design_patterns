/*
 * @author CodyTang
 */
package state;

import java.util.*;

public class HomeState implements State {

    private TV tv;

    public String presssHomeButton() 
    {
        return "TV is already on the Home Screen";
    }

    public String pressNetflixButton() 
    {
        tv.setState(tv.getNetflixState());
         return "Loading Netflix...";
        
    }

    public String pressHuluButton() 
    {
        tv.setState(tv.getHuluState());
       return "Loading Hulu...";
       
    }

    public String pressMovieButton() 
    {
        tv.setState(tv.getMovie());
    }

    public String pressTVButton() 
    {
       tv.setState(tv.getTV());
    }

}