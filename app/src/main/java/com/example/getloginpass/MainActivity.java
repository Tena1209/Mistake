package com.example.getloginpass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, GetDataAsyncTask.AsyncResponse {

    private EditText etLogin;
    private EditText etPassword;
    private Button buttonSubmit;
    private String login,  password, url_link;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etLogin=findViewById(R.id.eTLogin);
        etPassword=findViewById(R.id.ePassword);
        buttonSubmit=findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        login=etLogin.getText().toString();
        password=etPassword.getText().toString();
        url_link= "http://cf28578.tw1.ru/getUse.php";
        new GetDataAsyncTask(this).execute(login, password, url_link);

        /*Intent intent=new Intent(this, ViewActivity.class);
        intent.putExtra("login", etLogin.getText().toString());
        intent.putExtra("password", etPassword.getText().toString());
        startActivity(intent);*/

    }

    @Override
    public void proccessFinish(String output) {

        Intent intent=new Intent(this, LoginActivity.class);
        intent.putExtra("Full_name", output);
        startActivity(intent);

    }
}