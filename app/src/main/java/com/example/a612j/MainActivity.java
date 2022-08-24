package com.example.a612j;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    @SuppressLint("TimberArgCount")
    void initViews(){

        Timber.w("%s", getString());
        Timber.w("%s", getString());


        String foo = "foo";
        String bar = "bar";
        Timber.d("foo" + "bar");
        Timber.d("foo%s", bar);
        Timber.d("%sbar", foo);
        Timber.d("%s%s", foo, bar);


        Timber.d("%s %s", "arg0");
        Timber.d("%s", "arg0", "arg1");
        Timber.tag("tag").d("%s %s", "arg0");
        Timber.tag("tag").d("%s", "arg0", "arg1");

    }

    private String getString() {
        return "foo";
    }
}