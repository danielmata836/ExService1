package com.example.exservice1;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class ServiceAlarms extends Service {
    @Override
    public int onStartCommand(Intent intnent, int flags, int startId){
        Toast.makeText(this, "Service Started", Toast.LENGTH_SHORT).show();
        return START_NOT_STICKY;
    }
    @Override
    public IBinder onBind(Intent intent){
        return null;
    }
}
