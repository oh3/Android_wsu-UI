package com.example.registeration2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class IntroActivity extends AppCompatActivity {

    //인트로 기능구현
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro_activity); //xml , java 소스 연결
        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent intent = new Intent (getApplicationContext(), LoginActivity.class);
                startActivity(intent); //인트로 실행 후 바로 LoginActivity 넘어감.
                finish();
            }
        },1000); //2초 후 인트로 실행
    }

    @Override
    protected void onPause(){
        super.onPause();
        finish();
    }

}
