package com.example.android.musicalapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ebtesam on 12/9/2017 AD.
 */

public class MusicAdapter extends ArrayAdapter<Music>{

    public MusicAdapter(Activity context, ArrayList<Music> music) {
        super(context, 0, music);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_music, parent, false);
    }
    Music currentMusic=getItem(position);
        TextView song=(TextView) listItemView.findViewById(R.id.song);
        song.setText(currentMusic.getNameOfTheMusic());

        TextView artist=(TextView) listItemView.findViewById(R.id.artist);
        artist.setText(currentMusic.getNameOftheArtist());
        return listItemView;
    }


}
