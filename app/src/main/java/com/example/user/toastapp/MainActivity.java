package com.example.user.toastapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.duration;

public class MainActivity extends AppCompatActivity {

    int count=0;
    TextView tv;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showToast(View view) {
        String msg = "Hello Toast!";
        Toast toast = Toast.makeText(
                this, msg, Toast.LENGTH_SHORT);
        toast.show();
        countClick();
    }
    public void showCount(View v)
    {
        tv = (TextView ) findViewById(R.id.show_count);
        String s="No.of Clicks : "+count;
        tv.setText(s);
    }
    public void countClick()
    {
        count++;
    }
}

