package com.example.cleancode.media;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import android.util.Log;


/**
 * Created by user on 16/3/15.
 */
public class MediaQuery {
    public static final String TAG = "MediaQuery";

    final Context mContext;
    final Handler mHandler;

    public MediaQuery(Context context, Handler handler) {
        mContext = context;
        mHandler = handler;
    }

    public void getThumbnails() {
        mHandler.post(new Runnable() {
            @Override
            public void run() {
                getThumbnailsImpl();
            }
        });
    }

    public void getThumbnailsImpl() {
        Log.d(TAG, "getThumbnails");
        Uri uri = MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI;
        String[] projections = {};
        String selection = null;
        String[] selectionArgs = null;
        String sortOrder = null;

        ContentResolver contentResolver = mContext.getContentResolver();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(uri, projections, selection, selectionArgs, sortOrder);

            while(cursor != null && cursor.moveToNext()) {
                int idx = -1;
                int imageId = 0;
                int width = 0;
                int height = 0;
                idx = cursor.getColumnIndex(MediaStore.Images.Thumbnails.IMAGE_ID);
                if(idx != -1) {
                    width = cursor.getInt(idx);
                }
                idx = cursor.getColumnIndex(MediaStore.Images.Thumbnails.WIDTH);
                if(idx != -1) {
                    imageId = cursor.getInt(idx);
                }
                idx = cursor.getColumnIndex(MediaStore.Images.Thumbnails.HEIGHT);
                if(idx != -1) {
                    height = cursor.getInt(idx);
                }

                Log.d(TAG, "imageId=" + imageId + " width=" + width + " height="+height);
            }

        } finally {
            if(cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
    }
}
