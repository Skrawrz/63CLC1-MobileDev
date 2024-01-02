package com.nguyenphuocbaokhoa.duoihinhbatchu.model;

import com.nguyenphuocbaokhoa.duoihinhbatchu.ChoiGameActivity;
import com.nguyenphuocbaokhoa.duoihinhbatchu.DATA;
import com.nguyenphuocbaokhoa.duoihinhbatchu.object.CauDo;
import com.nguyenphuocbaokhoa.duoihinhbatchu.object.NguoiDung;

import java.util.ArrayList;

public class ChoiGameModel {
    ChoiGameActivity c ;
    ArrayList<CauDo>arr;
    int cauSo=-1;
    public NguoiDung nguoiDung;

    public ChoiGameModel(ChoiGameActivity c) {
        this.c = c;
        nguoiDung = new NguoiDung();
        taoData();
    }
    private void taoData(){
        arr = new ArrayList<>(DATA.getData().arrCauDo);
    }
    public CauDo layCauDo(){
        cauSo++;
        if(cauSo>=arr.size()){
            cauSo= arr.size()-1;
        }
        return arr.get(cauSo);
    }
    public void layThongTin(){
        nguoiDung.getTT(c);
    }
    public void luuThongTin(){
        nguoiDung.saveTT(c);
    }
}
