package com.example.android.materialme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Initialize the ImageView and title TextView
        TextView sportTitle = (TextView) findViewById(R.id.titleDetail);
        ImageView sportImage = (ImageView) findViewById(R.id.sportsImageDetail);

        //Get the title from the incoming Intent
        sportTitle.setText(getIntent().getStringExtra("title"));
        //Glide to load the image
        Glide.with(this).load(getIntent().getIntExtra("image_resource",0));
    }
}
