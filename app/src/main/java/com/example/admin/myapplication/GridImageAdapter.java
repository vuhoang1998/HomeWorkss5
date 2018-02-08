package com.example.admin.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

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


    @SuppressLint("ResourceAsColor")
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //1. Create image view
        TextView text = new TextView(context);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.food_1);

        text.setText("ahihi");
        text.setTextColor(R.color.colorPrimaryDark);
        text.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM);

        imageView.setLayoutParams(
                new AbsListView.LayoutParams(
                        AbsListView.LayoutParams.MATCH_PARENT, 250));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(20,20,20,20);
        imageView.setCropToPadding(true);


        LinearLayout ll = new LinearLayout(context);
        ll.setLayoutParams(
                new AbsListView.LayoutParams(
                        AbsListView.LayoutParams.MATCH_PARENT, 350));
        ll.setOrientation(LinearLayout.VERTICAL);
        ll.addView(imageView);
        ll.addView(text);
        //2.set image


        return ll;
    }
}
