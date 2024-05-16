package com.example.journalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Dashboard extends AppCompatActivity {
    CardView journalCard;
    CardView aboutCard;
    CardView suggestionCard;
    CardView searchCard;
    CardView logoutCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        // Initialize the Search Card and set OnClickListener
        searchCard = findViewById(R.id.find);
        searchCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, Search_page.class);
                startActivity(intent);
            }
        });
        // Initialize the Journal card and set OnClickListener
        journalCard = findViewById(R.id.projectApp);
        journalCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, MainActivity.class);
                startActivity(intent);
            }
        });
        // Initialize the About Card and set OnClickListener
        aboutCard = findViewById(R.id.about);
        aboutCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, About_page.class);
                startActivity(intent);
            }
        });
        // Initialize the About Card and set OnClickListener
        suggestionCard = findViewById(R.id.suggestion);
        suggestionCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, Suggestion_page.class);
                startActivity(intent);
            }
        });
        // Initialize the Logout Card and set OnClickListener
        logoutCard= findViewById(R.id.logout);
        logoutCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, Login_Page.class);
                startActivity(intent);
            }
        });

    }
}
