package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert (View view){

        EditText dollarAmount = findViewById(R.id.dollarAmountEditText);
        Log.i("dollarAmountText", dollarAmount.getText().toString());

        Double dollarAmountDouble = Double.parseDouble(dollarAmount.getText().toString());
        Double poundAmountDouble = dollarAmountDouble*0.75;

        Toast.makeText(MainActivity.this, "Pound " + String.format("%.2f", poundAmountDouble), Toast.LENGTH_SHORT).show();
        Log.i("poundAmountDouble", poundAmountDouble.toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
