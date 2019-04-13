package com.sofia.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText text1, text2;
    private TextView result;
    private Button butn;
    private float a, b, c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        text1 = findViewById(R.id.txt1);
        text2 = findViewById(R.id.txt2);
        result = findViewById(R.id.output);
        butn = findViewById(R.id.btn);
        butn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btn:
                a = Float.parseFloat(text1.getText().toString());
                b = Float.parseFloat(text2.getText().toString());
                c = b / ((a / 100) * (a / 100));
                result.setText("" + c);

                if (c <=18.5) {
                    Toast.makeText(MainActivity.this, "Under weight", Toast.LENGTH_SHORT).show();
                }
                else if(c>18.5 && c<=24.9){
                    Toast.makeText(MainActivity.this, "Normal weight", Toast.LENGTH_SHORT).show();
                }
                else if(c>24.9 && c<=29.9){
                    Toast.makeText(MainActivity.this, "Overweight", Toast.LENGTH_SHORT).show();
                }
                else if(c>30){
                    Toast.makeText(MainActivity.this, "Obesitys", Toast.LENGTH_SHORT).show();
                }
    }
  }
}





