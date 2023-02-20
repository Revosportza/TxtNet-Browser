package com.txtnet.txtnetbrowser.receiver;

import static com.txtnet.txtnetbrowser.R.string.SMSGenericFail;
import static com.txtnet.txtnetbrowser.R.string.SMSNP;
import static com.txtnet.txtnetbrowser.R.string.SMSNoServ;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsManager;
import android.widget.Toast;

import com.txtnet.txtnetbrowser.R;

public class SmsSentReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        switch (getResultCode()) {
            case Activity.RESULT_OK:
              //  Toast.makeText(context,
              //          "SMS Sent" + intent.getIntExtra("object", 0),
              //          Toast.LENGTH_SHORT).show();

                break;
            case SmsManager.RESULT_ERROR_GENERIC_FAILURE:
                Toast.makeText(context, SMSGenericFail, Toast.LENGTH_SHORT)
                        .show();

                break;
            case SmsManager.RESULT_ERROR_NO_SERVICE:
                Toast.makeText(context, SMSNoServ, Toast.LENGTH_SHORT)
                        .show();

                break;
            case SmsManager.RESULT_ERROR_NULL_PDU:
                Toast.makeText(context, SMSNP, Toast.LENGTH_SHORT).show();
                break;
            case SmsManager.RESULT_ERROR_RADIO_OFF:
                Toast.makeText(context, R.string.SMSRadio, Toast.LENGTH_SHORT).show();
                break;
        }
    }
} //TODO: Fix the above and make them useful eg. loading animation! Or failure message.