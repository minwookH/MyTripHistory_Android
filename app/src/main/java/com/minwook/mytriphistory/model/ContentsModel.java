package com.minwook.mytriphistory.model;

import android.content.Context;

import com.minwook.mytriphistory.DAO.Content;
import com.minwook.mytriphistory.common.DumyData;

import java.util.ArrayList;

public class ContentsModel {

    private Context context;
    private ArrayList<Content> list;

    public ContentsModel(Context context){
        this.context = context;
    }

    public ArrayList<Content> dataLoad(){
        return DumyData.getInstance().getList();
    }
}
