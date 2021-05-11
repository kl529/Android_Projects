package com.example.findyourmind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class edit_profile extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.home:
                intent = new Intent(edit_profile.this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.search:
//                intent = new Intent(MainActivity.this, Vertical_layout.class);
//                startActivity(intent);
                Log.d("search", "Search 버튼 클릭입니다.");
                break;
            case R.id.profile:
                intent = new Intent(edit_profile.this, mypage.class);
                startActivity(intent);
                break;
            case R.id.cancel:
                Toast.makeText(edit_profile.this, "취소합니다", Toast.LENGTH_SHORT).show();
                intent = new Intent(edit_profile.this, mypage.class);
                startActivity(intent);
                break;

            case R.id.submit:
                Toast.makeText(edit_profile.this, "변경되었습니다", Toast.LENGTH_SHORT).show();
                intent = new Intent(edit_profile.this, mypage.class);
                startActivity(intent);
                break;

        }
        finish();
    }
}