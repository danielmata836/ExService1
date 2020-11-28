package com.example.exservice1;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class ServiceAlarms extends Service {
    //---Implementação anterior que bloqueava a thread principal---
    //desta maneira com o onStartCommand, a aplicação ficava bloqueada
    // enquanto o serviço estava ativo.
    /*try{
        Thread.sleep(7000);
    } catch (InterruptedException e) {
        Log.e("SERVICEALARMS", "Interrupted Exception");
    }
    Toast.makeText(this, "Service Started", Toast.LENGTH_SHORT).show();

    return START_NOT_STICKY; */
    Handler oHandler;
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        oHandler = new Handler();
        new Thread() {
            public void run() {
                for (int i = 0; i < 4; i++) {//número de vezes que a toast é apresentada
                    Runnable oRun = new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(ServiceAlarms.this, "Service Started!", Toast.LENGTH_SHORT).show();
                        }
                    };
                    oHandler.post(oRun);
                    try {
                        Thread.sleep(5000);//intervalo entre cada uma das vezes que a toast é mostrada
                    } catch (InterruptedException oIE) {
                        Log.e("SERVICEALARMS", "Interrupted Exception");
                    }
                }
            }
        }.start();
        return START_NOT_STICKY;
    }
    @Override
    public IBinder onBind(Intent intent){
        return null;
    }
}
