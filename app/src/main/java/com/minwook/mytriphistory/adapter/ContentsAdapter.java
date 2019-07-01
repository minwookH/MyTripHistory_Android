package com.minwook.mytriphistory.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.minwook.mytriphistory.DAO.Content;
import com.minwook.mytriphistory.R;

import java.util.ArrayList;

public class ContentsAdapter extends RecyclerView.Adapter<ContentsAdapter.ViewHolder>{

    private ArrayList<Content> contents;

    public ContentsAdapter(ArrayList<Content> list){
        this.contents = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contents_cardview, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Content content = contents.get(position);
        holder.title.setText(content.getTitle());
        holder.location.setText(content.getLocation());
        holder.date.setText(content.getStartDate() + " ~ " + content.getEndDate());
    }

    @Override
    public int getItemCount() {
        return contents.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView title;
        TextView location;
        TextView date;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.title = itemView.findViewById(R.id.content_title);
            this.location = itemView.findViewById(R.id.location);
            this.date = itemView.findViewById(R.id.date);
        }
    }
}
