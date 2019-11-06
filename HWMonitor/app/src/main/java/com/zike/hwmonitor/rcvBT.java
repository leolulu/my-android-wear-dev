package com.zike.hwmonitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.widget.Toast;

public class rcvBT extends BroadcastReceiver
{
    private static final String ACL_DISCONNECTED
            = "android.bluetooth.device.action.ACL_DISCONNECTED";
    private static final String ACL_CONNECTED
            = "android.bluetooth.device.action.ACL_CONNECTED";

    private static final String STR_BT_DISCNN = "手机连接断开！！";
    private static final String STR_BT_CNN = "手机已连接";

    private static final int BT_CNN_STATE_DISCNN = 0,BT_CNN_STATE_CNN = 1;

    //Vib on the watch in two modes which can be changed to whaterver you want
    private void vibration(int MODE,Context context)
    {
        Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        if (BT_CNN_STATE_DISCNN == MODE)
        {
            //Disconnected, Vib 5 seconds
            vibrator.vibrate(5000);
        }
        else
        {
            //Connected
            long[] pat={100,200,100,300,100,400,100,500};
            vibrator.vibrate(pat,-1);
        }
    }
    @Override
    public void onReceive(Context context, Intent intent)
    {

        if (intent.toString().contains(ACL_DISCONNECTED))
        {
            //if the message contains "android.bluetooth.device.action.ACL_DISCONNECTED"
            // which means the connection is broken, toast a message and vib
            Toast.makeText(context,STR_BT_DISCNN,
                    Toast.LENGTH_LONG).show();
            vibration(BT_CNN_STATE_DISCNN,context);
        }
        else if (intent.toString().contains(ACL_CONNECTED))
        {
            Toast.makeText(context, STR_BT_CNN ,
                    Toast.LENGTH_LONG).show();
            vibration(BT_CNN_STATE_CNN,context);
        }

    }
}
