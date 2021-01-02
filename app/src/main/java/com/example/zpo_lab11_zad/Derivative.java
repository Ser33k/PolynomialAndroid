package com.example.zpo_lab11_zad;

public class Derivative {
    private String operation;
    private String expression;
    private String result;

    public Derivative(String operation, String expression, String result) {
        this.operation = operation;
        this.expression = expression;
        this.result = result;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Derivative of polynomial: " + result;
    }
}
