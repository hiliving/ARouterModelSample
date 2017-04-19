package com.practice.dev.common;

import android.app.Application;
import android.content.Context;

import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;
import com.practice.dev.common.util.Utils;


/**
 * 公共的Application类，主要放置通用的初始化操作
 * Created by HY on 2017/4/18.
 */

public class BaseApplication extends Application {
    private static BaseApplication sInstance;

    public static Context context;

    public static BaseApplication getIns() {
        return sInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        context = this.getApplicationContext();
        Utils.init(context);
    }

}
