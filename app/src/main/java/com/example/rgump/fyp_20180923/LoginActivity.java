package com.example.rgump.fyp_20180923;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rgump.fyp_20180923.include.Loader;

public class LoginActivity extends AppCompatActivity {

    Loader loader = new Loader();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
