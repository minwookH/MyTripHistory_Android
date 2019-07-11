package com.minwook.mytriphistory.di.component;

import com.minwook.mytriphistory.di.module.ContentsModule;
import com.minwook.mytriphistory.di.scope.ActivityScope;
import com.minwook.mytriphistory.present.ContentsPresent;
import com.minwook.mytriphistory.ui.fragment.ContentsFragment;

import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class, modules = ContentsModule.class)
public interface ContentsComponent {
    void inject(ContentsFragment contentsFragment);
}