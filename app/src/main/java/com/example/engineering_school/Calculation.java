package com.example.engineering_school;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Calculation extends AppCompatActivity implements View.OnClickListener {

    TextView cons = null;
    String oper;
    Integer before;
    Integer after;
    Integer fin;
    Boolean reset = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation);
    }

    @Override
    public void onClick(View view) {
        cons = (TextView) findViewById(R.id.board_tv);
        switch (view.getId()) {
            case R.id.zero:
                if (reset == true) {
                    cons.setText("0");
                    reset = true;
                } else {
                    cons.append("0");
                }
                break;

            case R.id.one:
                if (reset == true) {
                    cons.setText("1");
                    reset = false;
                } else {
                    cons.append("1");
                }
                break;

            case R.id.two:
                if (reset == true) {
                    cons.setText("2");
                    reset = false;
                } else {
                    cons.append("2");
                }
                break;

            case R.id.three:
                if (reset == true) {
                    cons.setText("3");
                    reset = false;
                } else {
                    cons.append("3");
                }
                break;

            case R.id.four:
                if (reset == true) {
                    cons.setText("4");
                    reset = false;
                } else {
                    cons.append("4");
                }
                break;

            case R.id.five:
                if (reset == true) {
                    cons.setText("5");
                    reset = false;
                } else {
                    cons.append("5");
                }
                break;

            case R.id.six:
                if (reset == true) {
                    cons.setText("6");
                    reset = false;
                } else {
                    cons.append("6");
                }
                break;

            case R.id.seven:
                if (reset == true) {
                    cons.setText("7");
                    reset = false;
                } else {
                    cons.append("7");
                }
                break;

            case R.id.eight:
                if (reset == true) {
                    cons.setText("8");
                    reset = false;
                } else {
                    cons.append("8");
                }
                break;

            case R.id.nine:
                if (reset == true) {
                    cons.setText("9");
                    reset = false;
                } else {
                    cons.append("9");
                }
                break;

            case R.id.C:
                cons.setText("0");
                reset = true;
                break;

            case R.id.plus_minus:
                String mi = "-";
                if (Double.parseDouble((String) cons.getText()) > 0) {
                    cons.setText(mi.concat((String) cons.getText()));
                } else {
                    cons.setText(Integer.toString(Math.abs(Integer.parseInt((String) cons.getText()))));
                }
                break;

            case R.id.percent:
                break;

            case R.id.divide:
                break;

            case R.id.multi:
                break;

            case R.id.minus:
                break;

            case R.id.plus:
                break;

            case R.id.equal:
                break;

            case R.id.point:
                break;
        }
    }
}