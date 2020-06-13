package com.example.weatherapp.base;

import android.app.Application;

import com.example.weatherapp.db.DBManager;

import org.xutils.x;

public class UniteApp extends Application {
    //设置全局声明
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        DBManager.initDB(this);
    }
}
