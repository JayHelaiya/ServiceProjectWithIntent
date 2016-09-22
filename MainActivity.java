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
import android.widget.Toast;

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
           /* Intent intent = new Intent(this, MyService.class);

            PendingIntent pendingIntent = PendingIntent.getBroadcast(
                    this.getApplicationContext(), 234324243, intent, 0);
            AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
            alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()
                    + (10 * 1000), pendingIntent);
            Toast.makeText(this, "Alarm set in " + 10 + " seconds",Toast.LENGTH_LONG).show();*/

            Intent serviceIntent = new Intent(this, MyService.class);
            serviceIntent.putExtra("name","jayesh");
            serviceIntent.putExtra("SirName","Helaiya");
            serviceIntent.putExtra("Designation","Java Developer");
            PendingIntent pendingIntent = PendingIntent.getBroadcast(
                    this.getApplicationContext(), 234324243, serviceIntent, 0);
            AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
            alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()
                    + (10 * 1000), pendingIntent);
            Toast.makeText(this, "Alarm set in " + 10 + " seconds", Toast.LENGTH_LONG).show();


        }
    }
}
