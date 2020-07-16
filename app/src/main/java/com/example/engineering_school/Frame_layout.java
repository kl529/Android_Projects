package com.example.engineering_school;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Frame_layout extends AppCompatActivity {

    Button btnTest = null;
    ImageView iv1 = null;
    ImageView iv2 = null;
    ImageView iv3 = null;
    ImageView iv4 = null;
    boolean tt = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);

        btnTest = (Button) findViewById(R.id.btnTest);
        iv1 = (ImageView) findViewById(R.id.iv);
        iv2 = (ImageView) findViewById(R.id.iv2);
        iv3 = (ImageView) findViewById(R.id.iv3);
        iv4 = (ImageView) findViewById(R.id.iv4);

        btnTest.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!tt){
                    Log.i("hey------", Boolean.toString(tt));
                    iv1.setVisibility(View.INVISIBLE);
                    iv2.setVisibility(View.VISIBLE);
                    iv4.setVisibility(View.INVISIBLE);
                    iv3.setVisibility(View.VISIBLE);
                    tt = true;
                }
                else if (tt){
                    Log.i("hey----", Boolean.toString(tt));
                    iv1.setVisibility(View.VISIBLE);
                    iv2.setVisibility(View.INVISIBLE);
                    iv4.setVisibility(View.VISIBLE);
                    iv3.setVisibility(View.INVISIBLE);
                    tt = false;
                }
            }
        });
    }
}