package com.example.android.touringguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaceDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_detail);

        //get the intent data passed to this activity
        Intent intent = getIntent();
        String album = intent.getStringExtra("PlaceName");
        String artist = intent.getStringExtra("PlaceAddress");
        int imageRes = Integer.parseInt( intent.getStringExtra("PlaceImg"));


        //display the data to screen
        ImageView img = (ImageView) findViewById(R.id.image_artist);
        img.setImageResource(imageRes);

        TextView albumTextView = (TextView) findViewById(R.id.name);
        albumTextView.setText("Name: " + album);

        TextView artistTextView = (TextView) findViewById(R.id.address);
        artistTextView.setText("Address: " + artist);

        TextView titleTextView = (TextView) findViewById(R.id.descrition);
        titleTextView.setText("Description: ");
    }
}
