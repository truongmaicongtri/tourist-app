package com.example.tri.touristapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class TouristRecyclerAdapter extends RecyclerView.Adapter<TouristRecyclerAdapter.TouristHolder> {
    List<String> touristSites;
    public TouristRecyclerAdapter(List<String> touristSites){
        this.touristSites= touristSites;
    }

    @Override
    public TouristHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        TextView v =(TextView) inflater.inflate(R.layout.tourist_list_item,parent,false);

        TouristHolder holder = new TouristHolder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(TouristHolder holder, int position) {
        String site = touristSites.get(position);
        holder.bindView(site);
    }

    @Override
    public int getItemCount() {
        return touristSites.size();
    }

    public static class TouristHolder extends RecyclerView.ViewHolder{

        private TextView view;

        public TouristHolder(View itemView){
            super(itemView);
            this.view =(TextView) itemView;
        }
        public void bindView(String touristItem) {
            view.setText(touristItem);
        }
    }
}
