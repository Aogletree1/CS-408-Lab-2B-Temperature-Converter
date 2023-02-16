package com.example.cs408lab2btemperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import static android.content.ContentValues.TAG;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import java.text.DecimalFormat;

import com.example.cs408lab2btemperatureconverter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


private float celsius;
private float fahrenheit;

EditText valueReportFahrenheit;
EditText valueReportCelsius;

    DecimalFormat df = new DecimalFormat(".0");



    private ActivityMainBinding binding;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



    }

    public void onClick(View view) {
        Log.i(TAG, "Button pressed.");
        String tag = view.getTag().toString();

            if (tag.equals("buttonConvert")) {

                valueReportFahrenheit = findViewById(R.id.reportFahrenheit);
                valueReportCelsius = findViewById(R.id.reportCelsius);

                String strFahrenheit = valueReportFahrenheit.getText().toString();
                String strCelsius = valueReportCelsius.getText().toString();



                if(valueReportFahrenheit != null){
                    try {

                        fahrenheit = Float.parseFloat(strFahrenheit);

                        celsius = ((fahrenheit - 32) * 5 / 9);


                        binding.reportCelsius.setText(String.valueOf(df.format(celsius)));
                        binding.reportFahrenheit.setText(String.valueOf(df.format(fahrenheit)));
                    }
                    catch (Exception e){
                        celsius = Float.parseFloat(strCelsius);

                        fahrenheit = (celsius * 9/5) + 32;

                        binding.reportCelsius.setText(String.valueOf(df.format(celsius)));
                        binding.reportFahrenheit.setText(String.valueOf(df.format(fahrenheit)));
                    }


                }







        }
    }
}