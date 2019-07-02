package com.minwook.mytriphistory.present;

import com.minwook.mytriphistory.DAO.Content;

import java.util.ArrayList;

public interface ContentsPresent {
    void loadListData();

    interface View{
        void response(ArrayList<Content> list);
    }
}
