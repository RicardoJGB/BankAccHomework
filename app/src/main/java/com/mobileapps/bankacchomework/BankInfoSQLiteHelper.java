package com.mobileapps.bankacchomework;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BankInfoSQLiteHelper {

    public class MovieDatabaseSQLiteHelper extends SQLiteOpenHelper {

        private static final int DATABASE_VERSION = 1;
        private static final String DATABASE_NAME = "accountInfo.db";

        public MovieDatabaseSQLiteHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            addAccountNameTable(sqLiteDatabase);
            addInfoTable(sqLiteDatabase);

        }

        private void addAccountNameTable(SQLiteDatabase db){
            db.execSQL(
                    "CREATE TABLE " + ContentProviderContract.AccountNameEntry.TABLE_NAME + " (" +
                            ContentProviderContract.AccountNameEntry._ID + " INTEGER PRIMARY KEY, " +
                            ContentProviderContract.AccountNameEntry.COLUMN_ACC_NAME + " TEXT UNIQUE NOT NULL);"
            );
        }

        private void addInfoTable(SQLiteDatabase db){
            db.execSQL(
                    "CREATE TABLE " + ContentProviderContract.AccountHolderNameEntry.TABLE_NAME + " (" +
                            ContentProviderContract.AccountHolderNameEntry._ID + " INTEGER PRIMARY KEY, " +
                            ContentProviderContract.AccountNameEntry.COLUMN_ACC_NAME + " TEXT NOT NULL, " +
                            ContentProviderContract.AccountHolderNameEntry.COLUMN_NAME+ " TEXT NOT NULL, " +
                            ContentProviderContract.AccountNameEntry.COLUMN_ACC_NAME + " INTEGER NOT NULL, " +
                            "FOREIGN KEY (" + ContentProviderContract.AccountNameEntry.COLUMN_ACC_NAME + ") " +
                            "REFERENCES " + ContentProviderContract.AccountNameEntry.TABLE_NAME
                            + " (" + ContentProviderContract.AccountHolderNameEntry._ID + "));"
            );
        }
        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        }
    }

}
