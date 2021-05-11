package com.example.findyourmind;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class mypage extends Fragment implements View.OnClickListener {

    private ListView itemsListView_done = null;
    private ListView itemsListView_notdone = null;
    private ListViewAdapter adapter;
    private ListViewAdapter adapter2;

    ViewGroup viewGroup;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container, @NonNull Bundle savedInstanceState) {
        viewGroup = (ViewGroup) inflater.inflate(R.layout.activity_mypage,container,false);

        itemsListView_done = (ListView) viewGroup.findViewById(R.id.list_view_items_done);
        ListViewAdapter adapter = new ListViewAdapter(mContext,generateItemList());
        itemsListView_done.setAdapter(adapter);





        itemsListView_done.setOnItemClickListener(listener);

        itemsListView_notdone = (ListView) viewGroup.findViewById(R.id.list_view_items_notdone);
        ListViewAdapter adapter2 = new ListViewAdapter(mContext,generateItemList2());
        itemsListView_notdone.setAdapter(adapter2);

        itemsListView_notdone.setOnItemClickListener(listener);

        return viewGroup;
    }

    //ListView의 아이템 하나가 클릭되는 것을 감지하는 Listener객체 생성 (Button의 OnClickListener와 같은 역할)
    AdapterView.OnItemClickListener listener= new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
            //클릭된 아이템의 위치를 이용하여 데이터인 문자열을 Toast로 출력
//            Toast.makeText(MainActivity.this, Integer.toString(position), Toast.LENGTH_SHORT).show();

            Intent intent;
            switch (position){
                case 0:
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.16personalities.com/ko/%EB%AC%B4%EB%A3%8C-%EC%84%B1%EA%B2%A9-%EC%9C%A0%ED%98%95-%EA%B2%80%EC%82%AC"));
                    startActivity(intent);
                    break;

                case 1:
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://iqtest.so/"));
                    startActivity(intent);
                    break;

                case 2:
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://testharo.com/depression/"));
                    startActivity(intent);
                    break;

                case 3:
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://testharo.com/selective_perception/"));
                    startActivity(intent);
                    break;

                case 4:
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://multiiqtest.com/"));
                    startActivity(intent);
                    break;

                case 5:
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mentalagetest.kr/"));
                    startActivity(intent);
                    break;

                case 6:
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://egogramtest.kr/"));
                    startActivity(intent);
                    break;

                case 7:
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://eqtest.kr/"));
                    startActivity(intent);
                    break;

                case 8:
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://testharo.com/adhd/"));
                    startActivity(intent);
                    break;

                case 9:
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://simritest.com/psychopath"));
                    startActivity(intent);
                    break;

                case 10:
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://simritest.com/narcissism"));
                    startActivity(intent);
                    break;

                case 11:
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://simritest.com/reaction"));
                    startActivity(intent);
                    break;

                case 12:
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://simritest.com/brainside"));
                    startActivity(intent);
                    break;

                case 13:
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kycu.ac.kr/html/counseling/sub04/kycu-counseling1.jsp"));
                    startActivity(intent);
                    break;

                case 14:
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kycu.ac.kr/html/counseling/sub04/kycu-counseling2.jsp"));
                    startActivity(intent);
                    break;

                case 15:
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kycu.ac.kr/html/counseling/sub04/kycu-counseling3.jsp"));
                    startActivity(intent);
                    break;

                case 16:
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kycu.ac.kr/html/counseling/sub04/kycu-counseling4.jsp"));
                    startActivity(intent);
                    break;

                case 17:
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kycu.ac.kr/html/counseling/sub04/kycu-counseling5.jsp"));
                    startActivity(intent);
                    break;

                case 18:
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kycu.ac.kr/html/counseling/sub04/kycu-counseling6.jsp"));
                    startActivity(intent);
                    break;

                case 19:
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kycu.ac.kr/html/counseling/sub04/kycu-counseling8.jsp"));
                    startActivity(intent);
                    break;

                case 20:
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kycu.ac.kr/html/counseling/sub04/kycu-counseling9.jsp"));
                    startActivity(intent);
                    break;

                case 21:
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kycu.ac.kr/html/counseling/sub04/kycu-counseling10.jsp"));
                    startActivity(intent);
                    break;

            }
        }
    };

//    @Override
//    public void onClick(View view) {
//        Intent intent;
//        switch (view.getId()) {
//            case R.id.home:
//                intent = new Intent(mypage.this, MainActivity.class);
//                startActivity(intent);
//                break;
//            case R.id.search:
////                intent = new Intent(MainActivity.this, Vertical_layout.class);
////                startActivity(intent);
//                Log.d("search", "Search 버튼 클릭입니다.");
//                break;
//            case R.id.profile:
//                intent = new Intent(mypage.this, mypage.class);
//                startActivity(intent);
//                break;
//            case R.id.pofile_main:
//                Toast.makeText(mypage.this, "정보를 변경합니다.", Toast.LENGTH_SHORT).show();
//                intent = new Intent(mypage.this, edit_profile.class);
//                startActivity(intent);
//                break;
//        }
//        finish();
//    }

    private ArrayList<ListViewItem> generateItemList(){
        String itemNames[] = getResources().getStringArray(R.array.done_name);
        String itemDescriptions[] = getResources().getStringArray(R.array.done_description);

        ArrayList<ListViewItem> list = new ArrayList<>();

        for (int i = 0; i <itemNames.length; i++){
            list.add(new ListViewItem(itemNames[i], itemDescriptions[i]));
        }
        Log.d("list체크", String.valueOf(list));
        return list;
    }

    private ArrayList<ListViewItem> generateItemList2(){
        String itemNames[] = getResources().getStringArray(R.array.notdone_name);
        String itemDescriptions[] = getResources().getStringArray(R.array.notdone_description);

        ArrayList<ListViewItem> list = new ArrayList<>();

        for (int i = 0; i <itemNames.length; i++){
            list.add(new ListViewItem(itemNames[i], itemDescriptions[i]));
        }

        return list;
    }

    @Override
    public void onClick(View view) {

    }

    private Context mContext;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }
}