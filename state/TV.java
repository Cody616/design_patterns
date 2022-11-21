/*
 * @author CodyTang
 */
package state;

import java.util.*;

public class TV {
    private State homeState;
    private State netflixState;
    private State huluState;
    private State state;

    public TV() 
    {
        System.out.println("Starting up the tv");

        state = homeState;
        homeState = new HomeState(this);
        netflixState = new NetflixState(this);
        huluState = new HuluState(this);
    }

    public String pressHomeButton() 
    {
        state.pressHomeButton();
        return "Pressing Home Button";
    }

    public String pressNetflixButton() 
    {
        state.pressNetflixButton();
        return "Pressing Netflix Button";
        
    }

    public String pressHuluButton() 
    {
        state.pressHuluButton();
        return "Pressing Hulu Button";
       
    }

    public String pressMovieButton() 
    {
        state.pressMovieButton();
        return "Pressing Movie Button";

    }

    public String pressTVButton() 
    {
        state.pressTVButton();
        return "Pressing TV Button";
    }

    public void setState(State state) 
    {
        this.state = state;
    }

    public State getHomeState()
    {
        return homeState;
    }

    public State getNetflixState() 
    {
        return netflixState;
    }

    public State getHuluState() 
    {
        return huluState;
    }
}