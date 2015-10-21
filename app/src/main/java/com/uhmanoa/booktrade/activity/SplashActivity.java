package com.uhmanoa.booktrade.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.uhmanoa.booktrade.R;
import com.uhmanoa.booktrade.utils.Constant;

import cn.bmob.v3.Bmob;


public class SplashActivity extends BaseActivity {
    private static final String APP_KEY = Constant.BMOB_APP_ID;
    private static final long DELAY_TIME = 2000L;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Bmob.initialize(this, APP_KEY);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, DELAY_TIME);
    }
}