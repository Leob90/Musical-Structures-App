package com.example.android.MyFavoriteMedia;

import android.view.View;
import android.widget.Toast;

public class NowPlayingClickListener implements View.OnClickListener
{
    @Override
    public void onClick (View view)
    {
        Toast.makeText(view.getContext(),"Open Selected Song", Toast.LENGTH_SHORT).show();
    }

}
