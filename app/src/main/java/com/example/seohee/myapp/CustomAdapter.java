package com.example.seohee.myapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by seohee on 2017-03-01.
 */

public class CustomAdapter extends BaseAdapter {
    private Context mContext;
    private int[] data;

    public CustomAdapter(Context mContext, int[] data){
        this.mContext = mContext;
        this.data = data;
    }

    public int getCount(){
        return data.length;
    }

    public Object getItem(int position){
        return data[position];
    }

    public long getItemId(int position){
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        ImageView imageView;
        if(convertView == null){
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(150,150));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(5,5,5,5);
        }
        else{
            imageView = (ImageView)convertView;
        }
        imageView.setImageResource(data[position]);
        return imageView;
    }


}

