package MindTest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.engineering_school.R;

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

        switch (view.getId()) {
            case R.id.log:
                intent = new Intent(this, MindTest.main_page.class);
                startActivity(intent);
                break;

            case R.id. findid:
                intent = new Intent(this, MindTest.main_page.class);
                startActivity(intent);
                break;

            case R.id.signup:
                intent = new Intent(this, MindTest.main_page.class);
                startActivity(intent);
                break;

            case R.id.naver:
                intent = new Intent(this, MindTest.main_page.class);
                startActivity(intent);
                break;

            case R.id.facebook:
                intent = new Intent(this, MindTest.main_page.class);
                startActivity(intent);
                break;

            case R.id.kakao:
                intent = new Intent(this, MindTest.main_page.class);
                startActivity(intent);
                break;

            case R.id.google:
                intent = new Intent(this, MindTest.main_page.class);
                startActivity(intent);
                break;

            case R.id.login_no_id:
                intent = new Intent(this, MindTest.main_page.class);
                startActivity(intent);
                break;
        }
        finish();
    }
}
