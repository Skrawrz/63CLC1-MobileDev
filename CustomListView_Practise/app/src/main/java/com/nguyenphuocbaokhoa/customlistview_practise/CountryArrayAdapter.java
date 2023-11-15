package com.nguyenphuocbaokhoa.customlistview_practise;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CountryArrayAdapter extends BaseAdapter {
    private List<Country>lsDataSource;
    private LayoutInflater inflater;
    private Context context;

    public CountryArrayAdapter(List<Country> lsDataSource, Context context) {
        this.lsDataSource = lsDataSource;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }
    class CountryItemViewHolder{
        ImageView flagView;
        TextView countryNameView;
        TextView populationView;
    }

    @Override
    public int getCount() {
        return lsDataSource.size();
    }

    @Override
    public Object getItem(int i) {
        return lsDataSource.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        CountryItemViewHolder itemViewHolder;
        if(view==null){
            view=inflater.inflate(R.layout.country_layout,null);
            itemViewHolder=new CountryItemViewHolder();
            itemViewHolder.flagView=view.findViewById(R.id.imageView);
            itemViewHolder.countryNameView=view.findViewById(R.id.textViewCountryName);
            itemViewHolder.countryNameView=view.findViewById(R.id.textView2);
            view.setTag(itemViewHolder);
        }
        else {
            itemViewHolder=(CountryItemViewHolder) view.getTag();
        }
        Country countryItem=lsDataSource.get(i);
        itemViewHolder.countryNameView.setText(countryItem.getCountryName());
        itemViewHolder.populationView.setText("Population: "+countryItem.getPopulation());
        int flagID=getImgIDbyResName(countryItem.getCountryFlag());
        itemViewHolder.flagView.setImageResource(flagID);
        return  view;
    }
    public int getImgIDbyResName(String resName){
        String packetName = context.getPackageName();
        int imgID=context.getResources().getIdentifier(resName,"mipmap",packetName);
        return imgID;
    }
}
