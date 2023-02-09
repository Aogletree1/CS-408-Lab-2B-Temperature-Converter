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


        }
    }
}