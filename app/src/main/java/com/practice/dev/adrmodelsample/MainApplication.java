package com.practice.dev.adrmodelsample;


import com.github.mzule.activityrouter.annotation.Modules;
import com.practice.dev.common.BaseApplication;

/**
 * 这个module跟界面无关
 * 1.管理组件的添加和删除，这里要和build.gradle里dependencies节点的配置一致
 * 2.组件名称排序不分先后
 * 3.组件名称一定要和其module名称一致
 * Created by HY on 2017/4/18.
 */
@Modules({"app","main","modelfirst", "modelsecond"})
public class MainApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
    }
}
