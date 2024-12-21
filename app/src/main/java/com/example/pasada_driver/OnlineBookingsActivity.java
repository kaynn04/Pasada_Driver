package com.example.pasada_driver;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class OnlineBookingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.online_bookings); // Ensure this is your layout file

        // Find the Switch by ID
        @SuppressLint("UseSwitchCompatOrMaterialCode") Switch toggleButton = findViewById(R.id.toggle_button);

        // Set the initial state of the Switch (checked=true)
        toggleButton.setChecked(true);

        // Set an OnCheckedChangeListener to listen for state changes
        toggleButton.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (!isChecked) {

                runOnUiThread(() -> {
                    // If unchecked, navigate to HomePageOffline
                    Intent intent = new Intent(OnlineBookingsActivity.this, OfflineBookingsActivity.class);
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
            Intent intent = new Intent(OnlineBookingsActivity.this, HomePageOnline.class);
            startActivity(intent);

            // Apply smooth transition
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });

        // for padala
        // Find the LinearLayout by ID
        LinearLayout padalaBookingLayout = findViewById(R.id.padala_booking_layout);

        // Set an OnClickListener for the RelativeLayout
        padalaBookingLayout.setOnClickListener(v -> {
            // Navigate to PadalaDetails Activity
            Intent intent = new Intent(OnlineBookingsActivity.this, PadalaDetails.class);
            startActivity(intent);

            // Apply smooth transition
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });

        // for hatid-sundo
        // Find the LinearLayout by ID
        LinearLayout hatidSundoBookingLayout = findViewById(R.id.hatid_sundo_booking_layout);

        // Set an OnClickListener for the LinearLayout
        hatidSundoBookingLayout.setOnClickListener(v -> {
            // Navigate to HatidSundodDetails Activity
            Intent intent = new Intent(OnlineBookingsActivity.this, HatidSundoDetails.class);
            startActivity(intent);

            // Apply smooth transition
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });
    }
}
