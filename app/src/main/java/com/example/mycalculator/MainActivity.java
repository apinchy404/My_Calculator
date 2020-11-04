package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView txtResult;
    EditText etFirstNumber,etSecondNumber;
    Button btnPlus,btnMinus,btnMulti,btnDivision,btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtResult=findViewById(R.id.txt_result);
        etFirstNumber=findViewById(R.id.et_first_number);
        etSecondNumber=findViewById(R.id.et_second_number);

        btnPlus=findViewById(R.id.btn_plus);
        btnMinus=findViewById(R.id.btn_minus);
        btnMulti=findViewById(R.id.btn_multi);
        btnDivision=findViewById(R.id.btn_division);
        btnClear=findViewById(R.id.btn_clear);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=etFirstNumber.getText().toString();
                String number2=etFirstNumber.getText().toString();

                if(number1.isEmpty() || number2.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please enter digit", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double value1=Double.parseDouble(number1);
                    double value2=Double.parseDouble(number2);
                    double result= value1+value2;

                    txtResult.setText(""+result);
                }

            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=etFirstNumber.getText().toString();
                String number2=etFirstNumber.getText().toString();

                if(number1.isEmpty() || number2.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please enter digit", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double value1=Double.parseDouble(number1);
                    double value2=Double.parseDouble(number2);
                    double result= value1-value2;

                    txtResult.setText(""+result);
                }

            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=etFirstNumber.getText().toString();
                String number2=etFirstNumber.getText().toString();

                if(number1.isEmpty() || number2.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please enter digit", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double value1=Double.parseDouble(number1);
                    double value2=Double.parseDouble(number2);
                    double result= value1*value2;

                    txtResult.setText(""+result);
                }

            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=etFirstNumber.getText().toString();
                String number2=etFirstNumber.getText().toString();

                if(number1.isEmpty() || number2.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please enter digit", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double value1=Double.parseDouble(number1);
                    double value2=Double.parseDouble(number2);
                    double result= value1/value2;

                    txtResult.setText(""+result);
                }

            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText("Result");
                etFirstNumber.setText("");
                etSecondNumber.setText("");
            }
        });

    }
}