package com.example.on;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AoAdapter extends RecyclerView.Adapter<AoAdapter.AoViewHolder> {
    private ArrayList<Ao> mAoList;
    private LayoutInflater mInflater;
    private Context context;

    @NonNull
    @Override
    public AoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.aolist_item,parent,false);
        AoViewHolder avh= new AoViewHolder(v);
        return avh;
    }

    public AoAdapter(Context context, ArrayList<Ao> aoList)
    {
        mInflater = LayoutInflater.from(context);
        this.mAoList = aoList;
        this.context = context;
    }
    @Override
    public void onBindViewHolder(@NonNull AoAdapter.AoViewHolder holder, int position) {
        Ao current = mAoList.get(position);

        holder.mImageView.setImageResource(current.getImgHinh());
        holder.tvName.setText(current.getName());
        holder.tvPrice.setText(current.getPrice());
    }

    @Override
    public int getItemCount() {
        return mAoList.size();
    }



    public class AoViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView mImageView;
        public TextView tvName;
        public TextView tvPrice;
        public AoViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imghinh);
            tvName = itemView.findViewById(R.id.tvName);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int mPosition= getLayoutPosition();
            Ao aos= mAoList.get(mPosition);

            Intent intent = new Intent(context, ScreenHai.class);
            intent.putExtra("name",aos.getName());
            intent.putExtra("price",aos.getPrice());

            context.startActivity(intent);


        }
    }
}
