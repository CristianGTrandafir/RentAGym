package com.example.rentagym.Seller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.rentagym.Customer.Customer_Chat;
import com.example.rentagym.R;


public class SellerChatOption extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_seller_home);
        button = findViewById(R.id.goToChat);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SellerChatOption.this, Customer_Chat.class);
                startActivity(intent);
            }
        });
    }
}
