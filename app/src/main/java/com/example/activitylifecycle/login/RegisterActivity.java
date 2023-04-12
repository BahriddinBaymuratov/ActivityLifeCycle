package com.example.activitylifecycle.login;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.activitylifecycle.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        TextInputEditText editText1 = findViewById(R.id.email);
        TextInputEditText editText2 = findViewById(R.id.password);
        MaterialButton btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(view -> {
            String email = editText1.getText().toString();
            String password = editText2.getText().toString();
            // shu yerda nimadur jarayon bo'ladi api ga yuborish yoki database ga saqlash kabi misollar

            Intent intent = new Intent();
            intent.putExtra("email", email);
            intent.putExtra("password", password);
            setResult(Activity.RESULT_OK, intent);
            finish();
        });
    }
}