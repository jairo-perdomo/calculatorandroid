package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityResult extends AppCompatActivity {
    String operation, numberOne, numberTwo, result, showResults;
    TextView etResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        etResult = findViewById(R.id.tvResults);
        Bundle bundleDates = getIntent().getExtras();
        operation = bundleDates.getString("operation");
        numberOne = bundleDates.getString("numberOne");
        numberTwo = bundleDates.getString("numberTwo");
        result    = bundleDates.getString("result");

        showResults = numberOne + " " + operation + " " + numberTwo + " es: " + result;
        etResult.setText(showResults);


    }
}