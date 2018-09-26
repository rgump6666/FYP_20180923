package com.example.rgump.fyp_20180923;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.rgump.fyp_20180923.include.Function;
import com.example.rgump.fyp_20180923.include.Loader;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    Function function = new Function();
    Loader loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getPassedParameter();

        loader.setContext(this);
        loader.setGlobal();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        return loader.navigationDrawer.onOptionsItemSelected(item);
    }




    private void getPassedParameter(){
        loader = function.getPassedParameter(this);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        loader = function.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onBackPressed() {
        function.onBackPressed(this, loader);
    }

}
