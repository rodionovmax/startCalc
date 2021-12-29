package com.gb.startcalc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startBtn = findViewById(R.id.start_btn);
        startBtn.setOnClickListener(view -> {
            Uri uri = Uri.parse("example://intent");
            Intent startCalc = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(startCalc);
            finish();
        });
    }
}
