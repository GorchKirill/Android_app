package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Activity_amount extends AppCompatActivity {

    private EditText mLoanAmount, mInterestRate, mLoanPeriod;
    private TextView  mTotalPaymentsResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amount);
        mLoanAmount = findViewById(R.id.loan_amount);
        mInterestRate = findViewById(R.id.interest_rate);
        mLoanPeriod = findViewById(R.id.loan_period);
        mTotalPaymentsResult = findViewById(R.id.total_payments_result);
    }

    public void showLoanPayments2(View view) {
        double loanAmount = Integer.parseInt(mLoanAmount.getText().toString());
        double interestRate = Integer.parseInt(mInterestRate.getText().toString());
        double loanPeriod = Integer.parseInt(mLoanPeriod.getText().toString());
        double newloanAmount;
        newloanAmount = loanAmount*Math.pow(1+interestRate/100, loanPeriod);
        mTotalPaymentsResult.setText(new DecimalFormat("##.##").format(newloanAmount));

    }

    public void delete(View view) {
       mLoanAmount.setText("");
       mInterestRate.setText("");
       mLoanPeriod.setText("");
       mTotalPaymentsResult.setText("");
    }
}

