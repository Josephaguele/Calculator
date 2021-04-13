package com.josephagu.termcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button add, multiply, divide, subtract, bracket;
    EditText number1, number2;
    TextView output;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.firstNumber);
        number2 =findViewById(R.id.secondNumber);
        
        add = findViewById(R.id.buttonplus);
        subtract = findViewById(R.id.buttonminus);
        divide =findViewById(R.id.buttondivide);
        multiply =findViewById(R.id.buttonmultiply);
        output = findViewById(R.id.textOutput);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstNo = number1.getText().toString();
                String secondNo = number2.getText().toString();
                
                double num1 = Double.parseDouble(firstNo);
                double num2 = Double.parseDouble(secondNo);
                
                double answer = num1 + num2;


                String ans = Double.toString(answer);
                output.setText(ans);
            }
        });


        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstNo = number1.getText().toString();
                String secondNo = number2.getText().toString();

                double num1 = Double.parseDouble(firstNo);
                double num2 = Double.parseDouble(secondNo);

                double answer = num1 - num2;

                String ans = Double.toString(answer);
                output.setText(ans);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstNo = number1.getText().toString();
                String secondNo = number2.getText().toString();

                double num1 = Double.parseDouble(firstNo);
                double num2 = Double.parseDouble(secondNo);

                double answer = num1 * num2;

                String ans = Double.toString(answer);
                output.setText(ans);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstNo = number1.getText().toString();
                String secondNo = number2.getText().toString();

                double num1 = Double.parseDouble(firstNo);
                double num2 = Double.parseDouble(secondNo);

                double answer = num1 / num2;

                String ans = Double.toString(answer);
                output.setText(ans);
            }
        });
        
        
        
    }
} // end of class
