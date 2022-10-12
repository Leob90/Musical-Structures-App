package com.example.android.MyFavoriteMedia;

import android.view.View;
import android.widget.Toast;

public class SongsClickListener implements View.OnClickListener
{

    @Override
    public void onClick(View view)
    {
        Toast.makeText(view.getContext(),
                "Open the List of Songs",Toast.LENGTH_SHORT).show();
    }

}


