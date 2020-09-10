package com.mishaki.lib.sdkpi.init.room;

import android.content.Context;

/**
 * Created by 杜壁奇<br/>
 * on 2020/09/08 20:46
 */
public interface IRoomDatabaseInitial<T extends IRoomDatabase> {
    T init(Context context);
}
