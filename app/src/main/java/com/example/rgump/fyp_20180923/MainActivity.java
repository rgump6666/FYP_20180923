package com.example.rgump.fyp_20180923;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.rgump.fyp_20180923.include.Loader;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    Loader loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getPassedParameter();

        Toast.makeText(this, loader.my_str, Toast.LENGTH_SHORT).show();

        loader.setContext(this);
        loader.setGlobal();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        return loader.navigationDrawer.onOptionsItemSelected(item);
    }

    private void getPassedParameter(){
        Bundle b = getIntent().getExtras();
        if(b != null) {
            loader = (Loader) b.getSerializable("loader");
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        Intent intent = new Intent();

        loader.my_str = "from main";

        intent.putExtra("loader", loader);
        setResult(1,intent);
        finish();
    }

}
