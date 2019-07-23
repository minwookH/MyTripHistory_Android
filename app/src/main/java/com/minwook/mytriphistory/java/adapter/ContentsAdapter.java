package com.minwook.mytriphistory.java.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.minwook.mytriphistory.java.DAO.Content;
import com.minwook.mytriphistory.R;

import java.util.ArrayList;

public class ContentsAdapter extends RecyclerView.Adapter<ContentsAdapter.ViewHolder>{

    private ArrayList<Content> contents;

    private OnListItemSelectedInterface mListener;
    private Context context;

    public ContentsAdapter(Context context, OnListItemSelectedInterface mListener){
        this.context = context;
        this.mListener = mListener;
        contents = new ArrayList<>();
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

    public interface OnListItemSelectedInterface {
        void onItemSelected(int position);
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView title;
        TextView location;
        TextView date;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.title = itemView.findViewById(R.id.content_title);
            this.location = itemView.findViewById(R.id.location);
            this.date = itemView.findViewById(R.id.date);
            this.cardView = itemView.findViewById(R.id.card_view);
            this.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mListener.onItemSelected(getAdapterPosition());
                }
            });
        }
    }

    public void addList(ArrayList<Content> list){
        contents.addAll(list);
    }
}
