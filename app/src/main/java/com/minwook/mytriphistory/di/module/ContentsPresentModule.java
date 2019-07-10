package com.minwook.mytriphistory.di.module;

import android.content.Context;

import com.minwook.mytriphistory.DAO.Content;
import com.minwook.mytriphistory.present.ContentsPresent;
import com.minwook.mytriphistory.present.ContentsPresentImpl;

import dagger.Module;
import dagger.Provides;

@Module
public class ContentsPresentModule {

    @Provides
    public ContentsPresent providePresenter(ContentsPresent.View view, Context context) {
        return new ContentsPresentImpl(context, view);
    }
}
