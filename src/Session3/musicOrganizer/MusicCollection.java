package Session3.musicOrganizer;

import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 *
 * @author David J. Barnes and Michael K�lling
 * @version 2011.07.31
 */
public class MusicCollection
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<Music> files;
    // A player for the music files.
    private MusicPlayer player;
    private String name;

    /**
     * Create a MusicCollection
     */
    public MusicCollection(String name)
    {
        this.name = name;
        this.files = new ArrayList<>();
        this.player = new MusicPlayer();
    }

    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(Music filename)
    {
        this.files.add(filename);
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return this.files.size();
    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        System.out.println(this.files.get(index));
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        for (Music file : this.files) {
            file.printSong();
            System.out.println();
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        this.files.remove(index);
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        this.player.stop();
        this.player.startPlaying(this.files.get(index).getFile());
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        this.player.stop();
    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index) {
        // The return value.
        // Set according to whether the index is valid or not.
        if (index > this.files.size()) {
            System.out.println("Wrong Index!!!");
            return false;
        }
        return true;
    }

    /**
     * Search the music in the collection
     * @param name The word that wants to be searched in singer names and file path
     */
    public void searchMusic(String name){
        boolean found = false;
        for (Music file : this.files) {
            if (file.getFile().equals(name) || file.getSinger().equals(name)) {
                file.printSong();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No Result Retrieved !!!");
        }
    }
}