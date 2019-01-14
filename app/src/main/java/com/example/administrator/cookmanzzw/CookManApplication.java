package com.example.administrator.cookmanzzw;

import android.content.Context;
import android.support.multidex.MultiDex;

import com.example.administrator.cookmanzzw.constants.Constants;
import com.example.administrator.cookmanzzw.utils.Logger.LogLevel;
import com.example.administrator.cookmanzzw.utils.Logger.Logger;
import com.tencent.bugly.crashreport.CrashReport;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.message.IUmengRegisterCallback;
import com.umeng.message.PushAgent;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.cookie.CookieJarImpl;
import com.zhy.http.okhttp.cookie.store.PersistentCookieStore;

import org.litepal.LitePalApplication;

import okhttp3.OkHttpClient;

/**
 * Created by Administrator on 2017/2/17.
 */

public class CookManApplication extends LitePalApplication {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();




        mContext = getApplicationContext();

        //Logger设置
        if(BuildConfig.DEBUG) {
            Logger.init(Constants.Common_Tag).logLevel(LogLevel.FULL);
        }
        else{
            Logger.init(Constants.Common_Tag).logLevel(LogLevel.NONE);
        }

        //腾讯Bugly
        CrashReport.initCrashReport(getApplicationContext());


    }

    public static Context getContext() {
        return mContext;
    }
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
