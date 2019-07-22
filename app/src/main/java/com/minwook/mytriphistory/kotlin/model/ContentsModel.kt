package com.minwook.mytriphistory.kotlin.model

import android.content.Context
import com.minwook.mytriphistory.kotlin.DAO.Content
import com.minwook.mytriphistory.kotlin.common.DumyData
import java.util.ArrayList

class ContentsModel {
    private val list: ArrayList<Content>? = null

    fun dataLoad(): ArrayList<Content> {
        return DumyData.list
    }
}