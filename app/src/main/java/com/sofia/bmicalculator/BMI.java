package com.sofia.bmicalculator;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMI {
    private EditText text1, text2;
    private TextView result;
    private Button butn;
    private float a, b, c;

    public BMI(EditText text1, EditText text2, TextView result, Button butn, float a, float b, float c) {
        this.text1 = text1;
        this.text2 = text2;
        this.result = result;
        this.butn = butn;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public EditText getText1() {
        return text1;
    }

    public void setText1(EditText text1) {
        this.text1 = text1;
    }

    public EditText getText2() {
        return text2;
    }

    public void setText2(EditText text2) {
        this.text2 = text2;
    }

    public TextView getResult() {
        return result;
    }

    public void setResult(TextView result) {
        this.result = result;
    }

    public Button getButn() {
        return butn;
    }

    public void setButn(Button butn) {
        this.butn = butn;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "BMI{" +
                "text1=" + text1 +
                ", text2=" + text2 +
                ", result=" + result +
                ", butn=" + butn +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
