package com.example.short_v4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        EditText i_editText4 = (EditText) findViewById(R.id.editText);
        String editText1_text = i_editText4.getText().toString();
        EditText i_editText3 = (EditText) findViewById(R.id.editText2);
        String editText2_text = i_editText3.getText().toString();
        Switch switch1 = (Switch) findViewById(R.id.switch1);
        boolean switch1_isChecked = switch1.isChecked();

        System.out.println(switch1_isChecked);

        if (switch1_isChecked == true){
            long[] patter = {
                    1000,
                    300,1000,50,1000,50,1000,50,1000,200,100,200,Long.parseLong(editText1_text)*1000,
                    300,1000,50,1000,50,1000,50,1000,200,100,200,Long.parseLong(editText2_text)*1000
            };
            Vibrator vibrator = (Vibrator) this.getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(patter, 1);
            Toast.makeText(MainActivity.this,"渐进式启动",Toast.LENGTH_SHORT).show();
        }
        else {
            long[] patter = {
                    1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
                    200, 100, 200, Long.parseLong(editText1_text)*1000, 300, Long.parseLong(editText2_text)*1000,
            };
            Vibrator vibrator = (Vibrator) this.getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(patter, -1);
            Toast.makeText(MainActivity.this,"点式启动",Toast.LENGTH_SHORT).show();
        }

//        for (long s : patter) {
//            System.out.println(s);
//        }

//        Vibrator vibrator = (Vibrator) this.getSystemService(Context.VIBRATOR_SERVICE);
//        vibrator.vibrate(patter, -1);

//        Toast.makeText(MainActivity.this,"爽不？",Toast.LENGTH_LONG).show();


//        EditText editText2 = (EditText) findViewById(R.id.editText2);
//        String editText2_text = editText2.getText().toString();
//        Toast.makeText(MainActivity.this,editText1_text,Toast.LENGTH_LONG).show();


    }
}
