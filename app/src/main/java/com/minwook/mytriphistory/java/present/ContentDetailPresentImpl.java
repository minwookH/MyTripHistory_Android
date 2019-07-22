package com.minwook.mytriphistory.java.present;

import android.content.Context;

import com.minwook.mytriphistory.java.DAO.Content;
import com.minwook.mytriphistory.java.common.DumyData;

public class ContentDetailPresentImpl implements ContentDetailPresent {

    private Context context;
    private ContentDetailPresent.View view;

    public ContentDetailPresentImpl(Context context, ContentDetailPresent.View view){
        this.context = context;
        this.view = view;
    }

    @Override
    public void loadData(int position) {
        Content content = DumyData.getInstance().getList().get(position);
        view.setText(content);
        view.addMarker(content.getLatitude(), content.getLongtitude(), content.getTitle());
        view.setCenterMap(content.getLatitude(), content.getLongtitude());
    }
}
