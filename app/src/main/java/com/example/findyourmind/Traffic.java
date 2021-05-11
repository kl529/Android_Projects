package com.example.findyourmind;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class Traffic extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    Fragment menu1;
    Fragment menu2;
    Fragment menu3;
    Fragment menu4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traffic);
        bottomNavigationView = findViewById(R.id.bottom_navigation_view);

        menu1 = new MainActivity();
        menu2 = new search();
        menu3 = new mypage();
        menu4 = new friend_info_list();

        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, menu1).commitAllowingStateLoss();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) { //menu_bottom.xml에서 지정해줬던 아이디 값을 받아와서 각 아이디값마다 다른 이벤트를 발생시킵니다.
                    case R.id.page_1: {
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, menu1).commitAllowingStateLoss();
                        return true;
                    }
                    case R.id.page_2: {
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, menu2).commitAllowingStateLoss();
                        return true;
                    }
                    case R.id.page_3: {
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, menu3).commitAllowingStateLoss();
                        return true;
                    }
                    case R.id.page_4: {
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, menu4).commitAllowingStateLoss();
                        return true;
                    }

                    default:
                        return false;
                }
            }
        });
    }
}