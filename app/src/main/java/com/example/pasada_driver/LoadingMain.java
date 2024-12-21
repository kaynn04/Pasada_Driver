package com.example.pasada_driver;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;

public class LoadingMain extends AppCompatActivity {

    private ProgressBar progressBar;
    private Handler handler = new Handler();
    private int progressStatus = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading_main); // Make sure this points to your XML layout file

        progressBar = findViewById(R.id.progressBar);  // Initialize the ProgressBar

        // Simulate loading (filling up the progress bar)
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (progressStatus < 100) {
                    progressStatus += 1;  // Increase the progress

                    // Update the ProgressBar's progress on the main thread
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            progressBar.setProgress(progressStatus);  // Set the progress
                        }
                    });

                    try {
                        Thread.sleep(50);  // Delay to simulate loading (adjust speed here)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // After loading is complete, start the WelcomePage activity
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(LoadingMain.this, WelcomePage.class);
                        startActivity(intent);
                        finish();  // Close the current activity (loading screen)

                        // Apply smooth transition
                        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                    }
                });
            }
        }).start();
    }
}
