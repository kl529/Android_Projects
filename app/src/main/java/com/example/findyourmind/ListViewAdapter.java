package com.example.findyourmind;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<ListViewItem> items;

    public ListViewAdapter(Context context, ArrayList<ListViewItem> items){
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final int pos = position;
        final Context context = parent.getContext();

        if (convertView ==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.layout_list_view_row_items, parent, false);
        }

        ListViewItem currentItem = (ListViewItem)getItem(position);

        TextView textViewItemName = (TextView)convertView.findViewById(R.id.text_view_item_name);
        TextView textViewItemDescription = (TextView)convertView.findViewById(R.id.text_view_item_description);

        textViewItemName.setText(currentItem.getItemName());
        textViewItemDescription.setText(currentItem.getItemDescription());

        return convertView;
    }
}
