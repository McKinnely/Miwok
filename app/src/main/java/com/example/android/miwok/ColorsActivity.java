package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Shopping In Atlanta", "From boutiques to art galleries, antiques and outlet centers, Atlanta shopping is everywhere. Venture into Buckhead for luxurious Atlanta shopping with upscale malls such as Lenox Square Mall and Phipps Plaza that feature top brands. ", R.drawable.shopping_first_image));
        words.add(new Word("Discover", "Discover the hottest boutiques in neighborhood shopping districts, from Midtown and Virginia Highland to funky vintage finds in Little Five Points. In the market for home goods? Don't miss the design district in Atlanta's Westside.", R.drawable.shopping_second_image));
        words.add(new Word("Perfect For A Princess", "The Pink Pastry Parlor brings new fun to Phipps Plaza. Plan birthday parties and other celebrations for girls of all ages.", R.drawable.shopping_third_image));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);

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