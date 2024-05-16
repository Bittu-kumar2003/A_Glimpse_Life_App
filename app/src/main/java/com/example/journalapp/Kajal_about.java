package com.example.journalapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Kajal_about extends AppCompatActivity {
    ImageView linkedin,github,gmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kajal_about);

        // linked icon show your account
        linkedin=findViewById(R.id.imageView4);
        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.linkedin.com/in/bittu-kumar-812368246/");
            }
        });

        // Gmail

        gmail=findViewById(R.id.imageView5);
        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.linkedin.com/in/bittu-kumar-812368246/");
            }
        });

        //Github

        github=findViewById(R.id.imageView6);
        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://github.com/Bittu-kumar2003");
            }
        });

    }

    private void gotoUrl(String s) {
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}