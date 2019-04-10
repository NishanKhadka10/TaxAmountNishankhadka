package com.taxamountnishankhadka;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtsalary;
    private TextView tvsalary, tvoutput;
    private Button btncalctax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtsalary = findViewById(R.id.txtsalary);
        tvoutput = findViewById(R.id.tvoutput);
        btncalctax = findViewById(R.id.btncalctax);

        btncalctax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            double salary  = Double.parseDouble(txtsalary.getText().toString());

                TaxAmountActivity calculate = new TaxAmountActivity();
                calculate.setSalary(salary);
                double result = calculate.taxCalculate();
                tvoutput.setText(Double.toString(result));
            }
        });
    }
}
