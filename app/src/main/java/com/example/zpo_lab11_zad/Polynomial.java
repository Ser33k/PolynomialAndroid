package com.example.zpo_lab11_zad;

import androidx.annotation.NonNull;

public class Polynomial {
    private String [] coefficients = new String[3];

    public Polynomial(String[] coefficients) {
        this.coefficients = coefficients;
    }

    public double calculateValue (double x){
        double a = Double.parseDouble(coefficients[0]);
        double b = Double.parseDouble(coefficients[1]);
        double c = Double.parseDouble(coefficients[2]);
        return a*x*x + b*x + c;
    }


    @NonNull
    @Override
    public String toString() {
        String a = coefficients[0];
        String b = coefficients[1].charAt(0) == '-' ? coefficients[1] : "+"+coefficients[1];
        String c = coefficients[2].charAt(0) == '-' ? coefficients[2] : "+"+coefficients[2];
        return a+"x^2"+b+"x"+c;
    }



}
