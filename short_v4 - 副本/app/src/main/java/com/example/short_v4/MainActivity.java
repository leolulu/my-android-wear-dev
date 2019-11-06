package com.example.short_v4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Toast.makeText(MainActivity.this,"~呵呵~",Toast.LENGTH_SHORT).show();

        EditText i_editText4 = (EditText) findViewById(R.id.editText4);
        String editText1_text = i_editText4.getText().toString();
        EditText i_editText3 = (EditText) findViewById(R.id.editText3);
        String editText2_text = i_editText3.getText().toString();

        long[] patter = {
                1000,
                200, 10, 200, Long.parseLong(editText1_text)*1000, 200, Long.parseLong(editText2_text)*1000,
                200, 10, 200, Long.parseLong(editText1_text)*1000, 200, Long.parseLong(editText2_text)*1000,
                200, 10, 200, Long.parseLong(editText1_text)*1000, 200, Long.parseLong(editText2_text)*1000,
                200, 10, 200, Long.parseLong(editText1_text)*1000, 200, Long.parseLong(editText2_text)*1000,
                200, 10, 200, Long.parseLong(editText1_text)*1000, 200, Long.parseLong(editText2_text)*1000,
                200, 10, 200, Long.parseLong(editText1_text)*1000, 200, Long.parseLong(editText2_text)*1000,
                200, 10, 200, Long.parseLong(editText1_text)*1000, 200, Long.parseLong(editText2_text)*1000,
                200, 10, 200, Long.parseLong(editText1_text)*1000, 200, Long.parseLong(editText2_text)*1000,
                200, 10, 200, Long.parseLong(editText1_text)*1000, 200, Long.parseLong(editText2_text)*1000,
                200, 10, 200, Long.parseLong(editText1_text)*1000, 200, Long.parseLong(editText2_text)*1000
        };

        for (long s : patter) {
            System.out.println(s);
        }

        Vibrator vibrator = (Vibrator) this.getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(patter, -1);

        Toast.makeText(MainActivity.this,"爽不？",Toast.LENGTH_LONG).show();


//        EditText editText2 = (EditText) findViewById(R.id.editText2);
//        String editText2_text = editText2.getText().toString();
//        Toast.makeText(MainActivity.this,editText1_text,Toast.LENGTH_LONG).show();


    }
}
