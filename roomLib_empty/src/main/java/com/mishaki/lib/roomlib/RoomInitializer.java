package com.mishaki.lib.roomlib;

import android.content.Context;

import com.mishaki.lib.sdkpi.init.room.IRoomDatabaseInitial;

/**
 * Created by 杜壁奇<br/>
 * on 2020/09/08 21:26
 */
public class RoomInitializer implements IRoomDatabaseInitial<AppDatabase> {
    @Override
    public AppDatabase init(Context context) {
        throw new IllegalStateException("Please change useRoom to true");
    }
}
