package com.example.android.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class FavoriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        Button b3=findViewById(R.id.button3);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FavoriteActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        ArrayList<Music> music = new ArrayList<Music>();

        music.add(new Music("Shereen", "Mashaer"));
        music.add(new Music("Asalaa", "Ya da algabi"));
        music.add(new Music("Rashed Almajed", "Ashkuralla"));

        MusicAdapter adapter=new MusicAdapter(this,music);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);




    }
}
