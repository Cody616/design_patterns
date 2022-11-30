/*
 * Cody Tang
 */
package adapter;

public class AnalogAdapter implements AnalogAlbum
{
    private DigitalAlbum album;

    /*
     * Sets the album
     */
    public AnalogAdapter(DigitalAlbum album)
    {
        this.album = album;
    }
    /*
     * plays song method
     */
    public String play()
    {
        return this.album.playSong(0);
    }
    /*
     * plays the prev song method to rewind
     */
    public String rewind()
    {
        return this.album.prevSong();
    }
    /*
     * plays the next song method to go to next song/ff
     */
    public String ffwd()
    {
        return this.album.nextSong();
    }
    /*
     * plays the puase method which prints pause and currently stops index change
     */
    public String pause()
    {
        return this.album.pause();
    }
    /*
     * plays the stop method which prints stop and currently stops the current index change as well
     */
    public String stopEject()
    {
        return this.album.stop();
    }
}
