package com.example.on;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private AoAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<Ao> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            arrayList.add(new Ao("Google", "$10.00", R.drawable.google_wear));
            arrayList.add(new Ao("Code", "$20.00", R.drawable.code));
            arrayList.add(new Ao("Google blue", "$30.00", R.drawable.googleblue));
            arrayList.add(new Ao("Google green", "$40.00", R.drawable.googlegreen));
        }

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new AoAdapter(this, arrayList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        GridLayoutManager layoutManager = new GridLayoutManager(MainActivity.this, 2, GridLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(layoutManager);
    }


}
