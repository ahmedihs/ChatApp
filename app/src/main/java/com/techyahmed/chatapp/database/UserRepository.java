package com.techyahmed.chatapp.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.techyahmed.chatapp.database.ChatAppDatabase;
import com.techyahmed.chatapp.pojo.User;

/**
 * Created by engrmahmed14@gmail.com on 11/15/15.
 */
public class UserRepository {

    private ChatAppDatabase chatAppDatabase;
    private SQLiteDatabase sqLiteDatabase;
    public UserRepository(Context context){
        sqLiteDatabase=ChatAppDatabase.getIntance(context).getWrittable();

    }


    public long insert(User user){
        ContentValues contentValues=new ContentValues();
        contentValues.put("name",user.getName());
        contentValues.put("number", user.getNumber());
        contentValues.put("status", user.getStatus());
        return sqLiteDatabase.insert("user",null,contentValues );

    }

}
