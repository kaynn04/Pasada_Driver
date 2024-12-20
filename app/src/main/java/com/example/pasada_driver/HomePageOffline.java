package com.example.pasada_driver;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HomePageOffline extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page_offline);  // Make sure this is the correct layout

        // Find the Switch by ID
        Switch toggleButton = findViewById(R.id.toggle_button);

        // Set an OnCheckedChangeListener to listen for state changes
        toggleButton.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Intent intent = new Intent(HomePageOffline.this, HomePageOnline.class);
                startActivity(intent);

                // Apply smooth transition
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }
        });
    }
}
