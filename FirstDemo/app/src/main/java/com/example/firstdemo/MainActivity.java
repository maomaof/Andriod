package com.example.firstdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText edit_text_name = (EditText) findViewById(R.id.edit_text_name) ;
                EditText edit_text_pwd = (EditText) findViewById(R.id.edit_text_pwd) ;

                String name = edit_text_name.getText().toString();
                String pwd = edit_text_pwd.getText().toString();
                String empty = "";
                if(empty.equals(name))
                {
                    Toast.makeText(MainActivity.this, "Username or Email empty", Toast.LENGTH_SHORT).show();
                }
                else if (empty.equals(pwd))
                {
                    Toast.makeText(MainActivity.this, "Password empty", Toast.LENGTH_SHORT).show();
                }
                else{
                    //space check
                    //......
                    Toast.makeText(MainActivity.this, "Login Success", Toast.LENGTH_SHORT).show();;
                }

                Intent intent = new Intent(MainActivity.this, ChartActivity.class);
                startActivity(intent);

            }
        });

    }
}
