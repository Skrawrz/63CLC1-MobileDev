package com.nguyenphuocbaokhoa.a63130584_thigiuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activity_cau1 extends AppCompatActivity {
    EditText texta;
    EditText textb;
    EditText textkq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau1);
        getWidget();
    }
    void getWidget(){
        texta=findViewById(R.id.numa);
        textb=findViewById(R.id.numb);
        textkq=findViewById(R.id.numkq);
    }
    public void TinhTong(View v){
        EditText texta=findViewById(R.id.numa);
        EditText textb=findViewById(R.id.numb);
        EditText textkq=findViewById(R.id.numkq);
        float numbera =Float.parseFloat(String.valueOf(texta.getText())) ;
        float numberb =Float.parseFloat(String.valueOf(textb.getText())) ;
        float ketQua = numbera+numberb;
        textkq.setText(String.valueOf(ketQua));
    }
}