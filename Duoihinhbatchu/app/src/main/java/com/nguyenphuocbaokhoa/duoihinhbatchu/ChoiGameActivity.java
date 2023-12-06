package com.nguyenphuocbaokhoa.duoihinhbatchu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.nguyenphuocbaokhoa.duoihinhbatchu.adapter.DapAnAdapter;

import java.util.ArrayList;
import java.util.Random;

public class ChoiGameActivity extends AppCompatActivity {
    private String dapAn="yeuot";
    ArrayList<String>arrCauTraLoi;
    GridView gdvCauTraLoi;
    ArrayList<String>arrDapAn;
    GridView gdvDapAn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choi_game);
        init();
        anhXa();
        bamData();
        hienThiCauTraLoi();
        hienThiDapAn();
    }
    private void anhXa(){
        gdvCauTraLoi = findViewById(R.id.gdvCauTraLoi);
        gdvDapAn = findViewById(R.id.gdvDapAn);
    }
    private void init(){
        arrCauTraLoi = new ArrayList<>();
        arrDapAn = new ArrayList<>();
    }
    private void hienThiCauTraLoi(){
        gdvCauTraLoi.setNumColumns(arrCauTraLoi.size());
        gdvCauTraLoi.setAdapter(new DapAnAdapter(this,0,arrCauTraLoi));
    }
    private void hienThiDapAn(){
        gdvDapAn.setNumColumns(arrDapAn.size()/2);
        gdvDapAn.setAdapter(new DapAnAdapter(this,0,arrDapAn));
    }
    private void bamData(){
        arrCauTraLoi.clear();
        Random r= new Random();
        for (int i=0;i<dapAn.length();i++){
            arrCauTraLoi.add("");
            String s = ""+(char)(r.nextInt(26)+65);
            arrDapAn.add(s);
            String sl =""+(char)(r.nextInt(26)+65);
            arrDapAn.add(sl);
        }
        for (int i=0;i<dapAn.length();i++){
            String s = ""+dapAn.charAt(i);
            arrDapAn.set(i,s.toUpperCase());
        }
        for(int i=0;i<10;i++){
            String s = arrDapAn.get(i);
            int vt = r.nextInt(arrDapAn.size());
            arrDapAn.set(i,arrDapAn.get(vt));
            arrDapAn.set(vt,s);
        }
    }
}