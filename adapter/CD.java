/*
 * Cody Tang
 */

package adapter;

import java.util.ArrayList;

public class CD implements DigitalAlbum
{
    private ArrayList<String> songs = new ArrayList<String>();
    private int currentIndex;

    /*
     * Establishes the current index to a starting value and array list to songs
     */
    public CD(ArrayList<String> songs)
    {
        this.songs = songs;
        this.currentIndex = 1;
    }
    /*
     * Plays the song from the very start of playlist at index 0
     */
    public String playFromBeginning()
    {
        return "Playing song 1" + songs.get(0);
    }
    /*
     * Plays current song at the current index
     */
    public String playSong(int num)
    {
        if(currentIndex-1 >= songs.size())
        {
            return "At the end of the cassette you need to rewind";
        }
        this.currentIndex++;

        return "Playing: " + (this.currentIndex-1) + ": " + this.songs.get(currentIndex - 2);
    }
    /*
     * Plays song at previous index
     */
    public String prevSong()
    {
        if(currentIndex == 0)
        {
            return "Can't rewind back any further.";
        }
        this.currentIndex--;
        
        return "Skipping back and playing: " 
        + this.songs.get(currentIndex - 2);
    }
    /*
     * Plays song at the next index
     */
    public String nextSong()
    {
        
        if(currentIndex-1 >= songs.size())
        {
            //resets song to the very beginning of the album
            currentIndex = 0;
        }
        this.currentIndex++;

        return "Playing " + (this.currentIndex-1) + ": " 
        + this.songs.get(currentIndex-2);
    }
    /*
     * Prints stop, stops playlist
     */
    public String stop() 
    {
        return "Stopping and ejecting CD.";
    }
    /*
     * Prints pause, essentially "pauses song"
     */
    public String pause() 
    {
        return "Pausing the CD.";
    }
}