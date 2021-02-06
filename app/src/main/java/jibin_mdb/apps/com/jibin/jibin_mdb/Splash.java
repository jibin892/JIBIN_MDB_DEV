package jibin_mdb.apps.com.jibin.jibin_mdb;

import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import smoovie.apps.com.kayatech.smoovie.R;
import smoovie.apps.com.kayatech.smoovie.ui.Tools;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Tools.setSystemBarColorInt(this, getResources().getColor(R.color.white));



        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                Intent splash=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(splash);
            }
        }, 1000);

    }
}