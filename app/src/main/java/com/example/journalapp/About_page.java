package com.example.journalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class About_page extends AppCompatActivity {
    ImageView imageabout;
    ImageView imageabout2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_page);
        imageabout=findViewById(R.id.imageView1);
        imageabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(About_page.this,Bittu_About.class);
                startActivity(intent);
            }
        });
        imageabout2=findViewById(R.id.imageView2);
        imageabout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(About_page.this,Kajal_about.class);
                startActivity(intent);
            }
        });
    }
}