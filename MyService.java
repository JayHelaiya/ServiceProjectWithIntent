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
        String name = extras.getString("name");
        String SirName = extras.getString("SirName");
        String Designation = extras.getString("Designation");

        Log.e(TAG,name);
        Log.e(TAG,SirName);
        Log.e(TAG,Designation); Toast.makeText(context, name,
                Toast.LENGTH_SHORT).show();

        Toast.makeText(context, "Service has been started..",
                Toast.LENGTH_SHORT).show();
    }
}
