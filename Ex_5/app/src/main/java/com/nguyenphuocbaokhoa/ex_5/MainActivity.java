package com.nguyenphuocbaokhoa.ex_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText_Height;
    EditText editText_Weight;
    TextView textView_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWidget();
    }
    void getWidget(){
        editText_Height=findViewById(R.id.num1);
        editText_Weight=findViewById(R.id.num2);
        textView_result=findViewById(R.id.result);
    }
    public void XuLyCalculate(View v){
        EditText editText_Height=findViewById(R.id.num1);
        EditText editText_Weight=findViewById(R.id.num2);
        TextView textView_result=findViewById(R.id.result);
        TextView textView_ttrang=findViewById(R.id.ttrang);
        float your_Height =Float.parseFloat(String.valueOf(editText_Height.getText())) ;
        float your_Weight =Float.parseFloat(String.valueOf(editText_Weight.getText())) ;
        float ketQua = your_Weight/(your_Height*your_Height);
        textView_result.setText(String.valueOf(ketQua));
        if(ketQua<18.5)
            textView_ttrang.setText("Gầy");
        else if(ketQua>=18.5&&ketQua<=24.9)
            textView_ttrang.setText("Bình thường");
        else if (ketQua>=25)
            textView_ttrang.setText("Béo phí");
    }
}
