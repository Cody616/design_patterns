/*
 * @author CodyTang
 */
public class NetflixState implements State 
{
    private TV tv;
    private String[] tvShows = new String[] {"Peppa Pig","My Little Pony", "Garfield", "Teenage Mutatn Ninja Turtles"};
    private String[] movies = new String[] {"The Land Before Time", "Frozen", "The Little Mermaid", "Ice Age"};

    public NetflixState(TV tv)
    {
        this.tv = tv;
    }
    /*
     * sets to home state
     */
    public String pressHomeButton() {
        tv.setState(tv.getHomeState());
        return "\nLoading the Home Screen...";
    }
    /*
     * presses netlix state
     */
    public String pressNetflixButton() 
    {
        return "\nYou are already on Netflix Screen";
    }
    /*
     * presses hulu state
     */
    public String pressHuluButton() 
    {
        tv.setState(tv.getHuluState());
        return "\nLoading Hulu...";
    }
    /*
     * returns netflix moveis
     */
    public String pressMovieButton() 
    {
        String movies = "";
        System.out.println("\nNetflix Movies: ");
        for(int i = 0; i< this.movies.length; i++)
        {
            movies += "- " + this.movies[i] + "\n";
        }
        return movies;
    }
    /*
     * returns netflix shows
     */
    public String pressTVButton() 
    {
        String shows = "";
        System.out.println("\nNetflix TV Shows: ");
        for(int i = 0; i< this.tvShows.length; i++)
        {
            shows += "- " + this.tvShows[i] + "\n";
        }
        return shows;
    }

    
}
