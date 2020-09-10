package com.mishaki.lib.roomlib;

import android.content.Context;

import com.mishaki.lib.sdkpi.init.room.IRoomDatabaseInitial;

import androidx.room.Room;

/**
 * Created by 杜壁奇<br/>
 * on 2020/09/08 21:26
 */
public class RoomInitializer implements IRoomDatabaseInitial<AppDatabase> {
    @Override
    public AppDatabase init(Context context) {
        return Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, AppDatabase.getDataBaseName(context)).build();
    }
}
