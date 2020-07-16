package com.example.engineering_school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;

public class Timer extends AppCompatActivity {

    TextView tvNum;
    int count = 30;
    Intent intent;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 50; i++) { // 현재 UI 스레드가 아니기 때문에 메시지 큐에 Runnable을 등록 함
                    count--;
//                    runOnUiThread(new Runnable() {
//                        public void run() { // 메시지 큐에 저장될 메시지의 내용
//                            tvNum.setText("" + count);
//                        }
//                    });
//                    handler.post(new Runnable() {
//                        @Override
//                        public void run() {
//                            tvNum.setText("" + count);
//                        }
//                    });

                    Message msg = handler.obtainMessage();
                    msg.arg1 = count;
                    handler.sendMessage(msg);
                    Log.d("help***************", Integer.toString(count));
//                    tvNum.setText("page out : " + count +"s");
                    tvNum.setText(count);

                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (count == 0){
                        break;
                    }
                }

                intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        MainActivity.class); // 다음 넘어갈 클래스 지정
                startActivity(intent); // 다음 화면으로 넘어간다
                finish();
            }
        }).start();
    }
}