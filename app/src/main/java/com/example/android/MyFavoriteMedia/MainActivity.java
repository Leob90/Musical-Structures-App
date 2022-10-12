package com.example.android.MyFavoriteMedia;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.util.ArrayList;


public class  MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        SongsClickListener clickListener = new SongsClickListener();

        //find the View that shows the songs category
        TextView songs = (TextView) findViewById(R.id.songs);

        //Set a clickListener on that View
        songs.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open {@link SongsActivity}
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);


                //start the new activity
                startActivity(songsIntent);
            }
        });

        /**NowPlayingClickListener clickListener1 = new NowPlayingClickListener();

        //Find the View that shows the NowPlaying activity
        TextView nowPlaying = (TextView) findViewById(R.id.nowPlaying);

        //Set a click listener on that view
        nowPlaying.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v) {
                //Create  new intent to open the nowPlaying Activity
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);

                startActivity(nowPlayingIntent);
            }
        });**/
    }
}
