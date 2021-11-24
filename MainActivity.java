package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Kredit_payment(View view) {

            Intent intent = new Intent(MainActivity.this, Activity_Kredit.class);
            startActivity(intent);



    }

    public void payment_amount(View view) {

            Intent intent1 = new Intent(MainActivity.this, Easy_Amount_or_hard_amount.class);
            startActivity(intent1);
    }
}



