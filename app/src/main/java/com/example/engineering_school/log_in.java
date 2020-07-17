package com.example.engineering_school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class log_in extends AppCompatActivity implements View.OnClickListener { //로그인 화면

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.submit:
                Log.d("test", "tttt");
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}