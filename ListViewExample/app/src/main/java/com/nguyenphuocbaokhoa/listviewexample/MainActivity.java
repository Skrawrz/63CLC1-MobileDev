package com.nguyenphuocbaokhoa.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String>lsNNLT = new ArrayList<String>();
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
        listViewNNLT.setAdapter(adapterNNLT);
        listViewNNLT.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Code xử lý
                //cách 1
                //String mucChon=adapterNNLT.getItem(i);
                //cách 2
                String mucChon=lsNNLT.get(i).toString();
                //xử lý dữ liệu
                String chuoithongbao = "You selected"+ mucChon;
                Toast.makeText(MainActivity.this, chuoithongbao, Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void getWidget(){
        listViewNNLT=findViewById(R.id.lvNNLT);
    }
    ListView listViewNNLT;
}