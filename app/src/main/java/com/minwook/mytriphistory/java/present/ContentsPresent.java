package com.minwook.mytriphistory.java.present;

import com.minwook.mytriphistory.java.DAO.Content;

import java.util.ArrayList;

public interface ContentsPresent {
    void loadListData();

    interface View{
        void response(ArrayList<Content> list);
    }
}
