package com.example.bancobit1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class login_step2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_step2);
    }
    public void sendMessage(View view) {
        Intent intent = new Intent(login_step2.this, login_step1.class);
        startActivity(intent);
    }
    public void sendMessage1(View view) {
        Intent intent = new Intent(login_step2.this, main_menu.class);
        startActivity(intent);
    }
}