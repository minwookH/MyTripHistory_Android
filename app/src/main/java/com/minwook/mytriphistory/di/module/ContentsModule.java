package com.minwook.mytriphistory.di.module;

import android.content.Context;

import com.minwook.mytriphistory.present.ContentsPresent;
import com.minwook.mytriphistory.present.ContentsPresentImpl;

import dagger.Module;
import dagger.Provides;

@Module
public class ContentsModule {
    private ContentsPresent.View view;

    public ContentsModule(ContentsPresent.View view) {
        this.view = view;
    }

    @Provides
    public ContentsPresent.View provideView() {
        return view;
    }

    @Provides
    public ContentsPresent providePresenter(ContentsPresent.View view) {
        return new ContentsPresentImpl(view);
    }
}
