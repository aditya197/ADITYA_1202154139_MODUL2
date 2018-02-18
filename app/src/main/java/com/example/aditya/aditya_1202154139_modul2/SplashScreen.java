package com.example.aditya.aditya_1202154139_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

/**
 * Created by adity on 2/18/2018.
 */

public class SplashScreen extends AppCompatActivity {
    //membuat value splash
    private static int splashInterval = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override

            public void run() {
                Intent i = new Intent(SplashScreen.this, MenuUtama.class);
                startActivity(i);

                Toast.makeText(SplashScreen.this, "ISTY_1202154299", Toast.LENGTH_LONG).show();

                this.finish();
            }

            private void finish() {
            }
        }, splashInterval);
    } ;
}
