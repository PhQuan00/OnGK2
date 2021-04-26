package com.example.on;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class ScreenHai extends AppCompatActivity {
    private Button btnadd;
    private ImageView mImg2;
    private TextView mName2;
    private TextView mPrice2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);


        int mImg=getIntent().getIntExtra("img2",2);
        String  mtvName=getIntent().getStringExtra("name");
        String mtvPrice=getIntent().getStringExtra("price");

        mName2=findViewById(R.id.tvName2);
        mPrice2=findViewById(R.id.tvPrice);
        mImg2=findViewById(R.id.imghinh2);

        mName2.setText(mtvName);
        mPrice2.setText(mtvPrice);
        mImg2.setImageResource(mImg);


    }


}
