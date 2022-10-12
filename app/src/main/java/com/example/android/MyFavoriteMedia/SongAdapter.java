package com.example.android.MyFavoriteMedia;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {


    public SongAdapter(Activity context, ArrayList<Song> songs)
    {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        /**
         * Get the {@link AndroidFlavor} object located at this position in the list
         */
        Song currentSong = getItem(position);

        //Find the TextView in the list_item.xml layout with the ID version_name
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_text_view);
        //Get the version name from the current AndroidFlavor object and
        //set this text on the name TextView
        songTextView.setText(currentSong.getSong());

        //Same step from above with the artist
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        //Get the version number from the current AndroidFlavor object and
        //set this text on the artist TextView
        artistTextView.setText(currentSong.getArtist());

        //Find the ImageView in the list_item.xml with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if(currentSong.hasImage())
        {
            //Set the ImageView to the image resource specified in the current Song
            imageView.setImageResource(currentSong.getImageResourceId());

            //Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        }
        else
        {
            imageView.setVisibility(View.GONE);
        }

        //Return the whole list item layout (containing 2 TextViews)
        //so it can be shown in the ListView
        return listItemView;
    }
}

