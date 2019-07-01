package com.minwook.mytriphistory.ui.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.minwook.mytriphistory.DAO.Content;
import com.minwook.mytriphistory.R;
import com.minwook.mytriphistory.adapter.ContentsAdapter;
import com.minwook.mytriphistory.present.ContentsPresent;
import com.minwook.mytriphistory.present.ContentsPresentImpl;

import java.util.ArrayList;

public class ContentsFragment extends Fragment implements ContentsPresent.View{

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
        list = new ArrayList<>();

        for (int i = 0; i < 15; i++){
            Content content =  new Content();
            content.setTitle("제목 "+String.valueOf(i));
            content.setLocation("장소 "+Integer.toString(i));
            list.add(content);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_contents_list, container, false);
        contents = view.findViewById(R.id.contentlist);
        Log.d("test","onCreateView");

        contentsAdapter = new ContentsAdapter(list);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());

        contents.setLayoutManager(linearLayoutManager);
        contents.setAdapter(contentsAdapter);

        return view;
    }

}
