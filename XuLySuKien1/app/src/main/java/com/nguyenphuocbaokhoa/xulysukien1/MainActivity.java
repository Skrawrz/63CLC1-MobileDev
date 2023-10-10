package com.nguyenphuocbaokhoa.xulysukien1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText_UN;
    EditText editText_PWD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWidget();
    }
    void getWidget(){
        editText_UN=findViewById(R.id.edtUserName);
        editText_PWD=findViewById(R.id.edtPass);
    }
    public void XuLyLogin(View v){
        //B1: Lấy giữ liệu từ 2 edittext
        EditText editText_UN=findViewById(R.id.edtUserName);
        EditText editText_PWD=findViewById(R.id.edtPass);
        //B2:Lấy giữ liêụ đã nhập vào các điều khiển trên
        String tenDN = editText_UN.getText().toString();
        String mk = editText_PWD.getText().toString();
        String ketQua;
        if(tenDN.equals("63CLC1")&&mk.equals("123"))
            ketQua="OK, login successed";
        else
            ketQua="not OK, login failed";
        Toast.makeText(this,ketQua,Toast.LENGTH_LONG).show();
    }
}