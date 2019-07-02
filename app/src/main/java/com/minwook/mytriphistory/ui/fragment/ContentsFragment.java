package com.minwook.mytriphistory.ui.fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.minwook.mytriphistory.DAO.Content;
import com.minwook.mytriphistory.R;
import com.minwook.mytriphistory.adapter.ContentsAdapter;
import com.minwook.mytriphistory.present.ContentsPresent;
import com.minwook.mytriphistory.present.ContentsPresentImpl;
import com.minwook.mytriphistory.ui.activity.ContentDetailActivity;

import java.util.ArrayList;

public class ContentsFragment extends Fragment implements ContentsPresent.View, ContentsAdapter.OnListItemSelectedInterface{

    private RecyclerView contents;
    private ArrayList<Content> list;
    private ContentsAdapter contentsAdapter;
    private ContentsPresentImpl present;

    public ContentsFragment() {
        // Required empty public constructor
    }

    public static ContentsFragment newInstance() {
        ContentsFragment fragment = new ContentsFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("test","onCreate");
        /*list = new ArrayList<>();

        for (int i = 0; i < 15; i++){
            Content content =  new Content();
            content.setTitle("제목 "+String.valueOf(i));
            content.setLocation("장소 "+Integer.toString(i));
            list.add(content);
        }*/

        present = new ContentsPresentImpl(getContext(), this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_contents_list, container, false);
        contents = view.findViewById(R.id.contentlist);
        Log.d("test","onCreateView");

        contentsAdapter = new ContentsAdapter(getContext(), this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());

        contents.setLayoutManager(linearLayoutManager);
        contents.setAdapter(contentsAdapter);

        present.loadListData();

        return view;
    }

    @Override
    public void response(ArrayList<Content> list) {
        contentsAdapter.addList(list);
        contentsAdapter.notifyDataSetChanged();
    }

    @Override
    public void onItemSelected(int position) {
        Intent intent = new Intent(getContext(), ContentDetailActivity.class);
        intent.putExtra("position", position);
        getActivity().startActivity(intent);
    }
}
