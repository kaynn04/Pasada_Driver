package com.example.pasada_driver;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class HomePageOnline extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page_online);  // Ensure this is the correct layout

        // Find the Switch by ID
        Switch toggleButton = findViewById(R.id.toggle_button);

        // Set the initial state of the Switch (checked=true)
        toggleButton.setChecked(true);

        // Set an OnCheckedChangeListener to listen for state changes
        toggleButton.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (!isChecked) {
                runOnUiThread(() -> {
                    // If unchecked, navigate to HomePageOffline
                    Intent intent = new Intent(HomePageOnline.this, HomePageOffline.class);
                    startActivity(intent);

                    // Apply smooth transition
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                });
            }
        });

        // Find the button by ID
        AppCompatButton viewAllButton = findViewById(R.id.view_all);

        // Set an OnClickListener for the button
        viewAllButton.setOnClickListener(v -> {
            // Navigate to the OnlineBookingsActivity
            Intent intent = new Intent(HomePageOnline.this, OnlineBookingsActivity.class);
            startActivity(intent);

            // Apply smooth transition
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });
    }
}
