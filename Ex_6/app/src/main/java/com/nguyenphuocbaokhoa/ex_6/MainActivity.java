package com.nguyenphuocbaokhoa.ex_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText_Sothunhat;
    EditText editText_Sothuhai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void XuLyCong(View v){
        EditText editText_Sothunhat=findViewById(R.id.num1);
        EditText editText_Sothuhai=findViewById(R.id.num2);
        int Sothunhat=editText_Sothunhat.getText().toString();
        double Sothuhai;
        double ketQua=sothunhat+;
    }

}