package com.minwook.mytriphistory.kotlin.present

import com.minwook.mytriphistory.kotlin.DAO.Content
import java.util.ArrayList

interface ContentsPresent {
    fun loadListData()

    interface View {
        fun response(list: ArrayList<Content>)
    }
}