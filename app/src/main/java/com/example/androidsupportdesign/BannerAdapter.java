package com.example.androidsupportdesign;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BannerAdapter extends RecyclerView.Adapter<BannerAdapter.ViewHolder>{

    List<Banner> mArrayBanner;

    public BannerAdapter(List<Banner> mArrayBanner) {
        this.mArrayBanner = mArrayBanner;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.layout_item_banner, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Banner banner = mArrayBanner.get(position);
        holder.imgBanner.setImageResource(banner.getImage());
    }

    @Override
    public int getItemCount() {
        return mArrayBanner == null ? 0 : mArrayBanner.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imgBanner;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgBanner = itemView.findViewById(R.id.banner);
        }
    }

}
