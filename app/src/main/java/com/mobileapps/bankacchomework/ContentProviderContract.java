package com.mobileapps.bankacchomework;

import android.content.ContentUris;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.provider.BaseColumns;

public class ContentProviderContract {

        public static final String CONTENT_AUTHORITY = "com.mobileapps.bankacchomework";
        public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
        public static final String PATH_ACC_NAME = "account name";
        public static final String PATH_ACC_HOLDER_NAME = "account holder name";
        public static final String PATH_ACC_OPEN_DATE="account open date";
        public static final String PATH_CURRENT_BALANCE= ".2";//haha he is broke

        public static final class AccountNameEntry implements BaseColumns {
            public static final Uri CONTENT_URI =
                    BASE_CONTENT_URI.buildUpon().appendPath(PATH_ACC_NAME).build();


            public static final String CONTENT_TYPE =
                    "vnd.android.cursor.dir/" + CONTENT_URI  + "/" + PATH_ACC_NAME;
            public static final String CONTENT_ITEM_TYPE =
                    "vnd.android.cursor.item/" + CONTENT_URI + "/" + PATH_ACC_NAME;


            public static final String TABLE_NAME = "accountInfoTable";
            public static final String COLUMN_ACC_NAME = "accountName";
            public static final String COLUMN_HOLDER_NAME = "accountHolderName";
            public static final String COLUMN_OPEN_DATE = "accountOpenDate";
            public static final String COLUMN_CURRENT_BALANCE = "0.2";


            public static Uri buildAccountNameUri(long id){
                return ContentUris.withAppendedId(CONTENT_URI, id);
            }
        }

        public static final class AccountHolderNameEntry implements BaseColumns {
            public static final Uri CONTENT_URI =
                    BASE_CONTENT_URI.buildUpon().appendPath(PATH_ACC_HOLDER_NAME).build();

            public static final String CONTENT_TYPE =
                    "vnd.android.cursor.dir/" + CONTENT_URI + "/" + PATH_ACC_HOLDER_NAME;
            public static final String CONTENT_ITEM_TYPE =
                    "vnd.android.cursor.item/" + CONTENT_URI + "/" + PATH_ACC_HOLDER_NAME;

            public static final String TABLE_NAME = "holderTable";
            public static final String COLUMN_NAME = "holderName";

            public static Uri buildAccountHolderNameUri(long id){
                return ContentUris.withAppendedId(CONTENT_URI, id);
            }
        }

    public static final class AccountOpenDateEntry implements BaseColumns {
        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_ACC_OPEN_DATE).build();

        public static final String CONTENT_TYPE =
                "vnd.android.cursor.dir/" + CONTENT_URI + "/" + PATH_ACC_OPEN_DATE;
        public static final String CONTENT_ITEM_TYPE =
                "vnd.android.cursor.item/" + CONTENT_URI + "/" + PATH_ACC_OPEN_DATE;

        public static final String TABLE_NAME = "openDateTable";
        public static final String COLUMN_NAME = "openDate";

        public static Uri buildOpenDateUri(long id){
            return ContentUris.withAppendedId(CONTENT_URI, id);
        }
    }

    public static final class AccountCurrentBalanceEntry implements BaseColumns {
        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_CURRENT_BALANCE).build();

        public static final String CONTENT_TYPE =
                "vnd.android.cursor.dir/" + CONTENT_URI + "/" + PATH_CURRENT_BALANCE;
        public static final String CONTENT_ITEM_TYPE =
                "vnd.android.cursor.item/" + CONTENT_URI + "/" + PATH_CURRENT_BALANCE;

        public static final String TABLE_NAME = "balanceTable";
        public static final String COLUMN_NAME = "balanceDate";

        public static Uri buildCurrentBalanceUri(long id){
            return ContentUris.withAppendedId(CONTENT_URI, id);
        }
    }
    }

