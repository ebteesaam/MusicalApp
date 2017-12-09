package com.example.android.musicalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PopularActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        ArrayList<Music> music = new ArrayList<Music>();

        music.add(new Music("Shereen", "Mashaer"));
        music.add(new Music("Asalaa", "Ya da algabi"));
        music.add(new Music("Rashed Almajed", "Ashkuralla"));

        MusicAdapter adapter=new MusicAdapter(this,music);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
