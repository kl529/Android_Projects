package com.example.engineering_school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.btn1:
                intent= new Intent(this, Button_control.class);
                startActivity(intent);
                break;
            case R.id.btn2:
                intent= new Intent(MainActivity.this, Vertical_layout.class);
                startActivity(intent);
                break;
            case R.id.btn3:
                intent= new Intent(MainActivity.this, Horizontal_layout.class);
                startActivity(intent);
                break;
            case R.id.btn4:
                intent= new Intent(MainActivity.this, threetothree_layout.class);
                startActivity(intent);
                break;
            case R.id.btn5:
                intent= new Intent(MainActivity.this, threetothree_button.class);
                startActivity(intent);
                break;
            case R.id.btn6:
                intent= new Intent(MainActivity.this, Calculation.class);
                startActivity(intent);
                break;
            case R.id.btn7:
                intent= new Intent(MainActivity.this, log_in.class);
                startActivity(intent);
                break;
            case R.id.btn8:
                intent= new Intent(MainActivity.this, Frame_layout.class);
                startActivity(intent);
                break;
            case R.id.btn9:
                intent= new Intent(MainActivity.this, Timer.class);
                startActivity(intent);
                break;
        }
    }
}