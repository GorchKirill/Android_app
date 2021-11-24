package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;


public class Easy_Amount_or_hard_amount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_amount_or_hard_amount);

    }


    public void hard_amount(View view) {
        Intent intent = new Intent(Easy_Amount_or_hard_amount.this, Activity_amount.class);
        startActivity(intent);
    }

    public void easy_amount(View view) {
        Intent intent1 = new Intent(Easy_Amount_or_hard_amount.this, Activity_Easy_amount.class);
        startActivity(intent1);
    }
}