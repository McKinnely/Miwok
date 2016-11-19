package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity
{

    private  MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        /** Allows for us to set the context of the data in this file inside of the word_list.xml file. */
        setContentView(R.layout.word_list);


        //Create wordsArray
       final ArrayList<Word> wordsArrayList = new ArrayList<Word>(); //("one", "two", "three", "four", "five", "six", "seven","eight","nine","ten" );

       // wordsArray.add("one");

        wordsArrayList.add(new Word("one", "lutti", R.drawable.number_one, R.raw.number_one));
        wordsArrayList.add(new Word("two", "otiiko", R.drawable.number_two, R.raw.number_two));
        wordsArrayList.add(new Word("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
        wordsArrayList.add(new Word("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
        wordsArrayList.add(new Word("five", "massokka", R.drawable.number_five, R.raw.number_five));
        wordsArrayList.add(new Word("six", "temokka", R.drawable.number_six, R.raw.number_six));
        wordsArrayList.add(new Word("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        wordsArrayList.add(new Word("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
        wordsArrayList.add(new Word("nine", "wo' e", R.drawable.number_nine, R.raw.number_nine));
        wordsArrayList.add(new Word("ten", "na' aacha", R.drawable.number_ten, R.raw.number_ten));

        /**
        Creates an adapter that takes in the wordsArray so that the  application can work wit the most
        efficient amount of memory.
        */
       WordAdapter adapter = new WordAdapter(this, wordsArrayList, R.color.category_numbers);
        /**
        Created a corresponding ListView to the type of view inside of word_list.xmlthe type of view inside that file)
        to display the adapter's (itemsAdapter) data inside of it.
        */
        ListView listView = (ListView) findViewById(R.id.list);
        /**
        Applies the adapter logic inside of the listView so that it shows the screen.
        */
       listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Word word =   wordsArrayList.get(position);
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getAudioResourceID());
                mMediaPlayer.start();
            }
        });


    }
}
