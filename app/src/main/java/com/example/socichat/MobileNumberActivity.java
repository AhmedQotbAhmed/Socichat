package com.example.socichat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MobileNumberActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_number);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));

        setSupportActionBar(toolbar);
        Button btn=findViewById(R.id.btn_send_otp);
        btn.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

            switch (v.getId()){
                case R.id.btn_send_otp:
                    Intent outIntent = new Intent(MobileNumberActivity.this, MobileVerification.class);
                    startActivity(outIntent);
            }

    }
}
