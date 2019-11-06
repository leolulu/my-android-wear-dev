package com.example.short_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view) {
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        String editText1_text = editText1.getText().toString();
//        EditText editText2 = (EditText) findViewById(R.id.editText2);
//        String editText2_text = editText2.getText().toString();
        Toast.makeText(MainActivity.this,editText1_text,Toast.LENGTH_LONG).show();
//        Toast.makeText(MainActivity.this,editText2_text,Toast.LENGTH_LONG).show();
    }
}
