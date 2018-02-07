package com.example.admin.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by admin on 2/7/2018.
 */

class GridImageAdapter extends BaseAdapter {
    Context context;

    public GridImageAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 30;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //1. Create image view
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.food_1);
        imageView.setLayoutParams(
                new AbsListView.LayoutParams(
                        AbsListView.LayoutParams.MATCH_PARENT, 250));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(5,5,5,5);
        imageView.setCropToPadding(true);


        //2.set image


        return imageView;
    }
}
