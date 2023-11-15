package com.nguyenphuocbaokhoa.a63130584_thigiuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_cau3 extends AppCompatActivity {
    ArrayList<Music>dsBH;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau3);
        dsBH=new ArrayList<Music>();
        Music an1=new Music("Nơi này có anh","sontung","Sơn Tùng MTP");
        Music an2=new Music("Mưa","trungquan","Trung Quân Idol");
        Music an3=new Music("Faded","alanwalker","Alan Walker");
        dsBH.add(an1);
        dsBH.add(an2);
        dsBH.add(an3);
        ListView lvBH=findViewById(R.id.listViewMusic);
        MusicArrayAdapter adapter;
        adapter=new MusicArrayAdapter(dsBH,this);
        lvBH.setAdapter(adapter);
    }
}