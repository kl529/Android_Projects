package com.example.findyourmind;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity implements View.OnClickListener {

    int user_count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        Context mContext = this;
        EditText address = (EditText) findViewById(R.id.address);
        EditText password = (EditText) findViewById(R.id.password);
        Log.d("아이디 생성완료","미리 2개");
        String add = address.getText().toString();
        Log.d("아이디 생성완료","add");
        String pass = password.getText().toString();
        Log.d("아이디 생성완료","pass");

        switch (view.getId()) {
            case R.id.log:

                String ad_input = loginManager.getString(mContext, Integer.toString(user_count));
                String ps_input = loginManager.getString(mContext, Integer.toString(user_count));

//                for (int i=0; i<=100; i++){ //아이디 비밀번호 등록 구현중 실패
//
//                    if((ad_input.equals(Integer.toString(i))) & (ps_input.equals(Integer.toString(i))) & () & () )

                    if (ad_input.equals("")  && ps_input.equals("")) {

                        Toast.makeText(login.this, "정보가 없습니다. 아이디를 생성합니다.", Toast.LENGTH_SHORT).show();

                        loginManager.setString(mContext, Integer.toString(user_count), address.getText().toString());
                        loginManager.setString(mContext, Integer.toString(user_count), password.getText().toString());
                        user_count = user_count + 1;

                        Log.d("아이디 생성완료","아이디 생성완료");
                    }

                    else{
                        Toast.makeText(login.this, "정보가 있습니다. 로그인을 실행합니다.", Toast.LENGTH_SHORT).show();
                    }

                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id. findid:
                intent = new Intent(this, Traffic.class);
                startActivity(intent);
                break;

            case R.id.signup:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.naver:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.facebook:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.kakao:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.google:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.login_no_id:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
        }

        finish();
    }
}
