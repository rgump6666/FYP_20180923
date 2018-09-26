package com.example.rgump.fyp_20180923.include;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.rgump.fyp_20180923.R;

public class NavigationDrawer {

    public AppCompatActivity context;

    public DrawerLayout dl;
    public ActionBarDrawerToggle t;
    public NavigationView nv;

    public void setContext(AppCompatActivity context){
        this.context = context;
    }

    public void setNavigationDrawer(){

        dl = (DrawerLayout)context.findViewById(R.id.page_main);
        t = new ActionBarDrawerToggle(context, dl, R.string.Open, R.string.Close);

        dl.addDrawerListener(t);
        t.syncState();

        context.getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nv = (NavigationView)context.findViewById(R.id.include_nav);

        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch(id)
                {
                    case R.id.account:
                        Toast.makeText(context, "My Account",Toast.LENGTH_SHORT).show();
                    case R.id.settings:
                        Toast.makeText(context, "Settings",Toast.LENGTH_SHORT).show();
                    case R.id.mycart:
                        Toast.makeText(context, "My Cart",Toast.LENGTH_SHORT).show();
                    default:
                        return true;
                }




            }
        });

    }

    public boolean onOptionsItemSelected(MenuItem item) {

        if(t.onOptionsItemSelected(item))
            return true;

        return context.onOptionsItemSelected(item);

    }
}
