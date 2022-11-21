/*
 * @author CodyTang
 */
public class HomeState implements State {

    private TV tv;

    public HomeState(TV tv)
    {
        this.tv = tv;
    }
  
    public String pressHomeButton() 
    {
        return "TV is already on the Home Screen";
    }
    /*
     * sets netflix state
     */
    public String pressNetflixButton() 
    {
        this.tv.setState(this.tv.getNetflixState());
         return "Loading Netflix...";
    }
    /*
     * sets hulu state
     */
    public String pressHuluButton() 
    {
        this.tv.setState(this.tv.getHuluState());
       return "Loading Hulu...";
    }
    /*
     * indicates to show movies
     */
    public String pressMovieButton() 
    {
       return this.tv.pressMovieButton();
    }
    /*
     * indicates to show tv
     */
    public String pressTVButton() 
    {
       return this.tv.pressTVButton();
    }

}
