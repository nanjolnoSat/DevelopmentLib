package com.mishaki.lib.base;

import android.app.Application;

import com.mishaki.lib.BuildConfig;
import com.mishaki.lib.roomlib.RoomInitializer;

import androidx.room.RoomDatabase;

/**
 * Created by 杜壁奇<br/>
 * on 2020/09/08 21:49<br/>
 * DATABASE：不知道使用什么就用AppDatabase，这个是默认的Database类型<br/>
 * @see com.mishaki.lib.roomlib.AppDatabase
 */
public abstract class BaseApplication<DATABASE extends RoomDatabase> extends Application {
    //当调用getInstance静态方法的时候，就可以直接将该属性返回
    protected static BaseApplication instance;
    private DATABASE appDatabase;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        if (BuildConfig.USE_ROOM) {
            appDatabase = initDatabase();
        }
    }

    //为增强扩展性，不要求返回的类必须是AppDatabase的子类
    protected DATABASE initDatabase() {
        return (DATABASE) new RoomInitializer().init(this);
    }

    public DATABASE getDatabase() {
        return appDatabase;
    }
}
