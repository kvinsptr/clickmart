package com.example.clickmart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class ProductActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        // Placeholder for additional setup if needed
    }

    public void openProductDetail(View view) {
        Intent intent = new Intent(this, ProductDetailActivity.class);
        startActivity(intent);
    }
}
