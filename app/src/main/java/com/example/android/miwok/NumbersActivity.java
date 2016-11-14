package com.example.android.miwok;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        //Create wordsArray
        ArrayList<String> wordsArray  = new ArrayList<String>(); //("one", "two", "three", "four", "five", "six", "seven","eight","nine","ten" );
        Context context = getApplicationContext();

        wordsArray.add("one");
        wordsArray.add("two");
        wordsArray.add("three");
        wordsArray.add("four");
        wordsArray.add("five");
        wordsArray.add("six");
        wordsArray.add("seven");
        wordsArray.add("eight");
        wordsArray.add("nine");
        wordsArray.add("ten");


        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, wordsArray);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);



    }
}
