package com.example.kinderneutron;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.util.Log;


public class Errorlogs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Define data for 8 rows
        String[][] rowData = {
                {"1", "Type 1", "Message 1", "2024-04-20", "2024-04-20", "User 1"},
                {"2", "Type 2", "Message 2", "2024-04-21", "2024-04-21", "User 2"},
                {"3", "Type 3", "Message 3", "2024-04-22", "2024-04-22", "User 3"},
                // Add data for remaining rows similarly
        };

        // Get references to the TextViews in each row
        TextView[][] textViews = new TextView[8][6];
        for (int i = 0; i < 8; i++) {
            textViews[i][0] = findViewById(getResources().getIdentifier("textViewID1" + i, "id", getPackageName()));
            textViews[i][1] = findViewById(getResources().getIdentifier("textViewID2_" + i, "id", getPackageName()));
            textViews[i][2] = findViewById(getResources().getIdentifier("textViewID3_" + i, "id", getPackageName()));
            textViews[i][3] = findViewById(getResources().getIdentifier("textViewID4_" + i, "id", getPackageName()));
            textViews[i][4] = findViewById(getResources().getIdentifier("textViewID5_" + i, "id", getPackageName()));
            textViews[i][5] = findViewById(getResources().getIdentifier("textViewID6_" + i, "id", getPackageName()));
        }

        // Fill the TextViews with data
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if (textViews[i][j] != null) {
                    textViews[i][j].setText(rowData[i][j]);
                } else {
                    Log.e("Errorlogs", "TextView at index [" + i + "][" + j + "] is null");
                }
            }
        }
    }
}