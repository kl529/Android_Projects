package mains;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import calculation.Calculation;
import com.example.engineering_school.R;
import functions.Timer;

import layout.Button_control;
import layout.Frame_layout;
import layout.Horizontal_layout;
import layout.Vertical_layout;
import layout.threetothree_button;
import layout.threetothree_layout;
import views.textviews1;
import views.textviews2;

public class MainActivity extends AppCompatActivity implements View.OnClickListener { //메인 테이블레이아웃

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
            case R.id.btn10:
                intent= new Intent(MainActivity.this, textviews1.class);
                startActivity(intent);
                break;
            case R.id.btn11:
                intent= new Intent(MainActivity.this, textviews2.class);
                startActivity(intent);
                break;
        }
    }
}