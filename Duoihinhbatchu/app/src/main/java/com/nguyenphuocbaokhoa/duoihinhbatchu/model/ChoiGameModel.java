package com.nguyenphuocbaokhoa.duoihinhbatchu.model;

import com.nguyenphuocbaokhoa.duoihinhbatchu.ChoiGameActivity;
import com.nguyenphuocbaokhoa.duoihinhbatchu.object.CauDo;

import java.util.ArrayList;

public class ChoiGameModel {
    ChoiGameActivity c ;
    ArrayList<CauDo>arr;
    int cauSo=-1;

    public ChoiGameModel(ChoiGameActivity c) {
        this.c = c;
        taoData();
    }
    private void taoData(){
        arr = new ArrayList<>();
        arr.add(new CauDo("Màn 1","soctrang","https://i.ytimg.com/vi/mQxjJpr8Gvg/maxresdefault.jpg"));
        arr.add(new CauDo("Màn 2","tienganh","https://i.ytimg.com/vi/3UQdkHEKJnw/maxresdefault.jpg"));
        arr.add(new CauDo("Màn 3","baosutu","https://i.ytimg.com/vi/z-mhPMPK5NI/maxresdefault.jpg"));
        arr.add(new CauDo("Màn 4","voimamut","https://mcvideomd1fr.keeng.vn/playnow/images/20221005/f81e2a8f-6a17-43cf-9da8-fe6c82ac929c_640x360.jpg"));
        arr.add(new CauDo("Màn 5","mangcut","https://freetuts.net/upload/product_series/images/2022/11/16/2598/nhin-hinh-doan-chu-36.jpg"));
    }
    public CauDo layCauDo(){
        cauSo++;
        if(cauSo>=arr.size()){
            cauSo= arr.size()-1;
        }
        return arr.get(cauSo);
    }
}
