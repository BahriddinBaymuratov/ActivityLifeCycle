package com.example.activitylifecycle.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.example.activitylifecycle.R;
import com.google.android.material.button.MaterialButton;

public class WelcomeToActivity extends AppCompatActivity {

    private MaterialButton btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_to);

        btn1 = findViewById(R.id.btnFirst);
        btn2 = findViewById(R.id.btnSecond);
        btn3 = findViewById(R.id.btnSecond);

        btn1.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kun.uz/"));
            startActivity(intent);
        });
        btn2.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:40.724009,72.882532"));
            startActivity(intent);
        });
    }
}