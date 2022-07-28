package com.example.oyo_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class offerAdapter extends RecyclerView.Adapter<offerAdapter.viewholder>{

    ArrayList<Models> list;
    Context context;

    public offerAdapter(ArrayList<Models> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.best_offer_for_your,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        Models models = list.get(position);
        holder.offerimage.setImageResource(models.getGrideimage());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public  class  viewholder extends RecyclerView.ViewHolder {
        ImageView offerimage;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            offerimage = itemView.findViewById(R.id.oyoimage);

        }
    }
}
