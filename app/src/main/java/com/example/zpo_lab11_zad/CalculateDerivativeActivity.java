package com.example.zpo_lab11_zad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONObject;

public class CalculateDerivativeActivity extends AppCompatActivity {

    public static final String  EXTRA_VALUES = "values";
    private String [] valuesArray;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_derivative);
        TextView output = (TextView)findViewById(R.id.derivativeOutput);

        Intent intent = getIntent();
        valuesArray = intent.getStringExtra(EXTRA_VALUES).split(",");

        Polynomial polynomial = new Polynomial(valuesArray);
        String url = "https://newton.now.sh/api/v2/derive/"+polynomial.toString();

        RequestQueue queue = Volley.newRequestQueue(this);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();


        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, response -> {

            Derivative derivative = gson.fromJson(response, Derivative.class);
            output.setText(derivative.toString());
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                output.setText("Error");
            }
        }
        );



        queue.add(stringRequest);

    }




}