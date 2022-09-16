package com.neema.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_dollarAmount;
    TextView txt_result;
    Button btn_usd;
    Button btn_euro;
    Button btn_indrupee;
    Button btn_sarand;
    Button btn_Sfrance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_dollarAmount = findViewById(R.id.et_dollaramount);
        txt_result = findViewById(R.id.tv_KES_Amount);
        btn_usd = findViewById(R.id.btn_usd);
        btn_euro = findViewById(R.id.btn_euro);
        btn_indrupee = findViewById(R.id.btn_indrupee);
        btn_sarand =findViewById(R.id.btn_sarand);
        btn_Sfrance = findViewById(R.id.btn_sfranc);

        btn_Sfrance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kesToSfrance();
            }
        });



        btn_sarand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kesToSarand();
            }
        });
        btn_usd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kesTousd();
            }
        });
        btn_euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               kesToEuro();
            }
        });

        btn_indrupee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kesToIndRupee();



            }
        });
    }

    private void kesToSfrance() {
        int kesAmount = Integer.parseInt(et_dollarAmount.getText().toString());
        double rate = 125.5;
        double result = kesAmount/rate;
        txt_result.setText(Double.toString(result));

    }

    private void kesToSarand() {
        int kesAmount = Integer.parseInt(et_dollarAmount.getText().toString());
        double rate = 6.8;
        double result = kesAmount/rate;
        txt_result.setText(Double.toString(result));

    }

    private void kesToIndRupee() {
        int kesAmount = Integer.parseInt(et_dollarAmount.getText().toString());
        double rate = 1.5;
        double result = kesAmount/rate;
        txt_result.setText(Double.toString(result));

    }

    private void kesToEuro() {
        int kesAmount = Integer.parseInt(et_dollarAmount.getText().toString());
        double rate = 120.3;
        double result = kesAmount/rate;
        txt_result.setText(Double.toString(result));



    }

    //converting kenya shillings to usd
    private void kesTousd() {
        int kesAmount = Integer.parseInt(et_dollarAmount.getText().toString());
        double rate = 120.4;
        double result = kesAmount/rate;
        txt_result.setText(Double.toString(result));


    }


}