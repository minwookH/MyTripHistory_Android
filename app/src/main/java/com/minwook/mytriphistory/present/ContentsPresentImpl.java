package com.minwook.mytriphistory.present;

import android.content.Context;

import com.minwook.mytriphistory.DAO.Content;
import com.minwook.mytriphistory.model.ContentsModel;

public class ContentsPresentImpl implements ContentsPresent {

    private ContentsPresent.View view;
    private ContentsModel model;

    public ContentsPresentImpl(ContentsPresent.View view){
        this.view = view;
        model = new ContentsModel();
    }


    @Override
    public void loadListData() {
        view.response(model.dataLoad());
    }
}
