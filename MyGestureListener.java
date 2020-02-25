package com.example.simplegesterlistener;

import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class MyGestureListener extends GestureDetector.SimpleOnGestureListener {
    private static final String TAG = "Gesture";

    @Override
    public void onLongPress(MotionEvent e) {
        Log.i(TAG, "onLongPress: ");
    }
}
