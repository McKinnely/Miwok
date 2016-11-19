package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create wordsArray
        final ArrayList<Word> wordsArrayList = new ArrayList<Word>();

        wordsArrayList.add(new Word("father", "әpә",    R.drawable.family_father,R.raw.family_father));
        wordsArrayList.add(new Word("mother", "әṭa",    R.drawable.family_mother,R.raw.family_mother));
        wordsArrayList.add(new Word("son", "angsi",     R.drawable.family_son,R.raw.family_son));
        wordsArrayList.add(new Word("daughter", "tune", R.drawable.family_daughter,R.raw.family_daughter));
        wordsArrayList.add(new Word("older brother", "taachi", R.drawable.family_older_brother,R.raw.family_older_brother));
        wordsArrayList.add(new Word("younger brother", "chalitti", R.drawable.family_younger_brother,R.raw.family_younger_brother));
        wordsArrayList.add(new Word("older sister", "teṭe", R.drawable.family_older_sister,R.raw.family_older_sister));
        wordsArrayList.add(new Word("younger sister", "kolliti", R.drawable.family_younger_sister,R.raw.family_younger_sister));
        wordsArrayList.add(new Word("grandmother", "ama", R.drawable.family_grandmother,R.raw.family_grandmother));
        wordsArrayList.add(new Word("grandfather", "na' paapa", R.drawable.family_father,R.raw.family_grandfather));


        /**
         Creates an adapter that takes in the wordsArray so that the  application can work wit the most
         efficient amount of memory.
         */
        WordAdapter adapter = new WordAdapter(this, wordsArrayList, R.color.category_family);
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
                mMediaPlayer = MediaPlayer.create(FamilyMembersActivity.this, word.getAudioResourceID());
                mMediaPlayer.start();
            }
        });


    }
}
