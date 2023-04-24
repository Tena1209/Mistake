package com.example.getloginpass;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitu_view);
        TextView tv=findViewById(R.id.tvViewFullName);
        Intent intent=getIntent();
        //String login=intent.getStringExtra("login");
        String full_name=intent.getStringExtra("full_name");
        tv.setText("Hellow "+ full_name);
        

    }
}
