package com.example.ex18_sqlite01_12130561;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MysQLiteHelper extends SQLiteOpenHelper {
    static String name;
    static int version;


    public static final String TABLE_COMMENTS = "comments";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_COMMENT = "comment";
    private static final String DATABASE_CREATE = "create table "
            + TABLE_COMMENTS + "(" + COLUMN_ID
            + " integer primary key autoincrement, " + COLUMN_COMMENT
           + " text not null);";
    public MysQLiteHelper(@Nullable Context context)
    {

        super(context,name,null,version);
    }
    public MysQLiteHelper(@Nullable Context context,
                          @Nullable String name,
                          @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //String DATABASE_CREATE = "";
        db.execSQL(DATABASE_CREATE);
    }
 @Override public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
       db.execSQL(DATABASE_CREATE);
    }
}