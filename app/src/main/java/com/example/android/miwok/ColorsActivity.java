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

        wordsArrayList.add(new Word("red", "wetetti"));
        wordsArrayList.add(new Word("green", "chokokki"));
        wordsArrayList.add(new Word("brown", "takaakki"));
        wordsArrayList.add(new Word("gray", "topoppi"));
        wordsArrayList.add(new Word("black", "kululli"));
        wordsArrayList.add(new Word("white", "kelelli"));
        wordsArrayList.add(new Word("dusty yellow", "topiisa"));
        wordsArrayList.add(new Word("mustard yellow", "chiwiite"));


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
