package com.example.android.MyFavoriteMedia;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.io.File;
import java.util.ArrayList;

public class NowPlayingActivity extends AppCompatActivity {
    //Initialize all Buttons and textViews
    Button playButton, nextButton, previousButton, fastForwardButton, fastRewindButton;
    TextView textSongName, textSongStart, textSongStop;
    SeekBar seekMusic;

    //Create variables to put the song array,song name, and the position.
    //Also create a mediaPlayer object
    String songName;
    public static final String EXTRA_NAME = "song_name";
    static MediaPlayer mediaPlayer;
    int position;
    ArrayList<Song> mySongs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        Intent i = getIntent();
        Bundle bundle = i.getExtras();
    }
}




       /** //Initialize all objects
        previousButton = findViewById(R.id.previousButton);
        nextButton = findViewById(R.id.nextButton);
        playButton = findViewById(R.id.playButton);
        fastForwardButton =findViewById(R.id.fastForwardButton);
        fastRewindButton= findViewById(R.id.fastRewindButton);
        //textSongName = findViewById(R.id.textSongName);
        textSongStart = findViewById(R.id.txtStart);
        textSongStop = findViewById(R.id.txtStop);
        seekMusic = findViewById(R.id.seekBar);

        //Check for the MediaPlayer

        if (mediaPlayer !=null)
        {
            mediaPlayer.stop();
            mediaPlayer.release();
        }

        //Use the get intent to get the song info from the previous activity
        Intent i = getIntent();
        Bundle bundle = i.getExtras();

        mySongs = (ArrayList) bundle.getParcelableArrayList("songs");
        //Retrieve song name
        String songName = i.getStringExtra("songName");
        position = bundle.getInt("position", 0);
        //Put the song name inside the textView songName
        textSongName.setSelected(true);
        Uri uri = Uri.parse(mySongs.get(position).toString());
        songName= mySongs.get(position).getName();
        //Put this name into the textView
        textSongName.setText(songName);

        //Play the media player with the Uri above
        mediaPlayer = MediaPlayer.create(getApplicationContext(), uri);
        mediaPlayer.start();

        //Create the onClickListener to the playButton
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Check if the media player is playing.
                // If playing, when button is clicked, change the button icon
                if (mediaPlayer.isPlaying())
                {
                    playButton.setBackgroundResource(R.drawable.ic_play);
                    mediaPlayer.pause();
                }
                else
                    {
                        playButton.setBackgroundResource(R.drawable.ic_pause);
                        mediaPlayer.start();
                    }
            }
        });

    }
} **/

