package com.ador.dominique.ador_practicalexam2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {


    EditText txtNum1;
    EditText txtNum2;
    EditText txtTotal;
    Button btnCompute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum1 = (EditText) findViewById(R.id.prac1);
        txtNum2 = (EditText) findViewById(R.id.prac2);
        txtTotal = (EditText) findViewById(R.id.ave);
        btnCompute = (Button) findViewById(R.id.display);

        btnCompute.setOnClickListener(new ClickButton ());



    }


    private class ClickButton implements Button.OnClickListener{

        @Override
        public void onClick(View v) {

            int x = Integer.parseInt(txtNum1.getText().toString());
            int y = Integer.parseInt(txtNum2.getText().toString());

            int total = (x + y)/2;

            txtTotal.setText(Integer.toString(total));



        }


    }








}