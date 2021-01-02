package com.example.zpo_lab11_zad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCalculateValue1(View view) {
        EditText coefficientsInput = (EditText)findViewById(R.id.coefficientsInput);
        String values = coefficientsInput.getText().toString();



        Intent intent = new Intent(this, CalculateValueActivity.class);
        intent.putExtra(CalculateValueActivity.EXTRA_VALUES, values);

        startActivity(intent);
    }

    public void onCalculateDerivative(View view) {
        EditText coefficientsInput = (EditText)findViewById(R.id.coefficientsInput);
        String values = coefficientsInput.getText().toString();



        Intent intent = new Intent(this, CalculateDerivativeActivity.class);
        intent.putExtra(CalculateDerivativeActivity.EXTRA_VALUES, values);

        startActivity(intent);
    }
}