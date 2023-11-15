package com.nguyenphuocbaokhoa.listviewpractise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lvNNLT;
    ArrayList<String> lsNNLT=new ArrayList<String>();
    public void getWidget(){
    lvNNLT=findViewById(R.id.lvNNLT);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWidget();
        lsNNLT.add("C");
        lsNNLT.add("C++");
        lsNNLT.add("C#");
        lsNNLT.add("Java");
        lsNNLT.add("Python");
        lsNNLT.add("Ruby");
        lsNNLT.add("Android Java");
        ArrayAdapter<String> adapterNNLT=new ArrayAdapter<String>
                (this,android.R.layout.simple_dropdown_item_1line,lsNNLT);
        lvNNLT.setAdapter(adapterNNLT);
        lvNNLT.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String mucchon=lsNNLT.get(i).toString();
                String chuoithongbao="Bạn đã chọn"+ mucchon;
                Toast.makeText(MainActivity.this, chuoithongbao, Toast.LENGTH_SHORT).show();
            }
        });
    }
}