package com.example.engineering_school;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Button_control extends AppCompatActivity {


    Button btnTest = null;
    TextView tvTest = null;
    boolean tt = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_control);
    }

    public void onClick(View v) {

        tvTest = (TextView)findViewById(R.id.tvTest);

        switch (v.getId())
        {
            case R.id.btnTest:
                Toast.makeText(getApplicationContext(),"test", Toast.LENGTH_SHORT).show();
                Log.d( "hey1" ,Boolean.toString(tt));

                if (tt == false){
                    tvTest.setText("Odd");
                    tt = true;
                }

                else if (tt){
                    tvTest.setText("Even");
                    tt = false;
                }
                break;
        }
    }
}