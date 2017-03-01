package com.example.seohee.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    private int [] data = {R.drawable.doosan, R.drawable.hanwha, R.drawable.kia,
            R.drawable.kt, R.drawable.lg, R.drawable.lotte, R.drawable.nc,
            R.drawable.nexen, R.drawable.samsung, R.drawable.sk};

    private CustomAdapter adapter;
    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new CustomAdapter(this, data);
        gridView = (GridView)findViewById(R.id.gv01);
        gridView.setAdapter(adapter);
    }
}
