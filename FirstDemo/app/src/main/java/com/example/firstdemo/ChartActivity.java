package com.example.firstdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ChartActivity extends AppCompatActivity {

    private List<UserList> userList =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart);
        initUserList();
        UserAdapter adapter = new UserAdapter(ChartActivity.this, R.layout.user_item, userList);
        ListView listView =  (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                UserList user = userList.get(position);
                Toast.makeText(ChartActivity.this, "You Select "+user.getName(), Toast.LENGTH_SHORT).show();;
            }
        });
    }

    private void initUserList(){
        for(int i = 0; i < 2; i++){
            UserList user1 = new UserList("Apple", R.drawable.user1_pic);
            userList.add(user1);
            UserList user2 = new UserList("Banana", R.drawable.user2_pic);
            userList.add(user2);
            UserList user3 = new UserList("Orange", R.drawable.user3_pic);
            userList.add(user3);
            UserList user4 = new UserList("Watermelon", R.drawable.user4_pic);
            userList.add(user4);
            UserList user5 = new UserList("Grape", R.drawable.user5_pic);
            userList.add(user5);
            UserList user6 = new UserList("Pineapple", R.drawable.user6_pic);
            userList.add(user6);
            UserList user7 = new UserList("Strawberry", R.drawable.user7_pic);
            userList.add(user7);
            UserList user8 = new UserList("Cherry", R.drawable.user8_pic);
            userList.add(user8);
            UserList user9 = new UserList("Orange", R.drawable.user9_pic);
            userList.add(user9);
            UserList user10 = new UserList("Mango", R.drawable.user10_pic);
            userList.add(user10);
        }
    }
}
