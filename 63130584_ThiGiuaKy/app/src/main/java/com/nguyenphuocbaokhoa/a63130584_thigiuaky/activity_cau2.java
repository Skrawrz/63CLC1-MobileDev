package com.nguyenphuocbaokhoa.a63130584_thigiuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class activity_cau2 extends AppCompatActivity {
    ArrayList<String>lstDSBH=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau2);
        getWidget();
        lstDSBH.add("Những cơn mưa");
        lstDSBH.add("Martini");
        lstDSBH.add("Biêt khi nào chia ly");
        lstDSBH.add("Mời buồn sang chơi");
        lstDSBH.add("Nhưng câu hỏi khi say");
        lstDSBH.add("Talk to the moon");
        lstDSBH.add("God of music");
        lstDSBH.add("Cơn mua rào");
        lstDSBH.add("Em chắc không");
        lstDSBH.add("Ai trả lương cho mẹ");
        ArrayAdapter<String> adapterDSBH=new ArrayAdapter<String>
                (this, android.R.layout.simple_dropdown_item_1line,lstDSBH);
        lvDSBH.setAdapter(adapterDSBH);
        lvDSBH.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String mucchon=lstDSBH.get(position).toString();
                String thongbao="Bạn đã chọn bài hát: "+ mucchon;
                Toast.makeText(activity_cau2.this,thongbao,Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void getWidget(){
        lvDSBH=findViewById(R.id.lvDSBH);
    }
    ListView lvDSBH;
}