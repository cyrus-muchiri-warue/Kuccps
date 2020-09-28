package com.example.kuccps.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.kuccps.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      showSplashScreen();
    }

    public void showSplashScreen()
    {
        Thread thread=new Thread()
        {
            public void run()
            {
                try {
                    sleep(3*1000);
                    Intent loginIntent=new Intent(getApplicationContext(),Main2Activity.class);
                    startActivity(loginIntent);
                    finish();


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };
        thread.start();
    }
}
