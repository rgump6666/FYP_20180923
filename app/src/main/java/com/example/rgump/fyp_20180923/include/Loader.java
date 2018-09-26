package com.example.rgump.fyp_20180923.include;

import android.support.v7.app.AppCompatActivity;
import java.io.Serializable;

public class Loader implements Serializable {

    public AppCompatActivity context;
    public NavigationDrawer navigationDrawer;

    public String my_str;

    public Loader(){
        navigationDrawer = new NavigationDrawer();
    }

    public void setContext(AppCompatActivity context){
        this.context = context;
    }

    public void setGlobal(){
        setNavigationDrawer();
    }

    public void setNavigationDrawer(){
        navigationDrawer.setContext(context);
        navigationDrawer.setNavigationDrawer();
    }
}
