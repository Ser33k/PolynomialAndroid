package com.example.zpo_lab11_zad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalculateValueActivity extends AppCompatActivity {

    public static final String  EXTRA_VALUES = "values";
//    public static final Polynomial EXTRA_POLYNOMIAL = null;


    private String [] valuesArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_value);

        Intent intent = getIntent();
        valuesArray = intent.getStringExtra(EXTRA_VALUES).split(",");


//        textView.setText(values);
    }


    public void calculateValue2(View view) {

        EditText xValueInput = (EditText)findViewById(R.id.xValueInput);
        double x = Double.parseDouble(xValueInput.getText().toString());

        Polynomial polynomial = new Polynomial(valuesArray);
        String values = polynomial.toString();

        double result = polynomial.calculateValue(x);



        TextView textView = (TextView)findViewById(R.id.valueOutput);
        textView.setText("Result: "+result);


    }
}