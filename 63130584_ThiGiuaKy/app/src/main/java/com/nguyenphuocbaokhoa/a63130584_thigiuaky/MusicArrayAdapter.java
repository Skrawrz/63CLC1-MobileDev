package com.nguyenphuocbaokhoa.a63130584_thigiuaky;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MusicArrayAdapter extends BaseAdapter {
    private List<Music>lstDataSource;
    private LayoutInflater inflater;
    private Context context;

    public MusicArrayAdapter(List<Music> lstDataSource, Context context) {
        this.lstDataSource = lstDataSource;
        this.context = context;
        this.inflater=LayoutInflater.from(context);
    }
    class MusicItemViewHolder{
        ImageView musicView;
        TextView musicName;
        TextView musicianName;
    }

    @Override
    public int getCount() {
        return lstDataSource.size();
    }

    @Override
    public Object getItem(int position) {
        return lstDataSource.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MusicItemViewHolder itemViewHolder;
        if(convertView==null) {
            convertView = inflater.inflate(R.layout.baihat_layout, null);
            itemViewHolder = new MusicItemViewHolder();
            itemViewHolder.musicView = convertView.findViewById(R.id.imageViewMusic);
            itemViewHolder.musicName = convertView.findViewById(R.id.textViewMusicName);
            itemViewHolder.musicianName = convertView.findViewById(R.id.textViewtacgia);
            convertView.setTag(itemViewHolder);
        }
        else {
            itemViewHolder=(MusicItemViewHolder) convertView.getTag();
        }
        Music musicItem=lstDataSource.get(position);
        itemViewHolder.musicName.setText(musicItem.getMusicName());
        itemViewHolder.musicianName.setText("Tên tác giả: "+musicItem.getMusician());
        int flagID=getImgIDbyResName(musicItem.getMusicImg());
        itemViewHolder.musicView.setImageResource(flagID);
        return convertView;
    }
    public int getImgIDbyResName(String resName){
        String packageName = context.getPackageName();
        int imgID=context.getResources().getIdentifier(resName,"mipmap",packageName);
        return  imgID;
    }
}
