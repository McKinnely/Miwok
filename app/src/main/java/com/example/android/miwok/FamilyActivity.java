package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Cakes & Ale", "Cakes & Ale Any number of restaurants on this list could have opened in another city, but not Cakes & Ale, which effortlessly captures the scope of metro Atlanta’s complex culinary makeup. ", R.drawable.restaurants_first_image));
        words.add(new Word("Ticonderoga Club", "Ticonderoga Club isn’t just a watering hole where star bartenders Greg Best and Paul Calvert shake up some of the city’s most compelling cocktails. It’s a real restaurant, a low-key hangout in the corner of Krog Street Market where executive chef David Bies gives comfort food fine-dining finesse. ", R.drawable.restaurants_second_image));
        words.add(new Word("The General Muir In", "The General Muir In barely three years, the General Muir has become an indispensable part of our landscape, especially at lunch. ", R.drawable.restaurants_third_image));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);

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