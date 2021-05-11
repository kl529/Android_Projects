package com.example.findyourmind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler hd = new Handler();
        Log.d("eee","------------");
        hd.postDelayed(new splashhandler(), 3000);
        Log.d("eee","------------");
    }

    private class splashhandler implements Runnable{
        public void run(){
            Log.d("eee","------------");
            startActivity(new Intent(getApplication(), login.class)); //로딩이 끝난 후, 메인으로 이동
            Log.d("eee","------------");
            splash.this.finish(); // 로딩페이지 Activity stack에서 제거
        }
    }

    @Override
    public void onBackPressed() {
        //초반 플래시 화면에서 넘어갈때 뒤로가기 버튼 못누르게 함
    }
}
