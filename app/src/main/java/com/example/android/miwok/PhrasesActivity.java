package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Tongue and Groove", "Open for close to two decades, this sophisticated nightspot draws Atlanta's beautiful people looking for a place to tear up the dance floor. The 8,600-square-foot space is located in Buckhead's Lindbergh Center and offers plenty of options for parking. There are two large rooms, one with a balcony overlooking a large dance floor.", R.drawable.night_life_first_image));
        words.add(new Word("Reign", "This is one of the more upscale (read: expensive) clubs in Atlanta and has attractive digs to match. Club-goers arrive later in the evening, closer to midnight, so don't rush to get there. Save your feet and kick back with a leisurely dinner beforehand at one of Midtown's fabulous restaurants before bringing your moves to the dance floor. Bartenders make tasty cocktails and aren't afraid to make 'em strong.", R.drawable.night_life_second_image));
        words.add(new Word("Havana Club" , "You don't have to leave Atlanta to visit Cuba. This upscale Buckhead venue boasts 15,000 square feet of space and with three distinct rooms, each with its own unique ambiance, each trying to capture the essence of Havana. The largest room, Stage, features a bevy of music varieties and VIP cabanas.", R.drawable.night_life_third_image));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on


    }
}