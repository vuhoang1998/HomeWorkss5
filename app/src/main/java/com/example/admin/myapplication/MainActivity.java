package com.example.admin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.github.clans.fab.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private FloatingActionButton fbAdd;
    int images[] = {R.drawable.food_1, R.drawable.food_2, R.drawable.food_3, R.drawable.food_4, R.drawable.food_5};
    int currentimage;
    private GridView gvimages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUI();
    }

    private void setupUI() {
        fbAdd = findViewById(R.id.fb_add);
        gvimages = findViewById(R.id.gv_images);

        GridImageAdapter adapter = new GridImageAdapter(this);

        gvimages.setAdapter(adapter);

    }



}
