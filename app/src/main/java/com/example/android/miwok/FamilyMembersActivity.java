package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create wordsArray
        ArrayList<Word> wordsArrayList = new ArrayList<Word>();

        wordsArrayList.add(new Word("father", "әpә"));
        wordsArrayList.add(new Word("mother", "әṭa"));
        wordsArrayList.add(new Word("son", "angsi"));
        wordsArrayList.add(new Word("daughter", "tune"));
        wordsArrayList.add(new Word("older brother", "taachi"));
        wordsArrayList.add(new Word("younger brother", "chalitti"));
        wordsArrayList.add(new Word("older sister", "teṭe"));
        wordsArrayList.add(new Word("younger sister", "kolliti"));
        wordsArrayList.add(new Word("grandmother", "ama"));
        wordsArrayList.add(new Word("grandfather", "na' paapa"));


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
