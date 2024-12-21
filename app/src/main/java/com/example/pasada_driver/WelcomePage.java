package com.example.pasada_driver;


import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class WelcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content view to your user_profile.xml layout file
        setContentView(R.layout.welcome_page);

        // Find the button by ID
        AppCompatButton loginButton = findViewById(R.id.loginButton);

        // Set an OnClickListener for the button
        loginButton.setOnClickListener(v -> {
            // Navigate to the OnlineBookingsActivity
            Intent intent = new Intent(WelcomePage.this, LoginPage.class);
            startActivity(intent);

            // Apply smooth transition
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });
    }

    // You can add other methods to handle user interactions, data fetching, etc.
}

