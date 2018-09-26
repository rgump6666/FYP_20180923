package com.example.rgump.fyp_20180923.include;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;

import com.example.rgump.fyp_20180923.include.NavigationDrawer;

public class Loader {

    public AppCompatActivity context;
    public NavigationDrawer navigationDrawer;

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
