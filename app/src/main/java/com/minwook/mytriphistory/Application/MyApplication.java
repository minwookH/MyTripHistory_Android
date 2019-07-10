package com.minwook.mytriphistory.Application;

import android.app.Application;
import android.content.Context;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

    }

    public static MyApplication get(Context context) {
        return (MyApplication) context.getApplicationContext();
    }
}
