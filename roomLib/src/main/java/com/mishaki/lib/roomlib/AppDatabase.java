package com.mishaki.lib.roomlib;

import android.content.Context;

import com.mishaki.lib.sdkpi.init.room.IRoomDatabase;

import androidx.room.Database;
import androidx.room.RoomDatabase;

/**
 * Created by 杜壁奇<br/>
 * on 2020/09/08 21:26
 */
//将需要使用的实体放到这里，没有实体类千万别使用Room
@Database(entities = {}, version = 1)
public abstract class AppDatabase extends RoomDatabase implements IRoomDatabase {
    private static String databaseName = null;

    public static String getDataBaseName(Context context) {
        if (databaseName == null) {
            synchronized (AppDatabase.class) {
                if (databaseName == null) {
                    databaseName = context.getApplicationContext().getPackageName() + ".AppDatabase";
                }
            }
        }
        return databaseName;
    }
}
