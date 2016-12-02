package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    /**
     * Handles playback of all the sound files
     */


    /**
     * Handles audio focus when playing a sound file
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Centennial Park", "The park is surrounded by many major Atlanta Landmarks; the Georgia World Congress Center, Georgia Dome, College Football Hall of Fame, Philips Arena and the CNN Center are all on the west side of the park and the Georgia Aquarium, National Center for Civil and Human Rights, and the World of Coca-Cola on the north side of the park. It is bounded by Marietta Street to the west, Baker Street to the north and Centennial Olympic Park Drive to the east and south. Andrew Young International Boulevard, named for the former Atlanta mayor and United Nations ambassador, runs through the southern portion of the park. Since 2008, the area around the park has been marketed, and increasingly referred to in the press, as the Luckie Marietta District. The Atlanta Streetcar will pass along the east side of the park, with a stop for the park on Centennial Olympic Drive.", R.drawable.parks_embassy));
        words.add(new Word("Fountain of Rings", "A key feature of the park is the Fountain of Rings interactive fountain which features computer-controlled lights and jets of water synchronized with music played from speakers in light towers surrounding it. It forms a splash pad that was designed for children to frolic in, as well as for concert-goers and joggers to cool off in on hot summer days. It consists of 251 jets that shoot 12 to 35 feet (3.7 to 10.7 m) in the air, and also creates a beautiful water sculpture that is essentially the front yard of the nearby museum. An important formal architectural landmark that is also a fun and playful space, the computer controlled fountain concept has since been replicated in other urban designs such as Dundas Square in Toronto and in commercial uses such as the Bellagio Fountains at the Bellagio Hotel & Casino in Las Vegas, Nevada.", R.drawable.parks_centennial_wedding));
        words.add(new Word("Economic", "The park has become a catalyst for new development in Atlanta's downtown. The new World of Coca-Cola opened on May 24, 2007, next to the Georgia Aquarium just north of the park, and the Imagine It! Children's Museum of Atlanta opened on March 1, 2004, on a corner northeast of the park. Other significant attractions or developments surrounding the park include The Georgia World Congress Center, the Atlanta Convention and Visitors Bureau, the Atlanta Apparel Mart, the Omni Hotel, the Tabernacle (formerly a House of Blues location during the games), SkyView Atlanta, a 200-foot (61 m) Ferris Wheel, the CNN Center, and the College Football Hall of Fame. The Georgia Dome and Philips Arena are in good proximity.", R.drawable.parksbg));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

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