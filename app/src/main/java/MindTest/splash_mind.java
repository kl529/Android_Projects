package MindTest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.example.engineering_school.R;

public class splash_mind extends AppCompatActivity { //MindTest 스플래시 화면

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_mind);

        Handler hd = new Handler();
        hd.postDelayed(new splashhandler(), 3000); // 초 계산
    }

    private class splashhandler implements Runnable{
        public void run(){
            startActivity(new Intent(getApplication(), login.class)); //로딩이 끝난 후, 메인으로 이동
            splash_mind.this.finish(); // 로딩페이지 Activity stack에서 제거
        }
    }

    @Override
    public void onBackPressed() {
        //초반 플래시 화면에서 넘어갈때 뒤로가기 버튼 못누르게 함
    }
}