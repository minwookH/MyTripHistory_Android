package com.minwook.mytriphistory.di.module;

import com.minwook.mytriphistory.DAO.Content;

import dagger.Module;
import dagger.Provides;

@Module
public class ContentModule {

    @Provides
    public Content provideContentClass() {
        return new Content();
    }
}
