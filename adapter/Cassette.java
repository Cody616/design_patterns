/*
 * Cody Tang
 */

package adapter;

import java.util.ArrayList;

public class Cassette implements AnalogAlbum
{
    private ArrayList<String> songs = new ArrayList<String>();
    private int currentIndex;

    /*
     * establishes current index, and sets songs to the array list
     */
    public Cassette(ArrayList<String> songs)
    {
        this.songs = songs;
        this.currentIndex = 1;
    }
    /*
     * Plays the current song at the current index, if not possible it will indicate user that they need to rewind
     */
    public String play()
    {
        if(currentIndex-1 >= songs.size())
        {
            return "At the end of the cassette you need to rewind";
        }
        this.currentIndex++;
        return "Playing song " + (this.currentIndex - 1) + ": " + this.songs.get(currentIndex - 2);
    }
    /*
     * Goes back to the most previous index if possible and plays the song before the current index
     */
    public String rewind()
    {
        if(currentIndex == 0)
        {
            return "Can't rewind back any further.";
        }
        this.currentIndex--;

        return "Rewinding to song " + currentIndex;
    }
    /*
     * Essentially skips current index and goes to the next song
     */
    public String ffwd()
    {
        this.currentIndex++;
        return "Forward to song " + this.currentIndex;
    }
    /*
     * Prints pause, essentially "pauses song"
     */
    public String pause()
    {
        return "Pausing the Cassette.";
    }
    /*
     * Prints stop, stops playlist
     */
    public String stopEject()
    {
        return "Stopping and ejecting the Cassette.";
    }

}