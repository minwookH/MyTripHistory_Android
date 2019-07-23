package com.minwook.mytriphistory.kotlin.model

import android.content.Context
import com.minwook.mytriphistory.kotlin.DAO.Content
import com.minwook.mytriphistory.kotlin.common.DumyData

class ContentsModel {


    fun dataLoad(): ArrayList<Content> {
        return DumyData.list
    }
}