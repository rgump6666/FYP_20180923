package com.example.rgump.fyp_20180923;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.EditText;

import com.example.rgump.fyp_20180923.include.Loader;

public class LoginActivity extends AppCompatActivity {

    Loader loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loader = new Loader();
        loader.setContext(this);
        loader.setGlobal();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        return loader.navigationDrawer.onOptionsItemSelected(item);
    }

}
