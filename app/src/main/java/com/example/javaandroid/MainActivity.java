package com.example.javaandroid;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView resultView;
    private Calc calc;
    private String resultText;
    private EditText firstNumber;
    private EditText secondNumber;
    private Double first = 0.0;
    private Double second = 0.0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        calc = new Calc();
        resultText = getString(R.string.resultText);
        firstNumber = findViewById(R.id.firstNumber);
        secondNumber = findViewById(R.id.secondNumber);
        resultView = findViewById(R.id.resultView);

        buttons();
    }

    private void buttons() {
        Button addButton = findViewById(R.id.addButton);
        addButton.setOnClickListener(v -> {
            first = Double.parseDouble(firstNumber.getText().toString());
            second = Double.parseDouble(secondNumber.getText().toString());
            String result = String.valueOf(calc.add(first, second));
            setResultText(result);
        });

        Button subtractButton = findViewById(R.id.subtractButton);
        subtractButton.setOnClickListener(v -> {
            first = Double.parseDouble(firstNumber.getText().toString());
            second = Double.parseDouble(secondNumber.getText().toString());
            String result = String.valueOf(calc.subtract(first, second));
            setResultText(result);
        });

        Button multiplyButton = findViewById(R.id.multiplyButton);
        multiplyButton.setOnClickListener(v -> {
            first = Double.parseDouble(firstNumber.getText().toString());
            second = Double.parseDouble(secondNumber.getText().toString());
            String result = String.valueOf(calc.multiply(first, second));
            setResultText(result);
        });

        Button divideButton = findViewById(R.id.divideButton);
        divideButton.setOnClickListener(v -> {
            first = Double.parseDouble(firstNumber.getText().toString());
            second = Double.parseDouble(secondNumber.getText().toString());
            String result = String.valueOf(calc.divide(first, second));
            setResultText(result);
        });
    }

    public void setResultText(String text) {
        String result = resultText + " " + text;
        resultView.setText(result);
    }
}
