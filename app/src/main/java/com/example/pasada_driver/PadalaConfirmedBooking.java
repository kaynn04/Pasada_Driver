package com.example.pasada_driver;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PadalaConfirmedBooking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content view to your user_profile.xml layout file
        setContentView(R.layout.padala_confirmed_booking);

        // Find the back button by ID
        ImageButton backButton = findViewById(R.id.back_button);

        // Set an OnClickListener for the back button
        backButton.setOnClickListener(v -> {
            // Navigate back to HomePageOnline
            Intent intent = new Intent(PadalaConfirmedBooking.this, PadalaDetails.class);
            startActivity(intent);

            // Apply smooth transition
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });
    }

    // You can add other methods to handle user interactions, data fetching, etc.
}

