package com.example.android.MyFavoriteMedia;

/**
 * {@link Song} represents the song shown in the listView
 * It contains the song's name, artist name, and an image of their album cover
 */

public class Song
{   /**Song name*/
    private String mSong;
    /**Artist name*/
    private String mArtist;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**Image resource Id for the song*/


    /**
     * Create a Song object.That has the song name, an artist name, and an album cover.
     * @param song is the name of the song in the array list
     * @param artist is the name of the artist for the song above
     * @param imageResourceId is the drawable resource ID for the image associsted to the word.
     */
    public Song(String song, String artist, int imageResourceId)
    {   mSong = song;
        mArtist = artist;
        mImageResourceId = imageResourceId;
    }

    /**Getters
     * Get the song and artist from the array
     */
    public String getSong()
    {
        return mSong;
    }
    public String getArtist()
    {
        return mArtist;
    }

    /**
     * Return the image resource Id of the word.
     */
    public int getImageResourceId()
    {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this song.
     */
    public boolean hasImage()
    {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
