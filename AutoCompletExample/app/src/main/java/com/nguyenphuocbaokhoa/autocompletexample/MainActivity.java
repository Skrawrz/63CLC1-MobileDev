package com.nguyenphuocbaokhoa.autocompletexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView auTV;
    ArrayList<String> COUNTRIES = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWidget();
        //bước 1
        COUNTRIES.add("Vietnam");
        COUNTRIES.add("England");
        COUNTRIES.add("USA");
        COUNTRIES.add("Thailand");
        COUNTRIES.add("Indonesia");
        COUNTRIES.add("Campuchia");
        //bước 2
        ArrayAdapter<String> adapterCountries = new ArrayAdapter<String>
                (this, android.R.layout.simple_dropdown_item_1line,COUNTRIES);
        //bước 3
        auTV.setAdapter(adapterCountries);
    }
    public void getWidget(){

        auTV = findViewById(R.id.autoCompleteCountries);
    }
}