package learncodeonline.in.cuccencyconverterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {

    Button euro, amcDollar, yen, pound, dhiram, CNdollar, SigDollar, Swiss_Franc, Malaysian_Ringgit;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

        euro = findViewById(R.id.euro);
        amcDollar = findViewById(R.id.amcDollar);
        yen = findViewById(R.id.yen);
        pound = findViewById(R.id.pound);
        dhiram = findViewById(R.id.dhiram);
        CNdollar = findViewById(R.id.CNdollar);
        SigDollar = findViewById(R.id.SigDollar);
        Swiss_Franc = findViewById(R.id.Swiss_Franc);
        Malaysian_Ringgit = findViewById(R.id.Malaysian_Ringgit);

        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)) {

                    editText.setError("Empty User Input");
                } else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);

                    Formatter formatter = new Formatter();
                    k = n * 0.012;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));

                }
            }


        });
        amcDollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)) {

                    editText.setError("Empty User Input");
                } else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);

                    Formatter formatter = new Formatter();
                    k = n * 0.014;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));

                }
            }


        });
        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)) {

                    editText.setError("Empty User Input");
                } else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);

                    Formatter formatter = new Formatter();
                    k = n * 1.57;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));

                }
            }


        });

        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)) {

                    editText.setError("Empty User Input");
                } else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);

                    Formatter formatter = new Formatter();
                    k = n * 0.011;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));

                }
            }


        });
        dhiram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)) {

                    editText.setError("Empty User Input");
                } else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);

                    Formatter formatter = new Formatter();
                    k = n * 0.053;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));

                }
            }


        });
        CNdollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)) {

                    editText.setError("Empty User Input");
                } else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);

                    Formatter formatter = new Formatter();
                    k = n * 0.019;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));

                }
            }


        });
        SigDollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)) {

                    editText.setError("Empty User Input");
                } else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);

                    Formatter formatter = new Formatter();
                    k = n * 0.020;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));

                }
            }


        });
        Swiss_Franc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)) {

                    editText.setError("Empty User Input");
                } else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);

                    Formatter formatter = new Formatter();
                    k = n * 0.014;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));

                }
            }


        });
        Malaysian_Ringgit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)) {

                    editText.setError("Empty User Input");
                } else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);

                    Formatter formatter = new Formatter();
                    k = n * 0.060;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));

                }
            }


        });


    }
}
