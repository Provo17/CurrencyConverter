package com.example.gregory.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert (View view) {
        Log.i("Test", "Clicked");

        EditText usdEditText = (EditText) findViewById(R.id.number);

        Double usdDouble = Double.parseDouble(usdEditText.getText().toString());

        Double poundAmount = usdDouble * 0.75;

        Toast.makeText(MainActivity.this, "£ " + String.format("%.2f", poundAmount), Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
