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
        //TextView textView_ttrang=findViewById(R.id.ttrang);
        double your_Height =Double.parseDouble(editText_Height.getText().toString()) ;
        double your_Weight =Double.parseDouble(editText_Weight.getText().toString()) ;
        //String ttrang=textView_ttrang.getText().toString();
        double ketQua = your_Weight/your_Height*your_Height;
        String result=Double.toString(ketQua);
        if(ketQua<18.5){
            System.out.println(ketQua);
            result="Gầy";
        }
        else if (ketQua>=18.5&&ketQua<22.9) {
            System.out.println(ketQua);
            result="Bình thường";
        }
        else if (ketQua>=23) {
            System.out.println(ketQua);
            result="Thừa cân";
        }

        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
    }
}