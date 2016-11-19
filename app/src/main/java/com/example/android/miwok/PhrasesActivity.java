package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create wordsArray
        final ArrayList<Word> wordsArrayList = new ArrayList<Word>();

        wordsArrayList.add(new Word("Where are you going?", "minto wuksus",R.raw.phrase_where_are_you_going));
        wordsArrayList.add(new Word("What is your name?", "tinnә oyaase'nә",R.raw.phrase_what_is_your_name));
        wordsArrayList.add(new Word("My name is...", "oyaaset...",R.raw.phrase_my_name_is));
        wordsArrayList.add(new Word("How are you feeling?", "michәksәs?",R.raw.phrase_how_are_you_feeling));
        wordsArrayList.add(new Word("I’m feeling good.", "kuchi achit",R.raw.phrase_im_feeling_good));
        wordsArrayList.add(new Word("Are you coming?", "әәnәs'aa?",R.raw.phrase_are_you_coming));
        wordsArrayList.add(new Word("Yes, I’m coming.","hәә’ әәnәm",R.raw.phrase_yes_im_coming));
        wordsArrayList.add(new Word("I’m coming.", "әәnәm",R.raw.phrase_im_coming));
        wordsArrayList.add(new Word("Let’s go.", "yoowutis",R.raw.phrase_lets_go));
        wordsArrayList.add(new Word("Come here.","әnni'nem",R.raw.phrase_come_here));


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


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Word word =   wordsArrayList.get(position);
                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getAudioResourceID());
                mMediaPlayer.start();
            }
        });


    }
}