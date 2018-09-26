package com.example.rgump.fyp_20180923.include;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Function {

    public void onBackPressed(AppCompatActivity context, Loader loader) {
        Intent intent = new Intent();

        intent.putExtra("loader", loader);
        context.setResult(0,intent);
        context.finish();
    }

    public Loader onActivityResult(int requestCode, int resultCode, Intent data)
    {
        return (Loader) data.getSerializableExtra("loader");
    }

    public Loader getPassedParameter(AppCompatActivity context){
        Bundle b = context.getIntent().getExtras();
        if(b != null) {
            return (Loader) b.getSerializable("loader");
        }

        return null;
    }
}
