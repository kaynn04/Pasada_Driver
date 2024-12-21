package com.example.pasada_driver;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class HatidSundoDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content view to your user_profile.xml layout file
        setContentView(R.layout.hatid_sundo_details);

        // back button code
        ImageButton backButton = findViewById(R.id.back_button);

        // Set an OnclickListener for the back button
        backButton.setOnClickListener(v -> {
            // Navigate back to OnlineBookingsActivity
            Intent intent = new Intent(HatidSundoDetails.this, OnlineBookingsActivity.class);
            startActivity(intent);

            // Smooth Transition
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });

        // Find the button by ID
        AppCompatButton confirmButton = findViewById(R.id.confirm_booking);

        // Set an OnClickListener for the button
        confirmButton.setOnClickListener(v -> {
            // Navigate to the OnlineBookingsActivity
            Intent intent = new Intent(HatidSundoDetails.this, HatidSundoConfirmedBooking.class);
            startActivity(intent);

            // Apply smooth transition
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });
    }

    // You can add other methods to handle user interactions, data fetching, etc.
}

