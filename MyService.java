package com.example.nichetech.serviceforobject;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
/**
 * Created by nichetech on 22/9/16.
 */
public class MyService extends BroadcastReceiver {

    private final static String TAG = "In this method: ";

    @Override
    public void onReceive(Context context, Intent intent) {

        Bundle extras = intent.getExtras();
        String username = extras.getString("username");
        String password = extras.getString("password");

        Log.e(TAG,username);
        Log.e(TAG,password);
        Toast.makeText(context,username, Toast.LENGTH_SHORT).show();

        Toast.makeText(context, "Service has been started..",
                Toast.LENGTH_SHORT).show();
    }
}
