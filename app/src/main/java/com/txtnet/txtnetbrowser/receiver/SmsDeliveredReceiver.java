package com.txtnet.txtnetbrowser.receiver;

import static com.txtnet.txtnetbrowser.R.string.smsNotDeliveredMessage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.txtnet.txtnetbrowser.R;

public class SmsDeliveredReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent arg1) {
        switch (getResultCode()) {
            case Activity.RESULT_OK:
                //Toast.makeText(context, "SMS delivered", Toast.LENGTH_SHORT).show();
                break;
            case Activity.RESULT_CANCELED:
                Toast.makeText(context, smsNotDeliveredMessage, Toast.LENGTH_SHORT).show();
                break;
        }
    }
}