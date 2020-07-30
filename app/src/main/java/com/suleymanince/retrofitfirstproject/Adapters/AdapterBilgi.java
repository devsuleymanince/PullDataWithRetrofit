package com.suleymanince.retrofitfirstproject.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.suleymanince.retrofitfirstproject.Models.Bilgiler;
import com.suleymanince.retrofitfirstproject.R;

import java.util.List;

public class AdapterBilgi extends BaseAdapter {

    List<Bilgiler> list;
    Context context;

    public AdapterBilgi(List<Bilgiler> list, Context context) {
        this.list = list;
        this.context = context;
    }



    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.layout_tek_list,parent,false);

        TextView txtUserId = convertView.findViewById(R.id.txt_user_id);
        TextView txtId = convertView.findViewById(R.id.txt_id);
        TextView txtTitle = convertView.findViewById(R.id.txt_title);
        TextView txtBody = convertView.findViewById(R.id.txt_body);

        txtUserId.setText(""+list.get(position).getUserId());
        txtId.setText(""+list.get(position).getId());
        txtTitle.setText(""+list.get(position).getTitle());
        txtBody.setText(""+list.get(position).getBody());

        return convertView;
    }
}
