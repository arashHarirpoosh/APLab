package Session3.musicOrganizer;

import java.util.ArrayList;

/**
 * Provide basic playing of MP3 files via the javazoom library.
 * See http://www.javazoom.net/
 * 
 * @author David J. Barnes and Michael K�lling.
 * @version 2011.07.31
 */
public class MusicPlayer
{
    // The current player. It might be null.
    private boolean isPlaying;
    private MusicCollection favoriteMusics;
    private ArrayList<MusicCollection> categories;
    /**
     * Constructor for objects of class MusicFilePlayer
     */
    public MusicPlayer()
    {

        isPlaying = false;
//        this.favoriteMusics = new MusicCollection("Favorite");
        this.categories = new ArrayList<>();
    }

    public void setFavoriteMusics(MusicCollection favoriteMusics) {
    this.favoriteMusics = favoriteMusics;
}

    /**
     * Set the categories
     * @param categories The Category arraylist
     */
    public void setCategories(ArrayList<MusicCollection> categories) {
        this.categories = categories;
    }

    /**
     *
     * @return The categories
     */
    public ArrayList<MusicCollection> getCategories() {
        return categories;
    }

    /**
     * Start playing the given audio file.
     * The method returns once the playing has been started.
     * @param filename The file to be played.
     */
    public void startPlaying(String filename)
    {
        System.out.println(filename + " is playing...");
		isPlaying = true;
    }
    
    public void stop()
    {
        System.out.println("player is stopped!");
		isPlaying = false;
    }

    /**
     * Add given music to the favorite list
     * @param m The music that is going to add in favorite list
     */
    public void addFavoriteMusic(Music m) {
        this.favoriteMusics.addFile(m);
    }

    /**
     * Remove one music from favorite list
     * @param index Index of the file that is going to remove
     */
    public void removeFavoriteMusic(int index) {
        this.favoriteMusics.removeFile(index);
    }

    /**
     *
     * @return The favorite playlist
     */
    public MusicCollection getFavoriteMusics() {
        return favoriteMusics;
    }
}