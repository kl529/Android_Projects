package com.example.engineering_school;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Calculation extends AppCompatActivity implements View.OnClickListener { // 계산기

    TextView cons = null;
    String oper;
    Double before;
    Double after;
    Double fin;
    Boolean reset = true;
    Boolean pointer = false;

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
                if (pointer == true){
                    cons.setText(""+(Double.parseDouble(cons.getText().toString())*-1));
                }

                else if(pointer == false){
                    cons.setText(""+(Integer.parseInt(cons.getText().toString())*-1));
                }
                break;

            case R.id.percent:
                before = Double.parseDouble(cons.getText().toString());
                oper = "percent";
                reset = true;
                Log.d("뭘까요", pointer.toString());
                break;

            case R.id.divide:
                before = Double.parseDouble(cons.getText().toString());
                oper = "divide";
                reset = true;
                Log.d("뭘까요", pointer.toString());
                break;

            case R.id.multi:
                before = Double.parseDouble(cons.getText().toString());
                oper = "multi";
                reset = true;
                break;

            case R.id.minus:
                before = Double.parseDouble(cons.getText().toString());
                oper = "minus";
                reset = true;
                Log.d("뭘까요", pointer.toString());
                break;

            case R.id.plus:
                before = Double.parseDouble(cons.getText().toString());
                oper = "plus";
                reset = true;
                Log.d("뭘까요", pointer.toString());
                break;

            case R.id.equal:
//                after = Integer.parseInt(cons.getText().toString());
                after = Double.parseDouble(cons.getText().toString());
                if (pointer == false) {
                    if (oper.equals("percent")) {
                        fin = before % after;
                        cons.setText(Integer.toString((int)Math.round(Double.parseDouble(fin.toString()))));
                        reset = true;
                        break;
                    } else if (oper.equals("divide")) {
                        fin = before / after;
                        cons.setText(Integer.toString((int)Math.round(Double.parseDouble(fin.toString()))));
                        reset = true;
                        break;
                    } else if (oper.equals("multi")) {
                        fin = before * after;
                        cons.setText(Integer.toString((int)Math.round(Double.parseDouble(fin.toString()))));
                        reset = true;
                        break;
                    } else if (oper.equals("minus")) {
                        fin = before - after;
                        cons.setText(Integer.toString((int)Math.round(Double.parseDouble(fin.toString()))));
                        reset = true;
                        break;
                    } else if (oper.equals("plus")) {
                        fin = before + after;
                        cons.setText(Integer.toString((int)Math.round(Double.parseDouble(fin.toString()))));
                        reset = true;
                        break;
                    }
                }

                else if(pointer == true){
                    if (oper.equals("percent")) {
                        fin = before % after;
                        cons.setText(fin.toString());
                        reset = true;
                        break;
                    } else if (oper.equals("divide")) {
                        fin = before / after;
                        cons.setText(fin.toString());
                        reset = true;
                        break;
                    } else if (oper.equals("multi")) {
                        fin = before * after;
                        cons.setText(fin.toString());
                        reset = true;
                        break;
                    } else if (oper.equals("minus")) {
                        fin = before - after;
                        cons.setText(fin.toString());
                        reset = true;
                        break;
                    } else if (oper.equals("plus")) {
                        fin = before + after;
                        cons.setText(fin.toString());
                        reset = true;
                        break;
                    }
                }

            case R.id.point:
                pointer = true;
                cons.append(".");
                reset = false;
                break;
        }
    }
}