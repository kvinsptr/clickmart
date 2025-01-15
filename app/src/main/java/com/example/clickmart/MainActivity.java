package com.example.clickmart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Handle Checkout Button for Product 1
    public void onCheckoutProduct1(View view) {
        // Show a toast or navigate to another activity
        Toast.makeText(this, "Checkout Celana Pendek", Toast.LENGTH_SHORT).show();

        // Intent to Checkout Activity (Example)
        Intent intent = new Intent(this, CheckoutActivity.class);
        intent.putExtra("productName", "Celana Pendek");
        intent.putExtra("productPrice", "Rp 100,000");
        startActivity(intent);
    }
}
