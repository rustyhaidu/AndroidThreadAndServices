package com.example.myapplication;

import android.os.Looper;
import android.util.Log;

public class DownloadThread extends Thread {
    private static final String TAG = DownloadThread.class.getSimpleName();
    public DownloadHandler mHandler;

    public void run() {
        Looper.prepare();
        mHandler = new DownloadHandler();
        Looper.loop();
    }


}
