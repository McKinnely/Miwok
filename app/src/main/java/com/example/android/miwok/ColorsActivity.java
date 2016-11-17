package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create wordsArray
        ArrayList<Word> wordsArrayList = new ArrayList<Word>();

        wordsArrayList.add(new Word("red", "wetetti", R.drawable.color_red));
        wordsArrayList.add(new Word("green", "chokokki",R.drawable.color_green));
        wordsArrayList.add(new Word("brown", "takaakki",R.drawable.color_brown));
        wordsArrayList.add(new Word("gray", "topoppi",R.drawable.color_gray));
        wordsArrayList.add(new Word("black", "kululli",R.drawable.color_black));
        wordsArrayList.add(new Word("white", "kelelli",R.drawable.color_white));
        wordsArrayList.add(new Word("dusty yellow", "topiisa",R.drawable.color_dusty_yellow));
        wordsArrayList.add(new Word("mustard yellow", "chiwiite", R.drawable.color_mustard_yellow));


        /**
         Creates an adapter that takes in the wordsArray so that the  application can work wit the most
         efficient amount of memory.
         */
        WordAdapter adapter = new WordAdapter(this, wordsArrayList);
        /**
         Created a corresponding ListView to the type of view inside of word_list.xmlthe type of view inside that file)
         to display the adapter's (itemsAdapter) data inside of it.
         */
        ListView listView = (ListView) findViewById(R.id.list);
        /**
         Applies the adapter logic inside of the listView so that it shows the screen.
         */
        listView.setAdapter(adapter);

    }
}
