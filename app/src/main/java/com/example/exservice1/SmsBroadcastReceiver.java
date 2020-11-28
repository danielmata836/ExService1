package com.example.exservice1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;
/*
Para enviar uma mensagem para o dispositivo Android Emulado,
 basta abrir as opções avançadas no menu do emulador e abrir "Phone",
 de seguida escrever a SMS (short message service) e enviar.
 */
public class SmsBroadcastReceiver extends BroadcastReceiver {
    public static final String SMS_BUNDLE = "pdus";

    public void onReceive(Context context, Intent intent){
       
    }
}
