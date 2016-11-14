package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        //Create wordsArray
        ArrayList<Word> wordsArrayList = new ArrayList<Word>(); //("one", "two", "three", "four", "five", "six", "seven","eight","nine","ten" );

       // wordsArray.add("one");

        wordsArrayList.add(new Word("one", "lutti"));
        wordsArrayList.add(new Word("two", "otiiko"));
        wordsArrayList.add(new Word("three", "tolookosu"));
        wordsArrayList.add(new Word("four", "oyyisa"));
        wordsArrayList.add(new Word("five", "massokka"));
        wordsArrayList.add(new Word("six", "temokka"));
        wordsArrayList.add(new Word("seven", "kenekaku"));
        wordsArrayList.add(new Word("eight", "kawinta"));
        wordsArrayList.add(new Word("nine", "wo' e"));
        wordsArrayList.add(new Word("ten", "na' aacha"));




        /**
        Creates an adapter that takes in the wordsArray so that the  application can work wit the most
        efficient amount of memory.
        */
       WordAdapter adapter = new WordAdapter(this, wordsArrayList);
        /**
        Created a corresponding ListView to the type of view inside of activity_numbers.xml file (the type of view inside that file)
        to display the adapter's (itemsAdapter) data inside of it.
        */
        ListView listView = (ListView) findViewById(R.id.list);
        /**
        Applies the adapter logic inside of the listView so that it shows the screen.
        */
       listView.setAdapter(adapter);



    }
}
