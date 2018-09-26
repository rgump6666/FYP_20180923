package com.example.rgump.fyp_20180923.include;

import android.support.v7.app.AppCompatActivity;
import java.io.Serializable;

public class Loader implements Serializable {

    public transient AppCompatActivity context;
    public transient NavigationDrawer navigationDrawer;

    public Loader(){}

    public void setContext(AppCompatActivity context){
        this.context = context;
    }

    public void setGlobal(){
        setNavigationDrawer();
    }

    public void setNavigationDrawer(){
        navigationDrawer = new NavigationDrawer();
        navigationDrawer.setContext(context);
        navigationDrawer.setNavigationDrawer();
    }
}
