package com.example.pasada_driver;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class OfflineBookingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.offline_bookings); // Ensure this is your layout file

        // Find the Switch by ID
        Switch toggleButton = findViewById(R.id.toggle_button);

        // Set the initial state of the Switch (checked=true)
        toggleButton.setChecked(true);

        // Set an OnCheckedChangeListener to listen for state changes
        toggleButton.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (!isChecked) {

                runOnUiThread(() -> {
                    // If unchecked, navigate to HomePageOffline
                    Intent intent = new Intent(OfflineBookingsActivity.this, OnlineBookingsActivity.class);
                    startActivity(intent);

                    // Apply smooth transition
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                });
            }
        });

        // Find the back button by ID
        ImageButton backButton = findViewById(R.id.back_button);

        // Set an OnClickListener for the back button
        backButton.setOnClickListener(v -> {
            // Navigate back to HomePageOnline
            Intent intent = new Intent(OfflineBookingsActivity.this, HomePageOffline.class);
            startActivity(intent);

            // Apply smooth transition
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });
    }
}
