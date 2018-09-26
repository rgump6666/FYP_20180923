package com.example.rgump.fyp_20180923;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.rgump.fyp_20180923.include.Loader;

import java.io.Serializable;

public class LoginActivity extends AppCompatActivity {

    Loader loader;

    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loader = new Loader();
        loader.setContext(this);
        loader.setGlobal();

        btn_login = (Button)findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                loader.my_str = "from login";

                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                Bundle b = new Bundle();
                b.putSerializable("loader", loader);
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        return loader.navigationDrawer.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);

        loader = (Loader) data.getSerializableExtra("loader");
        Toast.makeText(this, loader.my_str, Toast.LENGTH_SHORT).show();

        Intent intent = new Intent();
        intent.putExtra("loader", loader);
        setResult(1,intent);
        finish();
    }

}
