package com.nguyenphuocbaokhoa.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CountryArrayAdapter extends BaseAdapter {
    private List<Country>lstDataSource;
    private LayoutInflater inflater;
    private Context context;

    public CountryArrayAdapter(List<Country> lstDataSource, Context context) {
        this.lstDataSource = lstDataSource;
        this.context = context;
        this.inflater=LayoutInflater.from(context);
    }
    class CountryItemViewHolder{
        ImageView flagView;
        TextView countryNameView;
        TextView populationView;
    }
    @Override
    public int getCount() {
        return lstDataSource.size();
    }
    @Override
    public Object getItem(int i) {
        return lstDataSource.get(i);
    }
    @Override
    public long getItemId(int i) {
        return 0;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        CountryItemViewHolder itemViewHolder;
        if(view==null){
            //XML item view -->Java item
            view=inflater.inflate(R.layout.country_item_layout,null);
            //get Ref
            itemViewHolder = new CountryItemViewHolder();
            itemViewHolder.flagView=view.findViewById(R.id.imageViewFlag);
            itemViewHolder.countryNameView=view.findViewById(R.id.textViewCountryName);
            itemViewHolder.populationView=view.findViewById(R.id.textViewPopulation);
            view.setTag(itemViewHolder);
        }
        else {
            itemViewHolder=(CountryItemViewHolder) view.getTag();
        }
        Country countryItem=lstDataSource.get(i);
        itemViewHolder.countryNameView.setText(countryItem.getCountryName());
        itemViewHolder.populationView.setText("Population: " +countryItem.getPopulation());
        int flagID=getImgIDbyResName(countryItem.getCountryFlag());
        itemViewHolder.flagView.setImageResource(flagID);
        return view;
    }
    public int getImgIDbyResName(String resName){
        String packageName = context.getPackageName();
        int imgID=context.getResources().getIdentifier(resName,"mipmap",packageName);
        return  imgID;
    }
}
