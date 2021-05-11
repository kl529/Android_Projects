package com.example.findyourmind;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Map;


public class VollyActivity extends AppCompatActivity implements View.OnClickListener{
    RequestQueue requestQueue;
    String TAG = this.getClass().getSimpleName();
    @BindView(R.id.btnVolly) Button btnVolly;
    @BindView(R.id.btnadd) Button btnadd;
    @BindView(R.id.ivView) ImageView ivView;
    @BindView(R.id.nameget) TextView name;
    @BindView(R.id.psget) TextView name2;
    private Context context = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volly2);
        context = this;
        requestQueue = Volley.newRequestQueue(getApplicationContext());
        ButterKnife.bind(this);
        btnVolly.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnVolly:
                sendRequest();
                break;

            case R.id.btnadd:
                Log.d("1", "00000000000");
                addRequest();
                break;
            default:
                break;
        }
    }

    private void addRequest(){
//        String url = "http://10.0.2.2:1337/userinfos";
//        StringRequest request = new StringRequest(
//                Request.Method.POST,
//                url,
//                new Response.Listener<String>(){
//                    @Override
//                    public void onResponse(String response) {
//                        processRequest(response);
//                        Log.d("11111", "첫번째");
//                    }
//                },
//                new Response.ErrorListener(){
//                    @Override
//                    public void onErrorResponse(VolleyError error){
//                        Log.i("error message",error.getMessage());
//                    }
//                }
//        ) {
//                @Override
//                protected Map<String, String> getParams() throws AuthFailureError {
//                Map<String, String> params = new HashMap<>();
//                params.put("username", "testname");
//                params.put("userps", "9999")
//
//                return params;
//            }
//        };
//
//        requestPost.setShouldCache(false);
//        AppHelper.requestQueue.add(requestPost);
    }

    //-----------------------------------------------

    public void sendRequest(){
        String url = "http://10.0.2.2:1337/userinfos/1";
        JsonObjectRequest request = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
//                        String data = response.toString();
                        Log.d(TAG, "응답 => " + response.toString());
                        Hamburger hamburger = new Hamburger();
                        try {
                            Log.d("1", "햄버거 생성1.5");
//                            hamburger.setImage((String) response.get("sagin")); //이미지
//                            hamburger.setName((String) response.get("Name"));
//                            hamburger.setName((String) response.get("username"));

                            Log.d("1", "햄버거 생성2");

//                            Glide.with(context).load(hamburger.getImage()).into(ivView);//이미지

                            name.setText((String) response.get("username"));
                            name2.setText((String) response.get("userps"));

                            Log.d("1", "햄버거 생성3");
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        btnVolly.setText("");
                        Log.d("1", "햄버거 생성4");
                    }
                },
                        new Response.ErrorListener(){
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Log.d(TAG,"에러 => "+ error.getMessage());
                            }
                        }
                ){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<String, String>();
                return params;
            }
        };
        request.setShouldCache(false);
        requestQueue.add(request);
        Log.d(TAG, "요청 보냄!!");
    }
}