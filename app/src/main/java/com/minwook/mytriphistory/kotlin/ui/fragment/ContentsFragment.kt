package com.minwook.mytriphistory.kotlin.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.minwook.mytriphistory.R
import com.minwook.mytriphistory.kotlin.DAO.Content
import com.minwook.mytriphistory.kotlin.adapter.ContentsAdapter
import com.minwook.mytriphistory.kotlin.present.ContentsPresent
import com.minwook.mytriphistory.kotlin.present.ContentsPresentImpl
import com.minwook.mytriphistory.java.ui.activity.ContentDetailActivity
import kotlinx.android.synthetic.main.fragment_contents_list.*

class ContentsFragment: Fragment() , ContentsPresent.View, ContentsAdapter.OnListItemSelectedInterface {
    private val list = arrayListOf<Content>()
    private lateinit var contentsAdapter: ContentsAdapter
    private lateinit var present: ContentsPresentImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_contents_list, container, false)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
/*
        contents = view.findViewById(R.id.contentlist)
        Log.d("test", "onCreateView")

        contentsAdapter = ContentsAdapter(list)
        val linearLayoutManager = LinearLayoutManager(context)



        contents.layoutManager = linearLayoutManager
        contents.adapter = contentsAdapter
*/

        //contentlist.

        //present.loadListData()

        contentsAdapter = ContentsAdapter(list, this)
        val linearLayoutManager = LinearLayoutManager(context)

        contentlist.layoutManager = linearLayoutManager
        contentlist.adapter = contentsAdapter

        present = ContentsPresentImpl(this)

        present.loadListData()
    }

    override fun onItemSelected(position: Int) {
        activity?.let{
            val intent = Intent (it, ContentDetailActivity::class.java)
            it.startActivity(intent)
        }
    }

    override fun response(list: ArrayList<Content>) {
        contentsAdapter.addList(list)
        contentsAdapter.notifyDataSetChanged()
    }

}