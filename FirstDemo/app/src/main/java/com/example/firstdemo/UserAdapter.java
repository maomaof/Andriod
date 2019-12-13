package com.example.firstdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class UserAdapter extends ArrayAdapter<UserList> {

    private int resourceId;

    public UserAdapter(Context context, int textViewResourceId, List<UserList> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        UserList userList = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId, parent,false);
        ImageView userImage = (ImageView) view.findViewById(R.id.user_image);
        TextView userName = (TextView) view.findViewById(R.id.user_name);
        userImage.setImageResource(userList.getImageId());
        userName.setText(userList.getName());
        return view;
    }
}