package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etNumberOne, etNumberTwo;
    Button btnAdd, btnSustract, btnMultiplication, btnDivide;
    Double numberOne, numberTwo, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumberOne = findViewById(R.id.etNumberOne);
        etNumberTwo = findViewById(R.id.etNumbeTwo);
        btnAdd = findViewById(R.id.btnAdd);
        btnSustract = findViewById(R.id.btnSustract);
        btnMultiplication = findViewById(R.id.btnMultiplication);
        btnDivide = findViewById(R.id.btnDivide);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOne = Double.parseDouble(etNumberOne.getText().toString());
                numberTwo = Double.parseDouble(etNumberTwo.getText().toString());

                result = numberOne + numberTwo;

                Intent intentResult = new Intent(getApplicationContext(), ActivityResult.class);

                Bundle bundleDates = new Bundle();
                bundleDates.putString("operation", "+");
                bundleDates.putString("numberOne", String.valueOf(numberOne));
                bundleDates.putString("numberTwo", String.valueOf(numberTwo));
                bundleDates.putString("result", String.valueOf(result));
                intentResult.putExtras(bundleDates);
                startActivity(intentResult);
            }
        });

        btnSustract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOne = Double.parseDouble(etNumberOne.getText().toString());
                numberTwo = Double.parseDouble(etNumberTwo.getText().toString());

                result = numberOne - numberTwo;

                Intent intentResult = new Intent(getApplicationContext(), ActivityResult.class);

                Bundle bundleDates = new Bundle();
                bundleDates.putString("operation", "-");
                bundleDates.putString("numberOne", String.valueOf(numberOne));
                bundleDates.putString("numberTwo", String.valueOf(numberTwo));
                bundleDates.putString("result", String.valueOf(result));
                intentResult.putExtras(bundleDates);
                startActivity(intentResult);
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOne = Double.parseDouble(etNumberOne.getText().toString());
                numberTwo = Double.parseDouble(etNumberTwo.getText().toString());

                result = numberOne * numberTwo;

                Intent intentResult = new Intent(getApplicationContext(), ActivityResult.class);

                Bundle bundleDates = new Bundle();
                bundleDates.putString("operation", "*");
                bundleDates.putString("numberOne", String.valueOf(numberOne));
                bundleDates.putString("numberTwo", String.valueOf(numberTwo));
                bundleDates.putString("result", String.valueOf(result));
                intentResult.putExtras(bundleDates);
                startActivity(intentResult);
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOne = Double.parseDouble(etNumberOne.getText().toString());
                numberTwo = Double.parseDouble(etNumberTwo.getText().toString());

                result = numberOne / numberTwo;

                Intent intentResult = new Intent(getApplicationContext(), ActivityResult.class);

                Bundle bundleDates = new Bundle();
                bundleDates.putString("operation", "/");
                bundleDates.putString("numberOne", String.valueOf(numberOne));
                bundleDates.putString("numberTwo", String.valueOf(numberTwo));
                bundleDates.putString("result", String.valueOf(result));
                intentResult.putExtras(bundleDates);
                startActivity(intentResult);
            }
        });
    }
}