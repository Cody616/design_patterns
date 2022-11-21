/*
 * @author CodyTang
 */
public class HuluState implements State 
{
    private TV tv;
    private String[] movies = new String[] {"Cars", "Cinderella", "Wall-E", "ET"};
    private String[] tvShows = new String[] {"Sesame Street","Care Bears", "Loney Tunes"};

     /*
     * object of tv now hulu
     */
    public HuluState(TV tv)
    {
        this.tv = tv;
    }
    /*
     * sets state of home
     */
    public String pressHomeButton() {
        tv.setState(tv.getHomeState());
        return "\nLoading the Home Screen...";
    } 
    /*
     * sets state of netflix
     */
    public String pressNetflixButton() 
    {
        tv.setState(tv.getNetflixState());
        return "\nLoading Netflix...";
        
    }
    /*
     * sets state to hulu
     */
    public String pressHuluButton() 
    {
       return "\nYou are already on Hulu Screen";
    }
    /*
     * prints out list of hulu movies
     */
    public String pressMovieButton() 
    {
        String movies = "";
        System.out.println("\nHulu Movies: ");
        for(int i = 0; i< this.movies.length; i++)
        {
            movies += "- " + this.movies[i] + "\n";
        }
        return movies;
    }
    /*
     * returns list of hulu shows
     */
    public String pressTVButton() 
    { 
        String shows = "";
        System.out.println("\nHulu TV Shows: ");
        for(int i = 0; i< this.tvShows.length; i++)
        {
            shows += "- " + this.tvShows[i] + "\n";
        }
        return shows;
    }

}
