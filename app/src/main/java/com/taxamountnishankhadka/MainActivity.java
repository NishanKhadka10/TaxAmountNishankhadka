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
    private float totalsalary;

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
                float salary = Float.parseFloat(txtsalary.getText().toString());

                TaxAmountActivity calculate = new TaxAmountActivity(salary);
                float taxamt1 = calculate.totaltaxamt1();
                float taxamt2 = calculate.totaltaxamt2();
                float taxamt3 = calculate.totaltaxamt3();

                if (totalsalary <= 200000) {
                    tvoutput.setText(Float.toString(taxamt1));
                } else if (totalsalary > 200000 && totalsalary <= 300000) {
                    tvoutput.setText(Float.toString(taxamt2));
                } else {
                    tvoutput.setText(Float.toString(taxamt3));
                }

            }
        });
    }
}
