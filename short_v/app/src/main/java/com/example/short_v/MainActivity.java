package com.example.short_v;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends WearableActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Toast.makeText(MainActivity.this,"开始短振动！！！",Toast.LENGTH_LONG).show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.text);

        // Enables Always-on
        setAmbientEnabled();
    }
}
