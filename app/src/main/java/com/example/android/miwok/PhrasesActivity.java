package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create wordsArray
        ArrayList<Word> wordsArrayList = new ArrayList<Word>();

        wordsArrayList.add(new Word("Where are you going?", "minto wuksus"));
        wordsArrayList.add(new Word("What is your name?", "tinnә oyaase'nә"));
        wordsArrayList.add(new Word("My name is...", "oyaaset..."));
        wordsArrayList.add(new Word("How are you feeling?", "michәksәs?"));
        wordsArrayList.add(new Word("I’m feeling good.", "kuchi achit"));
        wordsArrayList.add(new Word("Are you coming?", "әәnәs'aa?"));
        wordsArrayList.add(new Word("Yes, I’m coming.","hәә’ әәnәm"));
        wordsArrayList.add(new Word("I’m coming.", "әәnәm"));
        wordsArrayList.add(new Word("Let’s go.", "yoowutis"));
        wordsArrayList.add(new Word("Come here.","әnni'nem"));


        /**
         Creates an adapter that takes in the wordsArray so that the  application can work wit the most
         efficient amount of memory.
         */
        WordAdapter adapter = new WordAdapter(this, wordsArrayList, R.color.category_phrases);
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