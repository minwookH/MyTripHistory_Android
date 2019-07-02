package com.minwook.mytriphistory.present;

import com.minwook.mytriphistory.DAO.Content;

import java.util.ArrayList;

public interface ContentsPresent {
    void loadListData();
    void moveContentDetail(int position);

    interface View{
        void response(ArrayList<Content> list);
    }
}
