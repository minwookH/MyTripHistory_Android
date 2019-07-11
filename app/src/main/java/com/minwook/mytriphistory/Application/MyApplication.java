package com.minwook.mytriphistory.Application;

import android.app.Application;
import android.content.Context;

import com.minwook.mytriphistory.di.component.AppComponent;
import com.minwook.mytriphistory.di.component.DaggerAppComponent;
import com.minwook.mytriphistory.di.module.AppModule;
import com.minwook.mytriphistory.di.module.ContentModule;

public class MyApplication extends Application {
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                                        .appModule(new AppModule(this))
                                        .contentModule(new ContentModule())
                                        .build();
        appComponent.inject(this);

    }

    public static MyApplication get(Context context) {
        return (MyApplication) context.getApplicationContext();
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }
}
