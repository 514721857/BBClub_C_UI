package com.bbc.bbclub.c.base;

import android.app.Application;
import android.content.Context;

/**
 * 应用程序入口
 * Created by mdw on 2016/4/19.
 */
public class App extends Application {


    private static Context sContext;

    public static App instance;


    @Override
    public void onCreate() {
        super.onCreate();

        sContext = this;
        instance = this;
    }

    /**
     * 获取上下文对象
     * @return
     */
    public static Context getContext(){
        return sContext;
    }
    public static App getInstance() {
        if (instance == null) {
            instance = new App();
        }
        return instance;
    }


}
