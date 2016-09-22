package com.example.nichetech.serviceforobject;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity
        implements OnClickListener {

    private final static String TAG = "In this method: ";
    private Button startSerivce = null;
    private Button stopSerivce = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        startSerivce = (Button) findViewById(R.id.buttonStart);
        startSerivce.setOnClickListener(this);
        stopSerivce = (Button) findViewById(R.id.buttonStop);
        stopSerivce.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (startSerivce == v) {
            Log.i(TAG, "Activity starting service..");

            Log.i(TAG, "Activity starting service..");
            Intent serviceIntent = new Intent(this, MyService.class);
            serviceIntent.putExtra("username","jayesh");
            serviceIntent.putExtra("password","Helaiya");
            PendingIntent pendingIntent = PendingIntent.getBroadcast(
                    this.getApplicationContext(), 234324243, serviceIntent, 0);
            AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
            alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()
                    + (1800 * 1000),(1800 * 1000), pendingIntent);

        }
    }
}
