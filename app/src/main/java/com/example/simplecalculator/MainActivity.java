package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edcalid1;
    private EditText edcalid2;
    private TextView txtcalid;
    private Button btncalid1;
    private Button btncalid2;
    private Button btncalid3;
    private Button btncalid4;
    private Button btncalid5;
    private Button btncalid6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edcalid1 = (EditText) findViewById(R.id.editText1);
        edcalid2 = findViewById(R.id.editText2);
        txtcalid = findViewById(R.id.textView);

        btncalid1 = findViewById(R.id.button1);
        btncalid2 = findViewById(R.id.button2);
        btncalid3 = findViewById(R.id.button3);
        btncalid4 = findViewById(R.id.button4);
        btncalid5 = findViewById(R.id.button5);
        btncalid6 = findViewById(R.id.button6);

        btncalid1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value1 = Integer.parseInt(edcalid1.getText()+"");
                int value2 = Integer.parseInt(edcalid2.getText()+"");

                txtcalid.setText(value1+value2+"");
            }
        });
        btncalid2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value1 = Integer.parseInt(edcalid1.getText()+"");
                int value2 = Integer.parseInt(edcalid2.getText()+"");

                txtcalid.setText(value1-value2+"");
            }
        });
        btncalid3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value1 = Integer.parseInt(edcalid1.getText()+"");
                int value2 = Integer.parseInt(edcalid2.getText()+"");

                txtcalid.setText(value1*value2+"");
            }
        });
        btncalid4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value1 = Integer.parseInt(edcalid1.getText()+"");
                int value2 = Integer.parseInt(edcalid2.getText()+"");

                txtcalid.setText(value1/value2+"");
            }
        });
        btncalid5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value1 = Integer.parseInt(edcalid1.getText()+"");
                int value2 = Integer.parseInt(edcalid2.getText()+"");

                txtcalid.setText(value1%value2+"");
            }
        });
        btncalid6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value1 = Integer.parseInt(edcalid1.getText()+"");
                int value2 = Integer.parseInt(edcalid2.getText()+"");

                txtcalid.setText(Math.pow(value1,value2)+"");
            }
        });



    }
}
