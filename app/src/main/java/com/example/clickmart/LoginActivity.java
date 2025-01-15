package com.example.clickmart;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log; // Untuk debugging
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnContinue = findViewById(R.id.btnContinue);

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Debugging
                Log.d("LoginActivity", "Continue button clicked");

                Intent intent = new Intent(LoginActivity.this, DashboardActivity.class);
                startActivity(intent);
                finish(); // Menutup LoginActivity agar tidak bisa kembali dengan tombol Back
            }
        });
    }
}
