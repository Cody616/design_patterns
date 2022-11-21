/*
 * @author CodyTang
 */
public class TV {

    private State HomeState;
    private State netflixState;
    private State huluState;
    private State state;

    /*
     * Creates instance of object tv
     */
    public TV() 
    {
        this.HomeState = new HomeState(this);
        this.netflixState = new NetflixState(this);
        this.huluState = new HuluState(this);
        this.state = HomeState; 
    }

    /*
     * Changes state to home
     */
    public String pressHomeButton() 
    {
        return this.state.pressHomeButton();
    }

    /*
     * Changes state to netflix
     */
    public String pressNetflixButton() 
    {
        return this.state.pressNetflixButton();
    }

    /*
     * Changes state to hulu
     */
    public String pressHuluButton() 
    {
        return this.state.pressHuluButton();
    }

    /*
     * Returns the movies of the current state
     */
    public String pressMovieButton() 
    {
        return this.state.pressMovieButton();
    }

    /*
     * Returns the tv shows of the current state
     */
    public String pressTVButton() 
    {
        return this.state.pressTVButton();
    }

    public void setState(State state) 
    {
        this.state = state;
    }

    public State getHomeState()
    {
        return this.HomeState;
    }

    public State getNetflixState() 
    {
        return this.netflixState;
    }

    public State getHuluState() 
    {
        return this.huluState;
    }

}
