package com.minwook.mytriphistory.kotlin.present

import com.minwook.mytriphistory.kotlin.model.ContentsModel

class ContentsPresentImpl(var view: ContentsPresent.View): ContentsPresent {
    private val model: ContentsModel = ContentsModel()

    override fun loadListData() {
        view.response(model.dataLoad())
    }
}