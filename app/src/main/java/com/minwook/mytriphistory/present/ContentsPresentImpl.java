package com.minwook.mytriphistory.present;

import android.content.Context;

import com.minwook.mytriphistory.DAO.Content;
import com.minwook.mytriphistory.model.ContentsModel;

import java.util.ArrayList;

import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;

public class ContentsPresentImpl implements ContentsPresent {

    private ContentsPresent.View view;
    private Context context;
    private ContentsModel model;

    private CompositeDisposable disposables;

    private ArrayList<Content> list;


    public ContentsPresentImpl(Context context, ContentsPresent.View view){
        this.context = context;
        this.view = view;
        //this.list = list;
        model = new ContentsModel(context);
    }


    @Override
    public void loadListData() {
        view.response(model.dataLoad());
    }

    @Override
    public void moveContentDetail(int position) {

    }


}
