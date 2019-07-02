package com.minwook.mytriphistory.model;

import android.content.Context;

import com.minwook.mytriphistory.DAO.Content;
import com.minwook.mytriphistory.common.DumyData;

import java.util.ArrayList;

public class ContentsModel {

    private Context context;
    private ArrayList<Content> list;
    private DumyData dumyData;

    public ContentsModel(Context context){
        this.context = context;
        //dumyData = new DumyData();
    }

    public ArrayList<Content> dataLoad(){
        return DumyData.getInstance().getList();
        //return dumyData.setDumyData();
    }
}
