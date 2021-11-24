package com.example.myapplication;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import java.text.DecimalFormat;

public class Activity_Easy_amount extends AppCompatActivity {

    private EditText mLoanAmount, mInterestRate, mLoanPeriod;
    private TextView mTotalPaymentsResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_amount);
        mLoanAmount = findViewById(R.id.loan_amount);
        mInterestRate = findViewById(R.id.interest_rate);
        mLoanPeriod = findViewById(R.id.loan_period);
        mTotalPaymentsResult = findViewById(R.id.total_payments_result);
    }


    public void ShowLoanPayments(View view) {
        double loanAmount = Integer.parseInt(mLoanAmount.getText().toString());
        double interestRate = Integer.parseInt(mInterestRate.getText().toString());
        double loanPeriod = Integer.parseInt(mLoanPeriod.getText().toString());
        double newloanAmount;
            newloanAmount = loanAmount * (1 + interestRate*loanPeriod/100);
            mTotalPaymentsResult.setText(new DecimalFormat("##.##").format(newloanAmount));
    }

    public void Delete(View view) {
        mLoanAmount.setText("");
        mInterestRate.setText("");
        mLoanPeriod.setText("");
        mTotalPaymentsResult.setText("");
    }
}