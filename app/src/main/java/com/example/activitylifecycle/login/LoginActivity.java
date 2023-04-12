package com.example.activitylifecycle.login;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.activitylifecycle.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    private TextInputEditText editText1;
    private TextInputEditText editText2;
    private AppCompatTextView textView;
    private MaterialButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editText1 = findViewById(R.id.email);
        editText2 = findViewById(R.id.password);
        textView = findViewById(R.id.tv);
        button = findViewById(R.id.btnLogin);


        textView.setOnClickListener(view1 -> {
            Intent intent = new Intent(this, RegisterActivity.class);
            someActivityResultLauncher.launch(intent);

        });

        button.setOnClickListener(view -> {
            Intent intent = new Intent(this, WelcomeToActivity.class);
            startActivity(intent);
        });

    }

    ActivityResultLauncher<Intent> someActivityResultLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        Intent data = result.getData();
                        String email = data.getStringExtra("email");
                        String password = data.getStringExtra("password");
                        editText1.setText(email);
                        editText2.setText(password);
                    }
                }
            });
}