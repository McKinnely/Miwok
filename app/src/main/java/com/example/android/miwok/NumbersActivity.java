package com.example.android.miwok;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

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

        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);
        TextView wordView  = new TextView(this);
        int num = 0;
        while(num < wordsArray.size())
        {
            wordView.setText(wordsArray.get(num));
            rootView.addView(wordView);
            num++;
        }

    }
}
