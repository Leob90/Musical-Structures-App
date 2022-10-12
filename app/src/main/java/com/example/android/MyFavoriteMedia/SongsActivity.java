package com.example.android.MyFavoriteMedia;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Bundle;
import android.os.Environment;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        //Create an array of songs
        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Bring Me To Life", "Evanescence", R.mipmap.evanescence));
        songs.add(new Song("Man In The Box", "Alice in Chains", R.mipmap.alice_in_chains));
        songs.add(new Song("Master Of Puppets", "Metallica", R.mipmap.metallica));
        songs.add(new Song("Welcome To The Jungle", "Guns N Roses", R.mipmap.guns_n_roses));
        songs.add(new Song("Cum On Feel The Noize", "Quiet Riot", R.mipmap.quiet_riot));
        songs.add(new Song("Dazed And Confused", "Led Zeppelin", R.mipmap.led_zeppelin));
        songs.add(new Song("Have A Cigar", "Pink Floyd",R.mipmap.pink_floyd));

        //Create an {@link ArrayAdapter, whose data source is a list of Strings.
        //The adapter knows how to create layouts for each item in the List, using the
        //    layout resource defined in the Android framework.
        //This list item layout contains a single {@link TextView}, which the adapter will
        //set to display a single word.
        SongAdapter adapter = new SongAdapter(this, songs);

        //Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        //There should be a {@link ListView} with the view ID called list, which is declared in the
        //activity_songs.xml
        ListView listView = (ListView) findViewById(R.id.list);

        //Make hte {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        //{@link ListView will display list items for each word in the list of word.
        //Do this by by calling the setAdapter method on the {@link ArrayAdapter} with the variable name ItemsAdapter
        listView.setAdapter(adapter);
    }
}

