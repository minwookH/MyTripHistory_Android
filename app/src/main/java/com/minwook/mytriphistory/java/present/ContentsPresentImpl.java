package com.minwook.mytriphistory.java.present;

import android.content.Context;

import com.minwook.mytriphistory.java.model.ContentsModel;

public class ContentsPresentImpl implements ContentsPresent {

    private ContentsPresent.View view;
    private Context context;
    private ContentsModel model;

    public ContentsPresentImpl(Context context, ContentsPresent.View view){
        this.context = context;
        this.view = view;
        model = new ContentsModel(context);
    }


    @Override
    public void loadListData() {
        view.response(model.dataLoad());
    }
}
