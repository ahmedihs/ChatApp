package com.techyahmed.chatapp.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by muhammad.ahmed@ihsinformatics.com on 12-Nov-15.
 */
public class ChatAppDatabase extends SQLiteOpenHelper {

   // private static SQLiteDatabase database;
    private static ChatAppDatabase chatApp;
    private static final  String DBNAME ="chatapp";
    private static final  int version =1;
    private static final String USERTABLE="CREATE TABLE USER (_userid int pk autoincrement, name varchar(50) not null , number varchar(20) not null , status varchar(200)  ) ";
    private static final String CONTACTTABLE="create table contact (_cid int pk autoincrement , name varchar(50), status varchar(200),number1 varchar(20), number2 varchar(20) ,number3 varchar(20),number4 varchar(20))";
    private static final String CONVERSATIONTABLE="create conversation (_id int pk autoincrement , sender varchar(20) not null ,msg varchar(500))";


    private ChatAppDatabase(Context context) {
        super(context, DBNAME, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL(USERTABLE);
        db.execSQL(CONTACTTABLE);
        db.execSQL(CONVERSATIONTABLE);

        //SQLiteDatabase.CursorFactory cursorFactory;
        //this.
        //db.execSQL();
   // getWritableDatabase()
        //super();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


    public static ChatAppDatabase getIntance(Context context){
        if(chatApp==null){
            chatApp=new ChatAppDatabase(context);

        }

        return chatApp;
    }

    public SQLiteDatabase getWrittable(){

        return chatApp.getWrittable();


    }





}
